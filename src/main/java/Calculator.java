public class Calculator {

    public String add;
    public String subtract;
    public String multiply;
    private String divide;

    public Calculator(String add, String subtract, String multiply, String divide){
        this.add = add;
    }

    public String getAdd(){
        return add;
    }

    public String getSubtract(){
        return subtract;
    }

    public String getMultiply(){
        return multiply;
    }

    public double getDivide(){
        return divide;
    }
}
