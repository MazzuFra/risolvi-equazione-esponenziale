package programma.matematica;

import javax.swing.*;
import java.math.*;
import java.text.DecimalFormat;

public class MyJFrame extends javax.swing.JFrame {

    public MyJFrame() {
        initComponents();
        jPanel3.setVisible(false);
        jPanel2.setVisible(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfieldA = new javax.swing.JTextField();
        txtfieldB = new javax.swing.JTextField();
        btnConferma = new javax.swing.JButton();
        jLabelB = new javax.swing.JLabel();
        jLabelA = new javax.swing.JLabel();
        radioAXB = new javax.swing.JRadioButton();
        radioAX = new javax.swing.JRadioButton();
        radioA = new javax.swing.JRadioButton();
        chboxDecimale = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtfieldEqInserita = new javax.swing.JTextField();
        btnModifica = new javax.swing.JButton();
        btnConferma2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelEqInserita = new javax.swing.JLabel();
        btnCalcola = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaCalcoli = new javax.swing.JTextArea();
        btnIndietro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcolo segno equazione esponenziale");

        jLabel1.setText("Seleziona il tipo di equazione:");

        btnConferma.setText("Conferma");
        btnConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfermaActionPerformed(evt);
            }
        });

        jLabelB.setText("b=");

        jLabelA.setText("a=");

        buttonGroup1.add(radioAXB);
        radioAXB.setSelected(true);
        radioAXB.setText("y=a^x+b");
        radioAXB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioAXBStateChanged(evt);
            }
        });

        buttonGroup1.add(radioAX);
        radioAX.setText("y=a^x");
        radioAX.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioAXStateChanged(evt);
            }
        });

        buttonGroup1.add(radioA);
        radioA.setText("y=a");
        radioA.setEnabled(false);
        radioA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioAStateChanged(evt);
            }
        });

        chboxDecimale.setText("decimale");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(radioAXB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radioAX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelB, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfieldB, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(txtfieldA)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(radioA, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnConferma))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chboxDecimale)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chboxDecimale, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelA)
                    .addComponent(radioAXB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelB)
                    .addComponent(radioAX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioA)
                    .addComponent(btnConferma))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setText("l'equazione inserita è:");

        txtfieldEqInserita.setText("y=a^x+ b");
        txtfieldEqInserita.setFocusable(false);

        btnModifica.setText("Modifica");
        btnModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificaActionPerformed(evt);
            }
        });

        btnConferma2.setText("Conferma");
        btnConferma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConferma2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfieldEqInserita)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnModifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConferma2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfieldEqInserita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifica)
                    .addComponent(btnConferma2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelEqInserita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEqInserita.setText("y=a^x+ b");

        btnCalcola.setText("calcola Positività");
        btnCalcola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcolaActionPerformed(evt);
            }
        });

        AreaCalcoli.setColumns(20);
        AreaCalcoli.setRows(5);
        AreaCalcoli.setFocusable(false);
        jScrollPane1.setViewportView(AreaCalcoli);

        btnIndietro.setText("Indietro");
        btnIndietro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndietroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(labelEqInserita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCalcola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIndietro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelEqInserita, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcola)
                    .addComponent(btnIndietro)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void calcolaSegno() {

        try {
            AreaCalcoli.setText("");
            if (radioAXB.isSelected()) {
                
                DecimalFormat df = new DecimalFormat("###");
                if (A == 1.0) {
                    
                    if (B > -1.0) {
                        AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                        throw new Exception("finito");
                    } else if (B == -1.0) {
                        AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> indeterminata \nnon è ne positiva ne negativa");
                        throw new Exception("finito");
                    } else if (B < -1.0) {
                        AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> non compreso in R\nL'equazione è sempre negativa");
                        throw new Exception("finito");
                    }
                } else if (A == 0.0) {
                    
                    if (B > 0.0) {
                        AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                        throw new Exception("finito");
                    } else if (B == 0.0) {
                        AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> indeterminata \nnon è ne positiva ne negativa");
                        throw new Exception("finito");
                    } else if (B < 0.0) {
                        AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> non compreso in R\nL'equazione è sempre negativa");
                        throw new Exception("finito");
                    }
                    
                } else if (B >= 0.0 && A != 0.0) {
                    AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                    throw new Exception("finito");
                } else {
                    
                    DecimalFormat fpos = new DecimalFormat("###.###");
                    double pos;
                    if (A > 1.0) {
                        pos = (Math.log10(-B) / Math.log10(A));
                    } else {
                        pos = -(Math.log10(-B) / Math.log10(A));
                    }
                    AreaCalcoli.append(rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB + ">0 -> x"+( (A>1.0) ? ">" : "<")+ fpos.format(pos) + "\nL'equazione è positiva per x"+( (A>1.0) ? ">" : "<")+ fpos.format(pos) + "\n");
                }
                
            } else if (radioAX.isSelected()) {
                if(A!=0)
                    AreaCalcoli.append(rapA + "^x" + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                else
                     AreaCalcoli.append(rapA + "^x" + ">0 -> indedeterminata\nL'equazione non è ne positiva ne negativa");
            }
        } catch (Exception e) {
        }
    }

    private void btnConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfermaActionPerformed
        if (chboxDecimale.isSelected()) {
            df = new DecimalFormat("###.###");
        } else {
            df = new DecimalFormat("###");
        }
        //controllo che non sian stati lasciati campi vuoti
        try {
            if (radioAXB.isSelected()) {
                if (txtfieldA.getText().equals("") || txtfieldB.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "non hai inserito nessun dato nei campi richiesti", "dati non validi", JOptionPane.ERROR_MESSAGE);
                    throw new Exception("dati errati");
                }
            } else {
                if (txtfieldA.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "non hai inserito nessun dato nel campo richiesto", "dati non validi", JOptionPane.ERROR_MESSAGE);
                    throw new Exception("dati errati");
                }
            }
            //controlla che a non sia < 0
            A = Double.parseDouble(txtfieldA.getText());
            rapA = df.format(A);
            if (A < 0.0) {
                throw new Exception("A<0");
            }
            
            if (radioAXB.isSelected()) {
                //controlla che selezionando y=a^x+b b non sia = 0
                B = Double.parseDouble(txtfieldB.getText());
                rapB = df.format(B);
                if (B == 0.0) {
                    throw new Exception("B=0");
                }
                //stampa la funzione inserita testualmente
                txtfieldEqInserita.setText("y=" + rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB);
                labelEqInserita.setText("y=" + rapA + "^x" + ((B >= 0.0) ? "+" : "") + rapB);
            } else if (radioAX.isSelected()) {
                txtfieldEqInserita.setText("y=" + rapA + "^x");
                labelEqInserita.setText("y=" + rapA + "^x");
            } else {
                txtfieldEqInserita.setText("y=" + rapA);
                labelEqInserita.setText("y=" + rapA);
            }
            jPanel2.setVisible(true);
            jPanel1.setVisible(false);
            pack();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "hai inserito dei valori non accettabili", "dati non validi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            //gestisce i casi in cui a<0 e y=a^x+b con b=0
            if (e.getMessage().equals("A<0")) {
                JOptionPane.showMessageDialog(this, "A minore di 0 non è accettabile", "dati non validi", JOptionPane.ERROR_MESSAGE);
            } else if (e.getMessage().equals("B=0")) {
                JOptionPane.showMessageDialog(this, "hai inserito B=0, usa y=a^x al posto di y=a^x+b", "Opzione consigliata", JOptionPane.INFORMATION_MESSAGE);
                radioAXB.setSelected(false);
                radioAX.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnConfermaActionPerformed

    private void radioAXBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioAXBStateChanged
        if (radioAXB.isSelected()) {
            txtfieldB.setEnabled(true);
        }

    }//GEN-LAST:event_radioAXBStateChanged

    private void radioAXStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioAXStateChanged
        if (radioAX.isSelected()) {
            txtfieldB.setEnabled(false);
            txtfieldB.setText("");
        }
    }//GEN-LAST:event_radioAXStateChanged

    private void radioAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioAStateChanged
        if (radioA.isSelected()) {
            txtfieldB.setEnabled(false);
            txtfieldB.setText("");
        }
    }//GEN-LAST:event_radioAStateChanged

    private void btnModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificaActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
        pack();
    }//GEN-LAST:event_btnModificaActionPerformed

    private void btnConferma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConferma2ActionPerformed

        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        AreaCalcoli.setText("");
        pack();
    }//GEN-LAST:event_btnConferma2ActionPerformed

    private void btnCalcolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcolaActionPerformed
        calcolaSegno();
//        AreaCalcoli.append("Sto calcolando.....\n\n\n lol no");
    }//GEN-LAST:event_btnCalcolaActionPerformed

    private void btnIndietroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndietroActionPerformed
        jPanel1.setVisible(true);
        jPanel3.setVisible(false);
        pack();
    }//GEN-LAST:event_btnIndietroActionPerformed

    private double A = 0, B = 0;
    private String rapA = "", rapB = "";
    DecimalFormat df;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaCalcoli;
    private javax.swing.JButton btnCalcola;
    private javax.swing.JButton btnConferma;
    private javax.swing.JButton btnConferma2;
    private javax.swing.JButton btnIndietro;
    private javax.swing.JButton btnModifica;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chboxDecimale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelA;
    private javax.swing.JLabel jLabelB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelEqInserita;
    private javax.swing.JRadioButton radioA;
    private javax.swing.JRadioButton radioAX;
    private javax.swing.JRadioButton radioAXB;
    private javax.swing.JTextField txtfieldA;
    private javax.swing.JTextField txtfieldB;
    private javax.swing.JTextField txtfieldEqInserita;
    // End of variables declaration//GEN-END:variables
}
