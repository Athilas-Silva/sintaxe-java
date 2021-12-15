public class App {
    public static void main(String[] args) throws Exception {
        // Variaveis de numeros inteiros
        int varInt = 1; // tem 4 bytes

        System.out.println(varInt);
        System.out.println("Menor valor: " + Integer.MIN_VALUE);
        System.out.println("Maior valor: " + Integer.MAX_VALUE);

        long varLong1 = 5000; //Tem 8 bytes
        long varLong2 = 92255555555L;

        System.out.println(varLong1);
        System.out.println(varLong2);
        System.out.println("Menor valor: " + Long.MIN_VALUE);
        System.out.println("Maior valor: " + Long.MAX_VALUE);

        short varShort = 32767; // Tem 2 bytes
        System.out.println(varShort);
        System.out.println("Menor valor: " + Short.MIN_VALUE);
        System.out.println("Maior valor: " + Short.MAX_VALUE);

        byte varByte = 127; // Tem 1 byte
        System.out.println(varByte);
        System.out.println("Menor valor: " + Byte.MIN_VALUE);
        System.out.println("Maior valor: " + Byte.MAX_VALUE);

        //Variaveis em números reais
        float varFloat = 3.14159265f; // Tem 4 bytes
        System.out.println(varFloat);
        System.out.println("Menor valor: " + Float.MIN_VALUE);
        System.out.println("Maior valor: " + Float.MAX_VALUE);

        double varDouble = 3.141592653589793; // Tem 8 bytes
        System.out.println(varDouble);
        System.out.println("Menor valor: " + Double.MIN_VALUE);
        System.out.println("Maior valor: " + Double.MAX_VALUE);

        // Outras Variaveis

        // Boolean
        boolean varBooleano = true; // Tem 1 bit
        varBooleano = false;
        System.out.println(varBooleano);

        // Char
        char simbolo = 'a';
        System.out.println(simbolo);

        // String
        String frase = "Aqui um texto aleatório";
        System.out.println(frase);
    }
}
