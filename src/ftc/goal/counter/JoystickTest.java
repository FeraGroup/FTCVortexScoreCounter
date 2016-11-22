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
import net.java.games.input.DirectAndRawInputEnvironmentPlugin;

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
    static public boolean pressLstJSTimerXbtn = false;
    static public boolean PressJSTimerXbtn = false;
    static public boolean pressLstJSTimerStart = false;
    static public boolean PressJSTimerStart = false;
    static public boolean pressLstJSTimerBack = false;
    static public boolean PressJSTimerBack = false;
    static public boolean BlueCorIcon = false;
    static public boolean RedCorIcon = false;
    static public boolean BlueCenIcon = false;
    static public boolean RedCenIcon = false;
    static public boolean controllerLoop = true;
    static public boolean spinnerSyncRun = true;
    
    static public ArrayList<Controller> foundControllers;

    public JoystickTest() {
        foundControllers = new ArrayList<>();
        searchForControllers();
        
        // If at least one controller was found we start showing controller data on window.
        if(!foundControllers.isEmpty()){
           startShowingControllerData();
        }else{
            SettingsUI.NoControllerName();
            do{
                GoalCounterUI.spinnersync();
            }while(spinnerSyncRun); 
        }
    }

    /**
     * Search (and save) for controllers of type Controller.Type.STICK,
     * Controller.Type.GAMEPAD, Controller.Type.WHEEL and Controller.Type.FINGERSTICK.
     */
    public static void searchForControllers() {
        Controller[] controllers = null;
 
        DirectAndRawInputEnvironmentPlugin directEnv = new DirectAndRawInputEnvironmentPlugin();
        
        if (directEnv.isSupported()) {
            controllers = directEnv.getControllers();
        } else {
            controllers = ControllerEnvironment.getDefaultEnvironment().getControllers();
        }
        
        for(int i = 0; i < controllers.length; i++){
            Controller controller = controllers[i];
            if (controller.getType() == Controller.Type.STICK || 
                controller.getType() == Controller.Type.GAMEPAD){
                // Add new controller to the list of all controllers.
                foundControllers.add(controller);
                // Add new controller to the list on the window.
                SettingsUI.addControllerName(controller.getName() + " - " + controller.hashCode());
            } 
        }
    }
        
    public static void updateJSstatusDisplays(int display, int color){
        //color 1 = red, color 2 = orange, color 3 = green
        //display 1 = RedCen, display 2 = RedCor,
        //display 3 = BlueCen, display 4 = BlueCor
        switch (display) {
            case 1:
                switch (color) {
                    case 1:
                        AudDisplay1600.RedCenJSGreen.setVisible(false);
                        AudDisplay1600.RedCenJSOrange.setVisible(false);
                        AudDisplay1600.RedCenJSRed.setVisible(true);
                        AudDisplay1366.RedCenJSGreen.setVisible(false);
                        AudDisplay1366.RedCenJSOrange.setVisible(false);
                        AudDisplay1366.RedCenJSRed.setVisible(true);
                        AudDisplay1920.RedCenJSGreen.setVisible(false);
                        AudDisplay1920.RedCenJSOrange.setVisible(false);
                        AudDisplay1920.RedCenJSRed.setVisible(true);
                        AudDisplay1024.RedCenJSGreen.setVisible(false);
                        AudDisplay1024.RedCenJSOrange.setVisible(false);
                        AudDisplay1024.RedCenJSRed.setVisible(true);
                        AudDisplay800.RedCenJSGreen.setVisible(false);
                        AudDisplay800.RedCenJSOrange.setVisible(false);
                        AudDisplay800.RedCenJSRed.setVisible(true);
                        AudDisplay1280.RedCenJSGreen.setVisible(false);
                        AudDisplay1280.RedCenJSOrange.setVisible(false);
                        AudDisplay1280.RedCenJSRed.setVisible(true);
                        break;
                    case 2:
                        AudDisplay1600.RedCenJSGreen.setVisible(false);
                        AudDisplay1600.RedCenJSOrange.setVisible(true);
                        AudDisplay1600.RedCenJSRed.setVisible(false);
                        AudDisplay1366.RedCenJSGreen.setVisible(false);
                        AudDisplay1366.RedCenJSOrange.setVisible(true);
                        AudDisplay1366.RedCenJSRed.setVisible(false);
                        AudDisplay1920.RedCenJSGreen.setVisible(false);
                        AudDisplay1920.RedCenJSOrange.setVisible(true);
                        AudDisplay1920.RedCenJSRed.setVisible(false);
                        AudDisplay1024.RedCenJSGreen.setVisible(false);
                        AudDisplay1024.RedCenJSOrange.setVisible(true);
                        AudDisplay1024.RedCenJSRed.setVisible(false);
                        AudDisplay800.RedCenJSGreen.setVisible(false);
                        AudDisplay800.RedCenJSOrange.setVisible(true);
                        AudDisplay800.RedCenJSRed.setVisible(false);
                        AudDisplay1280.RedCenJSGreen.setVisible(false);
                        AudDisplay1280.RedCenJSOrange.setVisible(true);
                        AudDisplay1280.RedCenJSRed.setVisible(false);
                        break;
                    case 3:
                        AudDisplay1600.RedCenJSGreen.setVisible(true);
                        AudDisplay1600.RedCenJSOrange.setVisible(false);
                        AudDisplay1600.RedCenJSRed.setVisible(false);
                        AudDisplay1366.RedCenJSGreen.setVisible(true);
                        AudDisplay1366.RedCenJSOrange.setVisible(false);
                        AudDisplay1366.RedCenJSRed.setVisible(false);
                        AudDisplay1920.RedCenJSGreen.setVisible(true);
                        AudDisplay1920.RedCenJSOrange.setVisible(false);
                        AudDisplay1920.RedCenJSRed.setVisible(false);
                        AudDisplay1024.RedCenJSGreen.setVisible(true);
                        AudDisplay1024.RedCenJSOrange.setVisible(false);
                        AudDisplay1024.RedCenJSRed.setVisible(false);
                        AudDisplay800.RedCenJSGreen.setVisible(true);
                        AudDisplay800.RedCenJSOrange.setVisible(false);
                        AudDisplay800.RedCenJSRed.setVisible(false);
                        AudDisplay1280.RedCenJSGreen.setVisible(true);
                        AudDisplay1280.RedCenJSOrange.setVisible(false);
                        AudDisplay1280.RedCenJSRed.setVisible(false);
                        break;
                    default:
                        break;
                }   break;
            case 2:
                switch (color) {
                    case 1:
                        AudDisplay1600.RedCorJSGreen.setVisible(false);
                        AudDisplay1600.RedCorJSOrange.setVisible(false);
                        AudDisplay1600.RedCorJSRed.setVisible(true);
                        AudDisplay1366.RedCorJSGreen.setVisible(false);
                        AudDisplay1366.RedCorJSOrange.setVisible(false);
                        AudDisplay1366.RedCorJSRed.setVisible(true);
                        AudDisplay1920.RedCorJSGreen.setVisible(false);
                        AudDisplay1920.RedCorJSOrange.setVisible(false);
                        AudDisplay1920.RedCorJSRed.setVisible(true);
                        AudDisplay1024.RedCorJSGreen.setVisible(false);
                        AudDisplay1024.RedCorJSOrange.setVisible(false);
                        AudDisplay1024.RedCorJSRed.setVisible(true);
                        AudDisplay800.RedCorJSGreen.setVisible(false);
                        AudDisplay800.RedCenJSOrange.setVisible(false);
                        AudDisplay800.RedCenJSRed.setVisible(true);
                        AudDisplay1280.RedCorJSGreen.setVisible(false);
                        AudDisplay1280.RedCorJSOrange.setVisible(false);
                        AudDisplay1280.RedCorJSRed.setVisible(true);
                        break;
                    case 2:
                        AudDisplay1600.RedCorJSGreen.setVisible(false);
                        AudDisplay1600.RedCorJSOrange.setVisible(true);
                        AudDisplay1600.RedCorJSRed.setVisible(false);
                        AudDisplay1366.RedCorJSGreen.setVisible(false);
                        AudDisplay1366.RedCorJSOrange.setVisible(true);
                        AudDisplay1366.RedCorJSRed.setVisible(false);
                        AudDisplay1920.RedCorJSGreen.setVisible(false);
                        AudDisplay1920.RedCorJSOrange.setVisible(true);
                        AudDisplay1920.RedCorJSRed.setVisible(false);
                        AudDisplay1024.RedCorJSGreen.setVisible(false);
                        AudDisplay1024.RedCorJSOrange.setVisible(true);
                        AudDisplay1024.RedCorJSRed.setVisible(false);
                        AudDisplay800.RedCorJSGreen.setVisible(false);
                        AudDisplay800.RedCorJSOrange.setVisible(true);
                        AudDisplay800.RedCorJSRed.setVisible(false);
                        AudDisplay1280.RedCorJSGreen.setVisible(false);
                        AudDisplay1280.RedCorJSOrange.setVisible(true);
                        AudDisplay1280.RedCorJSRed.setVisible(false);
                        break;
                    case 3:
                        AudDisplay1600.RedCorJSGreen.setVisible(true);
                        AudDisplay1600.RedCorJSOrange.setVisible(false);
                        AudDisplay1600.RedCorJSRed.setVisible(false);
                        AudDisplay1366.RedCorJSGreen.setVisible(true);
                        AudDisplay1366.RedCorJSOrange.setVisible(false);
                        AudDisplay1366.RedCorJSRed.setVisible(false);
                        AudDisplay1920.RedCorJSGreen.setVisible(true);
                        AudDisplay1920.RedCorJSOrange.setVisible(false);
                        AudDisplay1920.RedCorJSRed.setVisible(false);
                        AudDisplay1024.RedCorJSGreen.setVisible(true);
                        AudDisplay1024.RedCorJSOrange.setVisible(false);
                        AudDisplay1024.RedCorJSRed.setVisible(false);
                        AudDisplay800.RedCorJSGreen.setVisible(true);
                        AudDisplay800.RedCorJSOrange.setVisible(false);
                        AudDisplay800.RedCorJSRed.setVisible(false);
                        AudDisplay1280.RedCorJSGreen.setVisible(true);
                        AudDisplay1280.RedCorJSOrange.setVisible(false);
                        AudDisplay1280.RedCorJSRed.setVisible(false);
                        break;
                    default:
                        break;
                }   break;
            case 3:
                switch (color) {
                    case 1:
                        AudDisplay1600.BlueCenJSGreen.setVisible(false);
                        AudDisplay1600.BlueCenJSOrange.setVisible(false);
                        AudDisplay1600.BlueCenJSRed.setVisible(true);
                        AudDisplay1366.BlueCenJSGreen.setVisible(false);
                        AudDisplay1366.BlueCenJSOrange.setVisible(false);
                        AudDisplay1366.BlueCenJSRed.setVisible(true);
                        AudDisplay1920.BlueCenJSGreen.setVisible(false);
                        AudDisplay1920.BlueCenJSOrange.setVisible(false);
                        AudDisplay1920.BlueCenJSRed.setVisible(true);
                        AudDisplay1024.BlueCenJSGreen.setVisible(false);
                        AudDisplay1024.BlueCenJSOrange.setVisible(false);
                        AudDisplay1024.BlueCenJSRed.setVisible(true);
                        AudDisplay800.BlueCenJSGreen.setVisible(false);
                        AudDisplay800.BlueCenJSOrange.setVisible(false);
                        AudDisplay800.BlueCenJSRed.setVisible(true);
                        AudDisplay1280.BlueCenJSGreen.setVisible(false);
                        AudDisplay1280.BlueCenJSOrange.setVisible(false);
                        AudDisplay1280.BlueCenJSRed.setVisible(true);
                        break;
                    case 2:
                        AudDisplay1600.BlueCenJSGreen.setVisible(false);
                        AudDisplay1600.BlueCenJSOrange.setVisible(true);
                        AudDisplay1600.BlueCenJSRed.setVisible(false);
                        AudDisplay1366.BlueCenJSGreen.setVisible(false);
                        AudDisplay1366.BlueCenJSOrange.setVisible(true);
                        AudDisplay1366.BlueCenJSRed.setVisible(false);
                        AudDisplay1920.BlueCenJSGreen.setVisible(false);
                        AudDisplay1920.BlueCenJSOrange.setVisible(true);
                        AudDisplay1920.BlueCenJSRed.setVisible(false);
                        AudDisplay1024.BlueCenJSGreen.setVisible(false);
                        AudDisplay1024.BlueCenJSOrange.setVisible(true);
                        AudDisplay1024.BlueCenJSRed.setVisible(false);
                        AudDisplay800.BlueCenJSGreen.setVisible(false);
                        AudDisplay800.BlueCenJSOrange.setVisible(true);
                        AudDisplay800.BlueCenJSRed.setVisible(false);
                        AudDisplay1280.BlueCenJSGreen.setVisible(false);
                        AudDisplay1280.BlueCenJSOrange.setVisible(true);
                        AudDisplay1280.BlueCenJSRed.setVisible(false);
                        break;
                    case 3:
                        AudDisplay1600.BlueCenJSGreen.setVisible(true);
                        AudDisplay1600.BlueCenJSOrange.setVisible(false);
                        AudDisplay1600.BlueCenJSRed.setVisible(false);
                        AudDisplay1366.BlueCenJSGreen.setVisible(true);
                        AudDisplay1366.BlueCenJSOrange.setVisible(false);
                        AudDisplay1366.BlueCenJSRed.setVisible(false);
                        AudDisplay1920.BlueCenJSGreen.setVisible(true);
                        AudDisplay1920.BlueCenJSOrange.setVisible(false);
                        AudDisplay1920.BlueCenJSRed.setVisible(false);
                        AudDisplay1024.BlueCenJSGreen.setVisible(true);
                        AudDisplay1024.BlueCenJSOrange.setVisible(false);
                        AudDisplay1024.BlueCenJSRed.setVisible(false);
                        AudDisplay800.BlueCenJSGreen.setVisible(true);
                        AudDisplay800.BlueCenJSOrange.setVisible(false);
                        AudDisplay800.BlueCenJSRed.setVisible(false);
                        AudDisplay1280.BlueCenJSGreen.setVisible(true);
                        AudDisplay1280.BlueCenJSOrange.setVisible(false);
                        AudDisplay1280.BlueCenJSRed.setVisible(false);
                        break;
                    default:
                        break;
                }   break;
            case 4:
                switch (color) {
                    case 1:
                        AudDisplay1600.BlueCorJSGreen.setVisible(false);
                        AudDisplay1600.BlueCorJSOrange.setVisible(false);
                        AudDisplay1600.BlueCorJSRed.setVisible(true);
                        AudDisplay1366.BlueCorJSGreen.setVisible(false);
                        AudDisplay1366.BlueCorJSOrange.setVisible(false);
                        AudDisplay1366.BlueCorJSRed.setVisible(true);
                        AudDisplay1920.BlueCorJSGreen.setVisible(false);
                        AudDisplay1920.BlueCorJSOrange.setVisible(false);
                        AudDisplay1920.BlueCorJSRed.setVisible(true);
                        AudDisplay1024.BlueCorJSGreen.setVisible(false);
                        AudDisplay1024.BlueCorJSOrange.setVisible(false);
                        AudDisplay1024.BlueCorJSRed.setVisible(true);
                        AudDisplay800.BlueCorJSGreen.setVisible(false);
                        AudDisplay800.BlueCorJSOrange.setVisible(false);
                        AudDisplay800.BlueCorJSRed.setVisible(true);
                        AudDisplay1280.BlueCorJSGreen.setVisible(false);
                        AudDisplay1280.BlueCorJSOrange.setVisible(false);
                        AudDisplay1280.BlueCorJSRed.setVisible(true);
                        break;
                    case 2:
                        AudDisplay1600.BlueCorJSGreen.setVisible(false);
                        AudDisplay1600.BlueCorJSOrange.setVisible(true);
                        AudDisplay1600.BlueCorJSRed.setVisible(false);
                        AudDisplay1366.BlueCorJSGreen.setVisible(false);
                        AudDisplay1366.BlueCorJSOrange.setVisible(true);
                        AudDisplay1366.BlueCorJSRed.setVisible(false);
                        AudDisplay1920.BlueCorJSGreen.setVisible(false);
                        AudDisplay1920.BlueCorJSOrange.setVisible(true);
                        AudDisplay1920.BlueCorJSRed.setVisible(false);
                        AudDisplay1024.BlueCorJSGreen.setVisible(false);
                        AudDisplay1024.BlueCorJSOrange.setVisible(true);
                        AudDisplay1024.BlueCorJSRed.setVisible(false);
                        AudDisplay800.BlueCorJSGreen.setVisible(false);
                        AudDisplay800.BlueCorJSOrange.setVisible(true);
                        AudDisplay800.BlueCorJSRed.setVisible(false);
                        AudDisplay1280.BlueCorJSGreen.setVisible(false);
                        AudDisplay1280.BlueCorJSOrange.setVisible(true);
                        AudDisplay1280.BlueCorJSRed.setVisible(false);
                        break;
                    case 3:
                        AudDisplay1600.BlueCorJSGreen.setVisible(true);
                        AudDisplay1600.BlueCorJSOrange.setVisible(false);
                        AudDisplay1600.BlueCorJSRed.setVisible(false);
                        AudDisplay1366.BlueCorJSGreen.setVisible(true);
                        AudDisplay1366.BlueCorJSOrange.setVisible(false);
                        AudDisplay1366.BlueCorJSRed.setVisible(false);
                        AudDisplay1920.BlueCorJSGreen.setVisible(true);
                        AudDisplay1920.BlueCorJSOrange.setVisible(false);
                        AudDisplay1920.BlueCorJSRed.setVisible(false);
                        AudDisplay1024.BlueCorJSGreen.setVisible(true);
                        AudDisplay1024.BlueCorJSOrange.setVisible(false);
                        AudDisplay1024.BlueCorJSRed.setVisible(false);
                        AudDisplay800.BlueCorJSGreen.setVisible(true);
                        AudDisplay800.BlueCorJSOrange.setVisible(false);
                        AudDisplay800.BlueCorJSRed.setVisible(false);
                        AudDisplay1280.BlueCorJSGreen.setVisible(true);
                        AudDisplay1280.BlueCorJSOrange.setVisible(false);
                        AudDisplay1280.BlueCorJSRed.setVisible(false);
                        break;
                    default:
                        break;
                }   break;
            default:
                break;
        }
   
    }
    
    /**
     * Starts showing controller data on the window.
     */
    public static void startShowingControllerData(){
        while(true){
            if(controllerLoop == false){break;}
            
            GoalCounterUI.spinnersync();
            
            // Currently selected controller.
            int selectedControllerRedCen = SettingsUI.getSelectedControllerNameRedCen();
            if (selectedControllerRedCen == -1){
                    try {
                        Thread.sleep(250); // Pause the Joystick Checker while we update the Joysticks
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JoystickTest.class.getName()).log(Level.SEVERE, null, ex);
                    }
                selectedControllerRedCen = 0;
            }
            
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
           if (selectedControllerRedCor == -1){
                selectedControllerRedCor = 0;
            }
            Controller controllerRedCor = foundControllers.get(selectedControllerRedCor);

            // Pull controller for current data, and break while loop if controller is disconnected.
            
            if( !controllerRedCor.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
            int selectedControllerBlueCor = SettingsUI.getSelectedControllerNameBlueCor();
            if (selectedControllerBlueCen == -1){
                selectedControllerBlueCen = 0;
            }
            Controller controllerBlueCor = foundControllers.get(selectedControllerBlueCor);

            // Pull controller for current data, and break while loop if controller is disconnected.
            
            if( !controllerBlueCor.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
        int selectedControllerTimer = SettingsUI.getSelectedControllerNameTimer();
        if (selectedControllerBlueCor == -1){
                selectedControllerBlueCor = 0;
            }
            Controller controllerTimer = foundControllers.get(selectedControllerTimer);

            // Pull controller for current data, and break while loop if controller is disconnected.
            
            if( !controllerTimer.poll() ){
               // window.showControllerDisconnected();
               // break;
            }
            
            if( !controllerRedCen.poll() ){
                //peach color
                GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                updateJSstatusDisplays(1, 1);
            }
            else if(SettingsUI.RedCenBtn == false && SettingsUI.RedCenLeft == false && SettingsUI.RedCenRight == false){
                GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                updateJSstatusDisplays(1, 1);
            }
            else if(selectedControllerRedCen == selectedControllerRedCor && SettingsUI.RedCenBtn == true && SettingsUI.RedCorBtn == true){
                    //Orange
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(1, 2);
                }
            else if(selectedControllerRedCen == selectedControllerRedCor && SettingsUI.RedCenLeft == true && SettingsUI.RedCorLeft == true){
                    //Orange
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(1, 2);
                }
            else if(selectedControllerRedCen == selectedControllerRedCor && SettingsUI.RedCenRight == true && SettingsUI.RedCorRight == true){
                    //Orange
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(1, 2);
                }
            else if(selectedControllerRedCen == selectedControllerBlueCen || selectedControllerRedCen == selectedControllerBlueCor){
                //Orange
                    GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(1, 2);
                }
            else {
                //green
                GoalCounterUI.RedCenJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                updateJSstatusDisplays(1, 3);
            }
                         
            if( !controllerRedCor.poll() ){
                GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                    updateJSstatusDisplays(2, 1);
            }
            else if(SettingsUI.RedCorBtn == false && SettingsUI.RedCorLeft == false && SettingsUI.RedCorRight == false){
                GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                    updateJSstatusDisplays(2, 1);
            }
            else if(selectedControllerRedCen == selectedControllerRedCor && SettingsUI.RedCenBtn == true && SettingsUI.RedCorBtn == true){
                    //Orange
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(2, 2);
                }
            else if(selectedControllerRedCen == selectedControllerRedCor && SettingsUI.RedCenLeft == true && SettingsUI.RedCorLeft == true){
                    //Orange
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(2, 2);
                }
            else if(selectedControllerRedCen == selectedControllerRedCor && SettingsUI.RedCenRight == true && SettingsUI.RedCorRight == true){
                    //Orange
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(2, 2);
                }
            else if(selectedControllerRedCor == selectedControllerBlueCen || selectedControllerRedCor == selectedControllerBlueCor){
                //Orange
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(2, 2);
                }
            else {
                //green
                    GoalCounterUI.RedCorJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                    updateJSstatusDisplays(2, 3);
            }
                if( !controllerBlueCor.poll() ){
                    GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                    updateJSstatusDisplays(3, 1);
                }
            else if(SettingsUI.BlueCorBtn == false && SettingsUI.BlueCorLeft == false && SettingsUI.BlueCorRight == false){
                    GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                    updateJSstatusDisplays(3, 1);
            }
            else if(selectedControllerBlueCen == selectedControllerBlueCor && SettingsUI.BlueCenBtn == true && SettingsUI.BlueCorBtn == true){
                    //Orange
                        GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                        updateJSstatusDisplays(3, 2);
                }
            else if(selectedControllerBlueCen == selectedControllerBlueCor && SettingsUI.BlueCenLeft == true && SettingsUI.BlueCorLeft == true){
                    //Orange
                        GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                        updateJSstatusDisplays(3, 2);
                }
            else if(selectedControllerBlueCen == selectedControllerBlueCor && SettingsUI.BlueCenRight == true && SettingsUI.BlueCorRight == true){
                    //Orange
                        GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                        updateJSstatusDisplays(3, 2);
                }
            else if(selectedControllerBlueCor == selectedControllerRedCen || selectedControllerBlueCor == selectedControllerRedCor){
                //Orange
                        GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                        updateJSstatusDisplays(3, 2);
                }
            else {
                //green
                        GoalCounterUI.BlueCorJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                        updateJSstatusDisplays(3, 3);
            }
            if( !controllerBlueCen.poll() ){
                GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                updateJSstatusDisplays(4, 1);
            } 
            else if(SettingsUI.BlueCenBtn == false && SettingsUI.BlueCenLeft == false && SettingsUI.BlueCenRight == false){
                GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(238, 190, 171));
                updateJSstatusDisplays(4, 1);
            }
            else if(selectedControllerBlueCen == selectedControllerBlueCor && SettingsUI.BlueCenBtn == true && SettingsUI.BlueCorBtn == true){
                    //Orange
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(4, 2);
                }
            else if(selectedControllerBlueCen == selectedControllerBlueCor && SettingsUI.BlueCenLeft == true && SettingsUI.BlueCorLeft == true){
                    //Orange
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(4, 2);
                }
            else if(selectedControllerBlueCen == selectedControllerBlueCor && SettingsUI.BlueCenRight == true && SettingsUI.BlueCorRight == true){
                    //Orange
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(4, 2);
                }
            else if(selectedControllerBlueCen == selectedControllerRedCen || selectedControllerBlueCen == selectedControllerRedCor){
                //Orange
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(245, 126, 37));
                    updateJSstatusDisplays(4, 2);
                }
            else {
                //green
                    GoalCounterUI.BlueCenJSStatus.setBackground(new java.awt.Color(0, 166, 81));
                    updateJSstatusDisplays(4, 3);
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
            
        Component[] componentstimer = controllerTimer.getComponents();
            for(int i=0; i < componentstimer.length; i++)
            {
                Component componenttimer = componentstimer[i];
                Identifier componentIdentifierTimer = componenttimer.getIdentifier();
                
                if(componentIdentifierTimer.getName().matches("^[2]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componenttimer.getPollData() != 0.0f){
                        PressJSTimerXbtn = true;
                    }
                    else{
                        PressJSTimerXbtn = false;
                        
                    }
                      
                    if(PressJSTimerXbtn == false){
                        pressLstJSTimerXbtn = false;
                    }
                    
                    GoalCounterUI.goal.TimerXBtn();

                }
            
                if(componentIdentifierTimer.getName().matches("^[6]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componenttimer.getPollData() != 0.0f){
                        PressJSTimerBack = true;    
                    }
                    else{
                        PressJSTimerBack = false;
                    }
                      
                    if(PressJSTimerBack == false){
                        pressLstJSTimerBack = false;
                    }
                    
                    GoalCounterUI.goal.TimerBack();

                }
                
                if(componentIdentifierTimer.getName().matches("^[7]*$")){ // This is for Center Controller RB Button
                    // Is button pressed?
                    
                    if(componenttimer.getPollData() != 0.0f){
                        PressJSTimerStart = true;    
                    }
                    else{
                        PressJSTimerStart = false;
                    }
                      
                    if(PressJSTimerStart == false){
                        pressLstJSTimerStart = false;
                    }
                    
                    GoalCounterUI.goal.TimerStart();

                }
            }
            
            // We have to give processor some rest.
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(JoystickTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(!controllerLoop == false) continue;
        }
    }
    
}

