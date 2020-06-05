package generic_basic;

public class GenericMain {

	public static void main(String[] args) 
	{
		
		GenericClass<String> gt=new GenericClass<String>("hello world");
		
	System.out.println(gt.getData());
		

	}

}


class GenericClass<T>
{
	T data;
	
	GenericClass(T d)
	{
		this.data=d;
		
	}
	public T getData()
	{
		return data;
	}
	
	
} 



