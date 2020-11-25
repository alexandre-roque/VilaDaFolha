
package gui;

import dominio.ControleMissoes;
import dominio.Missao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @author alexa
 */
public class TelaCadastroMissoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroMissoes
     */
    
    private String nomeAntes;
    
    private ControleMissoes controleMissoes; 
    
    public TelaCadastroMissoes() {
        initComponents();
        this.controleMissoes = new ControleMissoes();
        this.nomeAntes = "";
    }

    /**
    *
    * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
    */
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelTituloMissao = new javax.swing.JLabel();
        textTituloMissao = new javax.swing.JTextField();
        labelDescricaoMissao = new javax.swing.JLabel();
        textDescricaoMissao = new javax.swing.JTextField();
        lavelRankMissao = new javax.swing.JLabel();
        textRankMissao = new javax.swing.JTextField();
        cadastrarMissao = new javax.swing.JButton();
        consultarMissao = new javax.swing.JButton();
        removerMissao = new javax.swing.JButton();
        editarMissao = new javax.swing.JButton();
        limparMissao = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Nome da missão: ");

        jButton1.setText("Cadastrar");

        setTitle("Cadastro Missões");

        labelTituloMissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelTituloMissao.setText("Título da missão: ");

        labelDescricaoMissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelDescricaoMissao.setText("Descrição da missão: ");

        lavelRankMissao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lavelRankMissao.setText("Rank da missão:");

        cadastrarMissao.setText("Cadastrar");
        cadastrarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarMissaoEvt(evt);
            }
        });

        consultarMissao.setText("Consultar");
        consultarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMissaoEvt(evt);
            }
        });

        removerMissao.setText("Remover");
        removerMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerMissaoEvt(evt);
            }
        });

        editarMissao.setText("Editar");
        editarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMissaoEvt(evt);
            }
        });

        limparMissao.setText("Limpar");
        limparMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparMissaoEvt(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTituloMissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(textDescricaoMissao)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removerMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(editarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labelDescricaoMissao)
                                        .addComponent(textTituloMissao))
                                    .addGap(88, 88, 88)
                                    .addComponent(cadastrarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(consultarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textRankMissao)
                            .addComponent(lavelRankMissao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limparMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelDescricaoMissao, labelTituloMissao, lavelRankMissao, textDescricaoMissao, textRankMissao, textTituloMissao});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labelTituloMissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textTituloMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelDescricaoMissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textDescricaoMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lavelRankMissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textRankMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastrarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(consultarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removerMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparMissao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparTela(){
        
        this.textTituloMissao.setText("");
        this.textDescricaoMissao.setText("");
        this.textRankMissao.setText("");
    }
    
    private void cadastarMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarMissaoEvt
        //Cadastra a nova missão
        controleMissoes.adicionaMissao(this.textTituloMissao.getText(),this.textDescricaoMissao.getText(),this.textRankMissao.getText());
        //Mensagem de Inclusao
        JOptionPane.showMessageDialog(this, "Missão incluída com sucesso!", "Inclusão sucedida", JOptionPane.INFORMATION_MESSAGE);
        //Limpa os campos
        limparTela();
    }//GEN-LAST:event_cadastarMissaoEvt

    private void consultarMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMissaoEvt
        
        String campos[] = null;
        if(!this.textTituloMissao.getText().equals("")){
            campos = this.controleMissoes.consultarNinja(this.textTituloMissao.getText());
            nomeAntes = this.textTituloMissao.getText();
        }
        
        if(campos!=null){
            this.textTituloMissao.setText(campos[0]);
            this.textDescricaoMissao.setText(campos[1]);
            this.textRankMissao.setText(campos[2]);
        }else{
           JOptionPane.showMessageDialog(this, " Ninja não encontrado !", "Aviso", JOptionPane.ERROR_MESSAGE);
           limparTela();
        }
        
    }//GEN-LAST:event_consultarMissaoEvt

    private void removerMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerMissaoEvt
        if(this.controleMissoes.removerMissao(this.textTituloMissao.getText())==true){
            JOptionPane.showMessageDialog(this, "Ninja removido com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            limparTela();
        }else{
            JOptionPane.showMessageDialog(this, " Não existe esse Ninja!", "Informação", JOptionPane.INFORMATION_MESSAGE); 
            limparTela();
        }
    }//GEN-LAST:event_removerMissaoEvt

    private void editarMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMissaoEvt
        String []camposNinja = new String[4];
        if(!nomeAntes.equals("")){
            
            camposNinja[0] = this.textTituloMissao.getText();
            camposNinja[1] = this.textDescricaoMissao.getText();
            camposNinja[2] = this.textRankMissao.getText();
            camposNinja[3] = this.nomeAntes;
        
            if(this.controleMissoes.editarMissao(camposNinja) == true){
                JOptionPane.showMessageDialog(this, "Ninja Editado com Sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                limparTela();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Consulte o NinjaPrimeiro para depois Editar!!!", "Informação", JOptionPane.INFORMATION_MESSAGE); 
            limparTela();
        }
    }//GEN-LAST:event_editarMissaoEvt

    private void limparMissaoEvt(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparMissaoEvt
        limparTela();
    }//GEN-LAST:event_limparMissaoEvt


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarMissao;
    private javax.swing.JButton consultarMissao;
    private javax.swing.JButton editarMissao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelDescricaoMissao;
    private javax.swing.JLabel labelTituloMissao;
    private javax.swing.JLabel lavelRankMissao;
    private javax.swing.JButton limparMissao;
    private javax.swing.JButton removerMissao;
    private javax.swing.JTextField textDescricaoMissao;
    private javax.swing.JTextField textRankMissao;
    private javax.swing.JTextField textTituloMissao;
    // End of variables declaration//GEN-END:variables
}
