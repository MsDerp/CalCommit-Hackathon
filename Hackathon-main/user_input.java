import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

public class user_input
{
    public static String age(int age)
    {
        String exercisePlan = " ";
        if(age<=5)
            exercisePlan = "Ideally, you should be exercising everday, throughtout the day, primarily in the form of active play. ";
        if (age>5 && age<=17)
            exercisePlan = "Ideally, you should be exercising at least 1 hour daily. The daily activity on at least three times a week for an hour\nshould be vigours activity, muscle strengthing, and bone streghtening.";
        if (age>17 && age<=64)
            exercisePlan = "Ideally, you should be doing 150 minutes of moderate inensity activity\n a week of moderate activity and 2 days a week of strengthening";
        if (age>=65)
            exercisePlan = "Ideally, you should be doing 150 minutes a week of moderate\n" +
            "intesity activity, 2 days a week of muscle strengthening, and balance improving activities.";
            
        return exercisePlan;
    }
    
    public static double BMI(int height, double weight)
    {
        double BMI =Math.round((((weight * 703)/height)/height));
        
        if(BMI>30)
         System.out.println("Since you have a higher BMI, you should to stick to a healthier diet and exercise more regularly to lose weight.");
        
        
        return BMI;
        
        

        
    }
    public static void diet(int age)
    {
                Dictionary diet = new Hashtable();
     
        if(age<=8)
        {
            diet.put("Calories", "1,200 to 2,000");
            diet.put("Protein", "3 to 5.5 ounces");
            diet.put("Fruits","1 to 2 cups"); 
            diet.put("Vegetables", "1.5 cups to 2.5 cups");
            diet.put("Grains", "4 to 6 ounces");
            diet.put("Dairy", "2.5 cups");
        }
        
        if(age>8 && age<=13)
        {
            diet.put("Calories ", "1,400 to 2,600");
            diet.put("Protein ", "3 to 6.5 ounces"); 
            diet.put("Fruits ", "1.5 to 2 cups"); 
            diet.put("Vegetables ", "1.5 to 3.5 cups");
            diet.put("Grains ", "5 to 9 ounces"); 
            diet.put("Diary ", "3 cups");
        }
        if(age>14 && age<=18)
        {
            diet.put("Calories", "1,800 to 3,200"); 
            diet.put("Proteins", "5 to 7 ounces"); 
            diet.put("Fruits", "1.5 to 2.5 cups"); 
            diet.put("Vegetables", "2.5 to 4 cups"); 
            diet.put("Grains", "6 to 10 ounces"); 
            diet.put("Dairy", "3 cups"); 
        }
        if(age>14 && age<=18)
        {
            diet.put("Calories", "1,800 to 3,200"); 
            diet.put("Proteins", "5 to 7 ounces"); 
            diet.put("Fruits", "1.5 to 2.5 cups"); 
            diet.put("Vegetables", "2.5 to 4 cups"); 
            diet.put("Grains", "6 to 10 ounces"); 
            diet.put("Dairy", "3 cups"); 
        }
        if(age>18 && age<=30)
        {
            diet.put("Calories", "2,000 to 3,000");
            diet.put("Proteins", "5.5 to 6.5 ounces"); 
            diet.put("Fruits", "2 cups"); 
            diet.put("Vegetables", "2.5 to 3 cups"); 
            diet.put("Grains", "5.5 to 6.5 ounces"); 
            diet.put("Dairy", "3 cups"); 
        }
        if(age>30 && age<=50)
        {
            diet.put("Calories", "1,800 to 3,000");
            diet.put("Proteins", "5 to 6 ounces"); 
            diet.put("Fruits", "1.5 to 2 cups"); 
            diet.put("Vegetables", "2.5 to 3 cups"); 
            diet.put("Grains", "6 to 7 ounces"); 
            diet.put("Dairy", "3 cups"); 
        }
        if(age>=51)
        {
            diet.put("Calories", "1,600 to 2,800");
            diet.put("Proteins", "5 to 5.5 ounces"); 
            diet.put("Fruits", "1.5 to 2 cups"); 
            diet.put("Vegetables", "2 to 2.5 cups"); 
            diet.put("Grains", "5 to 6 ounces"); 
            diet.put("Dairy", "3 cups"); 
        }
        
        System.out.println("Diet plan according to age:\n For your age, you should be eating " + diet.get("Calories") + " calories, " + diet.get("Proteins") + " of proteins,\n" + 
        diet.get("Fruits") + " of fruits, " + diet.get("Vegetables") + " of vegetables, \n" + diet.get("Grains") + " of grains, and " + diet.get("Dairy") + " of dairy.");
    
    
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        int height = input.nextInt();
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("What is your weight?");
        double weight = input.nextDouble();
    
        System.out.println("Exercise plan according to your age:\n " + age(age));
        System.out.println("BMI: " + BMI(height,weight));
        diet(age);
  
    }
}
    
    