//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    CarroAutomatico c1 = new CarroAutomatico("Ferrari","220");
        System.out.println("o carro está ligado? " + c1.isLigado());
        System.out.println("Ligando carro: " + c1 + "... ");
        c1.ligar();
        c1.setFreioPressionado(true);
        System.out.println("Ligando carro...");
        c1.ligar();
        System.out.println("O carro está ligado? " + c1.isLigado());
        System.out.println("Desligando carro...");
        c1.desligar();
        System.out.println("O carro está ligado? " + c1.isLigado());


    Gincho g1 = new Gincho("Ferrari","220");
        System.out.println("Ligando Gincho... ");
        g1.ligar();
        g1.carregarAutomovel(c1);
        System.out.println(" " + c1);


    MotoPartidaPedal mp1 = new MotoPartidaPedal("Ferrari","220");
        System.out.println("A moto está ligada? " + mp1.isLigado());
        System.out.println("Ligando moto: " + mp1 + "... ");
        mp1.ligar();
        mp1.setAceleradorPuxado(true);
        System.out.println("Ligando moto...");
        c1.ligar();
        System.out.println("A moto está ligada? " + mp1.isLigado());
        System.out.println("Desligando moto...");
        c1.desligar();
        System.out.println("A moto está ligada? " + mp1.isLigado());
        System.out.println();
        }

    }
