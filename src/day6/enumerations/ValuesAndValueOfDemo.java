package day6.enumerations;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class ValuesAndValueOfDemo {
    // public static enum-type[] values()
    // -> it returns an array of list of enumeration constants

    // public static enum-type valueOf(String str)
    // -> it returns the enumeration constant whose value corresponds to the string
    // passed. (TrafficLight.RED)

    public static void main(String[] args) {
        System.out.println("All days using values(): ");
        Day[] allDays = Day.values();
        for(Day d: Day.values()) {
            System.out.println(d);
        }

        System.out.println("\nUsing valueOf() method: ");
        String input = "FRIDAY";
        // friday, FriDay, fri
        Day chosenDay = Day.valueOf(input);
        System.out.println("Chosen day: " + chosenDay);
    }
}
