package core;

public enum Serviceplan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	private double extracharges;
	private Serviceplan(int extracharges) {
		this.extracharges=extracharges;
	}
	public double getcost() {
		return extracharges;
	}
}
