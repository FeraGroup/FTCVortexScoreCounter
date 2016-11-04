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
    static public boolean pressLstJSRedCenXbtn = false;
    static public boolean PressJSRedCenXbtn = false;
    static public boolean pressLstJSRedCenStart = false;
    static public boolean PressJSRedCenStart = false;
    static public boolean pressLstJSRedCenBack = false;
    static public boolean PressJSRedCenBack = false;
    static public boolean pressLstJSBlueCenXbtn = false;
    static public boolean PressJSBlueCenXbtn = false;
    static public boolean pressLstJSBlueCenStart = false;
    static public boolean PressJSBlueCenStart = false;
    static public boolean pressLstJSBlueCenBack = false;
    static public boolean PressJSBlueCenBack = false;
    static public boolean pressLstJSRedCorXbtn = false;
    static public boolean PressJSRedCorXbtn = false;
    static public boolean pressLstJSRedCorStart = false;
    static public boolean PressJSRedCorStart = false;
    static public boolean pressLstJSRedCorBack = false;
    static public boolean PressJSRedCorBack = false;
    static public boolean pressLstJSBlueCorXbtn = false;
    static public boolean PressJSBlueCorXbtn = false;
    static public boolean pressLstJSBlueCorStart = false;
    static public boolean PressJSBlueCorStart = false;
    static public boolean pressLstJSBlueCorBack = false;
    static public boolean PressJSBlueCorBack = false;
    
    public static ArrayList<Controller> foundControllers;

    public JoystickTest() {
        
        foundControllers = new ArrayList<>();
        searchForControllers();
        // If at least one controller was found we start showing controller data on window.
        if(!foundControllers.isEmpty()){
            startShowingControllerData();
        }
        else{
            SettingsUI.NoControllerName();
            while(true){
                GoalCounterUI.spinnersync();
            }
        }
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
                
                if(componentIdentifier.getName().matches("^[2]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(component.getPollData() != 0.0f){
                        PressJSRedCenXbtn = true;    
                    }
                    else{
                        PressJSRedCenXbtn = false;
                    }
                      
                    if(PressJSRedCenXbtn == false){
                        pressLstJSRedCenXbtn = false;
                    }
                    
                    GoalCounterUI.goal.RedCenX();
                    
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

                                if(componentIdentifier.getName().matches("^[6]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(component.getPollData() != 0.0f){
                        PressJSRedCenBack = true;    
                    }
                    else{
                        PressJSRedCenBack = false;
                    }
                      
                    if(PressJSRedCenBack == false){
                        pressLstJSRedCenBack = false;
                    }
                    
                    GoalCounterUI.goal.RedCenBack();
                }
                
                if(componentIdentifier.getName().matches("^[7]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(component.getPollData() != 0.0f){
                        PressJSRedCenStart = true;    
                    }
                    else{
                        PressJSRedCenStart = false;
                    }
                      
                    if(PressJSRedCenStart == false){
                        pressLstJSRedCenStart = false;
                    }
                    
                    GoalCounterUI.goal.RedCenStart();
                    
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
                
                if(componentIdentifierbluecen.getName().matches("^[2]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenXbtn = true;    
                    }
                    else{
                        PressJSBlueCenXbtn = false;
                    }
                      
                    if(PressJSBlueCenXbtn == false){
                        pressLstJSBlueCenXbtn = false;
                    }
                    
                    GoalCounterUI.goal.BlueCenX();

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
                
                if(componentIdentifierbluecen.getName().matches("^[6]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenBack = true;    
                    }
                    else{
                        PressJSBlueCenBack = false;
                    }
                      
                    if(PressJSBlueCenBack == false){
                        pressLstJSBlueCenBack = false;
                    }
                    
                    GoalCounterUI.goal.BlueCenBack();

                }
                
                if(componentIdentifierbluecen.getName().matches("^[7]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componentbluecen.getPollData() != 0.0f){
                        PressJSBlueCenStart = true;    
                    }
                    else{
                        PressJSBlueCenStart = false;
                    }
                      
                    if(PressJSBlueCenStart == false){
                        pressLstJSBlueCenStart = false;
                    }
                    
                    GoalCounterUI.goal.BlueCenStart();

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
                
                if(componentIdentifierredcor.getName().matches("^[2]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorXbtn = true;    
                    }
                    else{
                        PressJSRedCorXbtn = false;
                    }
                      
                    if(PressJSRedCorXbtn == false){
                        pressLstJSRedCorXbtn = false;
                    }
                    
                    GoalCounterUI.goal.RedCorX();

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
                
                if(componentIdentifierredcor.getName().matches("^[6]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?

                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorBack = true;    
                    }
                    else{
                        PressJSRedCorBack = false;
                    }

                    
                    if(PressJSRedCorBack == false){
                        pressLstJSRedCorBack = false;
                    }
                    
                    GoalCounterUI.goal.RedCorBack();
                   
                }
                
                if(componentIdentifierredcor.getName().matches("^[7]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?

                    if(componentredcor.getPollData() != 0.0f){
                        PressJSRedCorStart = true;    
                    }
                    else{
                        PressJSRedCorStart = false;
                    }

                    
                    if(PressJSRedCorStart == false){
                        pressLstJSRedCorStart = false;
                    }
                    
                    GoalCounterUI.goal.RedCorStart();
                   
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
                
                if(componentIdentifierbluecen.getName().matches("^[2]*$")){ // This is for Center Controller B Button
                    // Is button pressed?
                    
                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorXbtn = true;    
                    }
                    else{
                        PressJSBlueCorXbtn = false;
                    }
                      
                    if(PressJSBlueCorXbtn == false){
                        pressLstJSBlueCorXbtn = false;
                    }
                    
                    GoalCounterUI.goal.BlueCorX();

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
                
                if(componentIdentifierbluecen.getName().matches("^[6]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorBack = true;    
                    }
                    else{
                        PressJSBlueCorBack = false;
                    }
                      
                    if(PressJSBlueCorBack == false){
                        pressLstJSBlueCorBack = false;
                    }
                    
                    GoalCounterUI.goal.BlueCorBack();

                }
                
                if(componentIdentifierbluecen.getName().matches("^[7]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componentbluecor.getPollData() != 0.0f){
                        PressJSBlueCorStart = true;    
                    }
                    else{
                        PressJSBlueCorStart = false;
                    }
                      
                    if(PressJSBlueCorStart == false){
                        pressLstJSBlueCorStart = false;
                    }
                    
                    GoalCounterUI.goal.BlueCorBack();

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
            
            // We have to give processor some rest.
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(JoystickTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

