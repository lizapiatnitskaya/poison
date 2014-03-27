package poison;

public class Hospital {
	public static void main(String[] args)
	{
		Eatery eat = new Eatery();
		Poison [] man = new Poison [15];
		for( int i=0;i<man.length;i++){
			man[i] = eat.getPoison(5);
		}
		for( int i=0;i<man.length;i++)
		{
				man[i].effect();
		}
		}
	}


