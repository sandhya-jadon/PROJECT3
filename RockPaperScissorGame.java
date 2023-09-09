import java.util.*;
class RockPaperScissorGame{
  public static void main(String[] args){
    Scanner s1 = new Scanner(System.in);
	System.out.println("you will get 5 chances to play");
	int i = 1;
	int user_score = 0;
	int computer_score = 0;
	while(i<=5){
	  System.out.println("choose 0 for Rock , choose 1 for Paper , choose 2 for Scissor");
	  int user_choice = s1.nextInt();
	  Random rand = new Random();
	  int computer_choice = rand.nextInt(3);
	  System.out.println("computer_choice is " + computer_choice);
	  if(computer_choice==user_choice){
		  System.out.println("game tie");
	  } 
	  else if(computer_choice==0 && user_choice==1 ||computer_choice==1 && user_choice==2 ||computer_choice==2 && user_choice==0){
	    System.out.println("user won");
		user_score = user_score+1;
	  }
	  else{
	    System.out.println("computer won");
		computer_score = computer_score+1;
	  }
	  i=i+1;
	}
	System.out.println("user_score is " + user_score);
	System.out.println("computer_score is " + computer_score);
 }
}


	