package com.jamesshore.finances.domain;

public class InvalidDollars extends Dollars {

	@Override
	public boolean isValid() {
		return false;
	}

	@Override
	public Dollars plus(Dollars dollars) {
		return new InvalidDollars();
	}

	@Override
	public Dollars minus(Dollars dollars) {
		return new InvalidDollars();
	}

	@Override
	public Dollars subtractToZero(Dollars dollars) {
		return new InvalidDollars();
	}

	@Override
	public Dollars percentage(double percent) {
		return new InvalidDollars();
	}

	@Override
	public Dollars min(Dollars value2) {
		return new InvalidDollars();
	}
	
	@Override
	public String toString() {
		return "$???";
	}
	
	@Override
	public boolean equals(Object o) {
		return (o instanceof InvalidDollars);
	}

	@Override
	public int hashCode() {
		return 13;
	}
	
}