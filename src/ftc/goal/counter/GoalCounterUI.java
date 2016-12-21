/*
 * Created for FIRST Tech Challenge
 * To count balls scored in the Goals
 * During the 2016 - 2017 Game
 */
package ftc.goal.counter;


import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import javax.swing.ImageIcon;


/*
 * @author afera
 * Alexander Fera
 * Fera Group
 * Novi, MI 48377
 */
public class GoalCounterUI extends javax.swing.JFrame {

    public static Logger logger = Logger.getLogger("GoalCounter");  
    public static FileHandler fh;
    public static boolean AutoState = true;
    public static boolean TeleState = false;
    public static boolean TimerActive = false;
    public static boolean pause = false;
    public static int RedCenAuto = 0;
    public static int BlueCenAuto = 0;
    public static int RedCorAuto = 0;
    public static int BlueCorAuto = 0;
    public static int RedCenTele = 0;
    public static int BlueCenTele = 0;
    public static int RedCorTele = 0;
    public static int BlueCorTele = 0;
    public static AudDisplay1600 AudDisp1600;
    public static AudDisplay1366 AudDisp1366;
    public static AudDisplay1920 AudDisp1920;
    public static AudDisplay1024 AudDisp1024;
    public static AudDisplay800 AudDisp800;
    public static AudDisplay1280 AudDisp1280;
    public static ViewJSConfig JSConfigView;
    public static AboutUI about;
    public static JoystickTest JS;
    public static SettingsUI settings;
    public static Timer timer;
    public static int GameClock = 150;
    public static int ClockRemaining = 150;
    public static boolean isFullscreen = false;
    public static boolean audIsOpen = false;
    public static String iconURL = "/ftc/goal/counter/images/FIRSTicon_RGB_withTM.png";
    public static final String version = "1.0.3";

    /**
     * Creates new form GoalCounterUI
     */
    
    public GoalCounterUI() {
        initComponents();
        Image img = new ImageIcon(getClass().getResource(iconURL)).getImage();
        setIconImage(img);
    }
    
    public static void spinnersync(){
          RedCenAuto = (Integer) RedCenAutoSpin.getValue();
          BlueCenAuto = (Integer) BlueCenAutoSpin.getValue();
          RedCorAuto = (Integer) RedCorAutoSpin.getValue();
          BlueCorAuto = (Integer) BlueCorAutoSpin.getValue();
          RedCenTele = (Integer) RedCenTeleSpin.getValue();
          BlueCenTele = (Integer) BlueCenTeleSpin.getValue();
          RedCorTele = (Integer) RedCorTeleSpin.getValue();
          BlueCorTele = (Integer) BlueCorTeleSpin.getValue();
          //1600
          AudDisplay1600.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
          AudDisplay1600.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
          AudDisplay1600.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
          AudDisplay1600.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
          AudDisplay1600.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
          AudDisplay1600.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
          AudDisplay1600.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
          AudDisplay1600.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
          //1366
          AudDisplay1366.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
          AudDisplay1366.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
          AudDisplay1366.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
          AudDisplay1366.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
          AudDisplay1366.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
          AudDisplay1366.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
          AudDisplay1366.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
          AudDisplay1366.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
          //1080
          AudDisplay1920.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
          AudDisplay1920.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
          AudDisplay1920.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
          AudDisplay1920.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
          AudDisplay1920.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
          AudDisplay1920.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
          AudDisplay1920.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
          AudDisplay1920.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
          //1024
          AudDisplay1024.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
          AudDisplay1024.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
          AudDisplay1024.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
          AudDisplay1024.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
          AudDisplay1024.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
          AudDisplay1024.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
          AudDisplay1024.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
          AudDisplay1024.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
          //800
          AudDisplay800.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
          AudDisplay800.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
          AudDisplay800.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
          AudDisplay800.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
          AudDisplay800.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
          AudDisplay800.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
          AudDisplay800.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
          AudDisplay800.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
          //720
          AudDisplay1280.RedCenAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCenAuto));
          AudDisplay1280.RedCenTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCenTele));
          AudDisplay1280.RedCorAutoDisplay.setText(Integer.toString(GoalCounterUI.RedCorAuto));
          AudDisplay1280.RedCorTeleDisplay.setText(Integer.toString(GoalCounterUI.RedCorTele));
          AudDisplay1280.BlueCenAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCenAuto));
          AudDisplay1280.BlueCenTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCenTele));
          AudDisplay1280.BlueCorAutoDisplay.setText(Integer.toString(GoalCounterUI.BlueCorAuto));
          AudDisplay1280.BlueCorTeleDisplay.setText(Integer.toString(GoalCounterUI.BlueCorTele));
  }
    
    public void updateTimers(String TimerText){
        AudDisplay1600.TimerDisplay.setText(TimerText);
        AudDisplay1366.TimerDisplay.setText(TimerText);
        AudDisplay1920.TimerDisplay.setText(TimerText);
        AudDisplay1024.TimerDisplay.setText(TimerText);
        AudDisplay800.TimerDisplay.setText(TimerText);
        AudDisplay1280.TimerDisplay.setText(TimerText);
    }
    
    public static void resetTimerElements(){
            if (TimerActive == true){
                timer.cancel();
            }
            logger.info("User force reset everything during" + AudDisplay1920.State.getText() + " at: " + GameClock + System.lineSeparator() + 
                    "Scores," + RedCenAuto + "," + RedCenTele + "," + RedCorAuto + "," + RedCorTele + 
                    "," + BlueCenAuto + "," + BlueCenTele + "," + BlueCorAuto + "," + BlueCorTele);
            GameClock = 150;
            ClockRemaining = 150;
            Auto.setSelected(true);
            AutoState = true;
            TeleState = false;
            TimerActive = false;
            AudDisplay1600.TimerDisplay.setText("2:30");
            AudDisplay1366.TimerDisplay.setText("2:30");
            AudDisplay1920.TimerDisplay.setText("2:30");
            AudDisplay1024.TimerDisplay.setText("2:30");
            AudDisplay800.TimerDisplay.setText("2:30");
            AudDisplay1280.TimerDisplay.setText("2:30");
            Timer.setText("Match Timer: 2:30");
            AudDisplay1600.State.setText("Autonomous Mode");
            AudDisplay1366.State.setText("Autonomous Mode");
            AudDisplay1920.State.setText("Autonomous Mode");
            AudDisplay1024.State.setText("Autonomous Mode");
            AudDisplay800.State.setText("Autonomous Mode");
            AudDisplay1280.State.setText("Autonomous Mode");
            timerstart.setEnabled(true);
            timerstart.setText("START");
            pauseresume.setEnabled(false);
            pauseresume.setText("PAUSE");
            
    }
    
    public static void resetcounters(){
        RedCenAuto = 0;
        RedCorAuto = 0;
        BlueCenAuto = 0;
        BlueCorAuto = 0;
        RedCenTele = 0;
        RedCorTele = 0;
        BlueCenTele = 0;
        BlueCorTele = 0;
        RedCenAutoSpin.setValue(0);
        RedCenTeleSpin.setValue(0);
        RedCorAutoSpin.setValue(0);
        RedCorTeleSpin.setValue(0);
        BlueCenAutoSpin.setValue(0);
        BlueCenTeleSpin.setValue(0);
        BlueCorAutoSpin.setValue(0);
        BlueCorTeleSpin.setValue(0);
        isFullscreen = false;
        resetTimerElements();        
    }
        
    public void play(String filename){
      try{
        InputStream inputStream = getClass().getResourceAsStream("/ftc/goal/counter/gamesound/" + filename + ".wav");
        AudioStream audioStream = new AudioStream(inputStream);
        AudioPlayer.player.start(audioStream);
      }catch (Exception e){ 
          logger.severe("Couldn't play " + filename);
          logger.severe(e.getLocalizedMessage());
          e.printStackTrace();
      }
    }

    public static void ModeChange(){
        if(AutoState == true){
            Teleop.setSelected(true);
            AutoState = false;
            TeleState = true;
            AudDisplay1600.State.setText("Driver-Controlled Mode");
            AudDisplay1366.State.setText("Driver-Controlled Mode");
            AudDisplay1920.State.setText("Driver-Controlled Mode");
            AudDisplay1024.State.setText("Driver-Controlled Mode");
            AudDisplay800.State.setText("Driver-Controlled Mode");
            AudDisplay1280.State.setText("Driver-Controlled Mode");  
            logger.info("Set Mode to Driver-Controlled");
        }
        else if (TeleState == true){
            Auto.setSelected(true);
            AutoState = true;
            TeleState = false;
            AudDisplay1600.State.setText("Autonomous Mode");
            AudDisplay1366.State.setText("Autonomous Mode");
            AudDisplay1920.State.setText("Autonomous Mode");
            AudDisplay1024.State.setText("Autonomous Mode");
            AudDisplay800.State.setText("Autonomous Mode");
            AudDisplay1280.State.setText("Autonomous Mode");
            logger.info("Set Mode to Driver-Controlled");

        } 
    }

    public void StartClock(){
        pause = false;
        if(GameClock >= 121 && TimerActive == false) {
            pauseresume.setEnabled(true);
            timerstart.setEnabled(false);
            if(GameClock == 150){
                play("start-auto");
            }
            countdownclockAuto();
            Auto.setSelected(true);
            AutoState = true;
            TeleState = false;
            AudDisplay1600.State.setText("Autonomous Mode");
            AudDisplay1366.State.setText("Autonomous Mode");
            AudDisplay1920.State.setText("Autonomous Mode");
            AudDisplay1024.State.setText("Autonomous Mode");
            AudDisplay800.State.setText("Autonomous Mode");
            AudDisplay1280.State.setText("Autonomous Mode");  
            TimerActive = true;
            logger.info("Started Timer in Auto Mode at time " + GameClock);
        } else if(GameClock <= 120 && TimerActive == false) {
                pauseresume.setEnabled(true);
                timerstart.setEnabled(false);
                if(GameClock == 120){
                    play("start-tele");
                }
                countdownclockDrive();
                Teleop.setSelected(true);
                AutoState = false;
                TeleState = true;
                AudDisplay1920.State.setText("Driver-Controlled Mode");
                AudDisplay1600.State.setText("Driver-Controlled Mode");
                AudDisplay1366.State.setText("Driver-Controlled Mode");
                AudDisplay1920.State.setText("Driver-Controlled Mode");
                AudDisplay1024.State.setText("Driver-Controlled Mode");
                AudDisplay800.State.setText("Driver-Controlled Mode");
                AudDisplay1280.State.setText("Driver-Controlled Mode");
                TimerActive = true;
                logger.info("Started Timer in Driver Mode at time " + GameClock);
            }
        }

    public void countdownclockAuto(){
        if(GameClock <= 150){
            int delay = 1000;
            int period = 1000;
            int stopsec = 121;
            timer = new Timer();
            GameClock = ClockRemaining; 
            timer.scheduleAtFixedRate(new TimerTask(){

                public void run(){
                    int i = setInterval(stopsec); 
                    int mins = i/60; 
                    int secs = (i - (mins * 60));
                    ClockRemaining = ((mins * 60)+ secs);
                    if (GameClock == 120){
                        timerstart.setText("CONTINUE");
                        timerstart.setEnabled(true);
                        pauseresume.setEnabled(false);
                        TimerActive = false;
                        pause = true;
                    }
                    if(secs < 10) {
                        String TimerText = mins + ":0" + secs;
                        updateTimers(TimerText);
                        Timer.setText("Match Timer: " + mins + ":0" + secs);
                    } else {
                        String TimerText = mins + ":" + secs;
                        updateTimers(TimerText);
                        Timer.setText("Match Timer: " + mins + ":" + secs);
                    }    
                }

            }, delay, period);
        }
    }

    public void countdownclockDrive(){
        if(GameClock<=120){
            int delay = 1000;
            int period = 1000;
            int stopsec = 1;
            timer = new Timer();
            GameClock = ClockRemaining;
            timer.scheduleAtFixedRate(new TimerTask(){
                public void run(){
                    int i = setInterval(stopsec); 
                    int mins = i/60; 
                    int secs = (i - (mins * 60));
                    ClockRemaining = ((mins * 60)+ secs);
                    if(secs < 10) {
                        String TimerText = mins + ":0" + secs;
                        updateTimers(TimerText);
                        Timer.setText("Match Timer: " + mins + ":0" + secs);
                    } else {
                        String TimerText = mins + ":" + secs;
                        updateTimers(TimerText);
                        Timer.setText("Match Timer: " + mins + ":" + secs);
                    }    
                }
            }, delay, period);
        }
    }

    private final int setInterval(int stoptime){
        if(ClockRemaining == 141){
                play("time-endgame");
                logger.info("Played Auto Endgame at time " + ClockRemaining);
            }else if (ClockRemaining == 121){
                play("end-auto");
                logger.info("Played End Auto at time " + ClockRemaining);
            }else if(ClockRemaining == 31){
                play("time-endgame");
                logger.info("Played Driver Endgame at time " + ClockRemaining);
            }else if(ClockRemaining == 1){
                play("end-tele");
                logger.info("Played End Driver at time " + ClockRemaining);
        }
        if(GameClock == stoptime){
            timer.cancel();
            pauseresume.setEnabled(false);
            logger.info(AudDisplay1920.State.getText() + " Timer Expired, Timer Stopped at " + GameClock + System.lineSeparator() + 
                    "Scores," + RedCenAuto + "," + RedCenTele + "," + RedCorAuto + "," + RedCorTele + 
                    "," + BlueCenAuto + "," + BlueCenTele + "," + BlueCorAuto + "," + BlueCorTele);
        }
        return --GameClock;
    }

    public void IncrsRedCenA(){
         if(JoystickTest.PressJSRedCenAbtn==true && JoystickTest.pressLstJSRedCenAbtn!=true && SettingsUI.RedCenBtn == true){
            if(AutoState == true){
                RedCenAutoSpin.setValue(++RedCenAuto);
                JoystickTest.pressLstJSRedCenAbtn = true;     
            }
            if(TeleState == true){
                RedCenTeleSpin.setValue(++RedCenTele);
                JoystickTest.pressLstJSRedCenAbtn = true;  
            }
        }
    }

    public void DcrsRedCenB(){
         if(JoystickTest.PressJSRedCenBbtn==true && JoystickTest.pressLstJSRedCenBbtn!=true && SettingsUI.RedCenBtn == true){
            if(AutoState == true){
                if(RedCenAuto < 1){
                    RedCenAuto = 0;   
                }
                else{
                    RedCenAutoSpin.setValue(--RedCenAuto);
                    JoystickTest.pressLstJSRedCenBbtn = true;
                }  
            }
            if(TeleState == true){
                if(RedCenTele < 1){
                    RedCenTele = 0;   
                }
                else{
                    RedCenTeleSpin.setValue(--RedCenTele);
                    JoystickTest.pressLstJSRedCenBbtn = true;
                }  
            }  
        }
    }

    public void IncrsRedCenLB(){
         if(JoystickTest.PressJSRedCenLB==true && JoystickTest.pressLstJSRedCenLB!=true && SettingsUI.RedCenLeft==true){
                if(AutoState == true){
                          RedCenAutoSpin.setValue(++RedCenAuto);
                          JoystickTest.pressLstJSRedCenLB = true;     
                }
                if(TeleState == true){
                          RedCenTeleSpin.setValue(++RedCenTele);
                          JoystickTest.pressLstJSRedCenLB = true;     
                }     
        }
    }
        
    public void DcrsRedCenLT(){
         if(JoystickTest.PressJSRedCenLT==true && JoystickTest.pressLstJSRedCenLT!=true && SettingsUI.RedCenLeft==true){
            if(AutoState == true){
                if(RedCenAuto < 1){
                    RedCenAuto = 0;   
                }
                else{
                    RedCenAutoSpin.setValue(--RedCenAuto);
                    JoystickTest.pressLstJSRedCenLT = true;
                }  
            }
            if(TeleState == true){
                if(RedCenTele < 1){
                    RedCenTele = 0;   
                }
                else{
                    RedCenTeleSpin.setValue(--RedCenTele);
                    JoystickTest.pressLstJSRedCenLT = true;
                }  
            }
        } 
    }
    
    public void IncrsRedCenRB(){
    if(JoystickTest.PressJSRedCenRB==true && JoystickTest.pressLstJSRedCenRB!=true && SettingsUI.RedCenRight==true){
           if(AutoState == true){
                     RedCenAutoSpin.setValue(++RedCenAuto);
                     JoystickTest.pressLstJSRedCenRB = true;     
           }
           if(TeleState == true){
                     RedCenTeleSpin.setValue(++RedCenTele);
                     JoystickTest.pressLstJSRedCenRB = true;     
           }
       }
    }
        
    public void DcrsRedCenRT(){
         if(JoystickTest.PressJSRedCenRT==true && JoystickTest.pressLstJSRedCenRT!=true && SettingsUI.RedCenRight==true){
            if(AutoState == true){
                if(RedCenAuto < 1){
                    RedCenAuto = 0;   
                }
                else{
                    RedCenAutoSpin.setValue(--RedCenAuto);
                    JoystickTest.pressLstJSRedCenRT = true;
                }  
            }
            if(TeleState == true){
                if(RedCenTele < 1){
                    RedCenTele = 0;   
                }
                else{
                    RedCenTeleSpin.setValue(--RedCenTele);
                    JoystickTest.pressLstJSRedCenRT = true;
                }  
            } 
        }
    }
    
    public void IncrsBlueCenA(){
         if(JoystickTest.PressJSBlueCenAbtn==true && JoystickTest.pressLstJSBlueCenAbtn!=true && SettingsUI.BlueCenBtn == true){
            if(AutoState == true){
                BlueCenAutoSpin.setValue(++BlueCenAuto);
                JoystickTest.pressLstJSBlueCenAbtn = true;     
            }
            if(TeleState == true){
                BlueCenTeleSpin.setValue(++BlueCenTele);
                JoystickTest.pressLstJSBlueCenAbtn = true;     
            }   
        }
    }
    
    public void DcrsBlueCenB(){
         if(JoystickTest.PressJSBlueCenBbtn==true && JoystickTest.pressLstJSBlueCenBbtn!=true && SettingsUI.BlueCenBtn == true){
            if(AutoState == true){
                if(BlueCenAuto < 1){
                    BlueCenAuto = 0;   
                }
                else{
                    BlueCenAutoSpin.setValue(--BlueCenAuto);
                    JoystickTest.pressLstJSBlueCenBbtn = true;
                }  
            }
            if(TeleState == true){
                if(BlueCenTele < 1){
                    BlueCenTele = 0;   
                }
                else{
                    BlueCenTeleSpin.setValue(--BlueCenTele);
                    JoystickTest.pressLstJSBlueCenBbtn = true;
                } 
            }         
        }
    }
     
    public void IncrsBlueCenLB(){
         if(JoystickTest.PressJSBlueCenLB==true && JoystickTest.pressLstJSBlueCenLB!=true && SettingsUI.BlueCenLeft==true){
            if(AutoState == true){
                BlueCenAutoSpin.setValue(++BlueCenAuto);
                JoystickTest.pressLstJSBlueCenLB = true;     
            }
            if(TeleState == true){
                BlueCenTeleSpin.setValue(++BlueCenTele);
                JoystickTest.pressLstJSBlueCenLB = true;     
            }      
        }
    }
        
    public void DcrsBlueCenLT(){
         if(JoystickTest.PressJSBlueCenLT==true && JoystickTest.pressLstJSBlueCenLT!=true && SettingsUI.BlueCenLeft==true){
            if(AutoState == true){
                if(BlueCenAuto < 1){
                    BlueCenAuto = 0;   
                }
                else{
                    BlueCenAutoSpin.setValue(--BlueCenAuto);
                    JoystickTest.pressLstJSBlueCenLT = true;
                }  
            }
            if(TeleState == true){
                if(BlueCenTele < 1){
                    BlueCenTele = 0;   
                }
                else{
                    BlueCenTeleSpin.setValue(--BlueCenTele);
                    JoystickTest.pressLstJSBlueCenLT = true;
                }  
            }
        }
    }
    
    public void IncrsBlueCenRB(){
         if(JoystickTest.PressJSBlueCenRB==true && JoystickTest.pressLstJSBlueCenRB!=true && SettingsUI.BlueCenRight==true){
            if(AutoState == true){
                BlueCenAutoSpin.setValue(++BlueCenAuto);
                JoystickTest.pressLstJSBlueCenRB = true;     
            }
            if(TeleState == true){
                BlueCenTeleSpin.setValue(++BlueCenTele);
                JoystickTest.pressLstJSBlueCenRB = true;     
            }      
        }
    }
        
    public void DcrsBlueCenRT(){
         if(JoystickTest.PressJSBlueCenRT==true && JoystickTest.pressLstJSBlueCenRT!=true && SettingsUI.BlueCenRight==true){
            if(AutoState == true){
                if(BlueCenAuto < 1){
                    BlueCenAuto = 0;   
                }
                else{
                    BlueCenAutoSpin.setValue(--BlueCenAuto);
                    JoystickTest.pressLstJSBlueCenRT = true;
                }  
            }
            if(TeleState == true){
                if(BlueCenTele < 1){
                    BlueCenTele = 0;   
                }
                else{
                    BlueCenTeleSpin.setValue(--BlueCenTele);
                    JoystickTest.pressLstJSBlueCenRT = true;
                }  
            }
        }
    }
            
    public void IncrsRedCorA(){
         if(JoystickTest.PressJSRedCorAbtn==true && JoystickTest.pressLstJSRedCorAbtn!=true && SettingsUI.RedCorBtn == true){
            if(AutoState == true){
                RedCorAutoSpin.setValue(++RedCorAuto);
                JoystickTest.pressLstJSRedCorAbtn = true;     
            }
            if(TeleState == true){
                RedCorTeleSpin.setValue(++RedCorTele);
                JoystickTest.pressLstJSRedCorAbtn = true;     
            }       
        }
    }
    
    public void DcrsRedCorB(){
         if(JoystickTest.PressJSRedCorBbtn==true && JoystickTest.pressLstJSRedCorBbtn!=true && SettingsUI.RedCorBtn == true){
            if(AutoState == true){
                if(RedCorAuto < 1){
                    RedCorAuto = 0;   
                }
                else{
                    RedCorAutoSpin.setValue(--RedCorAuto);
                    JoystickTest.pressLstJSRedCorBbtn = true;
                }  
            }
            if(TeleState == true){
                if(RedCorTele < 1){
                    RedCorTele = 0;   
                }
                else{
                    RedCorTeleSpin.setValue(--RedCorTele);
                    JoystickTest.pressLstJSRedCorBbtn = true;
                }  
            }    
        }
    }
        
    public void IncrsRedCorLB(){
         if(JoystickTest.PressJSRedCorLB==true && JoystickTest.pressLstJSRedCorLB!=true && SettingsUI.RedCorLeft==true){
            if(AutoState == true){
                RedCorAutoSpin.setValue(++RedCorAuto);
                JoystickTest.pressLstJSRedCorLB = true;     
            }
            if(TeleState == true){
                RedCorTeleSpin.setValue(++RedCorTele);
                JoystickTest.pressLstJSRedCorLB = true;     
            }   
        }
    }
        
    public void DcrsRedCorLT(){
         if(JoystickTest.PressJSRedCorLT==true && JoystickTest.pressLstJSRedCorLT!=true && SettingsUI.RedCorLeft==true){
            if(AutoState == true){
                if(RedCorAuto < 1){
                    RedCorAuto = 0;   
                }
                else{
                    RedCorAutoSpin.setValue(--RedCorAuto);
                    JoystickTest.pressLstJSRedCorLT = true;
                }  
            }
            if(TeleState == true){
                if(RedCorTele < 1){
                    RedCorTele = 0;   
                }
                else{
                    RedCorTeleSpin.setValue(--RedCorTele);
                    JoystickTest.pressLstJSRedCorLT = true;
                }  
            }   
        }
    }
    
    public void IncrsRedCorRB(){
         if(JoystickTest.PressJSRedCorRB==true && JoystickTest.pressLstJSRedCorRB!=true && SettingsUI.RedCorRight==true){
            if(AutoState == true){
                RedCorAutoSpin.setValue(++RedCorAuto);
                JoystickTest.pressLstJSRedCorRB = true;     
            }
            if(TeleState == true){
                RedCorTeleSpin.setValue(++RedCorTele);
                JoystickTest.pressLstJSRedCorRB = true;     
            }  
        }
    }
        
    public void DcrsRedCorRT(){
         if(JoystickTest.PressJSRedCorRT==true && JoystickTest.pressLstJSRedCorRT!=true && SettingsUI.RedCorRight==true){
            if(AutoState == true){
                if(RedCorAuto < 1){
                    RedCorAuto = 0;   
                }
                else{
                    RedCorAutoSpin.setValue(--RedCorAuto);
                    JoystickTest.pressLstJSRedCorRT = true;
                }  
            }
            if(TeleState == true){
                if(RedCorTele < 1){
                    RedCorTele = 0;   
                }
                else{
                    RedCorTeleSpin.setValue(--RedCorTele);
                    JoystickTest.pressLstJSRedCorRT = true;
                }  
            }    
            }
        }
        
    public void IncrsBlueCorA(){
         if(JoystickTest.PressJSBlueCorAbtn==true && JoystickTest.pressLstJSBlueCorAbtn!=true && SettingsUI.BlueCorBtn == true){
            if(AutoState == true){
                BlueCorAutoSpin.setValue(++BlueCorAuto);
                JoystickTest.pressLstJSBlueCorAbtn = true;     
            }
            if(TeleState == true){
                BlueCorTeleSpin.setValue(++BlueCorTele);
                JoystickTest.pressLstJSBlueCorAbtn = true;     
            }    
        }
    }
    
    public void DcrsBlueCorB(){
        if(JoystickTest.PressJSBlueCorBbtn==true && JoystickTest.pressLstJSBlueCorBbtn!=true && SettingsUI.BlueCorBtn == true){
            if(AutoState == true){
                if(BlueCorAuto < 1){
                    BlueCorAuto = 0;   
                }
                else{
                    BlueCorAutoSpin.setValue(--BlueCorAuto);
                    JoystickTest.pressLstJSBlueCorBbtn = true;
                }  
            }
            if(TeleState == true){
                if(BlueCorTele < 1){
                    BlueCorTele = 0;   
                }
                else{
                    BlueCorTeleSpin.setValue(--BlueCorTele);
                    JoystickTest.pressLstJSBlueCorBbtn = true;
                } 
            }  
        }     
    }
    
    public void IncrsBlueCorLB(){
         if(JoystickTest.PressJSBlueCorLB==true && JoystickTest.pressLstJSBlueCorLB!=true && SettingsUI.BlueCorLeft==true){
            if(AutoState == true){
                BlueCorAutoSpin.setValue(++BlueCorAuto);
                JoystickTest.pressLstJSBlueCorLB = true;     
            }
            if(TeleState == true){
                BlueCorTeleSpin.setValue(++BlueCorTele);
                JoystickTest.pressLstJSBlueCorLB = true;     
            }    
        }
    }
        
    public void DcrsBlueCorLT(){
         if(JoystickTest.PressJSBlueCorLT==true && JoystickTest.pressLstJSBlueCorLT!=true && SettingsUI.BlueCorLeft==true){
            if(AutoState == true){
                if(BlueCorAuto < 1){
                    BlueCorAuto = 0;   
                }
                else{
                    BlueCorAutoSpin.setValue(--BlueCorAuto);
                    JoystickTest.pressLstJSBlueCorLT = true;
                }  
            }
            if(TeleState == true){
                if(BlueCorTele < 1){
                    BlueCorTele = 0;   
                }
                else{
                    BlueCorTeleSpin.setValue(--BlueCorTele);
                    JoystickTest.pressLstJSBlueCorLT = true;
                } 
            }  
        }
    }
    
    public void IncrsBlueCorRB(){
        if(JoystickTest.PressJSBlueCorRB==true && JoystickTest.pressLstJSBlueCorRB!=true && SettingsUI.BlueCorRight==true){
            if(AutoState == true){
                BlueCorAutoSpin.setValue(++BlueCorAuto);
                JoystickTest.pressLstJSBlueCorRB = true;     
            }
            if(TeleState == true){
                BlueCorTeleSpin.setValue(++BlueCorTele);
                JoystickTest.pressLstJSBlueCorRB= true;     
            }    
        }
    }
        
    public void DcrsBlueCorRT(){
         if(JoystickTest.PressJSBlueCorRT==true && JoystickTest.pressLstJSBlueCorRT!=true && SettingsUI.BlueCorRight==true){
            if(AutoState == true){
                if(BlueCorAuto < 1){
                    BlueCorAuto = 0;   
                }
                else{
                    BlueCorAutoSpin.setValue(--BlueCorAuto);
                    JoystickTest.pressLstJSBlueCorRT = true;
                }  
            }
            if(TeleState == true){
                if(BlueCorTele < 1){
                    BlueCorTele = 0;   
                }
                else{
                    BlueCorTeleSpin.setValue(--BlueCorTele);
                    JoystickTest.pressLstJSBlueCorRT = true;
                } 
            }
        }
    }

    public void TimerXBtn(){
         if(JoystickTest.PressJSTimerXbtn == true && JoystickTest.pressLstJSTimerXbtn != true && SettingsUI.ModeChange == true){
            ModeChange();
            JoystickTest.pressLstJSTimerXbtn = true;
        }
    }
    
    public void TimerStart(){
         if(JoystickTest.PressJSTimerStart == true && JoystickTest.pressLstJSTimerStart != true && SettingsUI.JSTimer == true){
            //StartClock();
            if(TimerActive == false && ClockRemaining == 150){
                StartClock();
            }else if(pause == false){
                timer.cancel();
                GameClock = ClockRemaining;
                pause = true;
                TimerActive = false;
                pauseresume.setText("RESUME");
                play("stop-forghorn");
        } else {
                pauseresume.setText("PAUSE");
                pause = false;
                StartClock();
        }
            JoystickTest.pressLstJSTimerStart = true;
        }
    }
    
    public void TimerBack(){
         if(JoystickTest.PressJSTimerBack == true && JoystickTest.pressLstJSTimerBack != true && SettingsUI.Reset == true){
            resetcounters();
            JoystickTest.pressLstJSTimerBack = true;
        }
    }          

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModeSelect = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        RedAlliance = new javax.swing.JPanel();
        RedCorJSStatus = new javax.swing.JPanel();
        RedCorTeleSpin = new javax.swing.JSpinner();
        RedCorTeleLabel = new javax.swing.JLabel();
        RedCorAutoSpin = new javax.swing.JSpinner();
        RedCorAutoeLabel = new javax.swing.JLabel();
        RedVortCorLabel = new javax.swing.JLabel();
        RedCenJSStatus = new javax.swing.JPanel();
        RedCenTeleSpin = new javax.swing.JSpinner();
        RedCenTeleLabel = new javax.swing.JLabel();
        RedCenAutoSpin = new javax.swing.JSpinner();
        RedCenAutoLabel = new javax.swing.JLabel();
        RedVortCenLabel = new javax.swing.JLabel();
        BlueAlliance = new javax.swing.JPanel();
        BlueCenJSStatus = new javax.swing.JPanel();
        BlueCenTeleSpin = new javax.swing.JSpinner();
        BlueCorTeleLabel = new javax.swing.JLabel();
        BlueCenAutoSpin = new javax.swing.JSpinner();
        BlueCorAutoLabel = new javax.swing.JLabel();
        BlueVortCenLabel = new javax.swing.JLabel();
        BlueCorJSStatus = new javax.swing.JPanel();
        BlueCenAutoLabel = new javax.swing.JLabel();
        BlueVortCorLabel = new javax.swing.JLabel();
        BlueCorAutoSpin = new javax.swing.JSpinner();
        BlueCenTeleLabel = new javax.swing.JLabel();
        BlueCorTeleSpin = new javax.swing.JSpinner();
        FTCLogoSmall = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        VersionInfo = new javax.swing.JLabel();
        SettingButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        auddisplay = new javax.swing.JButton();
        Auto = new javax.swing.JRadioButton();
        Teleop = new javax.swing.JRadioButton();
        timerstart = new javax.swing.JButton();
        HeaderLabel1 = new javax.swing.JLabel();
        pauseresume = new javax.swing.JButton();
        TimerStatus = new javax.swing.JPanel();
        Timer = new javax.swing.JLabel();

        ModeSelect.add(Auto);
        ModeSelect.add(Teleop);

        jButton3.setText("START");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vortex Counter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(440, 590));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        RedAlliance.setBackground(new java.awt.Color(237, 28, 36));
        RedAlliance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Red Vortex", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        RedCorTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCorTeleSpin.setName("redvorcencount"); // NOI18N

        RedCorTeleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCorTeleLabel.setText("Driver");

        RedCorAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        RedCorAutoeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCorAutoeLabel.setText("Auto");

        RedVortCorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RedVortCorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedVortCorLabel.setText("Corner Vortex");

        javax.swing.GroupLayout RedCorJSStatusLayout = new javax.swing.GroupLayout(RedCorJSStatus);
        RedCorJSStatus.setLayout(RedCorJSStatusLayout);
        RedCorJSStatusLayout.setHorizontalGroup(
            RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedVortCorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RedCorJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RedCorJSStatusLayout.createSequentialGroup()
                        .addComponent(RedCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RedCorTeleSpin))
                    .addGroup(RedCorJSStatusLayout.createSequentialGroup()
                        .addComponent(RedCorAutoeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RedCorTeleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RedCorJSStatusLayout.setVerticalGroup(
            RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedCorJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RedVortCorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCorAutoeLabel)
                    .addComponent(RedCorTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RedCorAutoSpin.getAccessibleContext().setAccessibleName("RedCorVor");
        RedCorAutoSpin.getAccessibleContext().setAccessibleDescription("");

        RedCenTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCenTeleSpin.setName("redvorcencount"); // NOI18N

        RedCenTeleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCenTeleLabel.setText("Driver");

        RedCenAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCenAutoSpin.setName("redvorcencount"); // NOI18N

        RedCenAutoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCenAutoLabel.setText("Auto");

        RedVortCenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RedVortCenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedVortCenLabel.setText("Center Vortex");

        javax.swing.GroupLayout RedCenJSStatusLayout = new javax.swing.GroupLayout(RedCenJSStatus);
        RedCenJSStatus.setLayout(RedCenJSStatusLayout);
        RedCenJSStatusLayout.setHorizontalGroup(
            RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedCenJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RedCenJSStatusLayout.createSequentialGroup()
                        .addComponent(RedCenAutoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RedCenTeleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RedCenJSStatusLayout.createSequentialGroup()
                        .addComponent(RedCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RedCenTeleSpin, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(RedVortCenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RedCenJSStatusLayout.setVerticalGroup(
            RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedCenJSStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RedVortCenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCenAutoLabel)
                    .addComponent(RedCenTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        RedCenAutoSpin.getAccessibleContext().setAccessibleName("redvorcencount");
        RedCenAutoSpin.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout RedAllianceLayout = new javax.swing.GroupLayout(RedAlliance);
        RedAlliance.setLayout(RedAllianceLayout);
        RedAllianceLayout.setHorizontalGroup(
            RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedAllianceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RedCorJSStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RedCenJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        RedAllianceLayout.setVerticalGroup(
            RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedAllianceLayout.createSequentialGroup()
                .addComponent(RedCenJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCorJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BlueAlliance.setBackground(new java.awt.Color(0, 101, 179));
        BlueAlliance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blue Votex", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        BlueCenTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCorTeleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCorTeleLabel.setText("Driver");

        BlueCenAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCorAutoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCorAutoLabel.setText("Auto");

        BlueVortCenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BlueVortCenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueVortCenLabel.setText("Center Vortex");

        javax.swing.GroupLayout BlueCenJSStatusLayout = new javax.swing.GroupLayout(BlueCenJSStatus);
        BlueCenJSStatus.setLayout(BlueCenJSStatusLayout);
        BlueCenJSStatusLayout.setHorizontalGroup(
            BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BlueVortCenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BlueCenJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BlueCorAutoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlueCenAutoSpin, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGroup(BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BlueCenJSStatusLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BlueCorTeleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                    .addGroup(BlueCenJSStatusLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BlueCenTeleSpin)))
                .addContainerGap())
        );
        BlueCenJSStatusLayout.setVerticalGroup(
            BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCenJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlueVortCenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCorAutoLabel)
                    .addComponent(BlueCorTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BlueCenAutoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCenAutoLabel.setText("Auto");

        BlueVortCorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BlueVortCorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueVortCorLabel.setText("Corner Vortex");

        BlueCorAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCenTeleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCenTeleLabel.setText("Driver");

        BlueCorTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout BlueCorJSStatusLayout = new javax.swing.GroupLayout(BlueCorJSStatus);
        BlueCorJSStatus.setLayout(BlueCorJSStatusLayout);
        BlueCorJSStatusLayout.setHorizontalGroup(
            BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BlueVortCorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BlueCorJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BlueCenAutoLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlueCorAutoSpin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BlueCorTeleSpin, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(BlueCenTeleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BlueCorJSStatusLayout.setVerticalGroup(
            BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCorJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlueVortCorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCenAutoLabel)
                    .addComponent(BlueCenTeleLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BlueAllianceLayout = new javax.swing.GroupLayout(BlueAlliance);
        BlueAlliance.setLayout(BlueAllianceLayout);
        BlueAllianceLayout.setHorizontalGroup(
            BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueAllianceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BlueCorJSStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BlueCenJSStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        BlueAllianceLayout.setVerticalGroup(
            BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueAllianceLayout.createSequentialGroup()
                .addComponent(BlueCenJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCorJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FTCLogoSmall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FTCLogoSmall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ftclogofull.png"))); // NOI18N

        ResetButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        VersionInfo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        VersionInfo.setText("VER: " + version);
        VersionInfo.setToolTipText("");

        SettingButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SettingButton.setText("SETTINGS");
        SettingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingButtonActionPerformed(evt);
            }
        });

        AboutButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AboutButton.setText("ABOUT");
        AboutButton.setToolTipText("");
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });

        copyright.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        copyright.setText("Copyright (c) 2016 FIRST");

        auddisplay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        auddisplay.setText("DISPLAY");
        auddisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auddisplayActionPerformed(evt);
            }
        });

        Auto.setSelected(true);
        Auto.setText("Autonomous Period");
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });

        Teleop.setText("Driver-Controlled Period");
        Teleop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeleopActionPerformed(evt);
            }
        });

        timerstart.setText("START");
        timerstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerstartActionPerformed(evt);
            }
        });

        HeaderLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        HeaderLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel1.setText("Vortex Counter");

        pauseresume.setText("PAUSE");
        pauseresume.setEnabled(false);
        pauseresume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseresumeActionPerformed(evt);
            }
        });

        Timer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Timer.setText("Match Timer: 2:30");

        javax.swing.GroupLayout TimerStatusLayout = new javax.swing.GroupLayout(TimerStatus);
        TimerStatus.setLayout(TimerStatusLayout);
        TimerStatusLayout.setHorizontalGroup(
            TimerStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimerStatusLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );
        TimerStatusLayout.setVerticalGroup(
            TimerStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Timer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(copyright)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VersionInfo))
                            .addComponent(FTCLogoSmall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SettingButton)
                                    .addComponent(auddisplay))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Auto)
                                    .addComponent(Teleop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AboutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ResetButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TimerStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(timerstart)
                                    .addComponent(RedAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BlueAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pauseresume))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(HeaderLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FTCLogoSmall)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(HeaderLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RedAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timerstart)
                    .addComponent(pauseresume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SettingButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(auddisplay))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Auto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Teleop)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyright))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ResetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AboutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VersionInfo)))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        resetcounters();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        if(!settings.isVisible()){
            settings.setVisible(true);
        }
    }//GEN-LAST:event_SettingButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        if(!about.isVisible()){
            about.setVisible(true);
            logger.info("Set About Window Visible");
        }
    }//GEN-LAST:event_AboutButtonActionPerformed
//Pro Java Coding Going on here:
    private void auddisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auddisplayActionPerformed
        switch (SettingsUI.AudDispOpen) {
            case 0://1080
                logger.info("Set 1920 Audience Display Open");
                if(!AudDisp1920.isVisible() && !audIsOpen){
                    AudDisp1920.dispose();
                    if (AudDisp1920.isUndecorated()){
                        AudDisp1920.setUndecorated(false);
                        AudDisp1920.setResizable(true);
                    }   AudDisp1920.setVisible(true);
                    audIsOpen = true;
                 }   
                break;
            case 1://1600
                logger.info("Set 1600 Audience Display Open");
                if(!AudDisp1600.isVisible() && !audIsOpen){
                    AudDisp1600.dispose();
                    if (AudDisp1600.isUndecorated()){
                        AudDisp1600.setUndecorated(false);
                        AudDisp1600.setResizable(true);
                    }
                    AudDisp1600.setVisible(true);
                    audIsOpen = true;
                }
                break;
            case 2://1366
                logger.info("Set 1366 Audience Display Open");
                if(!AudDisp1366.isVisible() && !audIsOpen){
                    AudDisp1366.dispose();
                    if (AudDisp1366.isUndecorated()){
                        AudDisp1366.setUndecorated(false);
                        AudDisp1366.setResizable(true);
                    }   AudDisp1366.setVisible(true);
                    audIsOpen = true;
                }
                break;
            case 3://720
                logger.info("Set 1280 Audience Display Open");
                if(!AudDisp1280.isVisible() && !audIsOpen){
                   AudDisp1280.dispose();
                   if (AudDisp1280.isUndecorated()){
                       AudDisp1280.setUndecorated(false);
                       AudDisp1280.setResizable(true);
                   }   AudDisp1280.setVisible(true);
                   audIsOpen = true;
                }
                break;
            case 4://1024
                logger.info("Set 1024 Audience Display Open");
                if(!AudDisp1024.isVisible() && !audIsOpen){
                   AudDisp1024.dispose();
                   if (AudDisp1024.isUndecorated()){
                       AudDisp1024.setUndecorated(false);
                       AudDisp1024.setResizable(true);
                   }   AudDisp1024.setVisible(true);
                   audIsOpen = true;
                }
                break;
            case 5://800
                logger.info("Set 800 Audience Display Open");
                 if(!AudDisp800.isVisible() && !audIsOpen){
                    AudDisp800.dispose();
                    if (AudDisp800.isUndecorated()){
                        AudDisp800.setUndecorated(false);
                        AudDisp800.setResizable(true);
                    }   AudDisp800.setVisible(true);
                    audIsOpen = true;
                 }
                break;
            default:
        break;
        }
        audIsOpen = true;
        auddisplay.setEnabled(false);
        isFullscreen = false;
        SettingsUI.toggleFullscreen.setEnabled(true);
        SettingsUI.toggleFullscreen.setToolTipText("Toggle Full Screen mode for the Audience Display");
    }//GEN-LAST:event_auddisplayActionPerformed

    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed
            ModeChange();
    }//GEN-LAST:event_AutoActionPerformed

    private void TeleopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeleopActionPerformed
            ModeChange();
    }//GEN-LAST:event_TeleopActionPerformed

    private void timerstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerstartActionPerformed
            StartClock();        
    }//GEN-LAST:event_timerstartActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        countdownclockDrive(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pauseresumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseresumeActionPerformed
        if(pause == false){
            timer.cancel();
            logger.info("User force paused timer during" + AudDisplay1920.State.getText() + " at: " + GameClock + System.lineSeparator() + 
                    "Scores," + RedCenAuto + "," + RedCenTele + "," + RedCorAuto + "," + RedCorTele + 
                    "," + BlueCenAuto + "," + BlueCenTele + "," + BlueCorAuto + "," + BlueCorTele);
            play("stop-forghorn");
            GameClock = ClockRemaining;
            pause = true;
            TimerActive = false;
            pauseresume.setText("RESUME");
        } else {
            logger.info("User resumed timer with" +  AudDisplay1920.State.getText() + " selected, at " + GameClock);
            pauseresume.setText("PAUSE");
            pause = false;
            StartClock();
        }
    }//GEN-LAST:event_pauseresumeActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ESCAPE){
            SettingsUI.exitFullscreen();
        }else if(key == KeyEvent.VK_F5){
            SettingsUI.toggleFullscreen();
        }
    }//GEN-LAST:event_formKeyPressed

    public static GoalCounterUI goal;
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        DateFormat df = new SimpleDateFormat("dd-MM-yy-HH-mm-ss");
        Date date = new Date();
        URL url = GoalCounterUI.class.getProtectionDomain().getCodeSource().getLocation();
        String filePath = url.toString().substring(6) + "\\logs\\";
        
        File directory = new File(String.valueOf(filePath));
        if (! directory.exists()){
            directory.mkdir();
        }
        
        try { 
            fh = new FileHandler(filePath + "goalCounterLog" + df.format(date) + ".log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);   
            logger.info("Logger Initilized");
        } catch (SecurityException | IOException e) {  
            e.printStackTrace();  
        } 
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GoalCounterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoalCounterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoalCounterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoalCounterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        goal = new GoalCounterUI();
        goal.setVisible(true);
        logger.info("Created Main Goal Display");
        settings = new SettingsUI();
        settings.setVisible(true);
        logger.info("Created Settings Display");
        AudDisp1920 = new AudDisplay1920();
        AudDisp1920.setVisible(false);
        logger.info("Created 1920 Audience Display");
        AudDisp1600 = new AudDisplay1600();
        AudDisp1600.setVisible(false);
        logger.info("Created 1600 Audience Display");
        AudDisp1366 = new AudDisplay1366();
        AudDisp1366.setVisible(false);
        logger.info("Created 1366 Audience Display");
        AudDisp1280 = new AudDisplay1280();
        AudDisp1280.setVisible(false);
        logger.info("Created 1280 Audience Display");
        AudDisp1024 = new AudDisplay1024();
        AudDisp1024.setVisible(false);
        logger.info("Created 1024 Audience Display");
        AudDisp800 = new AudDisplay800();
        AudDisp800.setVisible(false);
        logger.info("Created 800 Audience Display");
        JSConfigView = new ViewJSConfig();
        JSConfigView.setVisible(false);       
        logger.info("Created Joystick Mapping Display"); 
        about = new AboutUI();
        about.setVisible(false);
        logger.info("Created About Display");
        JS = new JoystickTest();  
        logger.info("Created Joystick Reader");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    public static javax.swing.JRadioButton Auto;
    private javax.swing.JPanel BlueAlliance;
    private javax.swing.JLabel BlueCenAutoLabel;
    public static javax.swing.JSpinner BlueCenAutoSpin;
    public static javax.swing.JPanel BlueCenJSStatus;
    private javax.swing.JLabel BlueCenTeleLabel;
    public static javax.swing.JSpinner BlueCenTeleSpin;
    private javax.swing.JLabel BlueCorAutoLabel;
    public static javax.swing.JSpinner BlueCorAutoSpin;
    public static javax.swing.JPanel BlueCorJSStatus;
    private javax.swing.JLabel BlueCorTeleLabel;
    public static javax.swing.JSpinner BlueCorTeleSpin;
    private javax.swing.JLabel BlueVortCenLabel;
    private javax.swing.JLabel BlueVortCorLabel;
    private javax.swing.JLabel FTCLogoSmall;
    private javax.swing.JLabel HeaderLabel1;
    private javax.swing.ButtonGroup ModeSelect;
    private javax.swing.JPanel RedAlliance;
    private javax.swing.JLabel RedCenAutoLabel;
    public static javax.swing.JSpinner RedCenAutoSpin;
    public static javax.swing.JPanel RedCenJSStatus;
    private javax.swing.JLabel RedCenTeleLabel;
    public static javax.swing.JSpinner RedCenTeleSpin;
    public static javax.swing.JSpinner RedCorAutoSpin;
    private javax.swing.JLabel RedCorAutoeLabel;
    public static javax.swing.JPanel RedCorJSStatus;
    private javax.swing.JLabel RedCorTeleLabel;
    public static javax.swing.JSpinner RedCorTeleSpin;
    private javax.swing.JLabel RedVortCenLabel;
    private javax.swing.JLabel RedVortCorLabel;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SettingButton;
    public static javax.swing.JRadioButton Teleop;
    public static javax.swing.JLabel Timer;
    public static javax.swing.JPanel TimerStatus;
    private javax.swing.JLabel VersionInfo;
    public static javax.swing.JButton auddisplay;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton pauseresume;
    public static javax.swing.JButton timerstart;
    // End of variables declaration//GEN-END:variables
}