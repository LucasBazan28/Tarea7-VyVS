public class ClasesNum {
    public String classifyNumber(int number) {
        if (number > 0) {
            return "Positivo";
        } else if (number < 0) {
            return "Negativo";
        } else {
            return "Cero";
        }
    }
    public boolean isEven(int n){
        //Even = par
        return (n % 2 == 0);
    }
    public boolean isInteger(double n){
        //Hago programación en varias líneas para ver tema de coverage
        boolean toReturn;
        if(n == Math.floor(n)){
            toReturn = true;
        }
        else{
            toReturn = false;
        }
        return toReturn;
    }
}
