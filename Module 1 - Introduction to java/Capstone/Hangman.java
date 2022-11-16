package Capstone;

public class Hangman {
     
     public static String[] gallows = {"+---+\n" +
     "|   |\n" +
     "    |\n" +
     "    |\n" +
     "    |\n" +
     "    |\n" +
     "=========\n",
 
     "+---+\n" +
     "|   |\n" +
     "O   |\n" +
     "    |\n" +
     "    |\n" +
     "    |\n" +
     "=========\n",
 
     "+---+\n" +
     "|   |\n" +
     "O   |\n" +
     "|   |\n" +
     "    |\n" +
     "    |\n" +
     "=========\n",
 
     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|   |\n" +
     "     |\n" +
     "     |\n" +
     " =========\n",
 
     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
     "     |\n" +
     "     |\n" +
     " =========\n",
 
     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|\\  |\n" +
     "/    |\n" +
     "     |\n" +
     " =========\n",
 
     " +---+\n" +
     " |   |\n" +
     " O   |\n" +
     "/|\\  |\n" + 
     "/ \\  |\n" +
     "     |\n" +
     " =========\n"};

     public static String[] words = { "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
     "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
     "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
     "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
     "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
     "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
     "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
     "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
     "wombat", "zebra"};


     public static void main(String[] args) {
          String word = randomWord();

          char[] placeholders = new char[word.length()];

          for(int i = 0; i < placeholders.length; i++){
               placeholders[i] = '_';
          }
     }

     public static String randomWord(){
          int word = words.length;
          double number = Math.random();
          int index = (int) (number * word);
          return words[index];
     }
     
}
