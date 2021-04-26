public class Palendrome {
    public static boolean palindrome(String s1){
        s1 = s1.toLowerCase();
        if(s1.equals(palindromeCreator(s1,s1.length()))){
            return true;
        }else{
            return false;
        }
    }

    private static String palindromeCreator(String s, int l){
        if(l <= 0){
            return s;
        }else{
            return palindromeCreator(s.substring(1,s.length()) + s.charAt(0), l-1);
        }
    }
}
