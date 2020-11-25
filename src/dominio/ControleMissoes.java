/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import dominio.Missao;
import java.util.ArrayList;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
 */
public class ControleMissoes {
    
    
    private ArrayList<Missao> missoes;
    
    
    public ControleMissoes(){
        
        this.missoes = new ArrayList<>();
        lerDadosMissao();
    }
    
    public void  adicionaMissao(String nome,String descricao,String rank){
        
        Missao missaoAdicionada = new Missao(nome,descricao,rank);
        this.missoes.add(missaoAdicionada);
        
        cadastrarDadosNinja();
        
    }
    
    public void lerDadosMissao(){
        
        ReadTextFile.openFile("listaMissoes.txt");
        this.missoes = ReadTextFile.readRecordsMissoes();
        ReadTextFile.closeFile();
    }
    
    public void cadastrarDadosNinja(){
         
        CreateTextFile.openFile("listaNinjas.txt");
        for(Missao missoes : this.missoes){
            
            CreateTextFile.cadastraMissao(missoes);
        }
        CreateTextFile.closeFile();  
    }
    
    public String[] consultarNinja(String nomeMissao){
        
        String [] campos = new String [3];
        for(Missao missoes : this.missoes){
            
            if(missoes.getNome().startsWith(nomeMissao)){
                campos[0] = missoes.getNome();
                campos[1] = String.valueOf(missoes.getDescricao());
                campos[2] = missoes.getRank();
                return campos;
            }
            
            if(missoes.getNome().equals(nomeMissao)){
            	campos[0] = missoes.getNome();
                campos[1] = String.valueOf(missoes.getDescricao());
                campos[2] = missoes.getRank();
                return campos;
            }
        
        }
        return null;
    }
    
    public boolean removerMissao(String nomeMissao){
        
        for(Missao missoes : this.missoes){
            
            if(nomeMissao.equals(missoes.getNome())){
                
                this.missoes.remove(missoes);
                cadastrarDadosNinja();
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean editarMissao(String[] campos){
        
        for(Missao missoes : this.missoes){
            
            if(campos[3].equals(missoes.getNome())){
            	missoes.setNome(campos[0]);
            	missoes.setDescricao(campos[1]);
            	missoes.setRank(campos[2]);
               cadastrarDadosNinja();
               return true;
            }
            
        }
        
        return false;
    }

    public ArrayList<Missao> getMissoes() {
        return missoes;
    }
    
}
