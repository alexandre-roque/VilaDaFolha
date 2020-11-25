/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.ControleMissoes;
import dominio.Missao;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author alexa
 */
public class TelaMissao extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaMissao
     */
    public TelaMissao(ControleMissoes controleMissoes) {
        this.controleMissoes = controleMissoes;
        this.missoes = controleMissoes.getMissoes();
        initComponents(); // PODEM TER 25 CARACTERES POR LINHA NO LABEL "mensagem"
        iniciaLista();
    }
    
    public void iniciaLista(){
        DefaultListModel model = new DefaultListModel();
        for(Missao missao: this.missoes){
            model.addElement(missao.getNome()); 
        } 
        this.listaMissoes.setModel(model);
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
        listaMissoes = new javax.swing.JList<>();
        rankMissao = new javax.swing.JLabel();
        labelDescricao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        descricaoMissaoPergaminho = new javax.swing.JLabel();
        fundoPergaminho = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dificuldadeMissao = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Missões");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/pergaminhoIcon.jpg"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        listaMissoes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaMissoes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaMissoesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaMissoes);

        rankMissao.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        rankMissao.setText("Rank: ");

        labelDescricao.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelDescricao.setText("Descrição da missão:");

        jPanel1.setLayout(null);

        descricaoMissaoPergaminho.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jPanel1.add(descricaoMissaoPergaminho);
        descricaoMissaoPergaminho.setBounds(30, 30, 200, 50);

        fundoPergaminho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/pergaminho.jpg"))); // NOI18N
        jPanel1.add(fundoPergaminho);
        fundoPergaminho.setBounds(0, 0, 260, 220);

        dificuldadeMissao.setColumns(20);
        dificuldadeMissao.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        dificuldadeMissao.setLineWrap(true);
        dificuldadeMissao.setRows(5);
        dificuldadeMissao.setText("\n");
        dificuldadeMissao.setFocusable(false);
        jScrollPane2.setViewportView(dificuldadeMissao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDescricao)
                            .addComponent(rankMissao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(rankMissao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDescricao)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaMissoesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaMissoesValueChanged
        int index = listaMissoes.getSelectedIndex();

        String descricao = "";
        String descricaoRank;
        descricao = ("<html>"+this.missoes.get(index).getDescricao()+"<html>");
        
        String rank = this.missoes.get(index).getRank();
        
        rankMissao.setText("Rank: "+rank);
        descricaoMissaoPergaminho.setText(descricao);
        
        if(this.missoes.get(index).getRank().equals("S")){
            dificuldadeMissao.setText("Essa missão é muito difícil, apesar de te conceder muito mérito, existe um perigo eminente de você perder a vida");
        }
        if(this.missoes.get(index).getRank().equals("A")){
            dificuldadeMissao.setText("Essa missão é difícil, apesar de te conceder mérito, existe um perigo de você perder a vida");
        }
        if(this.missoes.get(index).getRank().equals("B")){
            dificuldadeMissao.setText("Essa missão é tranquila, mas não deve ser subestimada");
        }
        if(this.missoes.get(index).getRank().equals("C")){
            dificuldadeMissao.setText("Essa missão é muito tranquila");
        }
        if(this.missoes.get(index).getRank().equals("D")){
            dificuldadeMissao.setText("Essa missão é fácil");
        }
        
        
    }//GEN-LAST:event_listaMissoesValueChanged

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        
    }//GEN-LAST:event_formInternalFrameClosing

    private ControleMissoes controleMissoes;
    private ArrayList<Missao> missoes;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descricaoMissaoPergaminho;
    private javax.swing.JTextArea dificuldadeMissao;
    private javax.swing.JLabel fundoPergaminho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JList<String> listaMissoes;
    private javax.swing.JLabel rankMissao;
    // End of variables declaration//GEN-END:variables

}
