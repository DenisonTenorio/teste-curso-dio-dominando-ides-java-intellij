package br.com.dio;

import br.com.dio.model.Gato;

import java.sql.SQLOutput;

public class
PrimeiroPrograma { //editar o nome do programa Shift+F6
    public static void main(String[] args) {
        /* System.out.println("Hello Word!");*/

        Gato gato = new Gato();
        System.out.println(gato);

        String nome;
        int numPaginas;
        Livro livro1 = new Livro(nome = "O problema dos 3 corpos", numPaginas = 300);
        System.out.println(livro1);

    }
}

class Livro {

    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
