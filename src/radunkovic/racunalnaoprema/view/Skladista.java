/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import radunkovic.racunalnaoprema.controller.ObradaOtpis;
import radunkovic.racunalnaoprema.controller.ObradaSkladiste;
import radunkovic.racunalnaoprema.model.Otpis;
import radunkovic.racunalnaoprema.model.Skladiste;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class Skladista extends javax.swing.JFrame {

    private ObradaSkladiste obradaSkladiste;
    private static DefaultComboBoxModel<Otpis> modelOtpis;

    /**
     * Creates new form Skladista
     */
    public Skladista() {
        initComponents();
        obradaSkladiste = new ObradaSkladiste();
        ucitajPodatke();
        
        DefaultComboBoxModel<Otpis> mp = new DefaultComboBoxModel<>();
        Otpis pm = new Otpis();
        pm.setAktivno(true);
        mp.addElement(pm);
        new ObradaOtpis().getLista().forEach((p) -> {
            mp.addElement(p);
        });
        cbOtpis.setModel(mp);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstSkladista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtKolicina = new javax.swing.JTextField();
        chbDostupan = new javax.swing.JCheckBox();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbOtpis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Skladište");

        lstSkladista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstSkladista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstSkladistaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstSkladista);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Naziv");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Količina");

        txtKolicina.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        chbDostupan.setText("Dostupno");
        chbDostupan.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        btnDodaj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPromjena.setText("Promjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnBrisanje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        jButton1.setText("Očisti");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Otpis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBrisanje))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chbDostupan))
                        .addComponent(txtNaziv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addComponent(cbOtpis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtKolicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chbDostupan))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbOtpis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena)
                            .addComponent(btnBrisanje))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(65, 65, 65))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstSkladistaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstSkladistaValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Skladiste s = lstSkladista.getSelectedValue();
        if (s == null) {
            return;
        }

        ocistiPolja();

        txtNaziv.setText(s.getNaziv());
        txtKolicina.setText(String.valueOf(s.getKolicina()));
        chbDostupan.setSelected(s.isDostupnost());

        modelOtpis = (DefaultComboBoxModel<Otpis>) cbOtpis.getModel();
        for (int i = 0; i < modelOtpis.getSize(); i++) {
            if (modelOtpis.getElementAt(i).getSifra() == s.getOtpis().getSifra()) {
                cbOtpis.setSelectedIndex(i);
                break;
            }
        }


    }//GEN-LAST:event_lstSkladistaValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Skladiste s = new Skladiste();

        preuzmiVrijednosti(s);

        try {
            obradaSkladiste.spremi(s);
        } catch (RacunalnaOpremaException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Skladiste s = lstSkladista.getSelectedValue();

        if (s == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite naziv");
        }

        preuzmiVrijednosti(s);

        try {
            obradaSkladiste.spremi(s);
        } catch (RacunalnaOpremaException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();

        ocistiPolja();

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Skladiste s = lstSkladista.getSelectedValue();

        if (s == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite s skladista");
        }

        try {
            obradaSkladiste.obrisi(s);
            ucitajPodatke();
            ocistiPolja();
        } catch (RacunalnaOpremaException ex) {
            JOptionPane.showMessageDialog(null, "Ne mogu obrisati");
        }

    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ocistiPolja();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JComboBox<Otpis> cbOtpis;
    private javax.swing.JCheckBox chbDostupan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Skladiste> lstSkladista;
    private javax.swing.JTextField txtKolicina;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void ocistiPolja() {
        txtNaziv.setText("");
        txtKolicina.setText("");
        chbDostupan.setSelected(false);
        cbOtpis.setSelectedIndex(0);
    }

    private void preuzmiVrijednosti(Skladiste s) {
        s.setNaziv(txtNaziv.getText());
        try {
            s.setKolicina(Integer.parseInt(txtKolicina.getText()));
        } catch (Exception e) {
            s.setKolicina(0);
            txtKolicina.setText("0");
        }
        s.setDostupnost(chbDostupan.isSelected());

        s.setOtpis((Otpis) cbOtpis.getSelectedItem());
    }

    private void ucitajPodatke() {
        DefaultListModel<Skladiste> m = new DefaultListModel<>();
        obradaSkladiste.getLista().forEach((o) -> {
            m.addElement(o);
        });
        lstSkladista.setModel(m);
    }
}
