package pojo.javaprograms;

public class StringReverse {
    public static void main(String[] args) {
        String name ="madam";
      String revrsedString =reversString(name);

      if(name.equals(revrsedString))
          System.out.println("String is palindrome");
      else
          System.out.println("String is not palindrome");

    }

    public static String reversString(String name){
        String reverseStringV ="";

        for(int i=name.length()-1;i>=0;i--){
           reverseStringV =reverseStringV + name.charAt(i);
        }
        return reverseStringV;
    }
}
