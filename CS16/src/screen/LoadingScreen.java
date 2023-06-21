package screen;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class LoadingScreen extends javax.swing.JFrame {

    public LoadingScreen() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/counter-strike-1.6.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLoading = new javax.swing.JLabel();
        jpbLoading = new javax.swing.JProgressBar();
        lblfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        jpFundo.setPreferredSize(new java.awt.Dimension(640, 320));
        jpFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(76, 88, 68));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setForeground(new java.awt.Color(76, 88, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoading.setText("0");
        jPanel2.add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, -1));

        jpbLoading.setForeground(new java.awt.Color(153, 153, 153));
        jpbLoading.setToolTipText("");
        jPanel2.add(jpbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 216, 30));

        jpFundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 230, 50));

        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        lblfundo.setText(" ");
        lblfundo.setOpaque(true);
        jpFundo.add(lblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 1, 700, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        LoadingScreen loading = new LoadingScreen();
        loading.setVisible(true);

        try {
            for (int i = 0; i <= 100; i += 3) {
                Thread.sleep(70);
                loading.jpbLoading.setValue(i);
                loading.lblLoading.setText(Integer.toString(i) + "%");
            }
            loading.dispose();

            MenuScreen menu = new MenuScreen();
            menu.setVisible(true);

        } catch (InterruptedException ex) {
            //Logger.getLogger(LoadingScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JProgressBar jpbLoading;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblfundo;
    // End of variables declaration//GEN-END:variables
}
