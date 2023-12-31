/**
 * Class for High Priority Tickets, used to store and calculate relevant information about
 * high priority tickets
 * @author Jose Merida
 * @version 1.0
 * @since 07-11-2023
 */
public class HighPriorityTicket implements Ticket{
    private int hours;
    private boolean isWeekend;

    /**
     * Creates a new High Priority Ticket
     * @param hours The hours of the ticket
     * @param isWeekend Whether its the weekend or not
     */
    public HighPriorityTicket(int hours, boolean isWeekend){
        this.hours = hours;
        this.isWeekend = isWeekend;
    }

    /**
     * Calculates the income generated by a ticket
     * @return double, the income generated
     */
    public double getIncome(){
        if (isWeekend){
            return (hours * 8.4);
        }
        else{
            return (hours * 9.6);
        }
    }

    /**
     * Getter for the hours attribute
     * @return Int, hours
     */
    public int getHours(){
        return hours;
    }

    /**
     * Getter for the isWeekend attribute
     * @return Boolean, isWeekend
     */
    public boolean getIsWeekend(){
        return isWeekend;
    }
}
