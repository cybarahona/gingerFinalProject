package com.example.cbhealthypets;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */
public class Comida {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Comida(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Comida> COMIDAS_POPULARES = new ArrayList<Comida>();
    public static final List<Comida> SUPLEMENTOS = new ArrayList<>();
    public static final List<Comida> CUIDADOS = new ArrayList<>();
    public static final List<Comida> COMIDAS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Comida(5, "Pedigree Adultos", R.drawable.pedigree));
        COMIDAS_POPULARES.add(new Comida(3.2f, "Beneful Razas pequeñas", R.drawable.beneful));
        COMIDAS_POPULARES.add(new Comida(12f, "Royal Canin Adultos", R.drawable.royalcanin));
        COMIDAS_POPULARES.add(new Comida(9, "Royal Canin Buldog", R.drawable.royalcaninbuldog));
        COMIDAS_POPULARES.add(new Comida(34f, "DogChow adultos", R.drawable.dogchow));

        COMIDAS.add(new Comida(5, "Pedigree Adultos", R.drawable.pedigree));
        COMIDAS.add(new Comida(3.2f, "Beneful Perros Pequeños", R.drawable.beneful));
        COMIDAS.add(new Comida(12f, "Royal Canin Adultos", R.drawable.royalcanin));
        COMIDAS.add(new Comida(9, "Royal Canin Buldog", R.drawable.royalcaninbuldog));
        COMIDAS.add(new Comida(34f, "DogChow adultos", R.drawable.dogchow));

        SUPLEMENTOS.add(new Comida(3, "Calcio", R.drawable.calcium));
        SUPLEMENTOS.add(new Comida(12, "Proteina", R.drawable.proteina));
        SUPLEMENTOS.add(new Comida(5, "Vitaminas y hierro", R.drawable.vitaminasyhierro));
        SUPLEMENTOS.add(new Comida(24, "Equilibrio piel y pelo", R.drawable.equilibriopielypelo));
        SUPLEMENTOS.add(new Comida(30, "Capsulas antiestres", R.drawable.antiestress));

        CUIDADOS.add(new Comida(2, "Corte de Pelo", R.drawable.peluqueria));
        CUIDADOS.add(new Comida(3, "Corte de uñas", R.drawable.corteunas));
        CUIDADOS.add(new Comida(2.5f, "Shampoo Perro Consentido", R.drawable.shampooperroconsentido));
        CUIDADOS.add(new Comida(4, "Jabon Vetriderm", R.drawable.vetriderm));
        CUIDADOS.add(new Comida(5, "Jabon Fido", R.drawable.jabonfido));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}
