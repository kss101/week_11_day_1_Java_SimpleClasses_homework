public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public long add(){
        return num1 + num2;
    }

    public long subtract(){
        return num1 - num2;
    }

    public long multiply(){
        return num1 * num2;
    }
}





