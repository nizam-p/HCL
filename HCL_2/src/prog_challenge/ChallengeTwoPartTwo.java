package prog_challenge;

import java.util.Map;

public class ChallengeTwoPartTwo {

	// Details entity/bean class with overridden toString implementation but with no getters and setters
	public static class Details {
		int id;
		String name;
		long phone;
		Address address;

		// No-argument constructor
		public Details() {
		}

		// with-arguments constructor
		public Details(int id, String name, long phn, Address add) {
			this.id = id;
			this.name = name;
			this.phone = phn;
			this.address = add;
		}

		@Override
		public String toString() {
			return id + ", " + name + ", " + phone + " and " + "Address : " + address.toString();
		}
	}

	// Address entity/bean class with overridden toString implementation, but with no getter and setter methods.
	public static class Address {
		int streetNumber;
		String streetName;
		String city;
		String state;
		int zipcode;
		String country;

		// No-arg constructor
		public Address() {
		}

		// with-arguments constructor
		public Address(int streetNum, String streetName, String city, String state, int code, String country) {
			this.streetNumber = streetNum;
			this.streetName = streetName;
			this.city = city;
			this.state = state;
			this.zipcode = code;
			this.country = country;
		}

		@Override
		public String toString() {
			return streetNumber + " " + streetName + ", " + city + ", " + state + "-" + zipcode + ", " + country + ".";
		}
	}

	public static void main(String[] args) {

		Address ad1 = new Address(1234, "Forest st", "Marlborough", "Massachusetts", 1752, "USA");
		Address ad2 = new Address(2341, "Cedar hill", "Northborough", "Massachusetts", 1754, "USA");
		Address ad3 = new Address(3412, "W Turnpike Rd", "Westborough", "Massachusetts", 1753, "USA");
		Address ad4 = new Address(4123, "S Turnpike Rd", "Southborough", "Massachusetts", 1756, "USA");

		Details entity1 = new Details(001, "ONE", 111111111, ad1);
		Details entity2 = new Details(002, "TWO", 222222222, ad2);
		Details entity3 = new Details(300, "THREE", 333333333, ad3);
		Details entity4 = new Details(4514, "FOUR", 444444444, ad4);

		Map<Integer, Details> map = Map.of(entity1.id, entity1, entity2.id, entity2, entity3.id, entity3, entity4.id,
				entity4);

		for (Integer id : map.keySet())
			System.out.println(map.get(id));
	}
}