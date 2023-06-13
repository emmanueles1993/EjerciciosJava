//María es propietaria de una tienda de ropa y le gustaría crear un programa que calcule el valor final del producto después de
//aplicar un descuento que ofrecería a sus clientes.
//Si el valor de la compra está entre $100.0 y $199.99, el descuento es del 10%.
//Si el valor de la compra está entre $200.0 y $299.99, el descuento es del 15%.
//Para compras superiores a $300.0, el descuento es del 20%.
public class TestDescuento2 {

    public static void main(String[] args) {

        double valorCompra = 250.0;
        double descuento = 0.0;//la inicializo con 0.0

        if (valorCompra >= 100.0 && valorCompra < 200.0) {
            descuento = 10.0;
        } else if (valorCompra >= 200.0 && valorCompra < 300.0) {
            descuento = 15.0;
        } else if (valorCompra >= 300.0) {
            descuento = 20.0;
        }

        double valorFinal = valorCompra - (valorCompra * (descuento / 100));//250.0-(250.0 *15.0 /100)37.5 = 212.5

        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Valor final: $" + valorFinal);
    }
}