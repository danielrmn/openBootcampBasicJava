package sesiones_1_2_3.funciones;

public class PreciosIva {
    public static void main(String[] args) {
        precioTotal(40);
        precioTotal(1003);
        precioTotal(10.4);

    }

    public static double precioTotal(double precio){
        double iva = 0.21d;
        double totalIva = precio * iva;
        double total = totalIva + precio;
        double precioDecimal = Math.round(total * 100.0)/100.0;
        System.out.println(precioDecimal);
        return precioDecimal;
    }
}
