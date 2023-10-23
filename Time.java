import java.util.*;

public class Time 
{
    int year;
    int month;
    int day;
    int hour;
    int minute;
    int seconds;
    String meridiem;

    public void input()
{
    Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = keyboard.nextInt();

        System.out.print("Enter month: ");
        month = keyboard.nextInt();

        System.out.print("Enter day: ");
        day = keyboard.nextInt();

        System.out.print("Enter hour: ");
        hour = keyboard.nextInt();

        System.out.print("Enter minute: ");
        minute = keyboard.nextInt();

        System.out.print("Enter seconds: ");
        seconds = keyboard.nextInt();

        System.out.print("Enter meridiem(PM or AM): ");
        meridiem = keyboard.next(); 
}

    public void PrintStandardTime()
    {
        if(month > 12 || day > 31 || hour > 13 || minute > 60 || seconds > 60)
        {
            System.out.println("Invalid number or meridiem for one of your inputs try again");
        }
        else
            System.out.println("the Standard time is: "+month+"-"+day+"-"+year+" "+hour+":"+minute+":"+seconds+" "+meridiem);
    }

    public void  PrintMilitaryTime()
    {   
        int mhour = hour;

        if(mhour > 1)
        {
            mhour = hour + 12;
        }
        if(mhour == 24)
        {
            mhour = 00;
        }

        if(month > 12 || day > 31 || mhour > 23 || minute > 60 || seconds > 60)
        {
            System.out.println("Invalid number or meridiem for one of your inputs try again");
        }
        else
            System.out.println("the Military time is: "+day+"-"+month+"-"+year+" "+mhour+":"+minute+":"+seconds);
    }
}


