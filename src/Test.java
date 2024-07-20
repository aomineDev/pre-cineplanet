class Prueba{

    static public int numero=5;
    static public int Sumar(int a, int b){
        return a+b;
    }

}
public class Test {


    public static void main(String[] args) {
        
        //int numero1[] = {1,2,3};
        //int numero2[] = numero1;
        
       // numero2[0] = 4;

        //System.out.println(numero1[0]);
        
        int fila=2;
        int columna=3;
        String filacon="";


        if (fila == 0){
            filacon= "A";
        }else if (fila ==1){
            filacon= "B";
        }

        else if (fila ==2){
            filacon= "C";

        }else if (fila ==3){
            filacon= "D";

        }else if (fila ==4){
            filacon= "E";

        }else if (fila ==5){
            filacon= "F";

        }else if (fila ==6){
            filacon= "G";
        }else if (fila ==7){
             filacon= "H";
        }

        System.out.println();
        System.out.println(filacon+(columna+1));
        
    }
}

    
    


