//Created by NikaStark on 28.07.2015.

import engine.models.Game;
import scanner.Scanner;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        final String pathInputOrigin = "C:\\Users\\Alex\\AppData\\Local\\PokerStars\\PokerStars.log.0";
        final File fileInput = new File(pathInputOrigin);
        Game game = new Game();
        Scanner scanner = new Scanner();
        scanner.scanner(fileInput, game);

    }


//    public static void main(String[] args) throws AbstractPokerBotException {
//        long t1=System.nanoTime();
//        final Calculator calculator = new Calculator();
//        final Card[] inputCardsOfPlayer = new Card[]{
//                new Card(6, Suits.Spades),
//                new Card(5, Suits.Spades)
//        };
//        final Card[] inputFlopCards = new Card[]{
//                new Card(7, Suits.Hertz),
//                new Card(2, Suits.Clubs),
//                new Card(HighCard.King, Suits.Diamonds)
//        };
//        final Distribution distribution = new Distribution(inputCardsOfPlayer);
//        distribution.setFlopCards(inputFlopCards);
//        for (int number : calculator.getTableChances(distribution)) {
//            System.out.print(number);
//            System.out.printf(" %.4f%n", ((float) number * 100 / 1081));
//        }
//        long t2 = System.nanoTime();
//        long elapsedTime = t2-t1;
//        System.out.println("Elapsed time was "+elapsedTime+" ns");
//    }

}
