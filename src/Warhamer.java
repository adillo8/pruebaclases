package src;

abstract class Warhamer{
    //metodo con implementacion
    public void atacar(){
        System.out.println("");
    }

    //metodo abstracto que sera definido en las clases hijas
    public abstract void defender();

    //metodo abstrtacto para ogro
    public abstract void imaginacion();
}

class Orco extends Warhamer{
    public void defender(){
        System.out.println("El ogro usa una roca pintada de morado como escudo");
    }
    public void imaginacion(){
        System.out.println("El ogro imagina que es un elfo y el elfo explota");
    }
}

class Elfo extends Warhamer{
    public void defender(){
        System.out.println("El elfo prueba con arco y flecha");
    }
    public void imaginacion(){
        System.out.println("El elfo no tiene el poder de la imaginacion y sufre al morir como un looser");
    }
}

// Clase principal
class WarhamerMain{
    public static void main(String[] args) {

        System.out.println("Empieza la lucha tras la herejia de Orus");
        System.out.println("Orco vs Elfo");
        Orco orco = new Orco();
        Elfo elfo = new Elfo();
        orco.atacar();
        elfo.atacar();
        orco.defender();
        elfo.defender();
        orco.imaginacion();
        elfo.imaginacion();
    }
}