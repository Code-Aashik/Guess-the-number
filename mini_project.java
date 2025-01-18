import java.util.Scanner;
// Guess Number
public class mini_project {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        do{
            System.out.println("Guess the number: ");
            int userNumber= sc.nextInt();

            if (userNumber==myNumber){
                System.out.println("Wohoo.. Correct number!!");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small.");
            }
        }while(true);
    }
}
