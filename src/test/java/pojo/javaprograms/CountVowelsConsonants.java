package pojo.javaprograms;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String name ="Hello World";
        System.out.println(name.length());
        countVowelsConsonants(name);
    }



    public static void countVowelsConsonants(String name) {
        int vowels = 0;
        int constant = 0;

        for (int i = 0; i < name.length(); i++) {

            name =name.toLowerCase();
            if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {

                if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                    vowels++;
                    System.out.println("Vowels: " + name.charAt(i));
                } else {
                    constant++;
                    System.out.println("Consonants: " + name.charAt(i));
                }

            }


        }
        System.out.println(vowels);
        System.out.println(constant);
    }}


