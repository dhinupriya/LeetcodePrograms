public class ValidPalinString {
    public static void main(String[] args) {
        Boolean bool=isPalindrome("OP");
        System.out.println(bool);
    }
    public static boolean isPalindrome(String s) {
        String a=s.replaceAll("[^a-zA-Z]","").toLowerCase();
        int end= a.length()-1;
        int start=0;
        if(a.length()<=1) return true;
        for(int i =a.length()/2;i>=0;i--){
                if(a.charAt(start++)!=a.charAt(end--))
                    return false;
        }
        return true;
    }
}
