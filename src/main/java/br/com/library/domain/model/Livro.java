package br.com.library.domain.model;


import br.com.library.domain.enums.EStatusEmprestimo;

import java.time.LocalDate;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private LocalDate ano;
    private String isbn;
    private EStatusEmprestimo statusEmprestimo;
    private int quantidadeTotal;
    private int quantitadeTotalDisponivel;

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
        return quantitadeTotalDisponivel;
    }

    public void setQuantitadeTotalDisponivel(int quantitadeTotalDisponivel) {
        this.quantitadeTotalDisponivel = quantitadeTotalDisponivel;
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
                ", quantitadeTotalDisponivel=" + quantitadeTotalDisponivel +
                '}';
    }

    public String validarDados() {

        return null;
    }

    public void cadastrarLivros(){

    }
}
