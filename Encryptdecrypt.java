import java.util.Scanner;
class Encryptdecrypt
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int ed;
        System.out.println("Enter 1 for encryption. Enter 2 for decryption");
        ed = s.nextInt();
        if (ed == 1){
            Homophonic.main(args);
        }
        else if(ed == 2){
            Decrypt.main(args);
        }

    }
}
