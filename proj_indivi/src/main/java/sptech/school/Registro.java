package sptech.school;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Registro {
    private Double valor_registro;
    private LocalDateTime data_registro;
    private Integer fk_componente;
    private Integer fk_medida;

    public Registro(Double valor_registro, Integer fk_componente, Integer fk_medida) {
        this.valor_registro = valor_registro;
        this.data_registro = LocalDateTime.now();
        this.fk_componente = fk_componente;
        this.fk_medida = fk_medida;
    }
    public Registro(Long valor_registro, Integer fk_componente, Integer fk_medida) {
        this.valor_registro = Double.valueOf(valor_registro);
        this.data_registro = LocalDateTime.now();
        this.fk_componente = fk_componente;
        this.fk_medida = fk_medida;
    }

    public Double getValor_registro() {
        return valor_registro;
    }

    public void setValor_registro(Double valor_registro) {
        this.valor_registro = valor_registro;
    }

    public LocalDateTime getData_registro() {
        return data_registro;
    }

    public void setData_registro(LocalDateTime data_registro) {
        this.data_registro = data_registro;
    }

    public Integer getFk_componente() {
        return fk_componente;
    }

    public void setFk_componente(Integer fk_componente) {
        this.fk_componente = fk_componente;
    }

    public Integer getFk_medida() {
        return fk_medida;
    }

    public void setFk_medida(Integer fk_medida) {
        this.fk_medida = fk_medida;
    }
}
