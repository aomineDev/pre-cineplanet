class Prueba{

    static public int numero=5;
    static public int Sumar(int a, int b){
        return a+b;
    }

}
public class Test {


    public static void main(String[] args) {
        
        int numero1[] = {1,2,3};
        int numero2[] = numero1;
        
        numero2[0] = 4;

        System.out.println(numero1[0]);
    }

    
    

}
