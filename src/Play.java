import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Play {
    Category country1 = new Category();

    Category planet1 = new Category();

    Category animal1 = new Category();
    Hangman hangman = new Hangman();

    public void playCountry(int playGuestCountry){
        String randomWord = country1.countryList().getCountry();
        String underscores = randomWord.replaceAll("[a-zA-Z]", "_");
        for(int i = 0; i<underscores.length(); i++){
            System.out.print(underscores.charAt(i)+ " ");
        }
        System.out.println();System.out.println();
        StringBuilder hiddenWord = new StringBuilder(underscores);
        ArrayList<Character> charList = new ArrayList<>();
        int wrongCount = 0;
        int guessLimit = 6;
        boolean letterGuess = true;
        Scanner scan = new Scanner(System.in);
        while (!hiddenWord.toString().equals(randomWord) && wrongCount != guessLimit) {
            Collections.sort(charList);
            System.out.println("Letters already entered: " +charList);
            System.out.println("Please enter a letter. ");
            String userInput = scan.nextLine();
            userInput = userInput.toLowerCase();
            char a = userInput.charAt(0);
            if (!charList.contains(a) && Character.isLetter(a)) {
                charList.add(a);
                for (int i = 0; i < randomWord.length(); i++) {
                    if (randomWord.charAt(i) == a) {
                        hiddenWord.setCharAt(i, a);
                        letterGuess = false;
                    }
                }
                if (letterGuess) {
                    wrongCount++;
                    hangman.printHangman(wrongCount);
                }
                letterGuess = true;
                System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                for(int i = 0; i<underscores.length(); i++){
                    System.out.print(hiddenWord.charAt(i)+ " ");
                }
            } else if (charList.contains(a)) {
                System.out.println(" You already entered this letter. Enter a new letter again:");
            } else if (wrongCount == guessLimit) {
                System.out.println(" Out of guesses.");
            }
        }
        if (randomWord.equals(hiddenWord.toString())) {
            System.out.println("You WIN!!! ");
        } else {
            System.out.println("Sorry You Lost\nGuessing word was >>" + randomWord.toUpperCase() + "<<");
        }
    }
        public void playPlanet(int playGuestPlanet){
            String randomWord1 = planet1.planetList().getPlanet();
            String underscores1 = randomWord1.replaceAll("[a-zA-Z]", "_");
            for(int i = 0; i<underscores1.length(); i++){
                System.out.print(underscores1.charAt(i)+ " ");
            }
            System.out.println();
            StringBuilder hiddenWord1 = new StringBuilder(underscores1);
            ArrayList<Character> charList1 = new ArrayList<>();
            int wrongCount = 0;
            int guessLimit = 6;
            boolean letterGuess = true;
            Scanner scan = new Scanner(System.in);
            while (!hiddenWord1.toString().equals(randomWord1) && wrongCount != guessLimit) {
                Collections.sort(charList1);
                String userInput = scan.nextLine();
                userInput = userInput.toLowerCase();
                char a = userInput.charAt(0);
                if (!charList1.contains(a) && Character.isLetter(a)) {
                    charList1.add(a);
                    for (int i = 0; i < randomWord1.length(); i++) {
                        if (randomWord1.charAt(i) == a) {
                            hiddenWord1.setCharAt(i, a);
                            letterGuess = false;
                        }
                    }
                    if (letterGuess) {
                        wrongCount++;
                        hangman.printHangman(wrongCount);

                    }
                    letterGuess = true;
                    System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                    for(int i = 0; i<underscores1.length(); i++){
                        System.out.print(hiddenWord1.charAt(i)+ " ");
                    }

                } else if (charList1.contains(a)) {
                    System.out.println(" You already entered this letter. Enter a new letter again:");
                } else if (wrongCount == guessLimit) {
                    System.out.println(" Out of guesses.");
                }
            }
            if (randomWord1.equals(hiddenWord1.toString())) {
                System.out.println("You WIN!!! ");
            } else {
                System.out.println("Sorry You Lost\nGuessing word was >>" + randomWord1.toUpperCase() + "<<");
            }
        }
        public void playAnimal(int playGuestAnimal) {
            String randomWord3 = animal1.animalList().getAnimal();
            String underscores3 = randomWord3.replaceAll("[a-zA-Z]", "_");
            for(int i = 0; i<underscores3.length(); i++){
                System.out.print(underscores3.charAt(i)+ " ");
            }
            System.out.println();
            StringBuilder hiddenWord3 = new StringBuilder(underscores3);
            ArrayList<Character> charList3 = new ArrayList<>();
            int wrongCount = 0;
            int guessLimit = 6;
            charList3.add('-');
            boolean letterGuess = true;
            Scanner scan = new Scanner(System.in);
            while (!hiddenWord3.toString().equals(randomWord3) && wrongCount != guessLimit) {
                Collections.sort(charList3);
                String userInput = scan.nextLine();
                userInput = userInput.toLowerCase();
                char a = userInput.charAt(0);
                if (!charList3.contains(a) && Character.isLetter(a)) {
                    charList3.add(a);
                    for (int i = 0; i < randomWord3.length(); i++) {
                        if (randomWord3.charAt(i) == a) {
                            hiddenWord3.setCharAt(i, a);
                            letterGuess = false;
                        }
                    }
                    if (letterGuess) {
                        wrongCount++;
                        hangman.printHangman(wrongCount);
                    }
                    letterGuess = true;
                    System.out.println("You have left  " + (guessLimit - wrongCount) + " guesses.");
                    for(int i = 0; i<underscores3.length(); i++){
                        System.out.print(hiddenWord3.charAt(i)+ " ");
                    }

                } else if (charList3.contains(a)) {
                    System.out.println(" You already entered this letter. Enter a new letter again:");
                } else if (wrongCount == guessLimit) {
                    System.out.println(" Out of guesses.");
                }
            }
            if (randomWord3.equals(hiddenWord3.toString())) {
                System.out.println("You WIN!!! ");
            } else {
                System.out.println("Sorry You Lost\nGuessing word was >>" + randomWord3.toUpperCase() + "<<");
            }
        }
    }