/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radunkovic.racunalnaoprema.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import radunkovic.racunalnaoprema.controller.ObradaOdjel;
import radunkovic.racunalnaoprema.controller.ObradaOprema;
import radunkovic.racunalnaoprema.model.Odjel;
import radunkovic.racunalnaoprema.model.Oprema;
import radunkovic.racunalnaoprema.model.Otpis;
import radunkovic.racunalnaoprema.pomocno.RacunalnaOpremaException;

/**
 *
 * @author Ivan
 */
public class Odjeli extends javax.swing.JFrame {
    
    private ObradaOdjel obradaOdjel;
     private static DefaultComboBoxModel<Oprema> modelOprema;

    /**
     * Creates new form Odjeli
     */
    public Odjeli() {
        initComponents();
        obradaOdjel = new ObradaOdjel();
        ucitajPodatke();
        
        DefaultComboBoxModel<Oprema> ms = new DefaultComboBoxModel<>();
        Oprema vp = new Oprema();
        vp.setNaziv("Odaberite opremu");
        vp.setMacadresa("");
        
        ms.addElement(vp);
        new ObradaOprema().getLista().forEach((s) -> {
            ms.addElement(s);
        });
        cbOprema.setModel(ms);
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
        lstOdjeli = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBrojZaposlenih = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbOprema = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtNaziv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Odjeli");

        lstOdjeli.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstOdjeli.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstOdjeliValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstOdjeli);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Naziv");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Broj zaposlenih");

        txtBrojZaposlenih.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Oprema");

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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Ocisti");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBrojZaposlenih, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnBrisanje)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPromjena)))
                    .addComponent(cbOprema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBrojZaposlenih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbOprema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromjena))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBrisanje)
                    .addComponent(jButton1))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstOdjeliValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstOdjeliValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Odjel s = lstOdjeli.getSelectedValue();
        if (s == null) {
            return;
        }

        

        txtNaziv.setText(s.getNaziv());
        txtBrojZaposlenih.setText(String.valueOf(s.getBrojzaposlenih()));
       
        modelOprema = (DefaultComboBoxModel<Oprema>) cbOprema.getModel();
        for (int i = 0; i < modelOprema.getSize(); i++) {
            if (modelOprema.getElementAt(i).getSifra() == s.getOprema().getSifra()) {
                cbOprema.setSelectedIndex(i);
                break;
            }
        }
       

    }//GEN-LAST:event_lstOdjeliValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        Odjel s = new Odjel();

        preuzmiVrijednosti(s);

        try {
            obradaOdjel.spremi(s);
        } catch (RacunalnaOpremaException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();
        
        ocistiPolja();
        

        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        Odjel s = lstOdjeli.getSelectedValue();

        if (s == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite odjel");
        }

        preuzmiVrijednosti(s);

        try {
            obradaOdjel.spremi(s);
        } catch (RacunalnaOpremaException e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
            return;
        }

        ucitajPodatke();
        ocistiPolja();

        
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        Odjel s = lstOdjeli.getSelectedValue();

        if (s == null) {
            JOptionPane.showConfirmDialog(null, "Prvo odaberite odjel");
        }

        try {
            obradaOdjel.obrisi(s);
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
    private javax.swing.JComboBox<Oprema> cbOprema;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Odjel> lstOdjeli;
    private javax.swing.JTextField txtBrojZaposlenih;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void ocistiPolja() {
        txtNaziv.setText("");
        txtBrojZaposlenih.setText("");
        cbOprema.setSelectedIndex(0);
        
    }

    private void preuzmiVrijednosti(Odjel s) {
        s.setNaziv(txtNaziv.getText());
        
        
        try {
            s.setBrojzaposlenih(Integer.parseInt(txtBrojZaposlenih.getText()));
        } catch (Exception e) {
            s.setBrojzaposlenih(0);
            txtBrojZaposlenih.setText("0");
        }
        s.setOprema((Oprema) cbOprema.getSelectedItem());
    }

    private void ucitajPodatke() {
        DefaultListModel<Odjel> m = new DefaultListModel<>();
        obradaOdjel.getLista().forEach((o) -> {
            m.addElement(o);
        });
        lstOdjeli.setModel(m);
    }
}
