/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package md.gui;

/**
 *
 * @author margh
 */
public class FramePrinc extends javax.swing.JFrame {

    /**
     * Creates new form FramePrinc
     */
    public FramePrinc() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbg_Sit_Fiscale = new javax.swing.ButtonGroup();
        pnl_nominativo = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_cognome = new javax.swing.JTextField();
        lbl_cognome = new javax.swing.JLabel();
        rb_giuridica = new javax.swing.JRadioButton();
        rb_fisica = new javax.swing.JRadioButton();
        pnl_residenza = new javax.swing.JPanel();
        lbl_Indirizzo = new javax.swing.JLabel();
        txt_Indirizzo = new javax.swing.JTextField();
        txt_Cap = new javax.swing.JTextField();
        txt_Citta = new javax.swing.JTextField();
        lbl_citta = new javax.swing.JLabel();
        lbl_cap = new javax.swing.JLabel();
        pnl_bottoni = new javax.swing.JPanel();
        btn_esc = new javax.swing.JButton();
        btn_ok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Anagrafica Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        lbl_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_nome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_nome.setText("Nome:");

        txt_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        txt_cognome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cognomeActionPerformed(evt);
            }
        });

        lbl_cognome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cognome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cognome.setText("Cognome:");

        rbg_Sit_Fiscale.add(rb_giuridica);
        rb_giuridica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_giuridica.setSelected(true);
        rb_giuridica.setText("Persona Giuridica");
        rb_giuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_giuridicaActionPerformed(evt);
            }
        });

        rbg_Sit_Fiscale.add(rb_fisica);
        rb_fisica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_fisica.setText("Persona Fisica");
        rb_fisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fisicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_nominativoLayout = new javax.swing.GroupLayout(pnl_nominativo);
        pnl_nominativo.setLayout(pnl_nominativoLayout);
        pnl_nominativoLayout.setHorizontalGroup(
            pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_nominativoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_nominativoLayout.createSequentialGroup()
                        .addGroup(pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nome)
                            .addComponent(txt_cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_nominativoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(rb_giuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(rb_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnl_nominativoLayout.setVerticalGroup(
            pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_nominativoLayout.createSequentialGroup()
                .addGroup(pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_giuridica)
                    .addComponent(rb_fisica))
                .addGap(18, 18, 18)
                .addGroup(pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_nominativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pnl_residenza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Residenza  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        lbl_Indirizzo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Indirizzo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Indirizzo.setText("Indirizzo:");

        txt_Indirizzo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Indirizzo.setToolTipText("");
        txt_Indirizzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IndirizzoActionPerformed(evt);
            }
        });

        txt_Cap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Cap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CapActionPerformed(evt);
            }
        });

        txt_Citta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Citta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CittaActionPerformed(evt);
            }
        });

        lbl_citta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_citta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_citta.setText("Città:");

        lbl_cap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_cap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cap.setText("CAP:");

        javax.swing.GroupLayout pnl_residenzaLayout = new javax.swing.GroupLayout(pnl_residenza);
        pnl_residenza.setLayout(pnl_residenzaLayout);
        pnl_residenzaLayout.setHorizontalGroup(
            pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_residenzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_residenzaLayout.createSequentialGroup()
                        .addComponent(txt_Cap, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_citta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(txt_Citta, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Indirizzo))
                .addContainerGap())
        );
        pnl_residenzaLayout.setVerticalGroup(
            pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_residenzaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pnl_residenzaLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt_Indirizzo))
                    .addComponent(lbl_Indirizzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Citta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_citta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_residenzaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pnl_residenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cap))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_esc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_esc.setText("ESCI");
        btn_esc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escActionPerformed(evt);
            }
        });

        btn_ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_bottoniLayout = new javax.swing.GroupLayout(pnl_bottoni);
        pnl_bottoni.setLayout(pnl_bottoniLayout);
        pnl_bottoniLayout.setHorizontalGroup(
            pnl_bottoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bottoniLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btn_esc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        pnl_bottoniLayout.setVerticalGroup(
            pnl_bottoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bottoniLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnl_bottoniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_esc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(pnl_nominativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(pnl_bottoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pnl_residenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(pnl_nominativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_residenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_bottoni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void txt_cognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cognomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_cognomeActionPerformed

    private void btn_escActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escActionPerformed
        // TODO add your handling code here:
        System.exit(-9999);
    }//GEN-LAST:event_btn_escActionPerformed

    private void txt_IndirizzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IndirizzoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IndirizzoActionPerformed

    private void txt_CapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CapActionPerformed

    private void txt_CittaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CittaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CittaActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here:
        
        //System.out.println(rb_fisica.);
        //System.out.println(rbg_Sit_Fiscale.isSelected());
        //System.out.println(rbg_Sit_Fiscale.);
        
        FinestraDialog finestra = new FinestraDialog(this, true);
        
        //finestra.txt_Nome_Cognome = "metto la stringa a mio piacere";
        
        //finestra.txt_Nome_Cognome.setText("metto la stringa a mio piacere");
        //finestra.txt_Nome_Cognome.setText(txt_nome.getText());
        //finestra.txt_Nome_Cognome = txt_nome;
        
        finestra.txt_Nome_Cognome.setText(txt_nome.getText() + " " + txt_cognome.getText());
        
        if (txt_nome.getText().isEmpty()) { 
           finestra.lbl_Titolo.setText("Non hai inserito il nome, birbante!");
        } else {
           finestra.lbl_Titolo.setText("Tutto corretto");
        }
         
        finestra.setVisible(true);
    }//GEN-LAST:event_btn_okActionPerformed

    private void rb_giuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_giuridicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_giuridicaActionPerformed

    private void rb_fisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_fisicaActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_esc;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel lbl_Indirizzo;
    private javax.swing.JLabel lbl_cap;
    private javax.swing.JLabel lbl_citta;
    private javax.swing.JLabel lbl_cognome;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JPanel pnl_bottoni;
    private javax.swing.JPanel pnl_nominativo;
    private javax.swing.JPanel pnl_residenza;
    private javax.swing.JRadioButton rb_fisica;
    private javax.swing.JRadioButton rb_giuridica;
    private javax.swing.ButtonGroup rbg_Sit_Fiscale;
    private javax.swing.JTextField txt_Cap;
    private javax.swing.JTextField txt_Citta;
    private javax.swing.JTextField txt_Indirizzo;
    private javax.swing.JTextField txt_cognome;
    protected javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}