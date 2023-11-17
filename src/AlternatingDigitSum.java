public class AlternatingDigitSum {
    public static void main(String[] args) {
        int out=alternateDigitSum(8866229);
        System.out.println(out);
    }
    public static int alternateDigitSum(int n) {
        String number=String.valueOf(n);
        int output=0;
        for(int i=0;i<number.length();i++){
            if((i % 2) == 0){
                output+=number.charAt(i)-'0';
            }else{
                output-=number.charAt(i)-'0';
            }
        }
        return output;
    }
}
