package factory;

public class EventAbstarctFactory {

	public static Event getEvent(String eventType) {
		if (eventType == null) {
			return null;
		}
		if (eventType.equalsIgnoreCase("TrekkingAndCamping ")) {
			return new TrekkingAndCamping();
		} else if (eventType.equalsIgnoreCase("MidnightEvents ")) {
			return new MidnightEvents();
		} else if (eventType.equalsIgnoreCase("Photography ")) {
			return new Photography();
		}
		return null;
	}

}
