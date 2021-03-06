/**
 * CVSS v2 Java Data Structure Copyright (c) 2015 - Mattia Zago
 * <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 *
 * NVD Common Vulnerability Scoring System Support v2 The Common Vulnerability
 * Scoring System (CVSS) provides an open framework for communicating the
 * characteristics and impacts of IT vulnerabilities. CVSS consists of 3 groups:
 * Base, Temporal and Environmental. Each group produces a numeric score ranging
 * from 0 to 10, and a Vector, a compressed textual representation that reflects
 * the values used to derive the score. The Base group represents the intrinsic
 * qualities of a vulnerability. The Temporal group reflects the characteristics
 * of a vulnerability that change over time. The Environmental group represents
 * the characteristics of a vulnerability that are unique to any user's
 * environment. CVSS enables IT managers, vulnerability bulletin providers,
 * security vendors, application vendors and researchers to all benefit by
 * adopting this common language of scoring IT vulnerabilities.
 *
 * ----------------------------------------------------------------------------
 * DISCLAIMER
 * ----------------------------------------------------------------------------
 * This Java library implements the structure of the CVSS v2 standard. All the
 * relevant information and texts are taken from the NIST documentation
 * (https://nvd.nist.gov/cvss.cfm) or the FIRST CVSS guide
 * (http://www.first.org/cvss/).
 *
 * ----------------------------------------------------------------------------
 * LICENSE
 * ----------------------------------------------------------------------------
 * The following project is released under BSD 3-Clause License
 *
 * Copyright (c) 2015 - Mattia Zago
 * <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 * may be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package it.zagomattia.cvss;

import it.zagomattia.cvss.base.*;

/**
 * Ask to the user about the CVSS vector
 * @author Mattia Zago <a href="mailto:dev@zagomattia.it">dev@zagomattia.it</a>
 */
public class CSVVBaseJDialogUserInput extends javax.swing.JDialog {

    public CVSSBase result;
    
    /**
     * Creates new form CSVVBaseJDialogUserInput
     * @param parent Parent frame, the JDialog will be related to this. Can be null
     * @param modal Classic modal flag
     */
    public CSVVBaseJDialogUserInput(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        setModal(modal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AV_Panel = new javax.swing.JPanel();
        AV_Scroll = new javax.swing.JScrollPane();
        AV_List = new javax.swing.JList();
        AV_Value = new javax.swing.JFormattedTextField();
        AC_Panel = new javax.swing.JPanel();
        AC_Scroll = new javax.swing.JScrollPane();
        AC_List = new javax.swing.JList();
        AC_Value = new javax.swing.JFormattedTextField();
        AU_Panel = new javax.swing.JPanel();
        AU_Scroll = new javax.swing.JScrollPane();
        AU_List = new javax.swing.JList();
        AU_Value = new javax.swing.JFormattedTextField();
        A_Panel = new javax.swing.JPanel();
        A_Scroll = new javax.swing.JScrollPane();
        A_List = new javax.swing.JList();
        A_Value = new javax.swing.JFormattedTextField();
        C_Panel = new javax.swing.JPanel();
        C_Scroll = new javax.swing.JScrollPane();
        C_List = new javax.swing.JList();
        C_Value = new javax.swing.JFormattedTextField();
        I_Panel = new javax.swing.JPanel();
        I_Scroll = new javax.swing.JScrollPane();
        I_List = new javax.swing.JList();
        I_Value = new javax.swing.JFormattedTextField();
        BTN_Cancel = new javax.swing.JButton();
        BTN_CreateVector = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CVSS Base Score Vector");

        AV_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("AV - Access Vector"));

        AV_List.setModel(AV.getListModel());
        AV_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AV_List.setSelectedIndex(0);
        AV_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AV_ListValueChanged(evt);
            }
        });
        AV_Scroll.setViewportView(AV_List);

        AV_Value.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        AV_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AV_Value.setText(((AV)AV_List.getSelectedValue()).getValueAsString());
        AV_Value.setToolTipText("Please insert a value");
        AV_Value.setEnabled(false);

        javax.swing.GroupLayout AV_PanelLayout = new javax.swing.GroupLayout(AV_Panel);
        AV_Panel.setLayout(AV_PanelLayout);
        AV_PanelLayout.setHorizontalGroup(
            AV_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AV_PanelLayout.createSequentialGroup()
                .addComponent(AV_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(AV_Value)
        );
        AV_PanelLayout.setVerticalGroup(
            AV_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AV_PanelLayout.createSequentialGroup()
                .addComponent(AV_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AV_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AC_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("AC - Access Control"));

        AC_List.setModel(AC.getListModel());
        AC_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AC_List.setSelectedIndex(0);
        AC_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AC_ListValueChanged(evt);
            }
        });
        AC_Scroll.setViewportView(AC_List);

        AC_Value.setFormatterFactory(AV_Value.getFormatterFactory());
        AC_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AC_Value.setText(((AC)AC_List.getSelectedValue()).getValueAsString());
        AC_Value.setToolTipText("Please insert a value");
        AC_Value.setEnabled(false);

        javax.swing.GroupLayout AC_PanelLayout = new javax.swing.GroupLayout(AC_Panel);
        AC_Panel.setLayout(AC_PanelLayout);
        AC_PanelLayout.setHorizontalGroup(
            AC_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AC_PanelLayout.createSequentialGroup()
                .addComponent(AC_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(AC_Value)
        );
        AC_PanelLayout.setVerticalGroup(
            AC_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AC_PanelLayout.createSequentialGroup()
                .addComponent(AC_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AC_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AU_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("AU - Authentication"));

        AU_List.setModel(AU.getListModel());
        AU_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        AU_List.setSelectedIndex(0);
        AU_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                AU_ListValueChanged(evt);
            }
        });
        AU_Scroll.setViewportView(AU_List);

        AU_Value.setFormatterFactory(AV_Value.getFormatterFactory());
        AU_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AU_Value.setText(((AU)AU_List.getSelectedValue()).getValueAsString());
        AU_Value.setToolTipText("Please insert a value");
        AU_Value.setEnabled(false);

        javax.swing.GroupLayout AU_PanelLayout = new javax.swing.GroupLayout(AU_Panel);
        AU_Panel.setLayout(AU_PanelLayout);
        AU_PanelLayout.setHorizontalGroup(
            AU_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AU_PanelLayout.createSequentialGroup()
                .addComponent(AU_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(AU_Value)
        );
        AU_PanelLayout.setVerticalGroup(
            AU_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AU_PanelLayout.createSequentialGroup()
                .addComponent(AU_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AU_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        A_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("A - Availability"));

        A_List.setModel(A.getListModel());
        A_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        A_List.setSelectedIndex(0);
        A_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                A_ListValueChanged(evt);
            }
        });
        A_Scroll.setViewportView(A_List);

        A_Value.setFormatterFactory(AV_Value.getFormatterFactory());
        A_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A_Value.setText(((A)A_List.getSelectedValue()).getValueAsString());
        A_Value.setToolTipText("Please insert a value");
        A_Value.setEnabled(false);

        javax.swing.GroupLayout A_PanelLayout = new javax.swing.GroupLayout(A_Panel);
        A_Panel.setLayout(A_PanelLayout);
        A_PanelLayout.setHorizontalGroup(
            A_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_PanelLayout.createSequentialGroup()
                .addComponent(A_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(A_Value)
        );
        A_PanelLayout.setVerticalGroup(
            A_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_PanelLayout.createSequentialGroup()
                .addComponent(A_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(A_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        C_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("C - Confidentiality"));

        C_List.setModel(C.getListModel());
        C_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        C_List.setSelectedIndex(0);
        C_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                C_ListValueChanged(evt);
            }
        });
        C_Scroll.setViewportView(C_List);

        C_Value.setFormatterFactory(AV_Value.getFormatterFactory());
        C_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        C_Value.setText(((C)C_List.getSelectedValue()).getValueAsString());
        C_Value.setToolTipText("Please insert a value");
        C_Value.setEnabled(false);

        javax.swing.GroupLayout C_PanelLayout = new javax.swing.GroupLayout(C_Panel);
        C_Panel.setLayout(C_PanelLayout);
        C_PanelLayout.setHorizontalGroup(
            C_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C_PanelLayout.createSequentialGroup()
                .addComponent(C_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(C_Value)
        );
        C_PanelLayout.setVerticalGroup(
            C_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(C_PanelLayout.createSequentialGroup()
                .addComponent(C_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(C_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        I_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("I - Integrity"));

        I_List.setModel(I.getListModel());
        I_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        I_List.setSelectedIndex(0);
        I_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                I_ListValueChanged(evt);
            }
        });
        I_Scroll.setViewportView(I_List);

        I_Value.setFormatterFactory(AV_Value.getFormatterFactory());
        I_Value.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        I_Value.setText(((I)I_List.getSelectedValue()).getValueAsString());
        I_Value.setToolTipText("Please insert a value");
        I_Value.setEnabled(false);

        javax.swing.GroupLayout I_PanelLayout = new javax.swing.GroupLayout(I_Panel);
        I_Panel.setLayout(I_PanelLayout);
        I_PanelLayout.setHorizontalGroup(
            I_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(I_PanelLayout.createSequentialGroup()
                .addComponent(I_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(I_Value)
        );
        I_PanelLayout.setVerticalGroup(
            I_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(I_PanelLayout.createSequentialGroup()
                .addComponent(I_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(I_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BTN_Cancel.setText("Cancel");
        BTN_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CancelActionPerformed(evt);
            }
        });

        BTN_CreateVector.setText("Create Vector");
        BTN_CreateVector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CreateVectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_CreateVector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AV_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AC_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AU_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(I_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AC_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AV_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AU_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Cancel)
                    .addComponent(BTN_CreateVector))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AV_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AV_ListValueChanged
        AV_Value.setText(((AV)AV_List.getSelectedValue()).getValueAsString());
    }//GEN-LAST:event_AV_ListValueChanged

    private void AC_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AC_ListValueChanged
        AC_Value.setText(((AC)AC_List.getSelectedValue()).getValueAsString());
    }//GEN-LAST:event_AC_ListValueChanged

    private void AU_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_AU_ListValueChanged
        AU_Value.setText(((AU)AU_List.getSelectedValue()).getValueAsString());
    }//GEN-LAST:event_AU_ListValueChanged

    private void A_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_A_ListValueChanged
        A_Value.setText(((A)A_List.getSelectedValue()).getValueAsString());
    }//GEN-LAST:event_A_ListValueChanged

    private void C_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_C_ListValueChanged
        C_Value.setText(((C)C_List.getSelectedValue()).getValueAsString());
    }//GEN-LAST:event_C_ListValueChanged

    private void I_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_I_ListValueChanged
        I_Value.setText(((I)I_List.getSelectedValue()).getValueAsString());
    }//GEN-LAST:event_I_ListValueChanged

    private void BTN_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_BTN_CancelActionPerformed

    private void BTN_CreateVectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CreateVectorActionPerformed

        this.result = new CVSSBase(
                (AV)AV_List.getSelectedValue(), 
                (AC)AC_List.getSelectedValue(), 
                (AU)AU_List.getSelectedValue(), 
                (C)C_List.getSelectedValue(), 
                (I)I_List.getSelectedValue(), 
                (A)A_List.getSelectedValue()
        );
        dispose();
    }//GEN-LAST:event_BTN_CreateVectorActionPerformed

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
            java.util.logging.Logger.getLogger(CSVVBaseJDialogUserInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSVVBaseJDialogUserInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSVVBaseJDialogUserInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSVVBaseJDialogUserInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CSVVBaseJDialogUserInput dialog = new CSVVBaseJDialogUserInput(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList AC_List;
    private javax.swing.JPanel AC_Panel;
    private javax.swing.JScrollPane AC_Scroll;
    private javax.swing.JFormattedTextField AC_Value;
    private javax.swing.JList AU_List;
    private javax.swing.JPanel AU_Panel;
    private javax.swing.JScrollPane AU_Scroll;
    private javax.swing.JFormattedTextField AU_Value;
    private javax.swing.JList AV_List;
    private javax.swing.JPanel AV_Panel;
    private javax.swing.JScrollPane AV_Scroll;
    private javax.swing.JFormattedTextField AV_Value;
    private javax.swing.JList A_List;
    private javax.swing.JPanel A_Panel;
    private javax.swing.JScrollPane A_Scroll;
    private javax.swing.JFormattedTextField A_Value;
    private javax.swing.JButton BTN_Cancel;
    private javax.swing.JButton BTN_CreateVector;
    private javax.swing.JList C_List;
    private javax.swing.JPanel C_Panel;
    private javax.swing.JScrollPane C_Scroll;
    private javax.swing.JFormattedTextField C_Value;
    private javax.swing.JList I_List;
    private javax.swing.JPanel I_Panel;
    private javax.swing.JScrollPane I_Scroll;
    private javax.swing.JFormattedTextField I_Value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
