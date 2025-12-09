public class CarroAutomatico extends Carro{

    public CarroAutomatico(String marca, String modelo) {
        super(marca, modelo);
    }
    boolean freioPressionado = false;

    public boolean isFreioPressionado() {
        return freioPressionado;
    }
    public void setFreioPressionado(boolean FreioPressionado) {
        freioPressionado = FreioPressionado;
    }

    @Override
    public void ligar(){
        if(freioPressionado){
            setLigado(true);
        }else {
            System.out.println("Para ligar o carro o freio precisa estar pressionado!");

        }}}

