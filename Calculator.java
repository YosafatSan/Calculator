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


    public static void main(String []arg){
        ICalculator Calc = new ICalculator();
        Calc.Fibo();
    }
}