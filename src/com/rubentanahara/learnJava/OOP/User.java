package OOP;

import java.time.LocalDate;
import java.time.Period;

/**
 * Main
 */
public class User {

    private final String name;
    private final LocalDate birthday;

    public User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    public int getAge() {
        Period age = Period.between(this.birthday, LocalDate.now());
        return age.getYears();
    }

    public String getName() {
        return this.name;
    }
}
