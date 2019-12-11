/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author meesi
 */
public class Roteiro {
    
    private int idRoteiro; 
    private Trajeto IdTrajeto; 
    private Paradas idParada;

    public int getIdRoteiro() {
        return idRoteiro;
    }

    public void setIdRoteiro(int idRoteiro) {
        this.idRoteiro = idRoteiro;
    }

    public Trajeto getIdTrajeto() {
        return IdTrajeto;
    }

    public void setIdTrajeto(Trajeto IdTrajeto) {
        this.IdTrajeto = IdTrajeto;
    }

    public Paradas getIdParadas() {
        return idParada;
    }

    public void setIdParadas(Paradas idParadas) {
        this.idParada = idParadas;
    }

    

   
    
}
