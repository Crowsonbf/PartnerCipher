import java.util.Scanner;
public class Decrypt
{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String cipher = "";
        String cipher2 = "";
        int letter = 1;
        int asciiValue= 1;
        System.out.println("Enter the encrypted message one number at a time (Enter 00 to end)");
        
        System.out.println("The decrypted message is: "+ decryptText(letter,cipher,cipher2,asciiValue,s));
    }
    public static String decryptText(int letter, String cipher, String cipher2, int asciiValue, Scanner s){
        s = new Scanner(System.in);
        while (letter != 00 ){
        letter = s.nextInt();
        ifs(asciiValue, cipher, cipher2, letter);
        cipher2 = cipher2 + ifs(asciiValue, cipher, cipher2, letter);

        }
    return cipher2;
    } 


public static String ifs(int asciiValue, String cipher, String cipher2, int letter) {

    if(letter > 26){
            System.out.println("Error");
        }
        else if (letter == 26) {
            asciiValue = letter + 6;
            cipher = "" + ((char)(asciiValue));
        }
            else if (letter >= 20 && letter < 26){
                asciiValue = letter + 77;
                cipher = "" + ((char)(asciiValue));
            }
            else if(letter == 03 ){
                asciiValue = 106;
                cipher = "" + ((char)(asciiValue));
            }
            else if(letter >= 01 && letter < 03){
                asciiValue = letter + 102;
                cipher = "" + ((char)(asciiValue));
            }
            else if(letter >= 04 && letter <= 19){
                asciiValue = letter + 103;
                cipher = "" + ((char)(asciiValue));
            }
            else if (letter == 00){
        }
        return cipher;
}
}

