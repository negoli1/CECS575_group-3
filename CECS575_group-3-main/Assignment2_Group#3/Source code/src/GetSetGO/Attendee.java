package factory;

import java.util.List;

public class Attendee extends User {

	private List<Integer> eventIDs;

	public List<Integer> getAttendedEventIds() {
		return this.eventIDs;
	}

}
