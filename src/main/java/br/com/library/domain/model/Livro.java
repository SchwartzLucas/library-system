package br.com.library.domain.model;


import br.com.library.domain.enums.EStatusEmprestimo;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "livros")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String autor;

    @Column(nullable = false)
    private LocalDate ano;

    @Column(nullable = false, unique = true, length = 20)
    private String isbn;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EStatusEmprestimo statusEmprestimo;

    @Column(nullable = false)
    private Integer quantidadeTotal;

    @Column(nullable = false)
    private Integer quantidadeTotalDisponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public EStatusEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }

    public void setStatusEmprestimo(EStatusEmprestimo statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public int getQuantitadeTotalDisponivel() {
        return quantidadeTotalDisponivel;
    }

    public void setQuantitadeTotalDisponivel(int quantitadeTotalDisponivel) {
        this.quantidadeTotalDisponivel = quantitadeTotalDisponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", isbn='" + isbn + '\'' +
                ", statusEmprestimo=" + statusEmprestimo +
                ", quantidadeTotal=" + quantidadeTotal +
                ", quantitadeTotalDisponivel=" + quantidadeTotalDisponivel +
                '}';
    }

    public String validarDados() {

        return null;
    }

    public void cadastrarLivros() {

    }
}
