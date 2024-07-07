class Prueba{

    static public int numero=5;
    static public int Sumar(int a, int b){
        return a+b;
    }

}
public class Test {


    public static void main(String[] args) {
        
        
        int r=Prueba.Sumar(3, 6);
        


        System.out.println("Resultado  " + r);
        System.out.println(Prueba.numero);
    }

    
    

}
