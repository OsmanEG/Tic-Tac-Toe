/*******************************************************
  * Osman El-Ghotmi                                    *
  * My Game of Tic-Tac-Toe                             *
  * ****************************************************/

import java.util.Random;
class FinalTicTacToe
{
  public static void printGrid(char grid [][])
  {
    System.out.println(grid[0][0] + "|" + grid[0][1] + "|" + grid[0][2]); 
    System.out.println("-----");
    System.out.println(grid[1][0] + "|" + grid[1][1] + "|" + grid[1][2]);
    System.out.println("-----");
    System.out.println(grid[2][0] + "|" + grid[2][1] + "|" + grid[2][2]);
    System.out.println("__________________________________");
    
  }
  
  public static void printOptions()
  {
    System.out.println(7 + "|" + 8 + "|" + 9); 
    System.out.println("-----");
    System.out.println(4 + "|" + 5 + "|" + 6);
    System.out.println("-----");
    System.out.println(1 + "|" + 2 + "|" + 3);
    System.out.println();
  }
  public static void main(String[]args)
  {
    mainMenu();
  }
  public static void mainMenu()
  {
    System.out.println("Welcome to Osmans Game of Tic-Tac-Toe!!!");
    System.out.println("Be sure to use the number key pad as your Tic Tac Toe board to select your option");
    System.out.println("And use the numbers to select the boxes respectively to the ones that will be shown");
    System.out.println("Press (1) for Two Player Tic Tac Toe");
    System.out.println("Press (2) for Easy Mode, Tic Tac Toe");
    System.out.println("Press (3) for Medium Mode, Tic Tac Toe");
    System.out.println("Press (4) for Hard Mode, Tic Tac Toe");
    int userPick = In.getInt();
    
    switch(userPick)
    {
      case 1:
      {
        twoPlayer();
      }
      break;
      case 2:
      {
        easyMode();
      }
      break;
      case 3:
      {
        mediumMode();
      }
      break;
      case 4:
      {
        hardMode();
      }
      break;
      default:
      {
        System.out.println("Thanks For Playing!");
      }
      break;
    }
  }
  
  public static void easyMode()
  {
    boolean isPlayer1Turn = true;
    boolean isGameRunning = true;
    System.out.println("Welcome to Easy Tic Tac Toe");
    System.out.println("You will be represented as X");
    System.out.println("The Computer will be represented as O");
    //End of Information for the Player.
    
    char[][]grid = new char [3][3];
    grid[0][0] = ' ';
    grid[0][1] = ' ';
    grid[0][2] = ' ';
    grid[1][0] = ' ';
    grid[1][1] = ' ';
    grid[1][2] = ' ';
    grid[2][0] = ' ';
    grid[2][1] = ' ';
    grid[2][2] = ' ';
    //End of the Tic Tac Toe Grid Creation
    
    printOptions();
    printGrid(grid);
    
    while(isGameRunning == true)
    {
      
      do
      {
        System.out.println("Player Ones Turn");
        int userInput = In.getInt();
        
        switch (userInput)
        {
          case 7:
            if(grid[0][0] == ' ')
          {
            grid[0][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 8:
            if(grid[0][1] == ' ')
          {
            grid[0][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 9:
            if(grid[0][2] == ' ')
          {
            grid[0][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 4:
            if(grid[1][0] == ' ')
          {
            grid[1][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 5:
            if(grid[1][1] == ' ')
          {
            grid[1][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 6:
            if(grid[1][2] == ' ')
          {
            grid[1][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 1:
            if(grid[2][0] == ' ')
          {
            grid[2][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 2:
            if(grid[2][1] == ' ')
          {
            grid[2][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 3:
            if(grid[2][2] == ' ')
          {
            grid[2][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          default:
            System.out.println("INVALID INPUT, PLEASE TRY AGAIN!!!");
            isPlayer1Turn = true;
            break;
            
        }
      }while(isPlayer1Turn == true);
      
      printOptions();
      printGrid(grid);
      
      if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("You Win!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ')
      {
        System.out.println("It's a Tie!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }
      
      if(isGameRunning == true)
      {
        do
        {
          Random rand = new Random(); 
          rand.nextInt(10);
          int computerInput = rand.nextInt(10) + 1;
          
          switch (computerInput)
          {
            case 7:
              if(grid[0][0] == ' ')
            {
              grid[0][0] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
              break;
              
            case 8:
              if(grid[0][1] == ' ')
            {
              grid[0][1] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;

              }
              break;
              
            case 9:
              if(grid[0][2] == ' ')
            {
              grid[0][2] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
              break;
              
            case 4:
              if(grid[1][0] == ' ')
            {
              grid[1][0] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
              break;
              
            case 5:
              if(grid[1][1] == ' ')
            {
              grid[1][1] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
              break;
              
            case 6:
              if(grid[1][2] == ' ')
          {
              grid[1][2] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
              break;
              
          case 1:
            if(grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
            else
            {
              isPlayer1Turn = false;
            }
            break;
            
            case 2:
              if(grid[2][1] == ' ')
            {
              grid[2][1] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
              break;
              
            case 3:
              if(grid[2][2] == ' ')
          {
              grid[2][2] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
              }
            break;
            
            default:
              isPlayer1Turn = false;
              break;
              
          }
        }while(isPlayer1Turn == false);
        
      printOptions();
      printGrid(grid);
      
      if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
      {
        System.out.println("The Computer Wins!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }      
      }   
    }while(isGameRunning == true);
    mainMenu();
  }
  
  public static void twoPlayer()
  {
    boolean isPlayer1Turn = true;
    boolean isGameRunning = true;
    System.out.println("Welcome to 2 Player Tic Tac Toe");
    System.out.println("Player One will be represented as X");
    System.out.println("Player Two will be represented as O");
    //End of Information for the Player.
    
    char[][]grid = new char [3][3];
    grid[0][0] = ' ';
    grid[0][1] = ' ';
    grid[0][2] = ' ';
    grid[1][0] = ' ';
    grid[1][1] = ' ';
    grid[1][2] = ' ';
    grid[2][0] = ' ';
    grid[2][1] = ' ';
    grid[2][2] = ' ';
    //End of the Tic Tac Toe Grid Creation
    
    printOptions();
    printGrid(grid);
    
    while(isGameRunning == true)
    {
      
      do
      {
        System.out.println("Player Ones Turn");
        int userInput = In.getInt();
        
        switch (userInput)
        {
          case 7:
            if(grid[0][0] == ' ')
          {
            grid[0][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 8:
            if(grid[0][1] == ' ')
          {
            grid[0][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 9:
            if(grid[0][2] == ' ')
          {
            grid[0][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 4:
            if(grid[1][0] == ' ')
          {
            grid[1][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 5:
            if(grid[1][1] == ' ')
          {
            grid[1][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 6:
            if(grid[1][2] == ' ')
          {
            grid[1][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 1:
            if(grid[2][0] == ' ')
          {
            grid[2][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 2:
            if(grid[2][1] == ' ')
          {
            grid[2][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 3:
            if(grid[2][2] == ' ')
          {
            grid[2][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          default:
            System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            isPlayer1Turn = true;
            break;
            
        }
      }while(isPlayer1Turn == true);
      
      printOptions();
      printGrid(grid);
      
      if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ')
      {
        System.out.println("It's a Tie!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }
      
      if(isGameRunning == true)
      {
        do
        {
          System.out.println("Player Twos Turn");
          int userInput2 = In.getInt();
          
          switch (userInput2)
          {
            case 7:
              if(grid[0][0] == ' ')
            {
              grid[0][0] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
            case 8:
              if(grid[0][1] == ' ')
            {
              grid[0][1] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
            case 9:
              if(grid[0][2] == ' ')
            {
              grid[0][2] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
            case 4:
              if(grid[1][0] == ' ')
            {
              grid[1][0] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
            case 5:
              if(grid[1][1] == ' ')
            {
              grid[1][1] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
            case 6:
              if(grid[1][2] == ' ')
          {
              grid[1][2] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
          case 1:
            if(grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
            else
            {
              isPlayer1Turn = false;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
            case 2:
              if(grid[2][1] == ' ')
            {
              grid[2][1] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
              break;
              
            case 3:
              if(grid[2][2] == ' ')
          {
              grid[2][2] = 'O';
              isPlayer1Turn = true;
            }
              else
              {
                isPlayer1Turn = false;
                System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              }
            break;
            
            default:
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
              isPlayer1Turn = false;
              break;
              
          }
        }while(isPlayer1Turn == false);
        
      printOptions();
      printGrid(grid);
      
      if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
      {
        System.out.println("Player Two Wins!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }      
      }   
    }while(isGameRunning == true);
    mainMenu();
  }
  
  public static void mediumMode()
  {
    boolean isPlayer1Turn = true;
    boolean isGameRunning = true;
    System.out.println("Welcome Medium Tic Tac Toe");
    System.out.println("You will be represented as X");
    System.out.println("The Computer will be represented as O");
    //End of Information for the Player.
    
    char[][]grid = new char [3][3];
    grid[0][0] = ' ';
    grid[0][1] = ' ';
    grid[0][2] = ' ';
    grid[1][0] = ' ';
    grid[1][1] = ' ';
    grid[1][2] = ' ';
    grid[2][0] = ' ';
    grid[2][1] = ' ';
    grid[2][2] = ' ';
    //End of the Tic Tac Toe Grid Creation
    
    printOptions();
    printGrid(grid);
    
    while(isGameRunning == true)
    {
      
      do
      {
        System.out.println("Player Ones Turn");
        int userInput = In.getInt();
        
        switch (userInput)
        {
          case 7:
            if(grid[0][0] == ' ')
          {
            grid[0][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 8:
            if(grid[0][1] == ' ')
          {
            grid[0][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 9:
            if(grid[0][2] == ' ')
          {
            grid[0][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 4:
            if(grid[1][0] == ' ')
          {
            grid[1][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 5:
            if(grid[1][1] == ' ')
          {
            grid[1][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 6:
            if(grid[1][2] == ' ')
          {
            grid[1][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 1:
            if(grid[2][0] == ' ')
          {
            grid[2][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 2:
            if(grid[2][1] == ' ')
          {
            grid[2][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 3:
            if(grid[2][2] == ' ')
          {
            grid[2][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          default:
            System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            isPlayer1Turn = true;
            break;
            
        }
      }while(isPlayer1Turn == true);
      
      printOptions();
      printGrid(grid);
      
      if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ')
      {
        System.out.println("It's a Tie!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }
      
      if(isGameRunning == true)
      {
        do
        {
          if(grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[2][0] == 'X' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[1][0] == 'X' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'X' && grid[2][1] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[2][1] == 'X' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'X' && grid[2][2] == 'X' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][2] == 'X' && grid[2][2] == 'X' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[0][2] == 'X' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'X' && grid[0][2] == 'X' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'X' && grid[1][2] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[2][2] == 'X' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[0][2] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[0][2] == 'X' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[2][2] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[2][2] == 'X' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else
          {
            do
            {
              Random rand = new Random(); 
              rand.nextInt(10);
              int computerInput = rand.nextInt(10) + 1;
              
              switch (computerInput)
              {
                case 7:
                  if(grid[0][0] == ' ')
                {
                  grid[0][0] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 8:
                  if(grid[0][1] == ' ')
                {
                  grid[0][1] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                    
                  }
                  break;
                  
                case 9:
                  if(grid[0][2] == ' ')
                {
                  grid[0][2] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 4:
                  if(grid[1][0] == ' ')
                {
                  grid[1][0] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 5:
                  if(grid[1][1] == ' ')
                {
                  grid[1][1] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 6:
                  if(grid[1][2] == ' ')
                {
                  grid[1][2] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 1:
                  if(grid[2][0] == ' ')
                {
                  grid[2][0] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 2:
                  if(grid[2][1] == ' ')
                {
                  grid[2][1] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 3:
                  if(grid[2][2] == ' ')
                {
                  grid[2][2] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                default:
                  isPlayer1Turn = false;
                  break;
                  
              }
            }while(isPlayer1Turn == false);
          }
          
        }while(isPlayer1Turn == false);
        printOptions();
        printGrid(grid);
        
        if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
          }
        else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else
        {
          isGameRunning = true;
        }
      }
    }
    mainMenu();
  }
  
  public static void hardMode()
  {
    boolean isPlayer1Turn = true;
    boolean isGameRunning = true;
    System.out.println("Welcome Hard Tic Tac Toe");
    System.out.println("You will be represented as X");
    System.out.println("The Computer will be represented as O");
    //End of Information for the Player.
    
    char[][]grid = new char [3][3];
    grid[0][0] = ' ';
    grid[0][1] = ' ';
    grid[0][2] = ' ';
    grid[1][0] = ' ';
    grid[1][1] = ' ';
    grid[1][2] = ' ';
    grid[2][0] = ' ';
    grid[2][1] = ' ';
    grid[2][2] = ' ';
    //End of the Tic Tac Toe Grid Creation
    
    printOptions();
    printGrid(grid);
    
    while(isGameRunning == true)
    {
      
      do
      {
        System.out.println("Player Ones Turn");
        int userInput = In.getInt();
        
        switch (userInput)
        {
          case 7:
            if(grid[0][0] == ' ')
          {
            grid[0][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 8:
            if(grid[0][1] == ' ')
          {
            grid[0][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 9:
            if(grid[0][2] == ' ')
          {
            grid[0][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 4:
            if(grid[1][0] == ' ')
          {
            grid[1][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 5:
            if(grid[1][1] == ' ')
          {
            grid[1][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 6:
            if(grid[1][2] == ' ')
          {
            grid[1][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 1:
            if(grid[2][0] == ' ')
          {
            grid[2][0] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 2:
            if(grid[2][1] == ' ')
          {
            grid[2][1] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          case 3:
            if(grid[2][2] == ' ')
          {
            grid[2][2] = 'X';
            isPlayer1Turn = false;
          }
            else
            {
              isPlayer1Turn = true;
              System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            }
            break;
            
          default:
            System.out.println("YOU CAN'T GO THERE, TRY AGAIN.");
            isPlayer1Turn = true;
            break;
            
        }
      }while(isPlayer1Turn == true);
      
      printOptions();
      printGrid(grid);
      
      if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
      {
        System.out.println("Player One Wins!!!");
        isGameRunning = false;
      }
      else if(grid[0][0] != ' ' && grid[0][1] != ' ' && grid[0][2] != ' ' && grid[1][0] != ' ' && grid[1][1] != ' ' && grid[1][2] != ' ' && grid[2][0] != ' ' && grid[2][1] != ' ' && grid[2][2] != ' ')
      {
        System.out.println("It's a Tie!!!");
        isGameRunning = false;
      }
      else
      {
        isGameRunning = true;
      }
      
      if(isGameRunning == true)
      {
        do
        {
          if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[2][0] == 'O' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[1][0] == 'O' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[2][1] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[2][1] == 'O' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'O' && grid[2][2] == 'O' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][2] == 'O' && grid[2][2] == 'O' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[0][2] == 'O' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[0][2] == 'O' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[1][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[2][2] == 'O' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[0][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[0][2] == 'O' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[2][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[2][2] == 'O' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[1][0] == 'X' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[2][0] == 'X' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[1][0] == 'X' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'X' && grid[1][1] == 'X' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'X' && grid[2][1] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[2][1] == 'X' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'X' && grid[1][2] == 'X' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'X' && grid[2][2] == 'X' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][2] == 'X' && grid[2][2] == 'X' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[0][1] == 'X' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[0][2] == 'X' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'X' && grid[0][2] == 'X' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'X' && grid[1][1] == 'X' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'X' && grid[1][2] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[1][2] == 'X' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[2][1] == 'X' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[2][2] == 'X' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][1] == 'X' && grid[2][2] == 'X' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[1][1] == 'X' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'X' && grid[0][2] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[0][2] == 'X' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'X' && grid[2][2] == 'X' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'X' && grid[2][2] == 'X' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == ' ')
          {
            grid[0][1] ='O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == ' ')
          {
            grid[1][0] ='O';
            isPlayer1Turn = true;
          }
          else if(grid[2][1] == ' ')
          {
            grid[1][2] ='O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[2][1] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][1] == 'O' && grid[1][1] == 'O' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[1][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[2][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[2][0] == 'O' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[0][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[0][2] == 'O' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[0][2] == 'O' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[0][2] == 'O' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[1][2] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[1][2] == 'O' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][0] == 'O' && grid[2][2] == 'O' && grid[2][1] == ' ')
          {
            grid[2][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[2][1] == 'O' && grid[2][2] == 'O' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == ' ')
          {
            grid[2][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][0] == 'O' && grid[2][0] == 'O' && grid[1][0] == ' ')
          {
            grid[1][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][0] == 'O' && grid[2][0] == 'O' && grid[0][0] == ' ')
          {
            grid[0][0] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][1] == 'O' && grid[2][1] == 'O' && grid[1][1] == ' ')
          {
            grid[1][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][1] == 'O' && grid[2][1] == 'O' && grid[0][1] == ' ')
          {
            grid[0][1] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == ' ')
          {
            grid[2][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[0][2] == 'O' && grid[2][2] == 'O' && grid[1][2] == ' ')
          {
            grid[1][2] = 'O';
            isPlayer1Turn = true;
          }
          else if(grid[1][2] == 'O' && grid[2][2] == 'O' && grid[0][2] == ' ')
          {
            grid[0][2] = 'O';
            isPlayer1Turn = true;
          }
          else
          {
            do
            {
              Random rand = new Random(); 
              rand.nextInt(10);
              int computerInput = rand.nextInt(10) + 1;
              
              switch (computerInput)
              {
                case 7:
                  if(grid[0][0] == ' ')
                {
                  grid[0][0] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 8:
                  if(grid[0][1] == ' ')
                {
                  grid[0][1] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                    
                  }
                  break;
                  
                case 9:
                  if(grid[0][2] == ' ')
                {
                  grid[0][2] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 4:
                  if(grid[1][0] == ' ')
                {
                  grid[1][0] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 5:
                  if(grid[1][1] == ' ')
                {
                  grid[1][1] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 6:
                  if(grid[1][2] == ' ')
                {
                  grid[1][2] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 1:
                  if(grid[2][0] == ' ')
                {
                  grid[2][0] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 2:
                  if(grid[2][1] == ' ')
                {
                  grid[2][1] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                case 3:
                  if(grid[2][2] == ' ')
                {
                  grid[2][2] = 'O';
                  isPlayer1Turn = true;
                }
                  else
                  {
                    isPlayer1Turn = false;
                  }
                  break;
                  
                default:
                  isPlayer1Turn = false;
                  break;
                  
              }
            }while(isPlayer1Turn == false);
          }
        }while(isPlayer1Turn == false);
        printOptions();
        printGrid(grid);
        
        if(grid[0][0] == 'O' && grid[1][0] == 'O' && grid[2][0] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[0][1] == 'O' && grid[1][1] == 'O' && grid[2][1] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
          }
        else if(grid[0][2] == 'O' && grid[1][2] == 'O' && grid[2][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[0][0] == 'O' && grid[0][1] == 'O' && grid[0][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[1][0] == 'O' && grid[1][1] == 'O' && grid[1][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[2][0] == 'O' && grid[2][1] == 'O' && grid[2][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[2][0] == 'O' && grid[1][1] == 'O' && grid[0][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else if(grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
        {
          System.out.println("The Computer Wins!!!");
          isGameRunning = false;
        }
        else
        {
          isGameRunning = true;
        }
      }
    }
    mainMenu();
  }
}