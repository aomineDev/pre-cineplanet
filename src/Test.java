public class Test {

    public static void main(String[] args) {
        
        int number = getNumber(3);
        System.out.println("El numero final es: "+number);

    }

    static int getNumber(int n) {

        for (int i = 0; i < 101; i++) {

            System.out.println(i);

            if(i == n) {
                System.out.println("Bucle detenido");
                return n;
            }

        }

        System.out.println("Bucle finalizado");

        return 100;

    }
    
}
