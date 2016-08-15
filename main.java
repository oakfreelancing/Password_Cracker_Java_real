//Property of Oak Freelancing

import java.util.Random;
public class main{
    
    public static void main(String[]args){
        //The loop and main algorithm
        while(true){
            //Declaring a random 
            Random rand = new Random();
            //Converting the random type into an int and declaring a range
            int randomNum = rand.nextInt((10 - 1) + 1) + 1;
      
            System.out.print(randomNum);
            
        }

    }
}