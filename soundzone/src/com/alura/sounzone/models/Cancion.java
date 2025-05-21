package com.alura.sounzone.models;

public class Cancion extends Audio{

    private String nombreAlbum;

    private String artista;

    private String discografica;

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public void detalleCancion() {
        System.out.println("Artista " + artista);
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Album: " + nombreAlbum);
        System.out.println("Duracion: " + getDuracion());
        System.out.println("Discografica: " + discografica);
        System.out.println("Reproducciones: " + getTotalDeReproducciones());
    }

}
