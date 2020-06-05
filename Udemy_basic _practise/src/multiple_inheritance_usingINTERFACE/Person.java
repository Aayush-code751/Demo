package multiple_inheritance_usingINTERFACE;

public abstract class Person implements IsAlive,LiveLife
{

	@Override
	public void LiveLifeMethod() {
		// TODO Auto-generated method stub
		System.out.println("interface LiveLife");
	}

	@Override
	public void IsAliveMethod() {
		// TODO Auto-generated method stub
		System.out.println("interface IsAlive");
	}
	
	public abstract void foodpref();

}
