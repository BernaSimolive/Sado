package Principal;

import Objetos.Doacao;
import Objetos.Doador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class DoadorToDB {
       
    public void cadastrarDoador(Doador doador){
        String sql = "INSERT INTO doador (cpfDoador,nomeDoador,telefone,endereco,email) VALUES ('"+doador.getCpfDoador() + "','"+ doador.getNome() + "','"+
                doador.getTelefone()+"','"+ doador.getEndereco()+ "','" + doador.getEmail()+ "')";
        
        System.out.println(sql);
        
        try {
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros na Transação");
        e.printStackTrace();
       }
    }
    
    
    public List<Doador> listarConsultaDoador(Doador doador){
            System.out.println(doador.getSql());
            try {
            List<Doador> listaConsultaDoador = new ArrayList<Doador>();
            Connection conectar = ConexaoDB.obtemConexao();
            PreparedStatement ps = conectar.prepareStatement(doador.getSql());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Doador d = new Doador();
                
                d.setCodigo(rs.getInt("idDoador"));
                d.setCpfDoador(rs.getString("cpfDoador"));
                d.setNome(rs.getString("nomeDoador"));
                d.setEndereco(rs.getString("endereco"));
                d.setTelefone(rs.getString("telefone"));
                d.setEmail(rs.getString("email"));
                
                listaConsultaDoador.add(d);
            }
            return listaConsultaDoador;
        } catch(SQLException e){
            
            e.printStackTrace();
            return null;
        }
        
    }
    public void deletarDoador(Doador doador){
        try {
            System.out.println(doador.getSql());
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(doador.getSql());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Doador Excluido!");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro para Excluir!");
        e.printStackTrace();
       }
    }
    public int mostrarTotal(Doador doador){
        
        try {
            Connection conectar = ConexaoDB.obtemConexao();
            Statement ps = conectar.createStatement();
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) AS total_rows FROM doador");
            if (rs.next()) {
               int totalDoador = rs.getInt("total_rows");
                doador.setTotalDoador(totalDoador);
            }
        System.out.println(rs);
        
        ps.close();
        conectar.close();               
        
        return doador.getTotalDoador();
        
        } catch (SQLException e) {
        e.printStackTrace();
        return 0;
       }
    }
}
    