package br.com.library.domain.model;


import br.com.library.domain.enums.EStatusCredencial;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "credenciais")
public class CredencialInstitucional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(name = "data_expedicao", columnDefinition = "TIMESTAMP")
    private LocalDateTime dataExpedicao;

    @Column(name = "data_vencimento", columnDefinition = "TIMESTAMP")
    private LocalDateTime dataVencimento;

    @Enumerated(EnumType.STRING)
    private EStatusCredencial status;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(LocalDateTime dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public LocalDateTime getDateVencimento() {
        return dataVencimento;
    }

    public void setDateVencimento(LocalDateTime dateVencimento) {
        this.dataVencimento = dateVencimento;
    }

    public EStatusCredencial getStatus() {
        return status;
    }

    public void setStatus(EStatusCredencial status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CredencialInstitucional{" +
                "codigo='" + codigo + '\'' +
                ", dataExpedicao=" + dataExpedicao +
                ", dateVencimento=" + dataVencimento +
                ", status=" + status +
                '}';
    }
}
