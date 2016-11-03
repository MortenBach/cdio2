public class Fields 
{

	public Fields() 
	{

	}

	public int assignvalue(int x) 
	{

		switch (x) {

		case 2:
			return 250;

		case 3:
			return -100;

		case 4:
			return 100;

		case 5:
			return -20;

		case 6:
			return 180;

		case 7:
			return 0;

		case 8:
			return -70;

		case 9:
			return 60;

		case 10:
			return -80;

		case 11:
			return -50;

		case 12:
			return 650;

		}
		return x;

	}

	public void printstory(int x) 
	{

		switch (x) 
		{

		case 2:
			System.out.println("The elevator is broken. You climb the stairs to get to the top of the tower. +250 credit for determination.");
			break;

		case 3:
			System.out.println("Texting while driving has led you astray. Mind the Crater, you goof. -100 credit to get your car towed and fixed. It doesn't look good.");
			break;

		case 4:
			System.out.println("You've arrived at the Palace gates. The guards welcome you inside. +100 credit.");
			break;

		case 5:
			System.out.println("You're in the desert and it's getting dark. You forgot that it's mighty cold in the desert at night. -20 credit for lack of preparation");
			break;

		case 6:
			System.out.println("You manage to pass the barricades to a territory unknown. They call it The Walled City. +180 credit for being adventurous.");
			break;

		case 7:
			System.out.println("The Monastery seemed like such a cool place to go. Unfortunately the monks have kept you occupied with anecdotes of their upbringing instead of teaching you how to fight. At least their storytelling is alright, you suppose... +0 credit");
			break;
			
		case 8:
			System.out.println("You decide to enter the Black Cave. Being in the total dark, you realize that there's nothing to see. Complete waste of time that was. And it's moist... Oh so moist. -70 credit for having trouble finding your way out.");
			break;

		case 9:
			System.out.println("You stumble upon some huts in the mountains while mountainclimbing. You decide to scour the terrain and end up at a big house. Inside is a man who identifies himself as Raz'al Ghul. And so your training begins... +60 credit.");
			break;

		case 10:
			System.out.println("You decide to climb the wall not knowing what awaits on the other side. Bad idea, it's a place full of werewolves. You climbed The Werewall! -80 creditfor stupidity. Determined to get out of there real' quick, you're granted an extra turn.");
			break;

		case 11:
			System.out.println("You've fallen into a pit during a walk in the woods and no-one is there to help you get out. It starts raining. -50 credit.");
			break;

		case 12:
			System.out.println("You've discovered a goldmine. You're finally rich! +650 credit.");
			break;
		}
	}
}
