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
import model.bean.Roteiro;
import model.bean.Trajeto;

public class DeltrajetoDAO 
{
    public Trajeto create (Roteiro p)
    {
        
        Connection con = ConnectionFactory.getconnection();
        PreparedStatement stmt = null;
        
        try 
        {
            stmt = con.prepareStatement("DELETE FROM roteiro WHERE (nometrajeto) values (?)");
            ResultSet rs = stmt.executeQuery();
            
            Trajeto dt = new Trajeto();
            while(rs.next())
            {
                dt.setNometrajeto(rs.getString("nometrajeto"));
            }       
            
             System.out.println("deletado com sucesso");
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
