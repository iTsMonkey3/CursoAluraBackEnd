package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificaion() >= 4){
            System.out.println("Esto está de huevos: ");
        } else if (clasificacion.getClasificaion() >= 2 ){
            System.out.println("Esto está trending: ");
        } else {
            System.out.println("Agregalas a tu lista de joyas: ");
        }
    }

}
