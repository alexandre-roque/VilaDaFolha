/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Observable;
import java.util.Observer;
import dominio.Missao;
import java.util.ArrayList;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @authors Alexandre Roque, Henrique Coelho, Nasser Rafael, Ronaldo Zica e Vitor Santana.
 */
public class ControleMissoes extends Observable{
    
    
    private ArrayList<Missao> missoes;
    
    
    public ControleMissoes(){
        this.missoes = new ArrayList<>();
        lerDadosMissao();
    }
    
    public void  adicionaMissao(String nome,String descricao,String rank){
        
        Missao missaoAdicionada = new Missao(nome,descricao,rank);
        this.missoes.add(missaoAdicionada);
 
        cadastrarDadosMissoes();
        
    }
    
    public void lerDadosMissao(){
        
        ReadTextFile.openFile("listaMissoes.txt");
        this.missoes = ReadTextFile.readRecordsMissoes();
        ReadTextFile.closeFile();
    }
    
    public void cadastrarDadosMissoes(){
         
        CreateTextFile.openFile("listaMissoes.txt");
        for(Missao missoes : this.missoes){
            
            CreateTextFile.cadastraMissao(missoes);
        }
        CreateTextFile.closeFile();
        mudaEstado();
    }
    
    public String[] consultarMissao(String nomeMissao){
        
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
                cadastrarDadosMissoes();
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
                cadastrarDadosMissoes();
                return true;
            }
            
        }
        
        return false;
    }

    public ArrayList<Missao> getMissoes() {
        return missoes;
    }
    
    public void mudaEstado(){
        setChanged();
        notifyObservers(this.getMissoes());
        System.out.println(this.countObservers());
    }
    
}
