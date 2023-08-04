package Event;

import Event.Listener.impl.Subscriber;
import Event.publisher.impl.HH;

public class JobSearch {
    public static void main(String[] args) {
        HH hh = new HH();

        hh.addVacancy("Middle Developer");
        hh.addVacancy("Senior Developer");

        hh.add(new Subscriber("Oleg"));
        hh.add(new Subscriber("Misha"));
        hh.add(new Subscriber("Tanya"));

        hh.addVacancy("Junior Developer");

        hh.removeVacancy("Junior Developer");


    }
}
