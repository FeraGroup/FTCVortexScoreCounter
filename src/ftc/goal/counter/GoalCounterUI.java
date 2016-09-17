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
    
    public void updatevalues(){
    
        while(true){
    //edVortCenVar.getValue(RedCenVal) = RedCenVal;
}
    }
       
public static final String version = "0.0.32-DEV";
    

    /**
     * Creates new form GoalCounterUI
     */
    
    public GoalCounterUI() {
        initComponents();

    }
    
    int RedCenAuto = 0;
    int BlueCenAuto = 0;
    int RedCorAuto = 0;
    int BlueCorAuto = 0;
    int RedCenTele = 0;
    int BlueCenTele = 0;
    int RedCorTele = 0;
    int BlueCorTele = 0;
    

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
        
     public void IncrsRedCenLB(){
         if(JoystickTest.PressJSRedCenLB==true && JoystickTest.pressLstJSRedCenLB!=true && SettingsUI.RedCenLeft==true){
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
                          JoystickTest.pressLstJSRedCenAbtn = true;     
                }
                if(TeleState == true){
                          RedCenTeleSpin.setValue(++RedCenTele);
                          JoystickTest.pressLstJSRedCenAbtn = true;     
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
     
    public void IncrsBlueCenLB(){
         if(JoystickTest.PressJSBlueCenLB==true && JoystickTest.pressLstJSBlueCenLB!=true && SettingsUI.BlueCenLeft==true){
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
                          JoystickTest.pressLstJSBlueCenAbtn = true;     
                }
                if(TeleState == true){
                          BlueCenTeleSpin.setValue(++BlueCenTele);
                          JoystickTest.pressLstJSBlueCenAbtn = true;     
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
                    JoystickTest.pressLstJSRedCorLT = true;
                }  
            }
            if(TeleState == true){
                if(RedCorTele < 1){
                    RedCorTele = 0;   
                }
                else{
                    RedCenTeleSpin.setValue(--RedCorTele);
                    JoystickTest.pressLstJSRedCorLT = true;
                }  
            }    
            }
        }
        
             public void IncrsRedCorLB(){
         if(JoystickTest.PressJSRedCorLB==true && JoystickTest.pressLstJSRedCorLB!=true && SettingsUI.RedCorLeft==true){
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
                          JoystickTest.pressLstJSRedCorAbtn = true;     
                }
                if(TeleState == true){
                          RedCorTeleSpin.setValue(++RedCorTele);
                          JoystickTest.pressLstJSRedCorAbtn = true;     
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
        public void IncrsBlueCorLB(){
         if(JoystickTest.PressJSBlueCorLB==true && JoystickTest.pressLstJSBlueCorLB!=true && SettingsUI.BlueCorLeft==true){
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
                          JoystickTest.pressLstJSBlueCorAbtn = true;     
                }
                if(TeleState == true){
                          BlueCorTeleSpin.setValue(++BlueCorTele);
                          JoystickTest.pressLstJSBlueCorAbtn = true;     
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
        RedCenAutoSpin = new javax.swing.JSpinner();
        RedCorAutoSpin = new javax.swing.JSpinner();
        RedVortCenLabel = new javax.swing.JLabel();
        RedVortCorLabel = new javax.swing.JLabel();
        RedCenAutoLabel = new javax.swing.JLabel();
        RedCenTeleLabel = new javax.swing.JLabel();
        RedCenTeleSpin = new javax.swing.JSpinner();
        RedCorAutoeLabel = new javax.swing.JLabel();
        RedCorTeleLabel = new javax.swing.JLabel();
        RedCorTeleSpin = new javax.swing.JSpinner();
        BlueAlliance = new javax.swing.JPanel();
        BlueCorAutoSpin = new javax.swing.JSpinner();
        BlueVortCenLabel = new javax.swing.JLabel();
        BlueCenAutoSpin = new javax.swing.JSpinner();
        BlueVortCorLabel = new javax.swing.JLabel();
        BlueCorAutoLabel = new javax.swing.JLabel();
        BlueCorTeleLabel = new javax.swing.JLabel();
        BlueCenTeleSpin = new javax.swing.JSpinner();
        BlueCenAutoLabel = new javax.swing.JLabel();
        BlueCorTeleSpin = new javax.swing.JSpinner();
        BlueCenTeleLabel = new javax.swing.JLabel();
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

        RedCenAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCenAutoSpin.setName("redvorcencount"); // NOI18N

        RedCorAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        RedVortCenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RedVortCenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedVortCenLabel.setText("Center Vortex");

        RedVortCorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        RedVortCorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedVortCorLabel.setText("Corner Vortex");

        RedCenAutoLabel.setText("A:");

        RedCenTeleLabel.setText("T:");

        RedCenTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCenTeleSpin.setName("redvorcencount"); // NOI18N

        RedCorAutoeLabel.setText("A:");

        RedCorTeleLabel.setText("T:");

        RedCorTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        RedCorTeleSpin.setName("redvorcencount"); // NOI18N

        javax.swing.GroupLayout RedAllianceLayout = new javax.swing.GroupLayout(RedAlliance);
        RedAlliance.setLayout(RedAllianceLayout);
        RedAllianceLayout.setHorizontalGroup(
            RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RedVortCenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RedAllianceLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(RedCenAutoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCenTeleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(RedVortCorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RedAllianceLayout.createSequentialGroup()
                .addComponent(RedCorAutoeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCorTeleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RedAllianceLayout.setVerticalGroup(
            RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedAllianceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RedVortCenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RedCenAutoLabel)
                    .addComponent(RedCenTeleLabel)
                    .addComponent(RedCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RedVortCorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RedCorAutoeLabel)
                    .addGroup(RedAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RedCorTeleLabel)
                        .addComponent(RedCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RedCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RedCenAutoSpin.getAccessibleContext().setAccessibleName("redvorcencount");
        RedCenAutoSpin.getAccessibleContext().setAccessibleDescription("");
        RedCorAutoSpin.getAccessibleContext().setAccessibleName("RedCorVor");
        RedCorAutoSpin.getAccessibleContext().setAccessibleDescription("");

        BlueAlliance.setBackground(new java.awt.Color(0, 101, 179));
        BlueAlliance.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blue Votex", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        BlueCorAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueVortCenLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BlueVortCenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueVortCenLabel.setText("Center Vortex");

        BlueCenAutoSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueVortCorLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BlueVortCorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueVortCorLabel.setText("Corner Vortex");

        BlueCorAutoLabel.setText("A:");

        BlueCorTeleLabel.setText("T:");

        BlueCenTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCenAutoLabel.setText("A:");

        BlueCorTeleSpin.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        BlueCenTeleLabel.setText("T:");

        javax.swing.GroupLayout BlueAllianceLayout = new javax.swing.GroupLayout(BlueAlliance);
        BlueAlliance.setLayout(BlueAllianceLayout);
        BlueAllianceLayout.setHorizontalGroup(
            BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueAllianceLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(BlueCorAutoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCorTeleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(BlueVortCenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BlueVortCorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BlueAllianceLayout.createSequentialGroup()
                .addComponent(BlueCenAutoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCenTeleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlueCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BlueAllianceLayout.setVerticalGroup(
            BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueAllianceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BlueVortCenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCenAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BlueCorAutoLabel)
                    .addComponent(BlueCorTeleLabel)
                    .addComponent(BlueCenTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BlueVortCorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BlueCenAutoLabel)
                    .addComponent(BlueCorAutoSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BlueAllianceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BlueCenTeleLabel)
                        .addComponent(BlueCorTeleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(FTCLogoSmall)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(copyright)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SettingButton)
                                            .addComponent(jButton1))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Auto)
                                            .addComponent(Teleop))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResetButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AboutButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(VersionInfo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RedAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(BlueAlliance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addComponent(HeaderLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SettingButton)
                            .addComponent(Auto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Teleop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyright))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ResetButton)
                                .addGap(34, 34, 34))
                            .addComponent(AboutButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VersionInfo)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
            RedCenAutoSpin.setValue(0);
            RedCorAutoSpin.setValue(0);
            BlueCenAutoSpin.setValue(0);
            BlueCorAutoSpin.setValue(0);
            RedCenAuto = 0;
            RedCorAuto = 0;
            BlueCenAuto = 0;
            BlueCorAuto = 0;
            RedCenTele = 0;
            RedCorTele = 0;
            BlueCenTele = 0;
            BlueCorTele = 0;
            //RedVortCorVar.setValue(0);
            //BlueVortCenVar.setValue(0);
            //BlueVortCorVar.setValue(0);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        new SettingsUI().setVisible(true);
    }//GEN-LAST:event_SettingButtonActionPerformed

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        new AboutUI().setVisible(true);
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AudDisplay().setVisible(true);
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
    
    //public static redcencount {
      // RedCenVal = RedVortCenVar.get;
       
//}
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
                new SettingsUI().setVisible(true);
            }
        });
        
         JoyStickBasic jinputJoystickTest = new JoyStickBasic();
        // Writes (into console) informations of all controllers that are found.
        //jinputJoystickTest.getAllControllersInfo();
        // In loop writes (into console) all joystick components and its current values.
        //jinputJoystickTest.pollControllerAndItsComponents(Controller.Type.STICK);
        //jinputJoystickTest.pollControllerAndItsComponents(Controller.Type.GAMEPAD);
        
        //new GoalCounterUI();
        
        new JoystickTest();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JRadioButton Auto;
    private javax.swing.JPanel BlueAlliance;
    private javax.swing.JLabel BlueCenAutoLabel;
    private javax.swing.JSpinner BlueCenAutoSpin;
    private javax.swing.JLabel BlueCenTeleLabel;
    private javax.swing.JSpinner BlueCenTeleSpin;
    private javax.swing.JLabel BlueCorAutoLabel;
    private javax.swing.JSpinner BlueCorAutoSpin;
    private javax.swing.JLabel BlueCorTeleLabel;
    private javax.swing.JSpinner BlueCorTeleSpin;
    private javax.swing.JLabel BlueVortCenLabel;
    private javax.swing.JLabel BlueVortCorLabel;
    private javax.swing.JLabel FTCLogoSmall;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.ButtonGroup ModeSelect;
    private javax.swing.JPanel RedAlliance;
    private javax.swing.JLabel RedCenAutoLabel;
    private javax.swing.JSpinner RedCenAutoSpin;
    private javax.swing.JLabel RedCenTeleLabel;
    private javax.swing.JSpinner RedCenTeleSpin;
    private javax.swing.JSpinner RedCorAutoSpin;
    private javax.swing.JLabel RedCorAutoeLabel;
    private javax.swing.JLabel RedCorTeleLabel;
    private javax.swing.JSpinner RedCorTeleSpin;
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
