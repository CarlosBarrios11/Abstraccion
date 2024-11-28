package extend;

public class TarjetaCredito extends MetodoPago{
    private String numeroTarjeta;

    public TarjetaCredito(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de $" + getMonto() + " con tarjeta de crédito: " + numeroTarjeta);
    }
}
