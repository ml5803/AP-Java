package chatBot;

public class MichaelLike implements Topic {

	private boolean inLikeLoop;
	private String likeResponse;

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		MichaelMain.print("What are some things you like?");
		inLikeLoop = true;
		while (inLikeLoop){
			likeResponse = MichaelMain.getInput();
			int likePsn =  MichaelMain.findKeyword(likeResponse, "like", 0);
			if (likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn+5);
				MichaelMain.print("You are such an"+"interesting"+"person, because you like" + thingsLiked);
			}
			if (MichaelMain.findKeyword(thingsLiked, "school", 0) >=0)
				//finish here.
				else{
					MichaelMain.print("I don't understand you.");
				}
		}
	}

	@Override
	public boolean isTriggered(String userInput) {
		String[] triggers ={"school","class","teacher"};
		if (MichaelMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if (MichaelMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}
}
