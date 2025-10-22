

public class area {

	double length;
	double breath;

	public void setDim(double l, double b) {

		length=l;
		breath=b;
		}

		public geatArea(){

			return length * breath;
			}



			public static void main(String [] arg) {

				area obj= new area();

				obj.length=100;
				obj.breath=122;

				obj.setDim();

				obj.getArea();
	}

	}