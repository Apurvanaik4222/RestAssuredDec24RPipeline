package pojo.javaprograms;

public class LeapYearProg {
    public static void main(String[] args) {
        boolean flag =leapYear(2025);
        if(flag)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");


    }
    public static boolean leapYear(int year){
        boolean flag;

        if((year%4==0 && year%100!=0) ||(year%400==0)){
            flag=true;

        }
        else
            flag=false;
        return flag;


    }
}
