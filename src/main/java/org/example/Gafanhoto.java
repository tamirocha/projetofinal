package org.example;


    // Atributos
public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssistido;


    // Método toString
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }

    // Método Lógico
    public void viuMaisUm() {

    }

    // Métodos Especiais Getters e Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }


    // Sobrescrever Método toString
        @Override
        public String toString() {
            return "Gafanhoto{" + super.toString() +            // Nesse caso para aparecer os atributos da classe pessoa também, temos que escrever super.toString()
                    "\nlogin='" + login + '\'' +
                    ", totalAssistido=" + totalAssistido +
                    '}';
        }
    }
