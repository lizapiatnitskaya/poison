package poison;
import java.util.Random;

public class Eatery {
	public Poison getPoison(int number){
		switch (new Random().nextInt(number))
		{
		case 0:
			return new Cyanide();
		case 1:
			return new Arsenic();
		case 2:
			return new Plumbum();
		case 3:
			return new Mercury();
			
			default:
				return new Healthy();
		
		}
	}


}
