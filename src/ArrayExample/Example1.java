package ArrayExample;

public class Example1 {
    public static void main(String[] args) {
        
        float[]weigthArray = new float[5];
        float[]heigthArray = new float[5];
        float[]BMIArray = new float[5];
        
        weigthArray[0] = 74.5f;
        weigthArray[1] = 56.7f;
        weigthArray[2] = 65.3f;
        weigthArray[3] = 90.0f;
        weigthArray[4] = 74.6f;
        
        heigthArray[0] = 180.5f;
        heigthArray[1] = 165.4f;
        heigthArray[2] = 172.3f;
        heigthArray[3] = 185.4f;
        heigthArray[4] = 183.6f;
        
        BMIArray[0] = weigthArray[0]/(heigthArray[0]*heigthArray[0]);
        BMIArray[1] = weigthArray[1]/(heigthArray[1]*heigthArray[1]);
        BMIArray[2] = weigthArray[2]/(heigthArray[2]*heigthArray[2]);
        BMIArray[3] = weigthArray[3]/(heigthArray[3]*heigthArray[3]);
        BMIArray[4] = weigthArray[4]/(heigthArray[4]*heigthArray[4]);
        
        System.out.println("Pearson 1 BMI: " + BMIArray[0] + ",");
        System.out.println("Pearson 2 BMI: " + BMIArray[1] + ",");
        System.out.println("Pearson 3 BMI: " + BMIArray[2] + ",");
        System.out.println("Pearson 4 BMI: " + BMIArray[3] + ",");
        System.out.println("Pearson 5 BMI: " + BMIArray[4] + ".");
        
    } 
}
