package Principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    private static final String host = "localhost";
    private static final String porta = "3306";
    private static final String db = "sado";
    private static final String usuario = "root";
    private static final String senha = "Bernatabem18leg!!!";
    
    public static Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC", usuario,senha);
            System.out.println("Banco Conectado com Sucesso!!!!");
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

  
}
