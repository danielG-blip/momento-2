abstract class Prenda {
    String nombre;
    String talla;
    double precio;

    public Prenda(String nombre, String talla, double precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }

    public abstract void mostrarInfo();

    public void etiqueta() {
        System.out.println("Etiqueta -> " + nombre + " | Talla: " + talla + " | Precio: $" + precio);
    }
}

interface Descuento {
    double aplicarDescuento(double porcentaje);
}