package br.com.dio;

import br.com.dio.modal.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
       Gato gato = new Gato();
        System.out.println(gato);


        Object numPaginas;
        Livro livro1 = new livro (nome "O problema dos 3 corpos", numPaginas;300);
        System.out.println(livro1);
        /*int a = 5;
        int b = 3;
        System.out.println("hello world!" + (a+b));*/

    }
}

class livro {
   private String nome;
   private Integer numPaginas;

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

    public livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;


    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

