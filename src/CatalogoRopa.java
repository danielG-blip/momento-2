public class CatalogoRopa {
    public static void main(String[] args) {

        Prenda deportiva = new PrendaDeportiva("Sudadera Nike", "M", 150000, "Gym");
        Prenda elegante = new PrendaFormal("Saco Elegante", "L", 300000, "Reunión de negocios");

        System.out.println("Catálogo de Ropa");
        deportiva.mostrarInfo();
        elegante.mostrarInfo();

        System.out.println("Descuentos");
        int precio1 = ((PrendaDeportiva)deportiva).aplicarDescuento(10);
        System.out.println("Sudadera con 10% descuento: $" + precio1);

        int precio2 = ((PrendaFormal)elegante).aplicarDescuento(20);
        System.out.println("Saco con 20% descuento: $" + precio2);
    }
}