package br.com.library.domain.model;

import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Emprestimo> emprestimos;
    private List<Usuario> usuarios;

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "livros=" + livros +
                ", emprestimos=" + emprestimos +
                ", usuarios=" + usuarios +
                '}';
    }
}
