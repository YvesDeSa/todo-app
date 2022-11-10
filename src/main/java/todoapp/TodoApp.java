package todoapp;

import java.sql.Connection;
import util.ConnectionFactory;

public class TodoApp {

    public static void main(String[] args) {
       Connection c = ConnectionFactory.getConnection();
       
       ConnectionFactory.closeConnection(c);
    }
}
