public class GuessGame {
	Player p1;
	Player p3;
	public void startGame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
		int targetNumber=(int)(Math.random()*10);
		System.out.println("I'm thinking of a number between 0-9...");
		while(true){
			System.out.println("Number to guess is " + targetNumber);
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			guessp2=p2.number;
			guessp3=p3.number;
			
			System.out.println("Player one guessed " + guessp1);
			System.out.println("Player two guessed " + guessp2);
			System.out.println("Player three guessed " + guessp3);
			
			if(guessp1==targetNumber) p1isRight=true;
			if(guessp2==targetNumber) p2isRight=true;
			if(guessp3==targetNumber) p3isRight=true;
			
			if(p1isRight||p2isRight||p3isRight){
				System.out.println("we have got a winner!");
				break;}
				esle{System.out.println("Players need to try agan!");
					}
					}
					}
					}
			
			
			
			
			
			
			
			
			
			
			
		
			