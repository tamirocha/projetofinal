package org.example;


    // Atributos
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    // Método Construtor


        public Pessoa(String nome, int idade, String sexo) {
            this.nome = nome;
            this.idade = idade;
            this.sexo = sexo;
            this.experiencia = 0;
        }

        // Método Lógico
    protected void gaharExperiencia() {

    }

    // Métodos Especiais Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    // Método toString


        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", sexo='" + sexo + '\'' +
                    ", experiencia=" + experiencia +
                    '}';
        }
    }
