package songs;
import java.util.Scanner;

public class SingDucks {

// This is my version of the song
        private void singMyVersion() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("How many ducks went swimming one day?");
            int ducks = myScanner.nextInt();

            String word = "ducks";
            for (int i = ducks; i > 0; i--) {
                System.out.println(i + " little " + word + " went swimming one day,");
                System.out.println("Over the hills and far away.");
                System.out.println("Mother duck said \"Quack! Quack! Quack! Quack!\"");

                if (i == 1) {
                    System.out.println("But no little ducks came swimming back.");
                } else {
                    int newNum = i - 1;
                    if (newNum == 1) {
                        word = " duck";
                    }
                    System.out.println("And only " + newNum + " little " + word + " came back.");
                    System.out.println();
                }
            }
        }

// This is teacher's version of the song
        private void singDeansVersion() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("How many ducks are there?");
            int numOfDucks = myScanner.nextInt();

            String word = "ducks";
            for(int i =  numOfDucks; i > 0; i--){
                System.out.println(i + " little " + word + " went swimming one day,");
                System.out.println("Over the hills and far away,");
                System.out.println("Mother duck said Quack, Quack, Quack, Quack,");
                int newDuckNum = i - 1;
                if(newDuckNum > 1){
                    System.out.println("But only " + newDuckNum + " little " + word + " came back");
                }
                else if(newDuckNum == 1){
                    word = "Duck";
                    System.out.println("But only " + newDuckNum + " little " + word + " came back");
                }
                else
                    System.out.println("and all of her little ducks came back");
            }
        }

            public static void main(String[] args) {
                SingDucks singing = new SingDucks();
                singing.singMyVersion();

            }
        }

