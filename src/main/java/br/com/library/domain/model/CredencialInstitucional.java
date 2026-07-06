package br.com.library.domain.model;


import br.com.library.domain.enums.EStatusCredencial;

import java.util.Date;

public class CredencialInstitucional {

    private String codigo;
    private Date dataExpedicao;
    private Date dateVencimento;
    private EStatusCredencial status;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public Date getDateVencimento() {
        return dateVencimento;
    }

    public void setDateVencimento(Date dateVencimento) {
        this.dateVencimento = dateVencimento;
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
                ", dateVencimento=" + dateVencimento +
                ", status=" + status +
                '}';
    }
}
