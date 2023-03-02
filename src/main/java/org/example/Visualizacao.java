package org.example;


    //Atributos
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    // Método Constructor

            public Visualizacao(Gafanhoto espectador, Video filme) {
                this.espectador = espectador;
                this.filme = filme;
                this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
                this.filme.setViews(this.filme.getViews() + 1);
            }


   // Métodos Lógicos
    public void avaliar() {                     // Se eu não passar parametro algum, quando eu chamar o método a nota será 5
         this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {             // nesse caso, se eu passar uma nota, ele vai dar essa nota
         this.filme.setAvaliacao(nota);
    }
    public void avaliar(double porcentagem) {   // nesse caso, se eu asssitir 20% do video, ele dá nota 3, se eu assistir 50, ele dá nota 5 e assim por diante
         int total = 0;                         // a avaliação do vídeo será de acordo com a porcentagem assistida
         if (porcentagem <= 20) {
             total = 3;
         } else if (porcentagem <= 50) {
             total = 5;
         } else if (porcentagem <= 90) {
             total = 8;
         } else {
             total = 10;
         }
         this.filme.setAvaliacao(total);
    }

    // Métodos Especiais Getters e Setters

            public Gafanhoto getEspectador() {
                return espectador;
            }

            public void setEspectador(Gafanhoto espectador) {
                this.espectador = espectador;
            }

            public Video getFilme() {
                return filme;
            }

            public void setFilme(Video filme) {
                this.filme = filme;
            }

        // toString


        @Override
        public String toString() {
            return "Visualizacao{" +
                    "espectador=" + espectador +
                    ", filme=" + filme +
                    '}';
        }
    }


