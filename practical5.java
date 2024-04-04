import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        int length;
        String s=new String();
        Scanner sc = new Scanner(System.in);

        
        System.out.println("enter the string");
        s=sc.next();
        length = s.length();
        System.out.println("the length of string "+s+"is:"+length);
        System.out.println("your second half of the is:"+s.substring(length/2));
        sc.close();
    }
    
}
