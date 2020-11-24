package aplicacao;

import dominio.ControleNinjas;
import gui.JanelaPrincipal;

/**
 *
 * @author alexa
 */
public class AldeiaDaFolha {
    public static void main(String args[]) {
        ControleNinjas controleNinja = new ControleNinjas();
        
        JanelaPrincipal janela = new JanelaPrincipal(controleNinja);
        janela.setVisible(true);
        
        controleNinja.addObserver(janela);
        
    }
    
}
