package com.alura.sounzone.models;

public class Audio {

    private String titulo;

    private int duracion;

    private int totalDeReproducciones;

    private int meGusta;

    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTotalDeReproducciones() {
        return totalDeReproducciones;
    }

    public void setTotalDeReproducciones(int totalDeReproducciones) {
        this.totalDeReproducciones = totalDeReproducciones;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void meGusta() {
        meGusta++;
    }

    public void reproduce() {
        System.out.println("Estas escuchando: " + titulo + " la la la la");
        totalDeReproducciones++;
    }

}
