/*
 * Created for FIRST Tech Challenge
 * To count balls scored in the Goals
 * During the 2016 - 2017 Game
 */
package ftc.goal.counter;

/*
 * @author afera
 * Alexander Fera
 * Fera Group
 * Novi, MI 48377
 */
public class GoalCounterUI extends javax.swing.JFrame {

    boolean AutoState = true;
    boolean TeleState = false;
    public static int RedCenAuto = 0;
    public static int BlueCenAuto = 0;
    public static int RedCorAuto = 0;
    public static int BlueCorAuto = 0;
    public static int RedCenTele = 0;
    public static int BlueCenTele = 0;
    public static int RedCorTele = 0;
    public static int BlueCorTele = 0;
    public static AudDisplay AudDisp;
    public static AboutUI about;
    public static JoystickTest JS;

public static final String version = "0.1.2-ALPHA";

    /**
     * Creates new form GoalCounterUI
     */
    
    public GoalCounterUI() {
        initComponents();
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
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ModeSelect = new javax.swing.ButtonGroup();
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
        HeaderLabel = new javax.swing.JLabel();
        ResetButton = new javax.swing.JButton();
        VersionInfo = new javax.swing.JLabel();
        SettingButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        copyright = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Auto = new javax.swing.JRadioButton();
        Teleop = new javax.swing.JRadioButton();

        ModeSelect.add(Auto);
        ModeSelect.add(Teleop);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vortex Counter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        RedAlliance.setBackground(new java.awt.Color(237, 28, 36));
        RedAlliance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Red Vortex", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        RedCorTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCorTeleSpin.setName("redvorcencount"); // NOI18N

        RedCorTeleLabel.setText("T:");

        RedCorAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        RedCorAutoeLabel.setText("A:");

        RedVortCorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RedVortCorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedVortCorLabel.setText("Corner Vortex");

        javax.swing.GroupLayout RedCorJSStatusLayout = new javax.swing.GroupLayout(RedCorJSStatus);
        RedCorJSStatus.setLayout(RedCorJSStatusLayout);
        RedCorJSStatusLayout.setHorizontalGroup(
            RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedCorJSStatusLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(RedCorAutoeLabel)
                .addGap(6, 6, 6)
                .addComponent(RedCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCorTeleLabel)
                .addGap(6, 6, 6)
                .addComponent(RedCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(RedVortCorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RedCorJSStatusLayout.setVerticalGroup(
            RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedCorJSStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RedVortCorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCorAutoeLabel)
                    .addComponent(RedCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedCorTeleLabel)
                    .addComponent(RedCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        RedCorAutoSpin.getAccessibleContext().setAccessibleName("RedCorVor");
        RedCorAutoSpin.getAccessibleContext().setAccessibleDescription("");

        RedCenTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCenTeleSpin.setName("redvorcencount"); // NOI18N

        RedCenTeleLabel.setText("T:");

        RedCenAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCenAutoSpin.setName("redvorcencount"); // NOI18N

        RedCenAutoLabel.setText("A:");

        RedVortCenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RedVortCenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedVortCenLabel.setText("Center Vortex");

        javax.swing.GroupLayout RedCenJSStatusLayout = new javax.swing.GroupLayout(RedCenJSStatus);
        RedCenJSStatus.setLayout(RedCenJSStatusLayout);
        RedCenJSStatusLayout.setHorizontalGroup(
            RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedCenJSStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RedCenAutoLabel)
                .addGap(2, 2, 2)
                .addComponent(RedCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCenTeleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(RedCenJSStatusLayout.createSequentialGroup()
                .addComponent(RedVortCenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RedCenJSStatusLayout.setVerticalGroup(
            RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedCenJSStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RedVortCenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedCenAutoLabel)
                    .addComponent(RedCenTeleLabel)
                    .addComponent(RedCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        RedCenAutoSpin.getAccessibleContext().setAccessibleName("redvorcencount");
        RedCenAutoSpin.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout RedAllianceLayout = new javax.swing.GroupLayout(RedAlliance);
        RedAlliance.setLayout(RedAllianceLayout);
        RedAllianceLayout.setHorizontalGroup(
            RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedCenJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(RedCorJSStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RedAllianceLayout.setVerticalGroup(
            RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedAllianceLayout.createSequentialGroup()
                .addComponent(RedCenJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RedCorJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BlueAlliance.setBackground(new java.awt.Color(0, 101, 179));
        BlueAlliance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blue Votex", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        BlueCenTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCorTeleLabel.setText("T:");

        BlueCenAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCorAutoLabel.setText("A:");

        BlueVortCenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BlueVortCenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueVortCenLabel.setText("Center Vortex");

        javax.swing.GroupLayout BlueCenJSStatusLayout = new javax.swing.GroupLayout(BlueCenJSStatus);
        BlueCenJSStatus.setLayout(BlueCenJSStatusLayout);
        BlueCenJSStatusLayout.setHorizontalGroup(
            BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BlueVortCenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BlueCenJSStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BlueCorAutoLabel)
                .addGap(6, 6, 6)
                .addComponent(BlueCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCorTeleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BlueCenJSStatusLayout.setVerticalGroup(
            BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCenJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlueVortCenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueCenJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueCorAutoLabel)
                    .addComponent(BlueCorTeleLabel)
                    .addComponent(BlueCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BlueCenAutoLabel.setText("A:");

        BlueVortCorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BlueVortCorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueVortCorLabel.setText("Corner Vortex");

        BlueCorAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCenTeleLabel.setText("T:");

        BlueCorTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout BlueCorJSStatusLayout = new javax.swing.GroupLayout(BlueCorJSStatus);
        BlueCorJSStatus.setLayout(BlueCorJSStatusLayout);
        BlueCorJSStatusLayout.setHorizontalGroup(
            BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCorJSStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BlueVortCorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BlueCorJSStatusLayout.createSequentialGroup()
                        .addComponent(BlueCenAutoLabel)
                        .addGap(6, 6, 6)
                        .addComponent(BlueCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BlueCenTeleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BlueCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(1, 1, 1))
        );
        BlueCorJSStatusLayout.setVerticalGroup(
            BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueCorJSStatusLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(BlueVortCorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BlueCorJSStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCenAutoLabel)
                    .addComponent(BlueCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueCenTeleLabel)
                    .addComponent(BlueCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout BlueAllianceLayout = new javax.swing.GroupLayout(BlueAlliance);
        BlueAlliance.setLayout(BlueAllianceLayout);
        BlueAllianceLayout.setHorizontalGroup(
            BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BlueAllianceLayout.createSequentialGroup()
                .addGroup(BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BlueCenJSStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BlueCorJSStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BlueAllianceLayout.setVerticalGroup(
            BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueAllianceLayout.createSequentialGroup()
                .addComponent(BlueCenJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BlueCorJSStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FTCLogoSmall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ftclogofull.png"))); // NOI18N

        HeaderLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLabel.setText("Vortex Counter");

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

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("DISPLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Auto.setSelected(true);
        Auto.setText("Auto");
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });

        Teleop.setText("Teleop");
        Teleop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeleopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FTCLogoSmall)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(copyright)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(VersionInfo))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SettingButton)
                                        .addComponent(jButton1))
                                    .addGap(49, 49, 49)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Auto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ResetButton))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Teleop)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AboutButton))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(RedAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BlueAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FTCLogoSmall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeaderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BlueAlliance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RedAlliance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingButton)
                    .addComponent(Auto)
                    .addComponent(ResetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Teleop)
                    .addComponent(AboutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyright)
                    .addComponent(VersionInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
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
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        if(!JoystickTest.settings.isVisible()){
            JoystickTest.settings.setVisible(true);
        }
    }//GEN-LAST:event_SettingButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        if(!about.isVisible()){
            about.setVisible(true);
        }
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!AudDisp.isVisible()){
            AudDisp.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed
      if(Auto.isSelected()){
         AutoState = true;
         TeleState = false;
                 }
    else{
         AutoState = false;
         TeleState = true;
     } 
    }//GEN-LAST:event_AutoActionPerformed

    private void TeleopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeleopActionPerformed
     if(Teleop.isSelected()){
         TeleState = true;
         AutoState = false;
     }
     else{
         TeleState = false;
         AutoState = true;
     } 
    }//GEN-LAST:event_TeleopActionPerformed

    public static GoalCounterUI goal;
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                goal = new GoalCounterUI();
                goal.setVisible(true);
                AudDisp = new AudDisplay();
                AudDisp.setVisible(false);
                about = new AboutUI();
                about.setVisible(false);
            }   
        });
        JS = new JoystickTest();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JRadioButton Auto;
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
    private javax.swing.JLabel HeaderLabel;
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
    private javax.swing.JRadioButton Teleop;
    private javax.swing.JLabel VersionInfo;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
