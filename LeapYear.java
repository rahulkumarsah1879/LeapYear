import java.util.Scanner;
class LeapYear {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=scan.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + " is Leap Year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
