    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // parent class
    class Week {
        Days[] days = Days.values(); // grabs all the days from "Days"

        // show all days
        public void showDays() {
            System.out.println("All the days:");
            for (Days d : days) {
                System.out.println(d);
            }
        }
    }

    // child class 1
    class Weekend extends Week {
        @Override
        public void showDays() {
            System.out.println("Just weekend vibes:");
            for (Days d : days) {
                if (d == Days.SATURDAY || d == Days.SUNDAY) {
                    System.out.println(d);
                }
            }
        }
    }

    //child class 2
    class Week_Days extends Week{
        @Override
        public void showDays() {
            System.out.println("\nThese are the working days in the week:");
            for (Days d : days) {
                if(d != Days.SATURDAY && d != Days.SUNDAY) {
                    System.out.println(d);
                }
            }
        }

    }

    // main program
    public class Days_Of_The_Week_Program {
        public static void main(String[] args) {
            Week week = new Week();
            week.showDays();  // prints all days

            System.out.println();

            Weekend wknd = new Weekend();
            wknd.showDays();  // prints only weekend


            Week_Days weekday = new Week_Days();
            weekday.showDays(); // prints the weekdays
        }
    }


