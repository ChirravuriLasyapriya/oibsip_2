import java.util.*;
import java.lang.*;
 class NumberGuessing
 {
   public static void main(String args[])
   { 
    int number,correct=0, guess, attempt=0,chances=5;
    Scanner sc=new Scanner(System.in);
    String game;
    System.out.println("Let's start the game\n");
    game="y";
    while(game=="y")
    {
       Random rand=new Random();
    number=rand.nextInt(100);
      //guess=sc.nextInt();
      if(number>50)
      System.out.println("CLUE:The system generated number is greater than 50\n");
      else
      System.out.println("CLUE:The system generated number is less than 50\n");
      while(chances!=0)
      {
      System. out. println("\nGuess a number");
      guess=sc.nextInt();
       if(guess==number&&chances!=0)
      {
        System. out. println(" \nYour guess is Correct\n");
        correct++;
        int score=(6-chances)*10;
      System. out. println("\nYour score is "+score+" out of 100 in  "+(attempt+1)+" attempts");
        break;
      }
      else if(guess>number&&chances!=0)
      {
        System. out. println("\nYour guess is wrong.Enter a smaller number \n");
        
      }
     else  if(guess<number&&chances!=0)
      {
        System. out. println("\nYour guess is wrong.Enter a greater number\n ");
        System. out. println("");
        
      }
      chances--;
      if(chances!=0)
      {
        
      System. out. println(" You have "+chances+" more chances");
      }
      else
      {
        System. out. println("Out of chances ");
      }
      }
      attempt++;
    
    
    System. out. println("\nThe system generated number was"+ number+"\n");
   
    System. out. println("\nYou have won "+correct+ " games out of"+attempt+" games\n");
    
    
    
       System. out. println("\nDo you want to play another game(yes/no)?\n");
      
      game =sc.next();
    }
  }
}
