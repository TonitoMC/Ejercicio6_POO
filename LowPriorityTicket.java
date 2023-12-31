/**
 * Class for Low Priority Tickets, used to store and calculate relevant information about
 * low priority tickets
 * @author Jose Merida
 * @version 1.0
 * @since 07-11-2023
 */
public class LowPriorityTicket implements Ticket{
    private int hours;

    /**
     * Creates a new Low Priority Ticket
     * @param hours The hours of the ticket
     */
    public LowPriorityTicket(int hours){
        this.hours = hours;
    }

    /**
     * Calculates the income generated by a ticket
     * @return The income generated
     */
    public double getIncome(){
        return hours*10;
    }

    /**
     * Getter method for the hours attribute
     * @return The hours of the ticket
     */
    public int getHours(){
        return hours;
    }
}