package com.example.pmdm_2223.EVA1.prueba_listado;

public class Contacto {
    private String nombre;

    public static final int CONTACTOS_INICIALES = 15;

    public Contacto() {}

    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static Contacto[] generarContactos(int n){
        Contacto[] contactos=new Contacto[n];
        for (int i = 0; i < 10; i++) {
            contactos[i]=new Contacto("Contacto"+i);
        }
        return contactos;
    }
}
