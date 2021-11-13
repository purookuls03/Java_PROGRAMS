import java.util.Scanner;
class patient
{
    String patientname;
    double weight;
    double height;
    
    patient()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        patientname = input.nextLine();

        System.out.println("Enter your weight: ");
        weight = input.nextDouble();

        System.out.println("Enter your height: ");
        height = input.nextDouble();

        
    }
    
    void BMI()
    {
        System.out.println("Your Name : "+patientname); 
        System.out.println("Weight : "+weight);
        System.out.println("Height : "+height);
        double bmi;
        bmi=(weight/(height*height));
        System.out.println("Your bmi : "+bmi);
    }

} 

public class healthcare 
{
    public static void main(String[] args)
    {
        patient obj1 = new patient();
        obj1.BMI();
    }
}     

