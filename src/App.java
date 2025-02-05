


public class App {
    public static void main(String[] args)  {

        int numero1, numero2, op;
        System.out.println("Hola, soy calculadora");
        System.out.println("INTRODUCE LA OPCIÓN QUE DESEAS REALIZAR");
        System.out.println("1. Sumar"); 
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        op = Integer.parseInt(System.console().readLine());
        System.out.println("INTRODUCE EL PRIMER NÚMERO");
        numero1 = Integer.parseInt(System.console().readLine());  
        System.out.println("INTRODUCE EL SEGUNDO NÚMERO");
        numero2 = Integer.parseInt(System.console().readLine());

        calculadora(numero1, numero2, op);  



    }

    public static int multiplicar(int num1, int num2) {
        System.out.println("Hacemos multiplicación");
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
       if(num2 == 0) {
            System.out.println("No se puede dividir por 0");
            throw new ArithmeticException();
            //return 0;
        }
        else{
            System.out.println("Hacemos division");
            return num1 / num2;
         }  
          //try {
         //   return num1 / num2;
        //  } catch (ArithmeticException e) {
        //    System.out.println("No se puede dividir por 0");
           // throw new ArithmeticException();
           // return 0;
          //}
       // return num1 / num2;
        
    }

    public static int sumar(int num1, int num2) {
        System.out.println("Hacemos suma");
        return num1 + num2;
        
    }

    public static int restar(int num1, int num2) {
        System.out.println("Hacemos resta");
        return num1 - num2;
    }

    public static int potencia(int num1, int num2) {
        System.out.println("Hacemos potencia");
        return (int) Math.pow(num1, num2);
    }
    


    public static int calculadora(int num1, int num2, int operacion) { 
        switch (operacion) {
            case 1:
                return sumar(num1, num2);
            case 2:
                return restar(num1, num2);
            case 3:
                return multiplicar(num1, num2);
            case 4:
                return dividir(num1, num2);
            case 5: 
                return potencia(num1, num2);
                
            default:
                System.out.println("Operación no válida");
                break;
        }


        return 0;
    }

}
