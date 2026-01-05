package br.com.alura.domain;

public class Pet {

    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private double peso;

    public Pet(String tipo, String nome, String raca, int idade, String cor, double peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

}
