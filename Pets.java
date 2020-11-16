package homework;

public class Pets {
	private String name;
	private int age;
	private String location;
	private String type;

	public Pets(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Pets(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

	public String GetName() {
		return this.name;
	}

	public void SetName(String n) {
		this.name = n;
	}

	public int GetAge() {
		return this.age;
	}

	public void SetAge(int a) {
		this.age = a;
	}

	public String GetType() {
		return this.type;
	}

	public void SetLocation(String l) {
		this.location = l;
	}

	public class Holiday {
		private String month;
		private int date;
		private int numGuests;
		private boolean isAttending;

		public boolean isAttending() {
			return isAttending;
		}

		public void setAttending(boolean isAttending) {
			this.isAttending = isAttending;
		}

		public Holiday(String month, int date) {
			this.month = month;
			this.date = date;
		}

		public Holiday(String month, int date, int numGuests) {
			this.month = month;
			this.date = date;
			this.numGuests = numGuests;
		}

		public Holiday(boolean isAttending) {
			this.isAttending = isAttending;
		}

		public String GetMonth() {
			return this.month;
		}

		public void SetMonth(String m) {
			this.month = m;
		}

		public int GetDate() {
			return this.date;
		}

		public void SetDate(int d) {
			this.date = d;
		}

		public int GetNumGuests() {
			return this.numGuests;
		}

		public void SetNumGuests(int g) {
			this.numGuests = g;
		}

		public static void main(String[] args) {

		}

	}
}
