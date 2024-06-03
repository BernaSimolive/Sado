package Objetos;
/**
 *
 * @author berna
 */
public class Doacao {
    private int codigo;
    private int codigoDoador;
    private String nome;
    private String cpfDoador;
    private int quantidade;
    private double peso;
    private String descricao;
    private String resposta;
    public String sql;
    private int totalDoacao;
    
    public Doacao(int codigo, int codigoDoador, String nome, String cpfDoador, int quantidade, double peso, String descricao) {
        this.codigo = codigo;
        this.codigoDoador = codigoDoador;
        this.nome = nome;
        this.cpfDoador = cpfDoador;
        this.quantidade = quantidade;
        this.peso = peso;
        this.descricao = descricao;
    }
    public Doacao() {
        this.codigo = 0;
        this.codigoDoador = 0;
        this.nome = "";
        this.cpfDoador = "";
        this.quantidade = 0;
        this.peso = 0;
        this.descricao = "";
        this.resposta = "";
        this.sql = "";
        this.totalDoacao = 0;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoDoador(){
        return codigoDoador;
    }
    public void setCodigoDoador(int codigoDoador){
        this.codigoDoador = codigoDoador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfDoador() {
        return cpfDoador;
    }

    public void setCpfDoador(String cpfDoador) {
        this.cpfDoador = cpfDoador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getResposta(){
        return resposta;
    }
    
    public void setResposta(String resposta){
        this.resposta = resposta;
    }
    
    public String getSQL(){
        return sql;
    }
    
    public void setSQL(String sql){
        this.sql = sql;
    }
    
    public int getTotalDoacao() {
        return totalDoacao;
    }

    public void setTotalDoacao(int totalDoacao) {
        this.totalDoacao = totalDoacao;
    }
}

