/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacao.ControleNinjas;
import dominio.Ninja;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
    private String nomeAntes;
    
    private ControleNinjas controleNinja; 
    
    public TelaCadastroNinjas() {
        initComponents();
        controleNinja = new ControleNinjas();
        this.nomeAntes = "";
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

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

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarNinjaActionPerformed(evt);
            }
        });

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerNinjaActionPerformed(evt);
            }
        });

        jButton4.setText("Limpar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCamposActionPerformed(evt);
            }
        });

        jButton5.setText("Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarNinjaActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rankNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idadeNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meritoNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
        
        //Cadastra o novo Ninja
        controleNinja.adicionaNinja(this.nomeNinja.getText(),this.idadeNinja.getText(),this.rankNinja.getText(),this.meritoNinja.getText());
        //Mensagem de Inclusao
        JOptionPane.showMessageDialog(this, "Ninja incluido com sucesso!", "Inclusão", JOptionPane.INFORMATION_MESSAGE);
        //Limpa os campos
        limparTela();
          
    }//GEN-LAST:event_cadastrarNinjaActionPerformed
    
    private void limparTela(){
        
        this.nomeNinja.setText("");
        this.rankNinja.setText("");
        this.idadeNinja.setText("");
        this.meritoNinja.setText("");
    }
    private void nomeNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeNinjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeNinjaActionPerformed

    private void consultarNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarNinjaActionPerformed
       
        String campos[];
        campos = this.controleNinja.consultarNinja(this.nomeNinja.getText());
        nomeAntes = this.nomeNinja.getText();
        
        if(campos!=null){
            
            this.idadeNinja.setText(campos[0]);
            this.rankNinja.setText(campos[1]);
            this.meritoNinja.setText(campos[2]);
        }else{
           JOptionPane.showMessageDialog(this, " Não existe esse Ninja!", "Informação", JOptionPane.INFORMATION_MESSAGE);
           limparTela();
        }
    }//GEN-LAST:event_consultarNinjaActionPerformed

    private void removerNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerNinjaActionPerformed
        
        if(this.controleNinja.removerNinja(this.nomeNinja.getText())==true){
            JOptionPane.showMessageDialog(this, "Ninja removido com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limparTela();
        }else{
            JOptionPane.showMessageDialog(this, " Não existe esse Ninja!", "Informação", JOptionPane.INFORMATION_MESSAGE); 
            limparTela();
        }
    }//GEN-LAST:event_removerNinjaActionPerformed

    private void limparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCamposActionPerformed
        limparTela();
    }//GEN-LAST:event_limparCamposActionPerformed

    private void editarNinjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarNinjaActionPerformed
        
        String []camposNinja = new String[5];
        if(!nomeAntes.equals("")){
            
            camposNinja[0] = this.nomeNinja.getText();
            camposNinja[1] = this.idadeNinja.getText();
            camposNinja[2] = this.rankNinja.getText();
            camposNinja[3] = this.meritoNinja.getText();
            camposNinja[4] = this.nomeAntes;
        
            if(this.controleNinja.editarNinja(camposNinja) == true){
                JOptionPane.showMessageDialog(this, "Ninja Editado com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                limparTela();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Consulte o NinjaPrimeiro para depois Editar!!!", "Informação", JOptionPane.INFORMATION_MESSAGE); 
            limparTela();
        }
    }//GEN-LAST:event_editarNinjaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idadeNinja;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField meritoNinja;
    private javax.swing.JTextField nomeNinja;
    private javax.swing.JTextField rankNinja;
    // End of variables declaration//GEN-END:variables
}
