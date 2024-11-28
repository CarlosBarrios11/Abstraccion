package extend;

public class Main {
    public static void main(String[] args) {
        TarjetaCredito pagoConTarjeta = new TarjetaCredito(1000,"CR2345636");
        PayPal pagoConPaypal = new PayPal(500, "carlos@gmail.com");

        System.out.println();
        pagoConTarjeta.procesarPago();

        System.out.println();
        pagoConPaypal.procesarPago();

    }
}
