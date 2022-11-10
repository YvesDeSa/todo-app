package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://localhost:5432/";
    public static final String USER = "postgres";
    public static final String PASSWORD = "postgres";
    
    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException exception){
            throw new RuntimeException("Erro na conexão com banco de dados: ", exception);
        }
    }
    
    @SuppressWarnings("empty-statement")
    public static void closeConnection(Connection connection){
        try{
            if(connection != null)
                connection.close();;
        }catch(SQLException exception){
            throw new RuntimeException("Erro ao fechar a conexão com banco de dados: ", exception);
        }
    }
}
