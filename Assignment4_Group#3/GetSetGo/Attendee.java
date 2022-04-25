package factory;

import java.util.List;
import factory.Interface.User;

public class Attendee implements User {

	private List<Integer> eventIDs;
	
	User user = new User();

	public List<Integer> getAttendedEventIds() {
		return this.eventIDs;
	}

	@Override 
	public void addComments(String comment) {
		user.setComment(comment);
		System.out.println("Comment Added by Attendee Successfully.");
	}

}
