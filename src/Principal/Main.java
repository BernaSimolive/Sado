package Principal;

import Telas.*;



public class Main {
    public static void main(String[] args) {
       ConexaoDB con = new ConexaoDB();
        con.obtemConexao();
        new TelaLogin().setVisible(true);
    }
    
}
