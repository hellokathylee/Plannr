import java.util.ArrayList;
import java.util.Date;

public class Social extends Event{
    private int duration;
    private String location;
    private ArrayList<String> participants;

    /**
     * Social events class constructor, which calls its super class Event
     * This constructor LETS THE USER PROVIDE PARTICIPANTS
     * @param name          Name of event
     * @param priority      Priority of event
     * @param startDate     Start date of event
     * @param endDate       End date of event
     * @param duration      Duration of event
     * @param location      Location of event
     * @param participants  Participants of event
     */
    public Social(String name, int priority, Date startDate, Date endDate,
                  int duration, String location, ArrayList<String> participants) {
        // Calls the super method
        super(name, priority, startDate, endDate);
        // Assigns instance variables unique to Social
        this.duration = duration;
        this.location = location;
        this.participants = participants;
    }

    /**
     * Social events class constructor, which calls its super class Event
     * This constructor DOES NOT REQUIRE USER TO INPUT LIST OF PARTICIPANTS
     * @param name          Name of event
     * @param priority      Priority of event
     * @param startDate     Start date of event
     * @param endDate       End date of event
     * @param duration      Duration of event
     * @param location      Location of event
     */
    public Social(String name, int priority, Date startDate, Date endDate,
                  int duration, String location) {
        // Calls the super method
        super(name, priority, startDate, endDate);
        // Assigns instance variables unique to Social
        this.duration = duration;
        this.location = location;
        this.participants = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "test";
    }
}