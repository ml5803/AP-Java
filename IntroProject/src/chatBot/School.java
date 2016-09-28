package chatBot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolResponse;
	public void talk() {
		// TODO Auto-generated method stub
		inSchoolLoop = true;
		while (inSchoolLoop){
			MichaelMain.print("Tell me about school.");
			schoolResponse = MichaelMain.getInput();
			MichaelMain.print("That's my favorite part about school too.");
			if (schoolResponse.indexOf("stop") >= 0){
				inSchoolLoop=false;
				MichaelMain.talkForever();
			}
		}
	}
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
