package bartbaobjects;

public class BMIclass {

    private double weight,height,BMI;
    
    public BMIclass(double weight,double height){
        this.weight = weight;
        this.height = height; 
    }
    public void BMIcalculator(){
        // Metoda za izracunavanje indeksa mase tela, BMI..
        BMI = weight / (height*height); 
    }
    public boolean OverWeight(){
        return(BMI>25);
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    @Override
    public String toString() {
        return "BMIclass{" + "weight=" + weight + ", height=" + height + ", BMI=" + BMI + '}';
    }
    
}
