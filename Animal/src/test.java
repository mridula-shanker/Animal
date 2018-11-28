import java.util.ArrayList;

public class test 
{

	public static void main(String[] args) 
	{
		ArrayList<Animal> myDogs = new ArrayList<Animal>();
		myDogs.add(new Dog('f'));
		myDogs.add(new Bird('f'));
		myDogs.add(new Pitbull('m'));
		for (Animal dog : myDogs)
		{
			System.out.println(dog.speak());
			if(dog instanceof Dog)
				System.out.println("dog");
			else
				System.out.println("bird");
		}
	

	}

}
