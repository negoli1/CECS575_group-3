package factory;

import java.util.Date;

public class Event {

	private int eventID;
	private String eventName;
	private String eventDescription;
	private String location;
	private String eventType;
	private int noOfSlots;
	private int attendes;
        public String m;
	Comments comments = new Comments();

	public Event(int eventID, String eventName, String eventDescription, String location, String eventType,
			int noOfSlots, int attendes) {
		super();
		this.eventID = eventID;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.location = location;
		this.eventType = eventType;
		this.noOfSlots = noOfSlots;
		this.attendes = attendes;
	}

	public Event() {
	}

	public int getEventID() {
		return this.eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return this.eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		m= eventDescription;
                EventManager.notifyDescUpdate(new Message(m));
		this.eventDescription= eventDescription;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
                
		m=location;
                EventManager.notifyDescUpdate(new Message(m));
		this.location = location;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getNoOfSlots() {
		return this.noOfSlots;
	}

	public void setNoOfSlots(int noOfSlots) {
		this.noOfSlots = noOfSlots;
	}

	public int getAttendes() {
		return this.attendes;
	}

	public void setAttendes(int attendes) {
		this.attendes = attendes;
	}

	public void setComment(String comment) {
		this.comments.organizerComments();
		this.comments.attendeeComments();

	}

	public Comments getComments() {
		return this.comments;
	}

	String getDetails() {
		return null;
	};

	Date getStartDate() {
		return null;
	};

	String getWhere() {
		return "";
	};

}
