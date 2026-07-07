package br.com.library.domain.model;

import br.com.library.domain.enums.EStatusEmprestimo;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "emprestimos")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String codigoTransacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    private LocalDateTime dataEmprestimo;

    private LocalDateTime dataPrevistaDevolucao;

    private LocalDateTime dataDevolucaoRealizada;

    @Enumerated(EnumType.STRING)
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
        return dataPrevistaDevolucao;
    }

    public void setDatePrevistaDevolucao(LocalDateTime datePrevistaDevolucao) {
        this.dataPrevistaDevolucao = datePrevistaDevolucao;
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
                ", datePrevistaDevolucao=" + dataPrevistaDevolucao +
                ", dataDevolucaoRealizada=" + dataDevolucaoRealizada +
                ", status=" + status +
                '}';
    }
}
