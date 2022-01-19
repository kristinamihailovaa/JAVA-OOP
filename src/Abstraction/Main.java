package Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CardRanks cardRanks= CardRanks.valueOf(scanner.nextLine());
        CardSuitPowers cardSuitPowers= CardSuitPowers.valueOf(scanner.nextLine());
        Card card=new Card(cardSuitPowers,cardRanks);
        System.out.printf("Card name: %s of %s; Card power: %d",cardRanks,cardSuitPowers,card.getPower());
    }

}
