/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dominio.ControleNinjas;
import dominio.Ninja;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
 */
public class TelaNinja extends javax.swing.JInternalFrame implements Observer{

    /**
     * Creates new form TelaMissao
     */
    public TelaNinja(ControleNinjas controleNinja) {
        initComponents();
        
        this.ninjas = controleNinja.getNinjas();
        this.controleNinja = controleNinja;
        this.designarMissao = false;
        this.dificuldadeMissaoAtribuida = "";
        iniciaLista();
    }

    public boolean isDesignarMissao() {
        return designarMissao;
    }

    public void setDesignarMissao(boolean designarMissao) {
        this.designarMissao = designarMissao;
    }

    public String getDificuldadeMissaoAtribuida() {
        return dificuldadeMissaoAtribuida;
    }

    public void setDificuldadeMissaoAtribuida(String dificuldadeMissaoAtribuida) {
        this.dificuldadeMissaoAtribuida = dificuldadeMissaoAtribuida;
    }
    
    public void iniciaLista(){
        DefaultListModel model = new DefaultListModel();
        for(Ninja ninja: this.ninjas){
            model.addElement(ninja.getNome()); 
        } 
        this.listaNinjas.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeNinja = new javax.swing.JLabel();
        textoNomeNinja = new javax.swing.JTextField();
        rankNinja = new javax.swing.JLabel();
        textoRankNinja = new javax.swing.JTextField();
        idadeNinja = new javax.swing.JLabel();
        textoIdadeNinja = new javax.swing.JTextField();
        meritoNinja = new javax.swing.JLabel();
        textoMeritoNinja = new javax.swing.JTextField();
        labelImagemNinja = new javax.swing.JLabel();
        jPanelLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNinjas = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();

        setTitle("Ninjas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/iconeNinja.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(670, 356));

        nomeNinja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nomeNinja.setText("Nome do ninja:");

        textoNomeNinja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rankNinja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rankNinja.setText("Rank do Ninja:");

        textoRankNinja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        idadeNinja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idadeNinja.setText("Idade do Ninja");

        textoIdadeNinja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        meritoNinja.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        meritoNinja.setText("Mérito do Ninja");

        textoMeritoNinja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        listaNinjas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaNinjas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaNinjasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaNinjas);

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListaLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeNinja, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(textoNomeNinja)
                    .addComponent(rankNinja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoRankNinja)
                    .addComponent(textoIdadeNinja)
                    .addComponent(idadeNinja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(meritoNinja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoMeritoNinja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImagemNinja, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {idadeNinja, meritoNinja, nomeNinja, rankNinja});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelImagemNinja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nomeNinja)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textoNomeNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rankNinja)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textoRankNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(idadeNinja)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textoIdadeNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(meritoNinja)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textoMeritoNinja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idadeNinja, meritoNinja, nomeNinja, rankNinja});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {textoIdadeNinja, textoMeritoNinja});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaNinjasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaNinjasValueChanged
     
        int index = 0;
        ImageIcon imagem;
        
        if(listaNinjas.getSelectedIndex() >= 0 && listaNinjas.getSelectedIndex() <= ninjas.size()){
            index = listaNinjas.getSelectedIndex();
            textoNomeNinja.setText(ninjas.get(index).getNome());
            textoRankNinja.setText(ninjas.get(index).getRank());
            textoIdadeNinja.setText(String.valueOf(ninjas.get(index).getIdade()));
            textoMeritoNinja.setText(String.valueOf(ninjas.get(index).getMerito()));
            
            if(!ninjas.get(index).getImagem().equals("")){
                imagem = new ImageIcon(getClass().getResource(ninjas.get(index).getImagem()));
                labelImagemNinja.setIcon(imagem);
            }
            else
                imagem = new ImageIcon(getClass().getResource("/gui/images/ninjaDefault"));
            
            if(this.isDesignarMissao())
            {
                String mensagemAux = "Deseja atribuir essa missão ao ninja ";
                mensagemAux = mensagemAux.concat(ninjas.get(index).getNome());
                mensagemAux = mensagemAux.concat(" ?");
                int input = JOptionPane.showConfirmDialog(null, mensagemAux, "Selecione uma opção.", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
                switch (input) // 0=yes, 1=no, 2=cancel
                {
                    case 0:                                                 // sim    
                        
                        String mensagem = "O ninja ";
                        mensagem = mensagem.concat(ninjas.get(index).getNome());

                        if(this.getDificuldadeMissaoAtribuida().equals("Rank: S"))
                        {

                            controleNinja.adicionaMerito(ninjas.get(index), 100000);

                            mensagem = mensagem.concat(" ganhou 100000 pontos de mérito.");                   
                            JOptionPane.showMessageDialog(this, mensagem, "Missão concluída", JOptionPane.INFORMATION_MESSAGE);
                        }

                        else if(this.getDificuldadeMissaoAtribuida().equals("Rank: A"))
                        {
                            controleNinja.adicionaMerito(ninjas.get(index), 10000);

                            mensagem = mensagem.concat(" ganhou 10000 pontos de mérito.");      
                            JOptionPane.showMessageDialog(this, mensagem, "Missão concluída", JOptionPane.INFORMATION_MESSAGE);
                        }

                        else if(this.getDificuldadeMissaoAtribuida().equals("Rank: B"))
                        {
                            controleNinja.adicionaMerito(ninjas.get(index), 1000);
                            mensagem = mensagem.concat(" ganhou 1000 pontos de mérito.");      
                            JOptionPane.showMessageDialog(this, mensagem, "Missão concluída", JOptionPane.INFORMATION_MESSAGE);
                        }

                        else if(this.getDificuldadeMissaoAtribuida().equals("Rank: C"))
                        {
                            controleNinja.adicionaMerito(ninjas.get(index), 100);
                            mensagem = mensagem.concat(" ganhou 100 pontos de mérito.");      
                            JOptionPane.showMessageDialog(this, mensagem, "Missão concluída", JOptionPane.INFORMATION_MESSAGE);
                        }

                        else if(this.getDificuldadeMissaoAtribuida().equals("Rank: D"))
                        {
                            controleNinja.adicionaMerito(ninjas.get(index), 10);
                            mensagem = mensagem.concat(" ganhou 10 pontos de mérito.");      
                            JOptionPane.showMessageDialog(this, mensagem, "Missão concluída", JOptionPane.INFORMATION_MESSAGE);
                        }

                        else
                        {
                            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao designar a missão", "AVISO", JOptionPane.ERROR_MESSAGE);
                        }
                        
                        break;

                    case 1:
                    case 2:                                                 // cancela
                    default:
                        JOptionPane.showMessageDialog(this, "A missão não foi designada.", "AVISO", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                
                this.setDesignarMissao(false);
            }
            
            textoNomeNinja.setText(ninjas.get(index).getNome());
            textoRankNinja.setText(ninjas.get(index).getRank());
            textoIdadeNinja.setText(String.valueOf(ninjas.get(index).getIdade()));
            textoMeritoNinja.setText(String.valueOf(ninjas.get(index).getMerito()));
            
        }
        else{
            textoNomeNinja.setText("");
            textoRankNinja.setText("");
            textoIdadeNinja.setText("");
            textoMeritoNinja.setText("");
        }
    }//GEN-LAST:event_listaNinjasValueChanged

    public ArrayList<Ninja> getNinjas() {
        return ninjas;
    }

    public void setNinjas(ArrayList<Ninja> ninjas) {
        this.ninjas = ninjas;
    }
    
    public void clearCampos(){
        textoNomeNinja.setText("");
        textoRankNinja.setText("");
        textoIdadeNinja.setText("");
        textoMeritoNinja.setText("");
        listaNinjas.clearSelection();
        labelImagemNinja.setIcon(null);
    }
    
    private ControleNinjas controleNinja;
    private ArrayList<Ninja> ninjas;
    private boolean designarMissao;
    private String dificuldadeMissaoAtribuida;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idadeNinja;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelImagemNinja;
    private javax.swing.JList<String> listaNinjas;
    private javax.swing.JLabel meritoNinja;
    private javax.swing.JLabel nomeNinja;
    private javax.swing.JLabel rankNinja;
    private javax.swing.JTextField textoIdadeNinja;
    private javax.swing.JTextField textoMeritoNinja;
    private javax.swing.JTextField textoNomeNinja;
    private javax.swing.JTextField textoRankNinja;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        ControleNinjas controleAuxNinjas = (ControleNinjas)o;
        this.ninjas = controleAuxNinjas.getNinjas();
        iniciaLista();
    }
}
