import Attendee;
import Organizer;

public class Comments {
    private User organizer;
    private User attendee;
 
    public Comments() {
       organizer = new Organizer();
       attendee = new Attendee();
    }
 
    public void organizerComments(){
       Organizer.addComments();
    }
    public void attendeeComments(){
       attendee.addComments();
    }
 }