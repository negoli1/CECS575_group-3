package factory;

public class UserFactory {

	public static User getUser(String userType) {
		if (userType == "ORGANIZER") {
			return new Organizer();
		} else if (userType == "ATTENDEE") {
			return new Attendee();
		}
		return null;
	}

}
