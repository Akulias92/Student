package bartbaobjects;

public class Main {
    public static void main(String[] args) {
        
        BMIclass cal = new BMIclass(62.2,179.2);
        cal.BMIcalculator();
        System.out.println("Your BMI is: " + cal);
    }
    
}
