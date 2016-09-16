package ftc.goal.counter;

/*
 * Created for FIRST Tech Challenge
 * To count balls scored in the Goals
 * During the 2016 - 2017 Game
 */

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import net.java.games.input.Component;
import net.java.games.input.Component.Identifier;
import net.java.games.input.Controller;
import net.java.games.input.ControllerEnvironment;
import ftc.goal.counter.GoalCounterUI;

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
    
    static public int count = 0;

    final SettingsUI window;
    
    private ArrayList<Controller> foundControllers;

    public JoystickTest() {
        window = new SettingsUI();
        
        foundControllers = new ArrayList<>();
        searchForControllers();
        // If at least one controller was found we start showing controller data on window.
        if(!foundControllers.isEmpty())
            startShowingControllerData();
        else
            System.out.println("No controller found!");
    }

    /**
     * Search (and save) for controllers of type Controller.Type.STICK,
     * Controller.Type.GAMEPAD, Controller.Type.WHEEL and Controller.Type.FINGERSTICK.
     */
    private void searchForControllers() {
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
    private void startShowingControllerData(){
        while(true)
        {
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
            
            // JPanel for controller buttons
            JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
            buttonsPanel.setBounds(6, 19, 246, 110);
                    
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

