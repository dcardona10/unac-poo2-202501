import java.util.Calendar;
import java.util.Date;

public class Person {

    public String id;
    public String name;
    public Date birthday;

    public void displaySalute() {
        System.out.println("Hello, " + this.name);
    }

    public void displayAge() {
        int age = getYearsBetween(this.birthday);
        System.out.println(this.name + " - " + age);
    }

    private int getYearsBetween(Date birthday) {
        Date today = new Date();
        Calendar calToday = Calendar.getInstance();
        calToday.setTime(today);
        Calendar calBirthday = Calendar.getInstance();
        calBirthday.setTime(birthday);
        int diff = calToday.get(Calendar.YEAR) - calBirthday.get(Calendar.YEAR);
        if (calToday.get(Calendar.MONTH) < calBirthday.get(Calendar.MONTH)) {
            diff--;
        }
        return diff;
    }
}
