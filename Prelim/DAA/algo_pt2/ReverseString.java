public class ReverseString {
    public static String reverse (String str){
        if (str.isEmpty()){
            return str; 
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[]args){
        String original = "hello";
        String reversed = reverse(original);

        System.out.println("Originial: " + original);
        System.out.println("Reversed; " + reversed);

    }
}
