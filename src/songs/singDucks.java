package songs;
import java.util.Scanner;

public class singDucks
{

        private void sing ()
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("How many ducks went swimming one day?");
            int ducks = myScanner.nextInt();

            String word = "ducks";
            for (int i = ducks; i > 0; i--) {
                System.out.println(i + " " + word + " " + " went swimming one day,");
                System.out.println("Over the hills and far away.");
                System.out.println("Mother duck said, Quack! Quack! Quack! Quack!");

                if (i == 1) {
                    System.out.println("But no little ducks came swimming back.");
                } else {
                    int newNum = i - 1;
                    if (newNum == 1) {
                        word = " duck";
                    }
                    System.out.println("And only " + newNum + " little" + " " + "came back.");
                    System.out.println();
                }
            }
        }

            public static void main(String[] args)
            {
                singDucks singing = new singDucks();
                singing.sing ();
            }
        }

