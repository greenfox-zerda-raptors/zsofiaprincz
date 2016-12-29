package date;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Scanner;


public class BirthdayWithJodaTime implements BirthdayCalculator<LocalDate> {

    @Override
    public LocalDate parseDate(String str) {
        // TODO - return with the parsed date; format is: yyyy-MM-dd
        LocalDate localDate = LocalDate.parse(str);
        return localDate;
    }

    @Override
    public String printMonthAndDay(LocalDate date) {
        // TODO - return the date formatted: month & day (MM. dd.)
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MM. dd.");
        String str = date.toString(formatter);
        return str;
           }

    @Override
    public boolean isAnniversaryToday(LocalDate date) {
        // TODO - return with true if today is the same month+day as date
        LocalDate today = LocalDate.now();
        return (printMonthAndDay(date).equals(printMonthAndDay(today)));
    }

    @Override
    public int calculateAgeInYears(LocalDate birthday) {
        // TODO - return how many years age the input date 'birthday' was
        LocalDate today = LocalDate.now();
        return today.getYear() - birthday.getYear();
    }

    @Override
    public int calculateDaysToNextAnniversary(LocalDate date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        DateTime today = new DateTime();
        DateTime birthday = new DateTime(today.getYear(), date.getMonthOfYear(), date.getDayOfMonth(), today.getHourOfDay(), today.getMinuteOfHour(), today.getSecondOfMinute()+1);

        Interval daysToNext;
        if (!birthday.isAfter(today)) {
            birthday = birthday.plusYears(1);
        }
        daysToNext = new Interval(today, birthday);
        return (int) daysToNext.toDuration().getStandardDays();
    }



    public static void main(String[] args) {
        new BirthdayWithJodaTime().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        LocalDate birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");
}
