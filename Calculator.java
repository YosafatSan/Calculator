public class Calculator{

    public static class ICalculator{
        public void Fibo(){
            System.out.println("Fibbonacci de 10" + CalcFibonacci(10));
        }
        private int CalcFibonacci(int n){
            if (n>1){
                return CalcFibonacci(n-1) + CalcFibonacci(n-2);  //función recursiva
            }
            else if (n==1) {  // caso base
                return 1;
            }
            else if (n==0){  // caso base
                return 0;
            }
            else{ //error
                System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1; 
            }
        }
    }

    public static  class ICalculator2 extends ICalculator{
        public void Suma(int a, int b){
            System.out.println("La suma es: " + (a+b));
        }
        public void Resta(int a, int b){
            System.out.println("La resta es: " + (a-b));
        }
        public void Fibo(){
            System.out.println("Fibbonacci de 10" + super.CalcFibonacci(20));
        }
    }

    public static void main(String []arg){
        ICalculator Calc = new ICalculator();
        Calc.Fibo();

        ICalculator2 Calc2 = new ICalculator2();
        Calc2.Fibo();
    }
}