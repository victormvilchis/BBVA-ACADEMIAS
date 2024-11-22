package Prog1;

public class CalculadoraDeVentas {

    // constantes para descuentos
    final static double DESCUENTO_BASICO = 0.05;  // 5% de descuento
    final static double DESCUENTO_AVANZADO = 0.10; // 10% de descuento 
    final static double IMPUESTO = 0.16;         // 16% de impuesto

    public static void main(String[] args) {

        // var locales
        double precioProducto1 = 150.0, precioProducto2 = 200.0, precioProducto3 = 50.0;
        int cantidadProducto1 = 3, cantidadProducto2 = 2, cantidadProducto3 = 5;           
        double totalVenta, totalConDescuento, totalConImpuesto, descuento = 0;  
        int edadCliente = 24, membresiaCliente = 1; // 1: Membresía básica, 2: Avanzada

        // total de la venta
        totalVenta = (precioProducto1 * cantidadProducto1) + (precioProducto2 * cantidadProducto2) + (precioProducto3 * cantidadProducto3);

        // ternario para aplicar descuento según la membresía
        descuento = (membresiaCliente == 1) ? totalVenta * DESCUENTO_BASICO : 
                    (membresiaCliente == 2) ? totalVenta * DESCUENTO_AVANZADO : 0;

        totalConDescuento = totalVenta - descuento;

        // aplic impuestos si el cliente es mayor de edad usando op ternario
        totalConImpuesto = (edadCliente >= 18) ? totalConDescuento * (1 + IMPUESTO) : totalConDescuento;

        // imprimir total antes y después de aplicar descuento e impuesto 
        System.out.println("Total sin descuento ni impuestos: $" + totalVenta);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        System.out.println("Total con impuestos (si es mayor de 18): $" + totalConImpuesto);

        // incrementar la cantidad del prodcuto 1 y decrementar el producto 2
        cantidadProducto1++;  // + 1 en la cantidad del producto 1 
        cantidadProducto2--;  // - 1 en 1 la cantidad del producto 2 

        // total con las nuevas cantidades
        totalVenta = (precioProducto1 * cantidadProducto1) + (precioProducto2 * cantidadProducto2) + (precioProducto3 * cantidadProducto3);

        // imprimir el total con las cantidades actualizadas 
        System.out.println("\nNueva cantidad de Producto 1: " + cantidadProducto1);
        System.out.println("Nueva cantidad de Producto 2: " + cantidadProducto2);
        System.out.println("Nuevo total de la venta: $" + totalVenta);


        // operador de asignación para cargo extra de 50 por envio
        totalVenta += 50; 
        //  total después de agregar el cargo 
        System.out.println("\nTotal despues de agregar cargo de envio: $" + totalVenta);

        // total final 
        System.out.println("\nTotal final después de todos los ajustes: $" + totalVenta);
    }
}