import java.util.HashSet;
import java.util.Set;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
        // Create a set to keep track of character in the string
        Set<Character> charSet = new HashSet<>();
        // Iterate through each character in the string
        for(char c : str.toCharArray()){
            // If the character is already in the set, the string is not an isogram
            if(charSet.contains(c)){
                return false;
            }
            // Otherwise, add the character to the set
            charSet.add(c);
        }
        return true;
    }
}
