public class CatalogoRopa {
    public static void main(String[] args) {

        Prenda p1 = new PrendaDeportiva("Sudadera Nike", "M", 150000, "Gym");
        Prenda p2 = new PrendaFormal("Saco Elegante", "L", 300000, "Reunión de negocios");

        System.out.println("Catálogo de Ropa");
        p1.mostrarInfo();
        p2.mostrarInfo();

        System.out.println("Aplicando Descuentos");
        double precio1 = ((PrendaDeportiva)p1).aplicarDescuento(10);
        System.out.println("Sudadera con 10% descuento: $" + precio1);

        double precio2 = ((PrendaFormal)p2).aplicarDescuento(20);
        System.out.println("Saco con 20% descuento: $" + precio2);
    }
}