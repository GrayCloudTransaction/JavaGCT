package sptech.school;

public class Servidor {
    private Integer id_servidor;
    private String nome;
    private String codigo;
    private String tipo;
    private String descricao;
    private Integer status;
    private Integer fk_empresa;

    public Servidor() {
    }

    public Servidor(Integer id_servidor, String nome, String codigo, String tipo, String descricao, Integer status, Integer fk_empresa) {
        this.id_servidor = id_servidor;
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
        this.descricao = descricao;
        this.status = status;
        this.fk_empresa = fk_empresa;
    }

    public Integer getId_servidor() {
        return id_servidor;
    }

    public void setId_servidor(Integer id_servidor) {
        this.id_servidor = id_servidor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFk_empresa() {
        return fk_empresa;
    }

    public void setFk_empresa(Integer fk_empresa) {
        this.fk_empresa = fk_empresa;
    }

    @Override
    public String toString() {
        return "Servidor{" +
                "id_servidor=" + id_servidor +
                ", nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                ", fk_empresa=" + fk_empresa +
                '}';
    }
}
