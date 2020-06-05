package collections;
import java.util.*;

public class Comparator_and_sets {

	public static void main(String[] args) 
	{
		Comparator<Data<Integer,String>> comp = new Comparator<Data<Integer,String>>()
		{

			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {

//				compare with integer (key)
				if(o1.getKey()>o2.getKey())
					return 1;
				else if(o1.getKey()<o2.getKey())
					return -1;
				else return 0;
				
//				compare with string(value)
//				if(o1.getValue().compareTo(o2.getValue())>0)
//					return 1;
//				else if(o1.getValue().compareTo(o2.getValue())<0)
//					return -1;
//				else return 0;
			}
	
	
		};
		Set<Data<Integer,String>> set= new TreeSet<Data<Integer,String>>(comp);
		
		set.add(new Data<Integer,String>(1,"one"));
		set.add(new Data<Integer,String>(9,"nine"));

		set.add(new Data<Integer,String>(8,"eight"));
		set.add(new Data<Integer,String>(5,"five"));

		set.add(new Data<Integer,String>(21,"twentyone"));
		set.add(new Data<Integer,String>(132,"one thirty two"));
		
	
		

		for(Data<Integer,String> dat: set)
		{
			System.out.println(dat);
			
		}
	System.out.println("-------------------------------");	
System.out.println("five".compareTo("eight"));

	}

}

class Data<K,V>
{
	private K key;
	private V value;
public Data(K key,V value)
{
	this.key=key;
	this.value=value;
	
}
public K getKey() {
	return key;
}
public V getValue() {
	return value;
}
@Override
public String toString() {
	return "[key=" + key + ", value=" + value + "]";
}



}