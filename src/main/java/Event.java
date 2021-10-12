import java.util.Date;

public class Event {
    private String name;
    private int priority;
    private Date startDate;
    private Date endDate;
    private boolean completed;

    /**
     * Construct an Event, giving them the given name,
     * priority, start date, and end date.
     *
     * @param name      The Event's name
     * @param priority  The Event's priority
     * @param startDate The Event's start date
     * @param endDate   The Event's end date
     * @param completed The Event's completion status
     */
    public Event(String name, int priority, Date startDate, Date endDate) {
        this.name = name;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = false;
    }

    /**
     * Construct an Event, giving them the given name,
     * priority, and end date.
     *
     * This constructor does not need startDate
     *
     * @param name      The Event's name
     * @param priority  The Event's priority
     * @param endDate   The Event's end date
     */
    public Event(String name, int priority, Date endDate) {
        this.name = name;
        this.priority = priority;
        this.endDate = endDate;
        this.completed = false;
    }

    /**
     * Construct an Event, giving them the given name and priority
     *
     * This constructor only needs name and endDate, and will assign
     * a 0 as the default value of priority
     *
     * @param name      The Event's name
     * @param endDate   The Event's end date
     */
    public Event(String name, Date endDate) {
        this.name = name;
        this.priority = 0;
        this.endDate = endDate;
        this.completed = false;
    }

    /**
     * toString method
     * @return a String that describes the Event
     */
    @Override
    public abstract String toString();

    /**
     * Gets the name of the Event
     * @return the name of the Event as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the priority of event
     * @return the priority of event as an int
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Gets the start date of event
     * @return the start date of event as a Date object
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Gets the end date of event
     * @return the end date of event as a Date object
     */
    public Date getEndDate() {
        return endDate;
    }

    public boolean isCompleted() {
        return completed;
    }
}
