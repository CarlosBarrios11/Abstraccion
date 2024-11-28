package implement;

public class Barco implements Movible{
    @Override
    public void mover() {
        System.out.println("El barco está navegando por el agua.");
    }

    @Override
    public void detener() {
        System.out.println("El barco se ha detenido.");
    }
}
