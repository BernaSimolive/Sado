package Objetos;
/**
 *
 * @author berna
 */
public class Doador {
    private int codigo;
    private String cpfDoador;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    public String sql;
    private String resposta;
    private int totalDoador;
    
    public Doador(int codigo, String cpfDoador, String nome, String endereco, String telefone, String email) {
        this.codigo = codigo;
        this.cpfDoador = cpfDoador;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public Doador(){
        this.codigo = 0;
        this.cpfDoador = "";
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
        this.email = "";
        this.sql = "";
        this.totalDoador = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpfDoador() {
        return cpfDoador;
    }

    public void setCpfDoador(String cpf) {
        this.cpfDoador = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getSql(){
        return sql;
    }
    
    public void setSql(String sql){
        this.sql= sql;
    }
    public String getResposta(){
        return resposta;
    }
    
    public void setResposta(String resposta){
        this.resposta = resposta;
    }
    
    public int getTotalDoador() {
        return totalDoador;
    }

    public void setTotalDoador(int totalDoador) {
        this.totalDoador = totalDoador;
    }
}
