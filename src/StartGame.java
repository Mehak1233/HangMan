import java.util.Scanner;
public class StartGame extends CarMobileWords {
	    
        Scanner sc = new Scanner(System.in);
		public StartGame(){
			// TODO Auto-generated constructor stub
			char[] ch;
			char c;
			boolean levelClear = true;
			for( int i =0; i<3;i++)                  // loop for level and word at that level
			{     
				    int chances = 10;
			        ch = getCar()[i].toCharArray();         // convert word into array     // taken i becoz position of word in array will equal to no. of level 
			        for(int j = 0;j<getCar()[i].length();j++)    // convert  array word into dashes
				{      
				     ch[j] = '_';
					System.out.print(ch[j]+"\t");      
				}	
				     System.out.println("");
				  //  System.out.println(getCar()[i]);
					System.out.println("you will get 10 chances to guess the right name ");
					System.out.println("level "+(i+1)+" : enter a letter");
					Boolean letterFound = false;                   // firstly intialize letter found = false
					int postionfilled = 0;                         // if all psition is fillled,move to next lvel
				while(chances!=0 && postionfilled<getCar()[i].length())              // loop of each level,to compare input char with word at that level till chances 0
				{                 
						c = sc.next().charAt(0);
						for(int m=0;m<ch.length;m++)
						{
							if(c==ch[m])                   // if letter is already in name
							{
								System.out.println(" this is alredy written in name.Enter another letter");
								c = sc.next().charAt(0);
							}
						}
					for(int k=0;k<getCar()[i].length();k++)    // loop for checking input letter with each letter at name
					{
						if(c==getCar()[i].charAt(k))
						{
							ch[k] = c;
							letterFound = true;
							postionfilled++;
						}
						  System.out.print(ch[k]+"\t");	  
						  			
				    }
					    System.out.println(""); // to print statement in next line
					    
					if(letterFound == true )    // if letter if found in any position 
					{
						if(postionfilled<getCar()[i].length())        // in case of last letter entered and it is correct and position is filled so it will not print msg 
						{
						System.out.println("congrats, level "+(i+1)+" : enter another letter");
						}
						else
  						{
  							System.out.println("===============================================================================================");
  							System.out.println("");
  						}
					}
					else                                    // letter don't find in any position
					{
						System.out.println("sorry, "+c+" is not in this name");
						chances--;
						System.out.println("your only  "+chances+" chances left.");
						HangmanGraph hg = new HangmanGraph(chances);
						  if(chances!=0)                      // at last chance 0, it dont display this msg
						    {
						     System.out.println("level "+(i+1)+" : try another letter");
						    }
					}  
					      letterFound = false;	     // for every new character letterfound will become false
					}
					     
					     if(chances == 0)
						    {
			                   System.out.println("sorry, you lose");
			                   levelClear = false;
			                   break;
						    }
					     levelClear = true;           // at start of each level give true to levelclear
				}	
					if( levelClear)           //this is essential, in case at level 1 ,2 it comes out of loop dont print this msg
		            {
				   System.out.println("congrates, you won");
		            }  
				}	
			          
			}
			       



			
		

