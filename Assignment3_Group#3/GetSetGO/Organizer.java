package factory;

import java.util.List;
import User;

public class Organizer implements User {

	private List<Integer> organizedEvents;
	
	User user = new User();

	public List<Integer> getOrganizedEvents() {
		return this.organizedEvents;
	}

	@Override 
	public void addComments(String comment) {
		user.setComment(comment);
		System.out.println("Comment Added by Organizer Successfully.");
	}
}
