package extend;

public abstract class MetodoPago {
    private double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    // Metodo abstracto: cada metodo de pago debe implementarlo
    public abstract void procesarPago();

    // Metodo concreto
    public void mostrarMonto() {
        System.out.println("Monto a procesar: $" + monto);
    }
}
