/*
 * FIRST Tech Challenge Vortex Counter
 * Created by Alexander Fera
 * Fera Group
 * Novi, MI 48377{licensePrefix}
 */
package ftc.goal.counter;


/**
 *
 * @author afera
 */
public class AudDisplay1366 extends javax.swing.JFrame {

    /**
     * Creates new form AudDisplay
     */
    public AudDisplay1366() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BlueCorAutoDisplay = new javax.swing.JLabel();
        BlueCenTeleDisplay = new javax.swing.JLabel();
        RedCorAutoDisplay = new javax.swing.JLabel();
        RedCorTeleDisplay = new javax.swing.JLabel();
        BlueCenAutoDisplay = new javax.swing.JLabel();
        RedCenTeleDisplay = new javax.swing.JLabel();
        RedCenAutoDisplay = new javax.swing.JLabel();
        BlueCorTeleDisplay = new javax.swing.JLabel();
        RedCenJSRed = new javax.swing.JLabel();
        RedCenJSOrange = new javax.swing.JLabel();
        RedCenJSGreen = new javax.swing.JLabel();
        RedCorJSRed = new javax.swing.JLabel();
        RedCorJSOrange = new javax.swing.JLabel();
        RedCorJSGreen = new javax.swing.JLabel();
        BlueCenJSRed = new javax.swing.JLabel();
        BlueCenJSOrange = new javax.swing.JLabel();
        BlueCenJSGreen = new javax.swing.JLabel();
        BlueCorJSRed = new javax.swing.JLabel();
        BlueCorJSOrange = new javax.swing.JLabel();
        BlueCorJSGreen = new javax.swing.JLabel();
        State = new javax.swing.JLabel();
        TimerDisplay = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(null);

        BlueCorAutoDisplay.setFont(new java.awt.Font("Arial", 0, 125)); // NOI18N
        BlueCorAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCorAutoDisplay.setText("0");
        jPanel1.add(BlueCorAutoDisplay);
        BlueCorAutoDisplay.setBounds(10, 500, 150, 190);

        BlueCenTeleDisplay.setFont(new java.awt.Font("Arial", 1, 125)); // NOI18N
        BlueCenTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCenTeleDisplay.setText("0");
        jPanel1.add(BlueCenTeleDisplay);
        BlueCenTeleDisplay.setBounds(180, 250, 220, 190);

        RedCorAutoDisplay.setFont(new java.awt.Font("Arial", 0, 125)); // NOI18N
        RedCorAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCorAutoDisplay.setText("0");
        jPanel1.add(RedCorAutoDisplay);
        RedCorAutoDisplay.setBounds(1200, 500, 160, 190);

        RedCorTeleDisplay.setFont(new java.awt.Font("Arial", 1, 125)); // NOI18N
        RedCorTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCorTeleDisplay.setText("0");
        jPanel1.add(RedCorTeleDisplay);
        RedCorTeleDisplay.setBounds(970, 500, 220, 190);

        BlueCenAutoDisplay.setFont(new java.awt.Font("Arial", 0, 125)); // NOI18N
        BlueCenAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCenAutoDisplay.setText("0");
        jPanel1.add(BlueCenAutoDisplay);
        BlueCenAutoDisplay.setBounds(10, 250, 150, 190);

        RedCenTeleDisplay.setFont(new java.awt.Font("Arial", 1, 125)); // NOI18N
        RedCenTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCenTeleDisplay.setText("0");
        jPanel1.add(RedCenTeleDisplay);
        RedCenTeleDisplay.setBounds(970, 250, 220, 190);

        RedCenAutoDisplay.setFont(new java.awt.Font("Arial", 0, 125)); // NOI18N
        RedCenAutoDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RedCenAutoDisplay.setText("0");
        RedCenAutoDisplay.setMaximumSize(new java.awt.Dimension(186, 180));
        RedCenAutoDisplay.setMinimumSize(new java.awt.Dimension(186, 180));
        jPanel1.add(RedCenAutoDisplay);
        RedCenAutoDisplay.setBounds(1200, 250, 160, 190);

        BlueCorTeleDisplay.setFont(new java.awt.Font("Arial", 1, 125)); // NOI18N
        BlueCorTeleDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BlueCorTeleDisplay.setText("0");
        jPanel1.add(BlueCorTeleDisplay);
        BlueCorTeleDisplay.setBounds(180, 500, 220, 190);

        RedCenJSRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerRedMedium.png"))); // NOI18N
        jPanel1.add(RedCenJSRed);
        RedCenJSRed.setBounds(980, 170, 90, 90);

        RedCenJSOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerOrangeMedium.png"))); // NOI18N
        jPanel1.add(RedCenJSOrange);
        RedCenJSOrange.setBounds(980, 170, 90, 90);

        RedCenJSGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerGreenMedium.png"))); // NOI18N
        jPanel1.add(RedCenJSGreen);
        RedCenJSGreen.setBounds(980, 170, 90, 90);

        RedCorJSRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerRedMedium.png"))); // NOI18N
        jPanel1.add(RedCorJSRed);
        RedCorJSRed.setBounds(1140, 690, 90, 70);

        RedCorJSOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerOrangeMedium.png"))); // NOI18N
        jPanel1.add(RedCorJSOrange);
        RedCorJSOrange.setBounds(1140, 690, 90, 70);

        RedCorJSGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerGreenMedium.png"))); // NOI18N
        jPanel1.add(RedCorJSGreen);
        RedCorJSGreen.setBounds(1140, 690, 90, 70);

        BlueCenJSRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerRedMedium.png"))); // NOI18N
        jPanel1.add(BlueCenJSRed);
        BlueCenJSRed.setBounds(300, 170, 90, 90);

        BlueCenJSOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerOrangeMedium.png"))); // NOI18N
        jPanel1.add(BlueCenJSOrange);
        BlueCenJSOrange.setBounds(300, 170, 90, 90);

        BlueCenJSGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerGreenMedium.png"))); // NOI18N
        jPanel1.add(BlueCenJSGreen);
        BlueCenJSGreen.setBounds(300, 170, 90, 90);

        BlueCorJSRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerRedMedium.png"))); // NOI18N
        jPanel1.add(BlueCorJSRed);
        BlueCorJSRed.setBounds(120, 690, 90, 70);

        BlueCorJSOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerOrangeMedium.png"))); // NOI18N
        jPanel1.add(BlueCorJSOrange);
        BlueCorJSOrange.setBounds(120, 690, 90, 70);

        BlueCorJSGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/ControllerGreenMedium.png"))); // NOI18N
        jPanel1.add(BlueCorJSGreen);
        BlueCorJSGreen.setBounds(120, 690, 90, 70);

        State.setFont(new java.awt.Font("Arial", 1, 65)); // NOI18N
        State.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        State.setText("Autonomous Mode");
        jPanel1.add(State);
        State.setBounds(0, 700, 1370, 70);

        TimerDisplay.setFont(new java.awt.Font("Dialog", 1, 245)); // NOI18N
        TimerDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimerDisplay.setText("2:30");
        jPanel1.add(TimerDisplay);
        TimerDisplay.setBounds(1, 10, 1370, 230);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ftc/goal/counter/images/AudDispBackground1366p.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 1366, 768);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        SettingsUI.toggleFullscreen.setEnabled(false);
        SettingsUI.toggleFullscreen.setToolTipText("You need to open the Audience display first");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        SettingsUI.toggleFullscreen.setEnabled(true);
        SettingsUI.toggleFullscreen.setToolTipText("Toggle Full Screen mode for the Audience Display");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        SettingsUI.toggleFullscreen.setEnabled(true);
        SettingsUI.toggleFullscreen.setToolTipText("Toggle Full Screen mode for the Audience Display");
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(AudDisplay1366.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudDisplay1366.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudDisplay1366.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudDisplay1366.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudDisplay1366().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel BlueCenAutoDisplay;
    public static javax.swing.JLabel BlueCenJSGreen;
    public static javax.swing.JLabel BlueCenJSOrange;
    public static javax.swing.JLabel BlueCenJSRed;
    public static javax.swing.JLabel BlueCenTeleDisplay;
    public static javax.swing.JLabel BlueCorAutoDisplay;
    public static javax.swing.JLabel BlueCorJSGreen;
    public static javax.swing.JLabel BlueCorJSOrange;
    public static javax.swing.JLabel BlueCorJSRed;
    public static javax.swing.JLabel BlueCorTeleDisplay;
    public static javax.swing.JLabel RedCenAutoDisplay;
    public static javax.swing.JLabel RedCenJSGreen;
    public static javax.swing.JLabel RedCenJSOrange;
    public static javax.swing.JLabel RedCenJSRed;
    public static javax.swing.JLabel RedCenTeleDisplay;
    public static javax.swing.JLabel RedCorAutoDisplay;
    public static javax.swing.JLabel RedCorJSGreen;
    public static javax.swing.JLabel RedCorJSOrange;
    public static javax.swing.JLabel RedCorJSRed;
    public static javax.swing.JLabel RedCorTeleDisplay;
    public static javax.swing.JLabel State;
    public static javax.swing.JLabel TimerDisplay;
    private javax.swing.JLabel background;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
