package factory;

public class Main {
	public static void main(String[] args) {

		// creating organizer and attendee
		Organizer organizer = (Organizer) UserFactory.getUser("ORGANIZER");
		Attendee attendee = (Attendee) UserFactory.getUser("ATTENDEE");

		// creating events

		TrekkingAndCamping tc = (TrekkingAndCamping) EventAbstarctFactory.getEvent("TrekkingAndCamping");
		MidnightEvents md = (MidnightEvents) EventAbstarctFactory.getEvent("MidnightEvents");
		Photography p = (Photography) EventAbstarctFactory.getEvent("Photography");

		Logger.getInstance().log("This is a message");
	}
}
