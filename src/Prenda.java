abstract class Prenda {
    protected String nombre;
    protected String talla;
    protected int precio;

    public Prenda(String nombre, String talla, int precio) {
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
    int aplicarDescuento(int porcentaje);
}