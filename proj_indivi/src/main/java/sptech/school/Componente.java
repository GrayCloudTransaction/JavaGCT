package sptech.school;

public class Componente {
    private Integer id_componente;
    private String tipo_componente;
    private  Integer fk_modelo_componente;
    private Integer fk_servidor;

    public Componente() {
    }

    public Componente(Integer id_componente, String tipo_componente, Integer fk_modelo_componente, Integer fk_servidor) {
        this.id_componente = id_componente;
        this.tipo_componente = tipo_componente;
        this.fk_modelo_componente = fk_modelo_componente;
        this.fk_servidor = fk_servidor;
    }

    public Integer getId_componente() {
        return id_componente;
    }

    public void setId_componente(Integer id_componente) {
        this.id_componente = id_componente;
    }

    public String getTipo_componente() {
        return tipo_componente;
    }

    public void setTipo_componente(String tipo_componente) {
        this.tipo_componente = tipo_componente;
    }

    public Integer getFk_modelo_componente() {
        return fk_modelo_componente;
    }

    public void setFk_modelo_componente(Integer fk_modelo_componente) {
        this.fk_modelo_componente = fk_modelo_componente;
    }

    public Integer getFk_servidor() {
        return fk_servidor;
    }

    public void setFk_servidor(Integer fk_servidor) {
        this.fk_servidor = fk_servidor;
    }
}
