package eletrodomesticos;

public class Radio implements Forma, Funcionalidade{
    
    public void area(){
        System.out.println("Tamanho do Radio");
    }

    public void aumentarVol(){
        System.out.println("Aumentando");
    }

    public void diminuirVol(){
        System.out.println("Diminuindo");
    }
}
