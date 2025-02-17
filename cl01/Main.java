import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.id = "1234";
        person.name = "David";
        Calendar birthdate = Calendar.getInstance();
        birthdate.set(1989, 3, 10);
        person.birthday = birthdate.getTime();
        person.displaySalute();
        person.displayAge();
    }
}
