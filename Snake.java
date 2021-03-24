
public class Snake
{
	public static void main(String[] args)
	{
		int playerPosition = 0;
		int Dice = 6;
		int roll = (int) (Math.random() * Dice) + 1;
		System.out.println(roll);
	}

	public int calculateplayerPosition(int player, int diceValue)
	{
		int checkPlay = 3;
		int check =(int) (Math.random() * checkPlay);

		switch(check)
		{
			case 0:
			System.out.println("No play");
			break;

			case 1:
			System.out.println("ladder");
			player = player + diceValue;
			break;

			default:
			System.out.println("Snake");
			player = player - diceValue;
			break;
		}
		return player;
	}
}
