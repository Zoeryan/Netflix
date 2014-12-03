import java.util.ArrayList;

public class Sports extends NonFiction{
	public Sports()
	{
		showName = "Broncos Game";
		mainCharacter = "Peyton Manning";
		viewerRating = 5;
		channel = "ESPN";
		
		
	}
	@Override
	public void isAired()
	{
		System.out.println(showName + " is still being shown on TV.");
	}


}
