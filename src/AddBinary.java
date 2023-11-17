public class AddBinary {
    public static void main(String[] args) {
String output=addBinary("1010","1011");
        System.out.println(output);
    }
    public static  String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry!=0){
            if(i>=0)
                carry+=a.charAt(i--)-'0';
            if(j>=0)
                carry+=b.charAt(j--)-'0';
            sb.append(carry%2);
            carry/=2;
        }
        return sb.reverse().toString();

    }

}
