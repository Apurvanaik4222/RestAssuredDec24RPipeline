package pojo.javaprograms;

public class CharOccurString {
    public static void main(String[] args) {
        String name = "Java is a programming language";
        charOccur(name,'a');
    }

    public static void charOccur(String name,char c){
        int count =0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==c){
                count++;
            }
        }
        System.out.println("Occurance of a in the string is: "+count);
    }
}
