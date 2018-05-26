package programma.matematica;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
import java.text.*;

public class MyGui implements ActionListener, ChangeListener {

    private String pan1 = "pan1", pan2 = "pan2", pan3 = "pan3";
    private JFrame finestradeck;
    private JTextArea AreaCalcoli;
    private JButton btnCalcola;
    private JButton btnConferma;
    private JButton btnConferma2;
    private JButton btnIndietro;
    private JButton btnModifica;
    private ButtonGroup buttonGroup1;
    private JCheckBox chboxDecimale;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JLabel jLabelA;
    private JLabel jLabelB;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jpanelradio;
    private JPanel jPaneltxtfield;
    private JScrollPane jScrollPane1;
    private JLabel labelEqInserita;
    private JRadioButton radioAX;
    private JRadioButton radioAXB;
    private JTextField txtfieldA;
    private JTextField txtfieldB;
    private JTextField txtfieldEqInserita;
    private CardLayout cl;
    private EqEsponenziale equazione;
    private int numerelloBello;
    
    private double lollo;
    public MyGui() {
        initComponents();
        finestradeck.setVisible(true);

    }

    //metodo per l'inizializzazione e inserimento nell'interfaccia grafica degli elementi grafici 
    private void initComponents() {

        //JFrame.setDefaultLookAndFeelDecorated(true);
        finestradeck = new JFrame("Calcolo segno equazione esponenziale");
        finestradeck.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cl = new CardLayout(2, 2);
        finestradeck.setLayout(cl);
        jPanel1 = new JPanel(new GridBagLayout());
        jPanel2 = new JPanel(new GridBagLayout());
        jPanel3 = new JPanel(new GridBagLayout());
        jpanelradio = new JPanel(new GridLayout(3, 1, 2, 2));
        jPaneltxtfield = new JPanel(new GridBagLayout());
        txtfieldA = new JTextField(5);
        txtfieldB = new JTextField(5);
        txtfieldEqInserita = new JTextField("y=a^x+ b", 20);
        jLabel1 = new JLabel("Seleziona il tipo di equazione:");
        jLabelA = new JLabel("a=");
        jLabelB = new JLabel("b=");
        jLabel3 = new JLabel("l'equazione inserita è:");
        labelEqInserita = new JLabel("y=a^x+ b");
        radioAXB = new JRadioButton("y=a^x+b");
        radioAX = new JRadioButton("y=a^x");
        buttonGroup1 = new ButtonGroup();
        chboxDecimale = new JCheckBox("decimale");
        btnConferma = new JButton("Conferma");
        btnModifica = new JButton("Modifica");
        btnConferma2 = new JButton("Conferma");
        btnCalcola = new JButton("calcola Positività");
        btnIndietro = new JButton("Indietro");
        AreaCalcoli = new JTextArea();
        jScrollPane1 = new JScrollPane(AreaCalcoli);
        equazione = new EqEsponenziale("#,###");

        buttonGroup1.add(radioAXB);
        buttonGroup1.add(radioAX);
        radioAXB.setSelected(true);

        txtfieldEqInserita.setFocusable(false);

        AreaCalcoli.setColumns(20);
        AreaCalcoli.setRows(5);
        AreaCalcoli.setFocusable(false);

        jpanelradio.add(radioAXB);
        jpanelradio.add(radioAX);

        jPaneltxtfield.add(jLabelA, setBagLayout(0, 0, 1, 1));
        jPaneltxtfield.add(jLabelB, setBagLayout(0, 1, 1, 1));
        jPaneltxtfield.add(txtfieldA, setBagLayout(1, 0, 1, 2));
        jPaneltxtfield.add(txtfieldB, setBagLayout(1, 1, 1, 2));
        jPaneltxtfield.add(btnConferma, setBagLayout(0, 2, 1, 3));

        jPanel1.add(jpanelradio, setBagLayout(0, 1, 2, 2));
        jPanel1.add(jLabel1, setBagLayout(0, 0, 1, 3));
        jPanel1.add(chboxDecimale, setBagLayout(3, 0, 1, 1));
        jPanel1.add(jPaneltxtfield, setBagLayout(3, 1, 3, 1));

        jPanel2.add(jLabel3, setBagLayout(0, 0, 1, 1));
        jPanel2.add(txtfieldEqInserita, setBagLayout(0, 1, 1, 2));
        jPanel2.add(btnModifica, setBagLayout(0, 2, 1, 1));
        jPanel2.add(btnConferma2, setBagLayout(1, 2, 1, 1));

        jPanel3.add(labelEqInserita, setBagLayout(0, 0, 1, 2));
        jPanel3.add(jScrollPane1, setBagLayout(0, 1, 2, 2));
        jPanel3.add(btnCalcola, setBagLayout(0, 3, 1, 1));
        jPanel3.add(btnIndietro, setBagLayout(1, 3, 1, 1));

        btnCalcola.addActionListener(this);
        btnConferma.addActionListener(this);
        btnConferma2.addActionListener(this);
        btnIndietro.addActionListener(this);
        btnModifica.addActionListener(this);
        radioAXB.addChangeListener(this);
        radioAX.addChangeListener(this);

        finestradeck.setResizable(false);
        finestradeck.setForeground(Color.CYAN);
        finestradeck.add(jPanel1, pan1);
        finestradeck.add(jPanel2, pan2);
        finestradeck.add(jPanel3, pan3);
        finestradeck.setVisible(true);
        finestradeck.pack();

    }

    //metodo per impostare le caratteristiche del GridBagLayout
    private GridBagConstraints setBagLayout(int gridx, int gridy, int gridheight, int gridwidth) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridheight = gridheight;
        gbc.gridwidth = gridwidth;
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        return gbc;
    }

    //metodi con le operazioni da svolgere per gli eventi generati da ogni componente gestita
    private void btnConfermaActionPerformed() {
        if (chboxDecimale.isSelected()) {
            equazione.setFormat("#,##0.0#");
        } else {
            equazione.setFormat("#,###");
        }
        //controllo che non siano stati lasciati campi vuoti
        try {
            if (radioAXB.isSelected()) {
                if (txtfieldA.getText().equals("") || txtfieldB.getText().equals("")) {
                    throw new Exception("dati errati");
                }
                equazione.setTipo(1);

            } else if (radioAX.isSelected()) {
                if (txtfieldA.getText().equals("")) {
                    throw new Exception("dati errati");
                }
                equazione.setTipo(0);
            }
            //controlla che a non sia < 0
            equazione.setA(Double.parseDouble(txtfieldA.getText()));
            //rapA = df.format(A);
            if (equazione.getA() < 0.0) {
                throw new Exception("A<0");
            }

            if (radioAXB.isSelected()) {
                //controlla che selezionando y=a^x+b b non sia = 0
                equazione.setB(Double.parseDouble(txtfieldB.getText()));
                if (equazione.getB() == 0.0) {
                    throw new Exception("B=0");
                }
                //stampa la funzione inserita testualmente
                txtfieldEqInserita.setText(equazione.getRapEquazione());
                labelEqInserita.setText(equazione.getRapEquazione());
            } else if (radioAX.isSelected()) {
                txtfieldEqInserita.setText(equazione.getRapEquazione());
                labelEqInserita.setText(equazione.getRapEquazione());
            } else {
                txtfieldEqInserita.setText(equazione.getRapEquazione());
                labelEqInserita.setText(equazione.getRapEquazione());
            }
            //mostra la finestra (jPanel) successiva
            cl.next(finestradeck.getContentPane());
            finestradeck.pack();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(finestradeck, "hai inserito dei valori non accettabili", "dati non validi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            //gestisce i casi in cui a<0 e y=a^x+b con b=0
            switch (e.getMessage()) {
                case "A<0":
                    JOptionPane.showMessageDialog(finestradeck, "A minore di 0 non è accettabile", "dati non validi", JOptionPane.ERROR_MESSAGE);
                    break;
                case "B=0":
                    JOptionPane.showMessageDialog(finestradeck, "hai inserito B=0, usa y=a^x al posto di y=a^x+b", "Opzione consigliata", JOptionPane.INFORMATION_MESSAGE);
                    radioAXB.setSelected(false);
                    radioAX.setSelected(true);
                    break;
                case "dati errati":
                    JOptionPane.showMessageDialog(finestradeck, "non hai inserito nessun dato nei campi richiesti", "dati non validi", JOptionPane.ERROR_MESSAGE);
                    System.err.println(e.getMessage());
                    break;
                default:
                    break;
            }

        }
    }

    private void btnConferma2ActionPerformed() {
        //cambia il jpanel visualizzato 
        cl.show(finestradeck.getContentPane(), pan3);
        AreaCalcoli.setText("");
        finestradeck.pack();
    }

    private void btnModificaActionPerformed() {
        cl.show(finestradeck.getContentPane(), pan1);
        finestradeck.pack();
    }

    private void btnIndietroActionPerformed() {
        cl.show(finestradeck.getContentPane(), pan1);
        finestradeck.pack();
    }

    private void stampaSegno() {

        AreaCalcoli.setText("");
        equazione.setSoluzione();
        if (Double.isNaN(equazione.getSoluzione())) {
            if (equazione.getTipo() == 1) {

                if (equazione.getA() == 1.0) {
                    if (equazione.getB() > -1.0) {
                        AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                    } else if (equazione.getB() == -1.0) {
                        AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> indeterminata \nnon è ne positiva ne negativa");
                    } else if (equazione.getB() < -1.0) {
                        AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> non compreso in R\nL'equazione è sempre negativa");
                    }
                } else if (equazione.getA() == 0.0) {
                    if (equazione.getB() > 0.0) {
                        AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                    } else if (equazione.getB() < 0.0) {
                        AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> non compreso in R\nL'equazione è sempre negativa");
                    }
                } else if (equazione.getB() > 0.0 && equazione.getA() != 0.0) {
                    AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
                }
            } else {
                AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> x non compreso in R\nL'equazione è sempre positiva");
            }
        } else if(equazione.getSoluzione()!=Double.NaN) {
            DecimalFormat fpos = new DecimalFormat("##0.0##");
            AreaCalcoli.append(equazione.getRapEquazioneWoY() + ">0 -> x" + ((equazione.getA() > 1.0) ? ">" : "<") + fpos.format(equazione.getSoluzione()) + "\nL'equazione è positiva per x" + ((equazione.getA() > 1.0) ? ">" : "<") + fpos.format(equazione.getSoluzione()) + "\n");
        }

    }

    private void radioAXBStateChanged() {
        if (radioAXB.isSelected()) {
            txtfieldB.setEnabled(true);
        }

    }

    private void radioAXStateChanged() {
        if (radioAX.isSelected()) {
            txtfieldB.setEnabled(false);
            txtfieldB.setText("");
        }
    }

    @Override
    //gestione degli eventi di tipo ChangeEvent (JRadioButton)
    public void stateChanged(ChangeEvent e) {
        //ridireziona la gestione dell'evento in base alla componente che lo ha generato
        if (e.getSource() == radioAXB) {
            radioAXBStateChanged();
        } else if (e.getSource() == radioAX) {
            radioAXStateChanged();
        }
    }

    @Override
    //gestione degli eventi del tipo ActionEvent (JButton)
    public void actionPerformed(ActionEvent e) {
        //ridireziona la gestione dell'evento in base alla componente che lo ha generato
        if (e.getSource() == btnConferma) {
            btnConfermaActionPerformed();
        } else if (e.getSource() == btnModifica) {
            btnModificaActionPerformed();
        } else if (e.getSource() == btnConferma2) {
            btnConferma2ActionPerformed();
        } else if (e.getSource() == btnIndietro) {
            btnIndietroActionPerformed();
        } else if (e.getSource() == btnCalcola) {
            stampaSegno();
        }

    }
}
