
public class GameShow extends NonFiction
{
	public GameShow()
	{
		showName = "Wheel of Fortune";
		mainCharacter = "Pat Sajak";
		viewerRating = 3.5;
		channel = "Channel 7";
			
	}
	
	@Override
	public void isAired()
	{
		System.out.println(showName + " is still being shown on TV.");
	}

}
