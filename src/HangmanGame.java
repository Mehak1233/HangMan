import java.util.Scanner;
public class HangmanGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
          System.out.println("Welcome to Hangman game. Please choose one category. ");
          System.out.println("1. Car brands");
          System.out.println("2. Mobile brands ");
          System.out.println("3. Exit");
          int Category = sc.nextInt();
          int num = 0;
          while(num != -1)
          {
             switch(Category)
             {    
                  case 1:
                	  StartGame s1 = new StartGame();
                	  num = -1;
                	  break;
                  case 2 :
                	  StartGameWithMobileWords s2 = new StartGameWithMobileWords();
                	  num = -1;
                	  break;
                  case 3 :
                          System.out.println("you exit the game");
                          num = -1;
                          return;
                   default :
                	   System.out.println("invalid number.Please enter number from 1 to 3");
                       Category = sc.nextInt(); 
             } 
          }   
	}               
	}


