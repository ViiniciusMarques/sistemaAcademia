/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author vinic
 */

public enum tipoUsuario {
    Master("Master"),
    Instrutor("Instrutor"),
    Aluno("Aluno");
    
    private final String label;
    
    tipoUsuario(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
    
}
