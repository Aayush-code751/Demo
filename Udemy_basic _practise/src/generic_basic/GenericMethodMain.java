package generic_basic;
import java.util.*;
public class GenericMethodMain {

	public static void main(String[] args) 
	{
		
		List<String> list= new ArrayList<>();
		list.add("hi");
		list.add("hsdsd");
		list.add("hsddssdsd");

		Integer[] array= {1,2,3};

		Data data =new Data();
		
		data.printList(list);
		data.printArray(array);
	}

}
class Data
{
	

public <E> void printList(List<E> list)
{
	for(E element: list)
	{
		
		System.out.println(element);
	}
}

public <E> void printArray(E[] array)
{
	for(E element: array)
	{
		
		System.out.println(element);
	}
}
}