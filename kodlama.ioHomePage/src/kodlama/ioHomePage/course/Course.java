package kodlama.ioHomePage.course;

public class Course {

	
		private String name;
		private double price;
		
		
		public Course() {
			super();
		}
		public Course(String name, double price) {
			super();
			this.name = name;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		

	}


