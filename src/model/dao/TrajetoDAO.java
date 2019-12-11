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
import model.bean.Trajeto;

/**
 *
 * @author meesi
 */
public class TrajetoDAO
{
     public void create (Trajeto p)
     {
        
        Connection con = ConnectionFactory.getconnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO trajeto (nome) values (?)");
            stmt.setString(1,p.getNometrajeto());
            stmt.executeUpdate();
            
            System.out.println("salvo com sucesso");
            }      
        catch (SQLException ex) 
        {
            System.err.println("erro ao salvar" +ex);
        }finally{
            ConnectionFactory.CloseConeection(con, stmt);
        }
    }
     
    public Trajeto procuraDadosTrajeto(String nome) 
    {
        Connection con = ConnectionFactory.getconnection();
        PreparedStatement stmt = null;
        
        try 
        {
            stmt = con.prepareStatement("SELECT * FROM trajeto WHERE nome = '" + nome + "'");
            ResultSet rs = stmt.executeQuery();
            
            Trajeto dt = new Trajeto();
            while(rs.next())
            {
                dt.setId(rs.getInt("idTrajeto"));
                dt.setNometrajeto(rs.getString("nometrajeto"));
                System.out.println("salvo com sucesso trajeto");
            }            
            return dt;
           
        } catch (SQLException ex) 
        {
            System.err.println("erro ao salvar" +ex);
        }finally
        {
            ConnectionFactory.CloseConeection(con, stmt);
        }
        return null;
    }
}