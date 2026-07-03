package domain.model;

import domain.enums.EStatusEmprestimo;

import java.time.LocalDateTime;
import java.util.Date;

public class Emprestimo {

    private int id;
    private String codigoTransacao;
    private Usuario usuario;
    private LocalDateTime dataEmprestimo;
    private LocalDateTime datePrevistaDevolucao;
    private LocalDateTime dataDevolucaoRealizada;
    private EStatusEmprestimo status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(String codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDatePrevistaDevolucao() {
        return datePrevistaDevolucao;
    }

    public void setDatePrevistaDevolucao(LocalDateTime datePrevistaDevolucao) {
        this.datePrevistaDevolucao = datePrevistaDevolucao;
    }

    public LocalDateTime getDataDevolucaoRealizada() {
        return dataDevolucaoRealizada;
    }

    public void setDataDevolucaoRealizada(LocalDateTime dataDevolucaoRealizada) {
        this.dataDevolucaoRealizada = dataDevolucaoRealizada;
    }

    public EStatusEmprestimo getStatus() {
        return status;
    }

    public void setStatus(EStatusEmprestimo status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", codigoTransacao='" + codigoTransacao + '\'' +
                ", usuario=" + usuario +
                ", dataEmprestimo=" + dataEmprestimo +
                ", datePrevistaDevolucao=" + datePrevistaDevolucao +
                ", dataDevolucaoRealizada=" + dataDevolucaoRealizada +
                ", status=" + status +
                '}';
    }
}
