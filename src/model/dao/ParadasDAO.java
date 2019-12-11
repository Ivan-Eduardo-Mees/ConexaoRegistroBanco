/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.Paradas;


/**
 *
 * @author meesi
 */
public class ParadasDAO 
{
    
    public void create (Paradas p)
    {
        
        Connection con = ConnectionFactory.getconnection();
        PreparedStatement stmt = null;
        
        try 
        {
            stmt = con.prepareStatement("INSERT INTO paradas (nomeparada, latitude, longitude) values (?,?,?)");
            stmt.setString(1,p.getNomeparada());
            stmt.setFloat(2,p.getLatitude());
            stmt.setFloat(3,p.getLongitude());
            stmt.executeUpdate();
            
            System.out.println("salvo com sucesso");
                    } catch (SQLException ex) {
            System.err.println("erro ao salvar" +ex);
        }finally{
            ConnectionFactory.CloseConeection(con, stmt);
        }
    } 
 
    public Paradas procuraDados (String nomeparada) 
    {

        Connection con = ConnectionFactory.getconnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("select idParadas , nomeparada from paradas where nomeparada = '" + nomeparada + "'");
            ResultSet result = stmt.executeQuery();
            
            Paradas dp = new Paradas();
            
            while(result.next()){
                dp.setIdParadas(result.getInt("idParadas"));
                dp.setNomeparada(result.getString("nomeparada"));
            }
            System.out.println("salvo com sucesso paradas");
            
            return dp;
        } catch (SQLException ex) {
            System.err.println("erro ao salvar" +ex);
        }finally{
            ConnectionFactory.CloseConeection(con, stmt);
        }
        
        return null;
    }   
    
}
