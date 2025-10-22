

public comany {

	public static class employ {

		String name;
		int year;
		double salary;
		String address;
		}

		public static void main(String [] arg) {

			employ firstEmploy= new employ();
			emmploy secondEmploy= new employ();

			employ thirdEmploy=new employ();

			firstEmploy.name="khan";
			firstEmploy.year="2023";
			firstEmploy.salary=20000;
			firstEmploy.address="abbottabad";

			seondEmploy.name="Malak";
			seondEmploy.year="2022";
			seondEmploy.salary=2000;
			secondEmploy.address="Karachi";

			thirdEmploy.name="sardar";
			thirdEmploy.year="2021";
			thirdEmploy.salary=2000000;
			thirdEmploy.address="islamabad";

			System.out.println("Name" +"\t" + "Year of Joining" + "\t" + "salary" + "\t" + "address");
			System.out.println("___________________________________________________________________");

			System.out.println(firstEmploy.name + "\t" + firstEmply.year +"\t" + firstEmploy.salary + "\t" + firstEmploy.address);
			System.out.println(secondEmploy.name + "\t" + secondEmply.year +"\t" + secondEmploy.salary + "\t" + secondEmploy.address);
			System.out.println(thirdEmploy.name + "\t" + thirdEmply.year +"\t" + thirdEmploy.salary + "\t" + thirdEmploy.address);
			}
	}