class PrendaFormal extends Prenda implements Descuento {
    private String ocasion;

    public PrendaFormal(String nombre, String talla, double precio, String ocasion) {
        super(nombre, talla, precio);
        this.ocasion = ocasion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Prenda formal: " + nombre + " para " + ocasion + ", talla " + talla + ", precio $" + precio);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }
}