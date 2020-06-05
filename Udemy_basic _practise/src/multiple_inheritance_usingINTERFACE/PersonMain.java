package multiple_inheritance_usingINTERFACE;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vegan vegan=new Vegan();
		AntiKandalasan anti= new AntiKandalasan();
		
		
//	vegan.IsAliveMethod();
	vegan.LiveLifeMethod();
	vegan.foodpref();
	
//	anti.IsAliveMethod();
	anti.LiveLifeMethod();
	anti.foodpref();
	}

}
