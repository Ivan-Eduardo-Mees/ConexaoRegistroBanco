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
public class Trajeto {
    
    private int IdTrajeto;
    private String nometrajeto;

    public Trajeto() {}
    
    public Trajeto(int IdTrajeto, String nometrajeto) {
        this.IdTrajeto = IdTrajeto;
        this.nometrajeto = nometrajeto;
    }

    public int getId() {
        return IdTrajeto;
    }

    public void setId(int id) {
        this.IdTrajeto = id;
    }

    public String getNometrajeto() {
        return nometrajeto;
    }

    public void setNometrajeto(String nometrajeto) {
        this.nometrajeto = nometrajeto;
    }
    
}
