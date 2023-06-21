package screen;

public class MenuScreen extends javax.swing.JFrame {

    public MenuScreen() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/counter-strike-1.6.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        btnOptions = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        lblfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Counter-Strike 1.6");

        jpFundo.setPreferredSize(new java.awt.Dimension(640, 320));
        jpFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNewGame.setBackground(new java.awt.Color(0, 51, 102));
        btnNewGame.setForeground(new java.awt.Color(255, 255, 255));
        btnNewGame.setText("New Game");
        btnNewGame.setBorder(null);
        btnNewGame.setContentAreaFilled(false);
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        jpFundo.add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        btnQuit.setBackground(new java.awt.Color(0, 51, 102));
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.setBorder(null);
        btnQuit.setContentAreaFilled(false);
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jpFundo.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        btnJoin.setBackground(new java.awt.Color(0, 51, 102));
        btnJoin.setForeground(new java.awt.Color(255, 255, 255));
        btnJoin.setText("Join a Random Server");
        btnJoin.setBorder(null);
        btnJoin.setContentAreaFilled(false);
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });
        jpFundo.add(btnJoin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        btnOptions.setBackground(new java.awt.Color(0, 51, 102));
        btnOptions.setForeground(new java.awt.Color(255, 255, 255));
        btnOptions.setText("Options");
        btnOptions.setBorder(null);
        btnOptions.setContentAreaFilled(false);
        btnOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptionsActionPerformed(evt);
            }
        });
        jpFundo.add(btnOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        btnFind.setBackground(new java.awt.Color(0, 51, 102));
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("Find Servers");
        btnFind.setBorder(null);
        btnFind.setContentAreaFilled(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jpFundo.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        lblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        lblfundo.setText(" ");
        jpFundo.add(lblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 1, 700, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
        NewGameScreen newGame = new NewGameScreen();
        newGame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        dispose();;
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
        NewGameScreen newGame = new NewGameScreen();
        newGame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptionsActionPerformed
        // TODO add your handling code here:
        OptionsFrame option = new OptionsFrame();
        option.setVisible(true);
    }//GEN-LAST:event_btnOptionsActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        NewGameScreen newGame = new NewGameScreen();
        newGame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFindActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnOptions;
    private javax.swing.JButton btnQuit;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JLabel lblfundo;
    // End of variables declaration//GEN-END:variables
}
