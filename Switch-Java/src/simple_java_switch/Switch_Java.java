package simple_java_switch;

public class Switch_Java {

	public static void main(String[] args) {

		
		String User = "Director";
		
		switch (User) {
		
		case "Tester":
			
			System.out.println("I'm the Tester");
			
			break;
		case "Designer":
			
			System.out.println("I'm the Designer");
			
			break;
		case "Director":
	
			System.out.println("I'm the Director");
	
			break;
			
		case "Actor/Actress":
			
			System.out.println("I'm the Actor/Actress");
	
			break;

		default:
			break;
		}

	}

}
