package com.guidosalcedo.entregableguidosalcedo.Datos;



public class Receta {

    private String titulo;
    private int imagen;
    private String ingredientes;
    private String preparacion;

    public Receta(String titulo, Integer imagen, String ingredientes, String preparacion) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}
