package chatBot;

public class Hello implements Topic{

	private boolean inHelloLoop;
	private String helloResponse;
	
	private int helloCount;
	
	public Hello(){
		helloCount = 0;
	}
	
	// responses are constants - never changes, always exists
	
	public void talk(){
		inHelloLoop = true;
		while (inHelloLoop){
			helloCount++;
			printResponse();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				MichaelMain.talkForever();
			}
		}
	}
	
	public void printResponse(){
		int responseIndex = 0;
		if(helloCount <5){
			responseIndex=(int)(Math.random()*calmResponses.length);
			MichaelMain.print(calmResponses[responseIndex]);
		}
		else{
			responseIndex=(int)(Math.random()*angryResponses.length);
			MichaelMain.print(calmResponses[responseIndex]);
		}
	}
	
	private static String[] calmResponses = {"We've already said our hellos, Remember?", "Yes, hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"Okay, seriously. This has to stop.","You are beginning to annoy me. We already SAID HELLO!"};
	
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
