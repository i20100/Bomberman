package Objekte;

public class Human extends Mammal{
	public static void main(String[] args) {
		Horse p0 = new Horse();
		Horse p1 = new Horse();
		p1.move();
		p0.setLeg(4);
		p1.getLeg();
		p1.setLeg(6);

		System.out.println(p1.equals(p0.getLeg()));
		System.out.println(p0.getLeg() == p1.getLeg());

	}



}
