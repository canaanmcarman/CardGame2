import java.util.Scanner;

public class CardGame {
    public static void main(String[] args){
        int card1, card2;
        int total;
        Scanner kb = new Scanner(System.in);




        System.out.println("Hello!");
        do {
            System.out.println("Enter card 1: ");
            card1 = kb.nextInt();
            System.out.println("Enter card 2: ");
            card2 = kb.nextInt();
            total = card1 + card2;


            if (card1 + card2 == 21){
                System.out.println("The sum of your 2 cards is: " + total + "*");
            }else{
                System.out.println("The sum of your 2 cards is: " + total);
            }


            }while ((card1 + card2) != 0);
        System.out.println("Goodbye!");
        }
    }

