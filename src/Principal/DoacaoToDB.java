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

/**
 *
 * @author berna
 */
public class DoacaoToDB {
    public void cadastrarDoacao(Doacao doacao){
        String sql = "INSERT INTO doacao (Doador_cpfDoador,nomeAlimento,peso,quantidade,descricao) VALUES ('"+doacao.getCpfDoador() + "','"+ doacao.getNome() + "','"+
                doacao.getPeso()+"','"+ doacao.getQuantidade()+ "','" + doacao.getDescricao()+ "')";
        
        System.out.println(sql);
        
        try {
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(sql);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Cadastro Concluído");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erros na Transação");
        e.printStackTrace();
       }
    }
    
    public List<Doacao> listarDoacoes(){
        try {
            List<Doacao> listaDoacao = new ArrayList<Doacao>();
            String sql = "SELECT * FROM doacao";
            Connection conectar = ConexaoDB.obtemConexao();
            PreparedStatement ps = conectar.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Doacao d = new Doacao();
                d.setCodigo(rs.getInt("idDoacao"));
                d.setCpfDoador(rs.getString("Doador_cpfDoador"));
                d.setNome(rs.getString("nomeAlimento"));
                d.setQuantidade(rs.getInt("quantidade"));
                d.setPeso(rs.getDouble("peso"));
                d.setDescricao(rs.getString("descricao"));
                
                listaDoacao.add(d);
            }
            return listaDoacao;
        } catch(SQLException e){
            
            e.printStackTrace();
            return null;
        }
        
    }

    public List<Doacao> listarConsultaDoacao(Doacao doacao){
        try {
            List<Doacao> listaConsultaDoacao = new ArrayList<Doacao>();
            System.out.println(doacao.getSQL());
            Connection conectar = ConexaoDB.obtemConexao();
            PreparedStatement ps = conectar.prepareStatement(doacao.getSQL());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Doacao d = new Doacao();
                
                d.setCodigo(rs.getInt("idDoacao"));
                d.setCpfDoador(rs.getString("Doador_cpfDoador"));
                d.setNome(rs.getString("nomeAlimento"));
                d.setQuantidade(rs.getInt("quantidade"));
                d.setPeso(rs.getDouble("peso"));
                d.setDescricao(rs.getString("descricao"));
                
                listaConsultaDoacao.add(d);
            }
            return listaConsultaDoacao;
        } catch(SQLException e){
            
            e.printStackTrace();
            return null;
        }
        
    }


    public void deletarDoacao(Doacao doacao){
        try {
        Connection conectar = ConexaoDB.obtemConexao();
        PreparedStatement ps = conectar.prepareStatement(doacao.getSQL());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Doação Excluida!");	
        ps.close();
        conectar.close();               

        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro para Excluir!");
        e.printStackTrace();
       }
    }
    
    public int mostrarTotalDoacao(Doacao doacao){
        
        try {
            Connection conectar = ConexaoDB.obtemConexao();
            Statement ps = conectar.createStatement();
            ResultSet rs = ps.executeQuery("SELECT COUNT(*) AS total_rows FROM doacao");
            if (rs.next()) {
               int totalDoador = rs.getInt("total_rows");
                doacao.setTotalDoacao(totalDoador);
            }
        System.out.println(rs);
        
        ps.close();
        conectar.close();               
        
        return doacao.getTotalDoacao();
        
        } catch (SQLException e) {
        e.printStackTrace();
        return 0;
       }
    }
}