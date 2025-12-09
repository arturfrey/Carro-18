public class Carro extends Automovel{

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return  getMarca() +
                " " + getModelo();

    }

}
