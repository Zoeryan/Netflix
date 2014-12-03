
public class Reality extends NonFiction{
	public Reality()
	{
		showName = "Jersey Shore";
		mainCharacter = "Snooki";
		viewerRating = 0;
		channel = "MTV";
		
		
	}
	
	@Override
	public void isAired()
	{
		System.out.println(showName + " is not shown on TV anymore.");
	}

}
