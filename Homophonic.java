import java.util.Scanner;
public class Homophonic
{
    public static void main(String[]args)
    {
           Scanner s = new Scanner(System.in);

// could have used empty string, but it doesnt harm anything
            String str = "attack";
            String cipher2 = "";
            System.out.println("enter a message");
            str = s.nextLine();
            System.out.println("The Encrypted message is: "+encryptText(cipher2,str));
    }
// loop runs as many times as there are letters in the message


public static String encryptText(String cipher2, String str){
        cipher2 = "";
        int i = 0;

        while (i < str.length()){
            char chr=str.charAt(i);
            int asciiValue=(int)chr;

         if(asciiValue <= 102 && asciiValue > 32){
            asciiValue = asciiValue -77;
         }
         else if(asciiValue == 32){
             asciiValue = asciiValue -6;
         }
         else if(asciiValue < 32) {
             asciiValue = asciiValue - 77;
         }
        else if(asciiValue == 106){
            asciiValue = asciiValue -103;
         }
         else if( asciiValue == 105){
             asciiValue = asciiValue-102;
         }
         else if (asciiValue == 103){
             asciiValue = asciiValue -102;
         }
        else if(asciiValue > 103){
            asciiValue = asciiValue -103;
         }
        if (asciiValue < 10){
            String cipher = "" + "0"+asciiValue + " ";
            cipher2 = cipher2 + cipher;
            i++;
        }
        if (asciiValue >= 10){
            String cipher = "" + asciiValue + " ";
            cipher2 = cipher2 + cipher;
            i++;
        }
    
        }
        return cipher2;


}

        
}
