import java.util.Scanner;

public class Time {

    int hours;
    int minutes;
    int seconds;


    Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }


    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }


    Time add_time(Time t1, Time t2) {
        Time result = new Time();

        // add seconds
        result.seconds = t1.seconds + t2.seconds;
        result.minutes = result.seconds / 60;
        result.seconds = result.seconds % 60;

        // add minutes
        result.minutes = result.minutes + t1.minutes + t2.minutes;
        result.hours = result.minutes / 60;
        result.minutes = result.minutes % 60;

        // add hours
        result.hours = result.hours + t1.hours + t2.hours;

        return result;
    }

    void display() {
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}

class TimeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        Time t3 = new Time();
        t3 = t3.add_time(t1, t2);

        t3.display();
    }
}
