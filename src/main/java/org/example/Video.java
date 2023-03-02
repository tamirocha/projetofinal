package org.example;

    // Atributos
public class Video implements AcoesVideo {
    private String titulo;
    private double avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Método Construtor

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    // Implementaçao da Interface AcoesVideo
    @Override
    public void play() {
        this.reproduzindo = true;
        System.out.println("Vídeo está em reprodução");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println("Vídeo está pausado");
    }

    @Override
    public void like() {
        this.curtidas ++;
        System.out.println("Gafanhoto curtiu esse vídeo!/Esse vídeo teve mais um like!");

    }

    // Métodos Epeciais Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {        // A avaliação do meu vídeo será a média da avaliação que ele tem
        double nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int cutidas) {
        this.curtidas = cutidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    // Método toString


        @Override
        public String toString() {
            return "Video{" +
                    "titulo='" + titulo + '\'' +
                    ", avaliacao=" + avaliacao +
                    ", views=" + views +
                    ", curtidas=" + curtidas +
                    ", reproduzindo=" + reproduzindo +
                    '}';
        }
    }
