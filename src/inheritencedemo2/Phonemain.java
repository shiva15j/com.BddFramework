package inheritencedemo2;

public class Phonemain {

	public static void main(String[] args) {

		Phone pp = new Phone();

		pp.calling();
		pp.camera();
		pp.alarm();

		System.out.println(" ");

		SmartPhone sm = new SmartPhone();
		
		sm.ram();
		sm.processor();
//		sm.calling();
//		sm.camera();
//		sm.alarm();

	}

}
