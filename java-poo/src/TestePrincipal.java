public class TestePrincipal {
    public static void main(String[] args) {

        try{
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }catch(Exception e){
            System.out.println("Erro de excessão");
        }finally{
            System.out.println("Funciona de qualquer forma");
        }
    }   
}
