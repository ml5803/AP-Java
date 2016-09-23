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

}
