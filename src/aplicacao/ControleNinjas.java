/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import dominio.Ninja;
import java.util.ArrayList;
import textFileApp.CreateTextFile;
import textFileApp.ReadTextFile;

/**
 *
 * @author vitor
 */
public class ControleNinjas {
    
    
    private ArrayList<Ninja> ninjas;
    
    
    public ControleNinjas(){
        
        this.ninjas = new ArrayList<>();
        lerDadosNinja();
    }
    
    public void  adicionaNinja(String nome,String idadeNinja,String rank,String meritoNinja){
        
        int idade = Integer.parseInt(idadeNinja);
        double merito = Double.parseDouble(meritoNinja);
        Ninja ninjaAdicionado = new Ninja(nome,idade,rank,merito,"");
        this.ninjas.add(ninjaAdicionado);
        
        cadastrarDadosNinja();
        
    }
    
    public void lerDadosNinja(){
        
        ReadTextFile.openFile("listaNinjas.txt");
        this.ninjas = ReadTextFile.readRecordsNinjas();
        ReadTextFile.closeFile();
    }
    
    public void cadastrarDadosNinja(){
         
        CreateTextFile.openFile("listaNinjas.txt");
        for(Ninja ninjas : this.ninjas){
            
            CreateTextFile.cadastraNinja(ninjas);
        }
        CreateTextFile.closeFile();  
    }
    
    public String[] consultarNinja(String nomeNinja){
        
        String [] campos = new String [3];
        for(Ninja ninjas : this.ninjas){
            
            if(nomeNinja.equals(ninjas.getNome())){
                
                campos[0] = String.valueOf(ninjas.getIdade());
                campos[1] = ninjas.getRank();
                campos[2] = String.valueOf(ninjas.getMerito());
                return campos;
            }
        
        }
        return null;
    }
    
    public boolean removerNinja(String nomeNinja){
        
        for(Ninja ninjas : this.ninjas){
            
            if(nomeNinja.equals(ninjas.getNome())){
                
                this.ninjas.remove(ninjas);
                cadastrarDadosNinja();
                return true;
            }
        }
        
        return false;   
    }
    
    public boolean editarNinja(String[] campos){
        
        for(Ninja ninjas : this.ninjas){
            
            if(campos[4].equals(ninjas.getNome())){
               ninjas.setNome(campos[0]);
               ninjas.setIdade(Integer.parseInt(campos[1]));
               ninjas.setRank(campos[2]);
               ninjas.setMerito(Double.parseDouble(campos[3]));
               cadastrarDadosNinja();
               return true;
            }
            
        }
        
        return false;
    }

    public ArrayList<Ninja> getNinjas() {
        return ninjas;
    }
    
   
    
    
    
}
