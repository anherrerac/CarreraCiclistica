package CarreraCiclistica;

import java.util.*;

public class Equipo {
    private String nombre; // Atributo asignado al Nombre del Equipo de ciclismo 
    private static double TiempoObtenido; // Atributo asignado al tiempo  obtenido por el equipo 
    private String PaisOrigen; // Atributo asignado al Pais del que proviene el equipo 
    Vector ListaCiclistas; // Atributo que define un vector de objetos ciclista
    
    public Equipo(String nombre, String PaisOrigen) {
        this.nombre = nombre;
        this.PaisOrigen = PaisOrigen;
        TiempoObtenido = 0; // Se inicializa el tiempo del equipo en cero 
        ListaCiclistas = new Vector(); // Creacion del vector de ciclistas que conforma el equipo 
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
    private String getPais() {
        return PaisOrigen;
    }
    private void setPais(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }
    void anadirCiclista(Ciclista ciclista) {
        ListaCiclistas.add(ciclista); // Se agrega el ciclista al vector de ciclistas
    }
    void listarEquipo() {// Ciclo para recorrer el vector de ciclistas
        for (int i = 0; i < ListaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) ListaCiclistas.elementAt(i); 
            System.out.println(c.getNombre());
        }
    }
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < ListaCiclistas.size(); i++) { // Ciclo para recorrer el vector de ciclistas 
            Ciclista c = (Ciclista) ListaCiclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) { 
                System.out.println(c.getNombre());
            }
        }
    }
    void calcularTotalTiempo() {
            for (int i = 0; i < ListaCiclistas.size(); i++) { // Se recorre el vector
                Ciclista c = (Ciclista) ListaCiclistas.elementAt(i); 
                TiempoObtenido = TiempoObtenido + c.getTiempoAcumulado();
            }
        }
    void imprimir() {
                System.out.println("Nombre del equipo = " + nombre);
                System.out.println("Pais = " + PaisOrigen);
                System.out.println("Total tiempo del equipo = " + TiempoObtenido);
            }
    }
            

