package Java1;

import java.util.Locale;

public class StringOperation {
    public static void main(String[]args){
        String name ="Hello Jat";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("Jt"));
        String firstName = "Anil";
        String lastName = "Jat";
        System.out.println(firstName  + lastName);
        String firstName1 = "Anil ";
        String lastName1 = "Jat";
        System.out.println(firstName1.concat(lastName1));
        int x = 10;
        String y = "20";
        //String z = x + y;
        String z=x+y;
        System.out.println(z);

    }

}
