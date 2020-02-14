package br.com.ferrosul.api.banco.jdbc;
import org.sqlite.SQLiteDataSource;

import java.sql.*;


public class Conexao {

        public Connection getConnection(){

                try {
                        Class.forName("org.sqlite.JDBC");
                        String dbURL = "jdbc:sqlite:/home/dieison/Documents/Projetos/ferrosul/api-banco/src/main/resources/dataBase/ferrosul.db";
                        Connection conn = DriverManager.getConnection(dbURL);
                        return  conn;
                } catch (ClassNotFoundException | SQLException ex) {
                        ex.printStackTrace();
                        return null;
                }

        }


}
