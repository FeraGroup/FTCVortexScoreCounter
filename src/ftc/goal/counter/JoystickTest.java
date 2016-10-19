package ftc.goal.counter;

/*
 * Created for FIRST Tech Challenge
 * To count balls scored in the Goals
 * During the 2016 - 2017 Game
 */

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.java.games.input.Component;
import net.java.games.input.Component.Identifier;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;

/**
 *
 * Joystick Test with JInput
 *@author afera
 * Alexander Fera
 * Fera Group
 * Novi, MI 48377
 *
 */
public class JoystickTest {
    static public boolean pressLstJSRedCenAbtn = false;
    static public boolean PressJSRedCenAbtn = false;
    static public boolean pressLstJSRedCenBbtn = false;
    static public boolean PressJSRedCenBbtn = false;
    static public boolean pressLstJSBlueCenAbtn = false;
    static public boolean PressJSBlueCenAbtn = false;
    static public boolean pressLstJSBlueCenBbtn = false;
    static public boolean PressJSBlueCenBbtn = false;
    static public boolean pressLstJSRedCorAbtn = false;
    static public boolean PressJSRedCorAbtn = false;
    static public boolean pressLstJSRedCorBbtn = false;
    static public boolean PressJSRedCorBbtn = false;
    static public boolean pressLstJSBlueCorAbtn = false;
    static public boolean PressJSBlueCorAbtn = false;
    static public boolean pressLstJSBlueCorBbtn = false;
    static public boolean PressJSBlueCorBbtn = false;
    static public boolean pressLstJSRedCenLT = false;
    static public boolean PressJSRedCenLT = false;
    static public boolean pressLstJSRedCenLB = false;
    static public boolean PressJSRedCenLB = false;
    static public boolean pressLstJSRedCenRT = false;
    static public boolean PressJSRedCenRT = false;
    static public boolean pressLstJSRedCenRB = false;
    static public boolean PressJSRedCenRB = false;
    static public boolean pressLstJSBlueCenLT = false;
    static public boolean PressJSBlueCenLT = false;
    static public boolean pressLstJSBlueCenLB = false;
    static public boolean PressJSBlueCenLB = false;
    static public boolean pressLstJSBlueCenRT = false;
    static public boolean PressJSBlueCenRT = false;
    static public boolean pressLstJSBlueCenRB = false;
    static public boolean PressJSBlueCenRB = false;
    static public boolean pressLstJSRedCorLT = false;
    static public boolean PressJSRedCorLT = false;
    static public boolean pressLstJSRedCorLB = false;
    static public boolean PressJSRedCorLB = false;
    static public boolean pressLstJSRedCorRT = false;
    static public boolean PressJSRedCorRT = false;
    static public boolean pressLstJSRedCorRB = false;
    static public boolean PressJSRedCorRB = false;
    static public boolean pressLstJSBlueCorLT = false;
    static public boolean PressJSBlueCorLT = false;
    static public boolean pressLstJSBlueCorLB = false;
    static public boolean PressJSBlueCorLB = false;
    static public boolean pressLstJSBlueCorRT = false;
    static public boolean PressJSBlueCorRT = false;
    static public boolean pressLstJSBlueCorRB = false;
    static public boolean PressJSBlueCorRB = false;
    
    public static ArrayList<Controller> foundControllers;

    public JoystickTest() {
        
        foundControllers = new ArrayList<>();
        searchForControllers();
        // If at least one controller was found we start showing controller data on window.
        if(!foundControllers.isEmpty())
            startShowingControllerData();
        else
            System.out.println("No controller found!");
            SettingsUI.NoControllerName();
    }

    /**
     * Search (and save) for controllers of type Controller.Type.STICK,
     * Controller.Type.GAMEPAD, Controller.Type.WHEEL and Controller.Type.FINGERSTICK.
     */
    public static void searchForControllers() {
        
        Controller[] controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();

        for(int i = 0; i < controllers.length; i++){
            Controller controller = controllers[i];

            if (
                    controller.getType() == Controller.Type.STICK || 
                    controller.getType() == Controller.Type.GAMEPAD
               )
            {
                // Add new controller to the list of all controllers.
                foundControllers.add(controller);
                
                // Add new controller to the list on the window.
                SettingsUI.addControllerName(controller.getName() + " - " + controller.hashCode());
            }
        }
    }

    
    /**
     * Starts showing controller data on the window.
     */
    public static void startShowingControllerData(){
        while(true){
            
            GoalCounterUI.spinnersync();
            
            // Currently selected controller.
            int selectedControllerRedCen = SettingsUI.getSelectedControllerNameRedCen();
            Controller controllerRedCen = foundControllers.get(selectedControllerRedCen);

            // Pull controller for current data, and break while loop if controller is disconnected.
            if( !controllerRedCen.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
            int selectedControllerBlueCen = SettingsUI.getSelectedControllerNameBlueCen();
            Controller controllerBlueCen = foundControllers.get(selectedControllerBlueCen);

            // Pull controller for current data, and break while loop if controller is disconnected.
            
            if( !controllerBlueCen.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
           int selectedControllerRedCor = SettingsUI.getSelectedControllerNameRedCor();
            Controller controllerRedCor = foundControllers.get(selectedControllerRedCor);

            // Pull controller for current data, and break while loop if controller is disconnected.
            
            if( !controllerRedCor.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
            int selectedControllerBlueCor = SettingsUI.getSelectedControllerNameBlueCor();
            Controller controllerBlueCor = foundControllers.get(selectedControllerBlueCor);

            // Pull controller for current data, and break while loop if controller is disconnected.
            
            if( !controllerBlueCor.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
            
            if( !controllerRedCen.poll() ){
                GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
            }
            else{
                if(selectedControllerRedCen != selectedControllerBlueCen && selectedControllerRedCen != selectedControllerRedCor && selectedControllerRedCen != selectedControllerBlueCor){
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                    //AudDisplay.RedCenJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/jsred.jpg")));
                }
                else {
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                }
                if( !controllerRedCen.poll() ){
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                }
            }
                         
            if( !controllerRedCor.poll() ){
                GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(238, 190, 171));
            }
            else{            
                if(selectedControllerRedCor != selectedControllerBlueCen && selectedControllerRedCor != selectedControllerRedCen && selectedControllerRedCor != selectedControllerBlueCor){
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                }
                else {
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                }
            }
            if( !controllerBlueCor.poll() ){
                GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(238, 190, 171));
            } 
            else{
                if(selectedControllerBlueCor != selectedControllerBlueCen && selectedControllerBlueCor != selectedControllerRedCen && selectedControllerBlueCor != selectedControllerRedCor){
                    GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                }
                else {
                    GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                }
            }
            
            if( !controllerBlueCen.poll() ){
                GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
            } 
            else{
                if(selectedControllerBlueCen != selectedControllerBlueCor && selectedControllerBlueCen != selectedControllerRedCen && selectedControllerBlueCen != selectedControllerRedCor){
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                }
                else {
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                }
            }
            
             
            // Go trough all components of the controller.
            Component[] components = controllerRedCen.getComponents();
            for(int i=0; i < components.length; i++)
            {
                Component component = components[i];
                Identifier componentIdentifier = component.getIdentifier();
                
                // Buttons
                //if(component.getName().contains("Button")){ // If the language is not english, this won't work.
                if(componentIdentifier.getName().matches("^[0]*$")){ // This is for Center Controller A Button
                    // Is button pressed?

                    if(component.getPollData() != 0.0f){
                        PressJSRedCenAbtn = true;    
                    }
                    else{
                        PressJSRedCenAbtn = false;
                    }

                    
                    if(PressJSRedCenAbtn == false){
                        pressLstJSRedCenAbtn = false;
                    }
                    
                    GoalCounterUI.goal.IncrsRedCenA();
                   
                   
                    
                }
                
                if(componentIdentifier.getName().matches("^[1]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(component.getPollData() != 0.0f){
                        PressJSRedCenBbtn = true;    
                    }
                    else{
                        PressJSRedCenBbtn = false;
                    }
                      
                    if(PressJSRedCenBbtn == false){
                        pressLstJSRedCenBbtn = false;
                    }
                    
                    GoalCounterUI.goal.DcrsRedCenB();
                    
                }
                if(componentIdentifier.getName().matches("^[4]*$")){ // This is for Center Controller LB Button
                    // Is button pressed?

                    if(component.getPollData() != 0.0f){
                        PressJSRedCenLB = true;    
                    }
                    else{
                        PressJSRedCenLB = false;
                    }

                    
                    if(PressJSRedCenLB == false){
                        pressLstJSRedCenLB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsRedCenLB();
                    
                }
                
                if(componentIdentifier.getName().matches("^[5]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?

                    if(component.getPollData() != 0.0f){
                        PressJSRedCenRB = true;    
                    }
                    else{
                        PressJSRedCenRB = false;
                    }

                    
                    if(PressJSRedCenRB == false){
                        pressLstJSRedCenRB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsRedCenRB();
                    
                }

                if(componentIdentifier == Component.Identifier.Axis.Z){
                    if(component.getPollData() <= -0.75){
                        PressJSRedCenRT = true;    
                    }
                    else{
                        PressJSRedCenRT = false;
                    }
                      
                    if(PressJSRedCenRT == false){
                        pressLstJSRedCenRT = false;
                    }
                    GoalCounterUI.goal.DcrsRedCenRT();
                    }
                
                if(componentIdentifier == Component.Identifier.Axis.Z){
                    if(component.getPollData() <= 0.75){
                        PressJSRedCenLT = true;    
                    }
                    else{
                        PressJSRedCenLT = false;
                    }
                      
                    if(PressJSRedCenLT == false){
                        pressLstJSRedCenLT = false;
                    }
                    GoalCounterUI.goal.DcrsRedCenLT();
                    }
            }
                
                
            
            Component[] componentsbluecen = controllerBlueCen.getComponents();
            for(int i=0; i < componentsbluecen.length; i++)
            {
                Component componentbluecen = componentsbluecen[i];
                Identifier componentIdentifierbluecen = componentbluecen.getIdentifier();
                
                // Buttons
                //if(component.getName().contains("Button")){ // If the language is not english, this won't work.
                if(componentIdentifierbluecen.getName().matches("^[0]*$")){ // This is for Center Controller A Button
                    // Is button pressed?

                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenAbtn = true;    
                    }
                    else{
                        PressJSBlueCenAbtn = false;
                    }

                    
                    if(PressJSBlueCenAbtn == false){
                        pressLstJSBlueCenAbtn = false;
                    }
                    
                    GoalCounterUI.goal.IncrsBlueCenA();
                    
                }
                
                if(componentIdentifierbluecen.getName().matches("^[1]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenBbtn = true;    
                    }
                    else{
                        PressJSBlueCenBbtn = false;
                    }
                      
                    if(PressJSBlueCenBbtn == false){
                        pressLstJSBlueCenBbtn = false;
                    }
                    
                    GoalCounterUI.goal.DcrsBlueCenB();

                }
                
            if(componentIdentifierbluecen.getName().matches("^[4]*$")){ // This is for Center Controller LB Button
                    // Is button pressed?
                    
                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenLB = true;    
                    }
                    else{
                        PressJSBlueCenLB = false;
                    }
                      
                    if(PressJSBlueCenLB == false){
                        pressLstJSBlueCenLB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsBlueCenLB();

                }
                
                if(componentIdentifierbluecen.getName().matches("^[5]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenRB = true;    
                    }
                    else{
                        PressJSBlueCenRB = false;
                    }
                      
                    if(PressJSBlueCenRB == false){
                        pressLstJSBlueCenRB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsBlueCenRB();

                }
                if(componentIdentifierbluecen == Component.Identifier.Axis.Z){
                    if(componentbluecen.getPollData() <= -0.75){
                        PressJSBlueCenRT = true;    
                    }
                    else{
                        PressJSBlueCenRT = false;
                    }
                      
                    if(PressJSBlueCenRT == false){
                        pressLstJSBlueCenRT = false;
                    }
                    GoalCounterUI.goal.DcrsBlueCenRT();
                    }
                
                if(componentIdentifierbluecen == Component.Identifier.Axis.Z){
                    if(componentbluecen.getPollData() <= 0.75){
                        PressJSBlueCenLT = true;    
                    }
                    else{
                        PressJSBlueCenLT = false;
                    }
                      
                    if(PressJSBlueCenLT == false){
                        pressLstJSBlueCenLT = false;
                    }
                    GoalCounterUI.goal.DcrsBlueCenLT();
                    }           
            }
           
                        // Go trough all components of the controller.
            Component[] componentsredcor = controllerRedCor.getComponents();
            for(int i=0; i < componentsredcor.length; i++)
            {
                Component componentredcor = componentsredcor[i];
                Identifier componentIdentifierredcor = componentredcor.getIdentifier();
                
                // Buttons
                //if(component.getName().contains("Button")){ // If the language is not english, this won't work.
                if(componentIdentifierredcor.getName().matches("^[0]*$")){ // This is for Center Controller A Button
                    // Is button pressed?

                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorAbtn = true;    
                    }
                    else{
                        PressJSRedCorAbtn = false;
                    }

                    
                    if(PressJSRedCorAbtn == false){
                        pressLstJSRedCorAbtn = false;
                    }
                    
                    GoalCounterUI.goal.IncrsRedCorA();
                    
                }
                
                if(componentIdentifierredcor.getName().matches("^[1]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorBbtn = true;    
                    }
                    else{
                        PressJSRedCorBbtn = false;
                    }
                      
                    if(PressJSRedCorBbtn == false){
                        pressLstJSRedCorBbtn = false;
                    }
                    
                    GoalCounterUI.goal.DcrsRedCorB();

                }
                
                if(componentIdentifierredcor.getName().matches("^[4]*$")){ // This is for Center Controller LB Button
                    // Is button pressed?

                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorLB = true;    
                    }
                    else{
                        PressJSRedCorLB = false;
                    }

                    
                    if(PressJSRedCorLB == false){
                        pressLstJSRedCorLB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsRedCorLB();
                    
                }
                
                if(componentIdentifierredcor.getName().matches("^[5]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?

                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorRB = true;    
                    }
                    else{
                        PressJSRedCorRB = false;
                    }

                    
                    if(PressJSRedCorRB == false){
                        pressLstJSRedCorRB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsRedCorRB();
                    
                }

                if(componentIdentifierredcor == Component.Identifier.Axis.Z){
                    if(componentredcor.getPollData() <= -0.75){
                        PressJSRedCorRT = true;    
                    }
                    else{
                        PressJSRedCorRT = false;
                    }
                      
                    if(PressJSRedCorRT == false){
                        pressLstJSRedCorRT = false;
                    }
                    GoalCounterUI.goal.DcrsRedCorRT();
                    }
                
                if(componentIdentifierredcor == Component.Identifier.Axis.Z){
                    if(componentredcor.getPollData() <= 0.75){
                        PressJSRedCorLT = true;    
                    }
                    else{
                        PressJSRedCorLT = false;
                    }
                      
                    if(PressJSRedCorLT == false){
                        pressLstJSRedCorLT = false;
                    }
                    GoalCounterUI.goal.DcrsRedCorLT();
                    }
            }
                
            Component[] componentsbluecor = controllerBlueCor.getComponents();
            for(int i=0; i < componentsbluecor.length; i++)
            {
                Component componentbluecor = componentsbluecor[i];
                Identifier componentIdentifierbluecen = componentbluecor.getIdentifier();
                
                // Buttons
                //if(component.getName().contains("Button")){ // If the language is not english, this won't work.
                if(componentIdentifierbluecen.getName().matches("^[0]*$")){ // This is for Center Controller A Button
                    // Is button pressed?

                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorAbtn = true;    
                    }
                    else{
                        PressJSBlueCorAbtn = false;
                    }

                    
                    if(PressJSBlueCorAbtn == false){
                        pressLstJSBlueCorAbtn = false;
                    }
                    
                    GoalCounterUI.goal.IncrsBlueCorA();
                    
                }
                
                if(componentIdentifierbluecen.getName().matches("^[1]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorBbtn = true;    
                    }
                    else{
                        PressJSBlueCorBbtn = false;
                    }
                      
                    if(PressJSBlueCorBbtn == false){
                        pressLstJSBlueCorBbtn = false;
                    }
                    
                    GoalCounterUI.goal.DcrsBlueCorB();

                }
                
                if(componentIdentifierbluecen.getName().matches("^[4]*$")){ // This is for Center Controller LB Button
                    // Is button pressed?
                    
                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorLB = true;    
                    }
                    else{
                        PressJSBlueCorLB = false;
                    }
                      
                    if(PressJSBlueCorLB == false){
                        pressLstJSBlueCorLB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsBlueCorLB();

                }
                
                if(componentIdentifierbluecen.getName().matches("^[5]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorRB = true;    
                    }
                    else{
                        PressJSBlueCorRB = false;
                    }
                      
                    if(PressJSBlueCorRB == false){
                        pressLstJSBlueCorRB = false;
                    }
                    
                    GoalCounterUI.goal.IncrsBlueCorRB();

                }
                if(componentIdentifierbluecen == Component.Identifier.Axis.Z){
                    if(componentbluecor.getPollData() <= -0.75){
                        PressJSBlueCorRT = true;    
                    }
                    else{
                        PressJSBlueCorRT = false;
                    }
                      
                    if(PressJSBlueCorRT == false){
                        pressLstJSBlueCorRT = false;
                    }
                    GoalCounterUI.goal.DcrsBlueCorRT();
                    }
                
                if(componentIdentifierbluecen == Component.Identifier.Axis.Z){
                    if(componentbluecor.getPollData() <= 0.75){
                        PressJSBlueCorLT = true;    
                    }
                    else{
                        PressJSBlueCorLT = false;
                    }
                      
                    if(PressJSBlueCorLT == false){
                        pressLstJSBlueCorLT = false;
                    }
                    GoalCounterUI.goal.DcrsBlueCorLT();
                    }   
                
            }
            
            AudDisplay.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
            AudDisplay.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
            AudDisplay.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
            AudDisplay.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
            AudDisplay.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
            AudDisplay.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
            AudDisplay.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
            AudDisplay.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
            
            // We have to give processor some rest.
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(JoystickTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

