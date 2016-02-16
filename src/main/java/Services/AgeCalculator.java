package Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by kchoudhary on 11-Feb-16.
 */

public class AgeCalculator {
    private Date dob;
    private String dobFromXml;

    AgeCalculator(String dobFromXml){
        this.dobFromXml = dobFromXml;
        int age = dateCalculator() - getBirthYear();
        System.out.println(age);

    }

    private int dateCalculator() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    private int getBirthYear() {
        try {
            dob = new SimpleDateFormat("dd-MM-yyyy").parse(dobFromXml);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar birthYear = Calendar.getInstance();
        birthYear.setTime(dob);
        return birthYear.get(Calendar.YEAR);
    }

}

