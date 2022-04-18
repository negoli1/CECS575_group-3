package factory;

import java.util.Date;

public class MidnightEvents extends Event {

	@Override
	public String getEventName() {
		return " MidnightEvents ";
	}

	@Override
	public String getDetails() {
		return "MidnightEvents at 11pm";
	}

	@Override
	public Date getStartDate() {
		return null;
	}

	@Override
	public String getWhere() {
		return "";
	}
}
