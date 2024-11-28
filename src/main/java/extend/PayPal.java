package extend;

public class PayPal extends MetodoPago{
    private String correoUsuario;

    public PayPal(double monto, String correoUsuario) {
        super(monto);
        this.correoUsuario = correoUsuario;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de $" + getMonto() +
                " a través de PayPal para el correo: " +
                correoUsuario);
    }
}
