package Java_Practice;
//import java.lang.*;

public class String_test {
    public static void main(String[] args){

        String str = "Hello World";
        String str3 = "     Hello World     ";
        String str1 = new String("Hello World");
        char[] str2 = {'h', 'e', 'l','l','o'};

        System.out.println(str2);
        System.out.println("First String "+ str);
        System.out.println("Second String "+ str1);
        // length() and length

        /* Java length variable describes the size of 
        an array, while Java's length() method tells you
         how many characters a text String contains.*/
        // == is not compare value, object compare 
        System.out.println(str.length());
        System.out.println(str2.length);

        System.out.println((str==str1)?"Equal":"Not Equal");
        System.out.println(str.equals(str1)?"Equal":"Not Equal");

        System.out.println(str.contains("o Wo")?"Contains":"Not Not Contains");

        System.out.println(str.equalsIgnoreCase("hello world")?"Equal":"Not Equal");
        System.out.println(str.isEmpty()?"Equal":"Not Equal");
        
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        
        System.out.println(str.concat(str1));
        
        System.out.println(str.startsWith("H", 0));
        System.out.println(str.endsWith("d"));

        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0));
        
        System.out.println(str.indexOf("Wo", 0));
        System.out.println(str.indexOf("o", 0));
        System.out.println(str.lastIndexOf("l"));

        System.out.println(str3.trim());

        System.out.println(str.replace('H', 'M'));
        String[] str4 = str3.split(" ");
        for (String x : str4) {
            System.out.println(x);
        }
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb);

        sb.append("!!!");
        System.out.println(sb);

        System.out.println(sb.reverse());

        System.out.println(sb.delete(0, 10));

        sb.setLength(3);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("hello there");
        System.out.println(sb1);
        sb1.append("hey");
        System.out.println(sb1);

        sb1.delete(2, 7);
        System.out.println(sb1);
  
    }
}
