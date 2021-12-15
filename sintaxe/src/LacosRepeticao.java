public class LacosRepeticao {
    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 10){
            System.out.println(contador);
            contador += 1;
        }

        //Do While
        do{
            System.out.println(contador);
            contador++;
        }
        while(contador <= 10);

        //For
        for(int x = 1; x <= 10; x++){
            System.out.println(x);
        }

        String[] frutas = {"Maçã", "Melancia", "Banana", "Abacaxi", "Laranja", "Uva"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
}
