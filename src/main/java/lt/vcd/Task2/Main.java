package lt.vcd.Task2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter year from: ");
        int yearsF = in.nextInt();
        System.out.print("Enter month from: ");
        int monthF = in.nextInt();
        System.out.print("Enter month days: ");
        int dayF = in.nextInt();
        System.out.print("Enter year to: ");
        int yearsT = in.nextInt();
        System.out.print("Enter month to: ");
        int monthT = in.nextInt();
        System.out.print("Enter month to: ");
        int dayT = in.nextInt();

        System.out.print(differenceInDays(yearsF, monthF, dayF, yearsT, monthT, dayT));
    }
    public static int differenceInDays(int year_from, int month_from, int day_from, int year_to, int month_to, int day_to) {
        int yearDaysFrom;
        int yearDaysTo;
        int monthDaysFrom;
        int monthDaysTo;
        int minusDays;
        int minusMonthsDays;
        int minusYearsDays;
        if (year_from % 400 == 0) {
            yearDaysFrom = 366;
        } else {
            if (year_from % 4 == 0 && year_from % 100 != 0) {
                yearDaysFrom = 366;
            } else {
                yearDaysFrom = 365;
            }
        }
        if (year_to % 400 == 0) {
            yearDaysTo = 366;
        } else {
            if (year_to % 4 == 0 && year_to % 100 != 0) {
                yearDaysTo = 366;
            } else {
                yearDaysTo = 365;
            }
        }
        if (month_from == 4 || month_from == 6 || month_from == 9 || month_from == 11) {
            monthDaysFrom = 30;
        } else if (yearDaysFrom == 366 && month_from == 2) {
            monthDaysFrom = 29;
        } else if (yearDaysFrom == 365 && month_from == 2){
            monthDaysFrom = 28;
        } else {
            monthDaysFrom = 31;
        }
        if (month_to == 4 || month_to == 6 || month_to == 9 || month_to == 11) {
            monthDaysTo = 30;
        } else if (yearDaysTo == 366 && month_to == 2) {
            monthDaysTo = 29;
        } else if (yearDaysTo == 365 && month_to == 2){
            monthDaysTo = 28;
        } else {
            monthDaysTo = 31;
        }
        if (year_from == year_to && month_from == month_to) {
            minusDays = day_to - day_from;
            return minusDays;
        } else if (year_from == year_to && month_from != month_to) {
            int monthFromDays = monthDaysFrom - day_from;
            int monthToDays =  day_to;
            int monthDifference = month_to - month_from;
            if (monthDifference == 1) {
                return monthFromDays + monthToDays;
            }
            int daySum = 0;
            for (int i = month_from+1; i < month_to; i++) {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    daySum += 30;
                } else if (yearDaysFrom == 366 && i == 2) {
                    daySum += 29;
                } else if (yearDaysFrom == 365 && i == 2){
                    daySum += 28;
                } else {
                    daySum += 31;
                }
            }
            return monthFromDays + monthToDays + daySum;
        } else {
            int yearsDayF = monthDaysFrom - day_from;
            for (int i = month_from+1; i <= 12; i++) {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    yearsDayF += 30;
                } else if (yearDaysFrom == 366 && i == 2) {
                    yearsDayF += 29;
                } else if (yearDaysFrom == 365 && i == 2){
                    yearsDayF += 28;
                } else {
                    yearsDayF += 31;
                }
            }
            int yearsDayT = day_to;
            for (int i = 1; i < month_to; i++) {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    yearsDayT += 30;
                } else if (yearDaysTo == 366 && i == 2) {
                    yearsDayT += 29;
                } else if (yearDaysTo == 365 && i == 2){
                    yearsDayT += 28;
                } else {
                    yearsDayT += 31;
                }
            }
            int yearsDaySum = 0;
            for (int i = year_from+1; i < year_to; i++){
                if (i % 400 == 0) {
                    yearsDaySum += 366;
                } else {
                    if (i % 4 == 0 && i % 100 != 0) {
                        yearsDaySum += 366;
                    } else {
                        yearsDaySum += 365;
                    }
                }
            }
            return yearsDayF + yearsDayT + yearsDaySum;
        }
    }
}
