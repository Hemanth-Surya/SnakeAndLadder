
public class Snake
{
	public static void main(String[] args)
	{
		 Random random = new Random();
        	 int WIN_POINT = 100;

         public static void StartGame()
         {
            	int playerPosition = 0, dicevalue = 0;
            	int playerDiceCount = 0;
		int currentPlayer = -1;
		int player2Position = 0, player2DiceCount = 0;
                while (true)
               {
                dicevalue = RollDie();
		if(currentPlayer == -1)
		{
                playerDiceCount++;
                playerPosition = CalculatePlayerPosition(playerPosition, dicevalue);
                System.out.println("Player position" + playerPosition);
                if (playerPosition == WIN_POINT)
                {
                    System.out.println("player 1 wins");
                    System.out.println("Die rolled " + playerDiceCount + " times to win");
                    break;
                }
            }
	       else
		{
			player2DiceCount++;
			player2Position = CalculatePlayerPosition(player2Position, dicevalue);
			System.println("Player2position" + player2Position);
                    	if (player2Position == WIN_POINT)
                    {
                        System.out.println("player 2 Wins");
                        System.out.println("Die rolled " + player2DiceCount+ " times to win");
                        break;
		    }
		}
		currentPlayer = -(currentPlayer);
		}
	

		public void DiceCountAndPosition(int dicecount, int playerPosition,int dicevalue,int number)
	        {
        	    	dicecount++;
            		playerPosition = CalculatePlayerPosition(playerPosition, dicevalue);
            		System.out.println("player" + number + " position" + playerPosition);
            		if (playerPosition == WIN_POINT)
            		{
                		System.out.println("Player" + number + "wins");
                		System.out.println("Die rolled" + dicecount + "times to wins");
                
            		}
        	}

		int Dice = 6;
		int roll = (int) (Math.random() * Dice) + 1;
		System.out.println(roll);

        	public int CalculatePlayerPosition(int player,int diceValue)
        	{
            		int checkPlay;
            		checkPlay = random.Next(3);
            		switch (checkPlay)
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
            		if (player < 0)
            		{
                		player = 0;
            		}
            		if (player > WIN_POINT)
            		{
                		player = player - diceValue;
            		}
            		return player;
        		}
	}
}
