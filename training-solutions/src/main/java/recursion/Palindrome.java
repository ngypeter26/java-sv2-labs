package recursion;

public class Palindrome {
    public boolean isPalindrome(String word){
        if (word.length()>1){
            boolean solution = isPalindrome(word.substring(1,word.length()-1));
            return solution && word.charAt(0) == word.charAt(word.length()-1);
        }else{
            return true;
        }
    }
}
