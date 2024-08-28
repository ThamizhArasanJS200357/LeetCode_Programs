import java.util.HashMap; 

public class daysOfWeek {
	public static String dayOfTheWeek(int day, int month, int year) {
		if (month == 1) {
            month = 13;
            year--;
        }
        if (month == 2) {
            month = 14;
            year--;
        }

        int q = day;
        int m = month;
        int K = year % 100;
        int J = year / 100;
        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - (2 * J)) % 7;
        if (h < 0) {
            h += 7;
        }
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return daysOfWeek[h];
	}
}

// Sample Input 1 :
// 4
// 28 8 2020
// 20 4 2033
// 29 2 1920
// 27 4 1999
// Sample Output 1 :
// Friday
// Wednesday
// Sunday
// Tuesday


//LINK:https://www.naukri.com/code360/problems/day-of-the-week_668910?topList=45-day-coding-challenge&problemListRedirection=true&leftPanelTabValue=PROBLEM