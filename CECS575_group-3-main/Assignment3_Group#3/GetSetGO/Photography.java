package factory;

import java.util.Date;

public class Photography extends Event {
	@Override
	public String getEventName() {
		return " Photography ";
	}

	@Override
	public String getDetails() {
		return "Photography at Lighthouse";
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
