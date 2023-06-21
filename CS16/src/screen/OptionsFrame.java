package screen;

import javax.swing.JOptionPane;

public class OptionsFrame extends javax.swing.JFrame {

    public OptionsFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFundo = new javax.swing.JPanel();
        jtpOptions = new javax.swing.JTabbedPane();
        pnlMultiplayer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlKeyboard = new javax.swing.JPanel();
        pnlMouse = new javax.swing.JPanel();
        pnlAudio = new javax.swing.JPanel();
        pnlVideo = new javax.swing.JPanel();
        pnlVoice = new javax.swing.JPanel();
        pnlLock = new javax.swing.JPanel();
        lblOptions = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnApply = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(85, 103, 68));
        setUndecorated(true);

        jpFundo.setBackground(new java.awt.Color(76, 88, 68));

        jtpOptions.setBackground(new java.awt.Color(76, 88, 68));
        jtpOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtpOptions.setForeground(new java.awt.Color(204, 204, 204));
        jtpOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtpOptions.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jtpOptions.setDoubleBuffered(true);
        jtpOptions.setFocusCycleRoot(true);
        jtpOptions.setFocusTraversalPolicyProvider(true);
        jtpOptions.setInheritsPopupMenu(true);
        jtpOptions.setName(""); // NOI18N
        jtpOptions.setOpaque(true);

        pnlMultiplayer.setBackground(new java.awt.Color(76, 88, 68));
        pnlMultiplayer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMultiplayer.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEM INTERNE PARA MULTPLAYER");

        javax.swing.GroupLayout pnlMultiplayerLayout = new javax.swing.GroupLayout(pnlMultiplayer);
        pnlMultiplayer.setLayout(pnlMultiplayerLayout);
        pnlMultiplayerLayout.setHorizontalGroup(
            pnlMultiplayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMultiplayerLayout.setVerticalGroup(
            pnlMultiplayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplayerLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jtpOptions.addTab("Multiplayer", null, pnlMultiplayer, "");

        pnlKeyboard.setBackground(new java.awt.Color(76, 88, 68));
        pnlKeyboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlKeyboard.setToolTipText("");

        javax.swing.GroupLayout pnlKeyboardLayout = new javax.swing.GroupLayout(pnlKeyboard);
        pnlKeyboard.setLayout(pnlKeyboardLayout);
        pnlKeyboardLayout.setHorizontalGroup(
            pnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        pnlKeyboardLayout.setVerticalGroup(
            pnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jtpOptions.addTab("Keyboard", pnlKeyboard);

        pnlMouse.setBackground(new java.awt.Color(76, 88, 68));
        pnlMouse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlMouseLayout = new javax.swing.GroupLayout(pnlMouse);
        pnlMouse.setLayout(pnlMouseLayout);
        pnlMouseLayout.setHorizontalGroup(
            pnlMouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        pnlMouseLayout.setVerticalGroup(
            pnlMouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jtpOptions.addTab("Mouse", pnlMouse);

        pnlAudio.setBackground(new java.awt.Color(76, 88, 68));
        pnlAudio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlAudioLayout = new javax.swing.GroupLayout(pnlAudio);
        pnlAudio.setLayout(pnlAudioLayout);
        pnlAudioLayout.setHorizontalGroup(
            pnlAudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        pnlAudioLayout.setVerticalGroup(
            pnlAudioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jtpOptions.addTab("Audio", pnlAudio);

        pnlVideo.setBackground(new java.awt.Color(76, 88, 68));
        pnlVideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlVideoLayout = new javax.swing.GroupLayout(pnlVideo);
        pnlVideo.setLayout(pnlVideoLayout);
        pnlVideoLayout.setHorizontalGroup(
            pnlVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        pnlVideoLayout.setVerticalGroup(
            pnlVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jtpOptions.addTab("Video", pnlVideo);

        pnlVoice.setBackground(new java.awt.Color(76, 88, 68));
        pnlVoice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlVoiceLayout = new javax.swing.GroupLayout(pnlVoice);
        pnlVoice.setLayout(pnlVoiceLayout);
        pnlVoiceLayout.setHorizontalGroup(
            pnlVoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        pnlVoiceLayout.setVerticalGroup(
            pnlVoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jtpOptions.addTab("Voice", pnlVoice);

        pnlLock.setBackground(new java.awt.Color(76, 88, 68));
        pnlLock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlLockLayout = new javax.swing.GroupLayout(pnlLock);
        pnlLock.setLayout(pnlLockLayout);
        pnlLockLayout.setHorizontalGroup(
            pnlLockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        pnlLockLayout.setVerticalGroup(
            pnlLockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        jtpOptions.addTab("Lock", pnlLock);

        lblOptions.setForeground(new java.awt.Color(255, 255, 255));
        lblOptions.setText("Options");

        btnExit.setBackground(new java.awt.Color(76, 88, 68));
        btnExit.setForeground(new java.awt.Color(204, 204, 204));
        btnExit.setText("X");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnApply.setBackground(new java.awt.Color(76, 88, 68));
        btnApply.setForeground(new java.awt.Color(204, 204, 204));
        btnApply.setText("Apply");
        btnApply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(76, 88, 68));
        btnCancel.setForeground(new java.awt.Color(204, 204, 204));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(76, 88, 68));
        btnOk.setForeground(new java.awt.Color(204, 204, 204));
        btnOk.setText("Ok");
        btnOk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFundoLayout = new javax.swing.GroupLayout(jpFundo);
        jpFundo.setLayout(jpFundoLayout);
        jpFundoLayout.setHorizontalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtpOptions)
                    .addGroup(jpFundoLayout.createSequentialGroup()
                        .addComponent(lblOptions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpFundoLayout.setVerticalGroup(
            jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(lblOptions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApply)
                    .addComponent(btnCancel)
                    .addComponent(btnOk))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Mudanças aplicadas com sucesso.");
    }//GEN-LAST:event_btnApplyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpFundo;
    private javax.swing.JTabbedPane jtpOptions;
    private javax.swing.JLabel lblOptions;
    private javax.swing.JPanel pnlAudio;
    private javax.swing.JPanel pnlKeyboard;
    private javax.swing.JPanel pnlLock;
    private javax.swing.JPanel pnlMouse;
    private javax.swing.JPanel pnlMultiplayer;
    private javax.swing.JPanel pnlVideo;
    private javax.swing.JPanel pnlVoice;
    // End of variables declaration//GEN-END:variables
}
