
package DAO;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pancaldi
 */
public class Conexao {
    
    public Connection getConnection() throws SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/gameteca", "postgres", "123456");
        return conexao;
    }
}