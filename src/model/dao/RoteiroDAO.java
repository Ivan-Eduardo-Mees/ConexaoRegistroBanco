/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Roteiro;

/**
 *
 * @author meesi
 */
public class RoteiroDAO 
{
            
    private Connection con = null;       
    
    public RoteiroDAO() 
    {
        con = ConnectionFactory.getconnection();
    }
    
    public boolean save(Roteiro g) 
    {

     String sql = "insert into Roteiro (idTrajeto , idParada) values (?,?)";    
     PreparedStatement stmt = null;      
     
        try 
        {
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, g.getIdTrajeto().getId());
            stmt.setInt(2, g.getIdParadas().getIdParadas());         
            stmt.executeUpdate();

            System.out.println("salvo com sucesso roteiro");
            
            return true;
        } catch (SQLException ex) 
        {
            System.err.println("erro ao salvar roteiro" +ex);
            return false;
        }
        finally 
        {
            ConnectionFactory.CloseConeection(con, stmt);
        }
    }
}
    