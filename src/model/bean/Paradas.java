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
public class Paradas {
    
    private int idParadas;
    private String nomeparada;
    private float latitude;
    private float longitude;

    public Paradas() {}
    
    public Paradas(int IdParadas, String nomeparada) {
        this.idParadas = IdParadas;
        this.nomeparada = nomeparada;
    }

    
    
    public int getIdParadas() {
        return idParadas;
    }

    public void setIdParadas(int idParadas) {
        this.idParadas = idParadas;
    }

    public String getNomeparada() {
        return nomeparada;
    }

    public void setNomeparada(String nomeparada) {
        this.nomeparada = nomeparada;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    

  


  


    
    
    
}

