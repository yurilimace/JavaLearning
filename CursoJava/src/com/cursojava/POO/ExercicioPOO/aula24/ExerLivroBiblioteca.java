package com.cursojava.POO.ExercicioPOO.aula24;

/**
 * Created by Yuri on 25/05/2017.
 */
public class ExerLivroBiblioteca {
    public static void main(String[] args){
        livroBibblioteca book = new livroBibblioteca();
        book.emprestado = true;
        book.genero = "Terror";
        book.nome = "open";
        book.NomeAutor = "Tcheca";
        book.totalPaginas = 200;
    }
}
