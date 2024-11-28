package implement;

public class Carro implements Movible{
    @Override
    public void mover() {
        System.out.println("El carro está moviéndose por la carretera.");
    }

    @Override
    public void detener() {
        System.out.println("El carro se ha detenido.");
    }
}
