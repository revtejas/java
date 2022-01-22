
public class revatureAi extends AlexaAi {
	String welcomeNote = "Hello, I'm revature";
	
	public void sayTime() {
	System.out.println("The time is 6:22 pm");
	}
	
	public void setReminder() {
		System.out.println("Your reminder is set");
	}

	public static void main(String[] args) {
		
		SiriAi s = new SiriAi();
		googleAi g = new googleAi();
		revatureAi r = new revatureAi();
		//s.playMusic();
		//s.playMusic("Thunder");
		//g.sayTime();
		r.sayTime();
		
		
		

	}

}
