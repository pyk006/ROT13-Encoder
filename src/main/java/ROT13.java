import java.util.*;

public class ROT13 {
    public static void main (String[] args) {
        System.out.println("Hello! Welcome to the ROT13 encoder.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input in words you want to encode to a ROT13 (please separate words by spaces): ");
        String wordsInInput = scanner.nextLine();
        AbstractMap<String, String> codeHash = new HashMap<String, String>();
        codeHash.put("a", "n");
        codeHash.put("b", "o");
        codeHash.put("c", "p");
        codeHash.put("d", "q");
        codeHash.put("e", "r");
        codeHash.put("f", "s");
        codeHash.put("g", "t");
        codeHash.put("h", "u");
        codeHash.put("i", "v");
        codeHash.put("j", "w");
        codeHash.put("k", "x");
        codeHash.put("l", "y");
        codeHash.put("m", "z");
        codeHash.put("n","a");
        codeHash.put("o","b");
        codeHash.put("p","c");
        codeHash.put("q","d");
        codeHash.put("r","e");
        codeHash.put("s","f");
        codeHash.put("t","g");
        codeHash.put("u","h");
        codeHash.put("v","i");
        codeHash.put("w","j");
        codeHash.put("x","k");
        codeHash.put("y","l");
        codeHash.put("z","m");
        codeHash.put("A", "N");
        codeHash.put("B", "O");
        codeHash.put("C", "P");
        codeHash.put("D", "Q");
        codeHash.put("E", "R");
        codeHash.put("F", "S");
        codeHash.put("G", "T");
        codeHash.put("H", "U");
        codeHash.put("I", "V");
        codeHash.put("J", "W");
        codeHash.put("K", "X");
        codeHash.put("L", "Y");
        codeHash.put("M", "Z");
        codeHash.put("N","A");
        codeHash.put("O","B");
        codeHash.put("P","C");
        codeHash.put("Q","D");
        codeHash.put("R","E");
        codeHash.put("S","F");
        codeHash.put("T","G");
        codeHash.put("U","H");
        codeHash.put("V","I");
        codeHash.put("W","J");
        codeHash.put("X","K");
        codeHash.put("Y","L");
        codeHash.put("Z","M");
        codeHash.put(" ", " ");
        String letterForCodeHash = "";
        String [] wordsArray = wordsInInput.split("");
        String[] wordsSeparated = new String[wordsArray.length];
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray[i].length(); j++) {
            wordsSeparated[i] = "";
                if (Character.isLetter(wordsArray[i].charAt(j))) {
                    letterForCodeHash = Character.toString((wordsArray[i].charAt(j)));
                    wordsSeparated[i] += codeHash.get(letterForCodeHash);
                } else {
                    wordsSeparated[i] += wordsArray[i].charAt(j);
                }
            }
        }
        String encodedString = String.join("", wordsSeparated);
        System.out.println("Here it is encoded!: " + encodedString);
    }
}
