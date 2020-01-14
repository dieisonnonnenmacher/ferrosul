package br.com.ferrosul.api.banco.jdbc;
import java.sql.Connection;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexao {

        public static SQLiteJDBCDriverConnection jdbc = new SQLiteJDBCDriverConnection("/dataBase/ferrosul.db");
        public static final Connection conexao = jdbc.connect();


        public void testeDb(){
                try{
                        Statement statement = conexao.createStatement();
                        System.out.println(statement.execute(".tables"));
                }catch (SQLException e){
                        System.out.println("Erro de conexão:" + e);
                }
        }


}
