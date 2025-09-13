import java.util.Scanner;

interface DayCalculator {
    int getTotalHours();
    int getRemainingHours(int hoursPassed);
}

class DayHours implements DayCalculator {
    private int hoursInADay = 24;

    @Override
    public int getTotalHours()
    {
        return hoursInADay;
    }

    @Override
    public int getRemainingHours(int hoursPassed)
    {
        return  hoursInADay - hoursPassed;
    }


}

public class Calculate_Hours_In_A_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DayHours day = new DayHours();

        System.out.println("Total hours in a day: "+ day.getTotalHours());

        System.out.println("What is the current time (using a 24hr format): ");
        int hoursPassed = sc.nextInt();

        System.out.println("Hours remaining in a day: "+ day.getRemainingHours(hoursPassed));


    }
}
