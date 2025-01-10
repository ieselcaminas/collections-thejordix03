
package Analfabetos;

public class Pais implements Comparable<Pais> {
    private String nombre;
    private int analfabetos;

    public Pais(String nombre, int analfabetos) {
        this.nombre = nombre;
        this.analfabetos = analfabetos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnalfabetos() {
        return analfabetos;
    }

    public void setAnalfabetos(int analfabetos) {
        this.analfabetos = analfabetos;
    }

    // Implementación del méetodo compare to
    @Override
    public int compareTo(Pais otroPais) {
        // Comparar por el número de analfabetos
        return Integer.compare(this.analfabetos, otroPais.analfabetos);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", analfabetos=" + analfabetos +
                '}';
    }
}