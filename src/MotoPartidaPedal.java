public class MotoPartidaPedal extends Moto{

    public MotoPartidaPedal(String marca, String modelo) {
        super(marca, modelo);
    }
    boolean aceleradorPuxado = false;

    public boolean isAceleradorPuxado() {
        return aceleradorPuxado;
    }
    public void setAceleradorPuxado(boolean AceleradorPuxado) {
        aceleradorPuxado = AceleradorPuxado;
    }

    @Override
    public void ligar(){
        if(aceleradorPuxado){
            setLigado(true);
        }else {
            System.out.println("Para ligar a moto o acelerador precisa estar puxado!");

        }}}


