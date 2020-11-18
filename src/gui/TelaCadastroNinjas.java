/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.Ninja;
import java.util.ArrayList;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @author vitor
 */
public class TelaCadastroNinjas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroNinjas
     */
    
    private ArrayList<Ninja> ninjas;
    
    public TelaCadastroNinjas(ArrayList<Ninja> ninjas) {
        initComponents();
        this.ninjas =  ninjas;
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
        nomeNinja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rankNinja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idadeNinja = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        meritoNinja = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Ninjas");
        setNormalBounds(new java.awt.Rectangle(0, 0, 82, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Rank do Ninja:");
        jLabel1.setMaximumSize(new java.awt.Dimension(181, 29));
        jLabel1.setMinimumSize(new java.awt.Dimension(181, 29));
        jLabel1.setPreferredSize(new java.awt.Dimension(181, 29));

        nomeNinja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeNinjaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nome do Ninja:");
        jLabel2.setMaximumSize(new java.awt.Dimension(181, 29));
        jLabel2.setMinimumSize(new java.awt.Dimension(181, 29));
        jLabel2.setPreferredSize(new java.awt.Dimension(181, 29));

        rankNinja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankNinjaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Idade do Ninja:");
        jLabel3.setMaximumSize(new java.awt.Dimension(181, 29));
        jLabel3.setMinimumSize(new java.awt.Dimension(181, 29));
        jLabel3.setPreferredSize(new java.awt.Dimension(181, 29));

        idadeNinja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeNinjaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Mérito do Ninja");
        jLabel4.setMaximumSize(new java.awt.Dimension(181, 29));
        jLabel4.setMinimumSize(new java.awt.Dimension(181, 29));
        jLabel4.setPreferredSize(new java.awt.Dimension(181, 29));

        meritoNinja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meritoNinjaActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNinjaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(meritoNinja)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idadeNinja)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeNinja)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rankNinja, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rankNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idadeNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meritoNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        nomeNinja.getAccessibleContext().setAccessibleName("");
        nomeNinja.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rankNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankNinjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rankNinjaActionPerformed

    private void idadeNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeNinjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeNinjaActionPerformed

    private void meritoNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meritoNinjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meritoNinjaActionPerformed

    private void cadastrarNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNinjaActionPerformed
        // TODO add your handling code here:
        int idade = Integer.parseInt(this.idadeNinja.getText());
        double merito = Double.parseDouble(this.meritoNinja.getText());
        
        Ninja ninja = new Ninja(this.nomeNinja.getText(),idade,this.rankNinja.getText(),merito,"");
        
        this.ninjas.add(ninja);
        CreateTextFile.openFile("listaNinjas.txt");
        for(Ninja ninjas : this.ninjas){
            
            CreateTextFile.cadastraNinja(ninjas);
        }
        CreateTextFile.closeFile();
        
        //metodo limpar
        this.nomeNinja.setText("");
        this.rankNinja.setText("");
        this.idadeNinja.setText("");
        this.meritoNinja.setText("");
        
          
    }//GEN-LAST:event_cadastrarNinjaActionPerformed

    private void nomeNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeNinjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeNinjaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idadeNinja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField meritoNinja;
    private javax.swing.JTextField nomeNinja;
    private javax.swing.JTextField rankNinja;
    // End of variables declaration//GEN-END:variables
}
