public class Moto extends Automovel{

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }


    @Override
    public String toString() {
        return  getMarca() +
                " " + getModelo();

    }
}
