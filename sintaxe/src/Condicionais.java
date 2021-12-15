public class Condicionais {
    public static void main(String[] args) {
        double notaA, notaB, media;
        notaA = 7;
        notaB = 8;
        media = (notaA + notaB) / 2;

        if(media >= 7){
            System.out.println(media + " Aprovado");
        }
        else if(media >= 5 && media < 7){
            System.out.println(media + " Recuperação");
        }
        else{
            System.out.println(media + " Reprovado");
        }

        //Operador Lógicos
        // && == (e)
        // || == (ou)

        int faltas = 11;
        if(media >= 7 && faltas <= 10){
            System.out.println("Aprovado " + faltas + " faltas - nota: " + media);
        }
        else if(media < 5 || faltas > 10){
            System.out.println("Reprovado " + faltas + " faltas - nota: " + media);
        }
        else if(media >= 5 && media < 7 && faltas <= 10){
            System.out.println("Recuperação" + faltas + " faltas - nota: " + media);
        }
        else{
            System.out.println("Reprovado" + faltas + " faltas - nota: " + media);
        }
    }
}
