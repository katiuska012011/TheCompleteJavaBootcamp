package challenge;

import java.util.Scanner;

public class TicTacToe {
     
    static Scanner scan = new Scanner(System.in);
     public static void main(String[] args) {
          
          char [][] board = {
               {'_','_','_'},
               {'_','_','_'},
               {'_','_','_'}
          };

          printBoard(board);

          for(int i = 0; i<9; i++){
               int [] spot;
               if(i%2 == 0){
                    System.out.println("Turn: X");
                    spot = askUser(board);
                    board[spot[0]][spot[1]] = 'X';
                    printBoard(board);

               }else{
                    System.out.println("Turn: O");
                    spot = askUser(board);
                    board[spot[0]][spot[1]] = 'O';
                    printBoard(board);               
               }
               int count = checkWin(board);
               if(count == 3){
                    System.out.println("X wins!");
                    break;
               }else if(count == -3){
                    System.out.println("O wins!");
                    break;
               }
          }


     }

     public static void printBoard(char [][] board){

          for(int i = 0; i<board.length; i++){
               System.out.print("\n \n");
               for(int j=0; j<board[i].length; j++){
                    System.out.print("\t"+board[i][j]+"");
               }
          }
          System.out.println("\n");

     }


     public static int [] askUser(char [][] board){

          int [] spot = new int [2];
          System.out.print("Pickup a row and column number: ");
          int row  = scan.nextInt(); 
          int column = scan.nextInt();

          while(board[row][column] != ('_')){
               System.out.print("Spot taken, please try again: ");
               row  = scan.nextInt(); 
               column = scan.nextInt();
          }
          spot[0]= row;
          spot[1] = column;
          return spot;
     }

     public static int checkWin(char [][] board){
          
          int count = 0;

          // Win with row
          for(int i = 0; i<board.length; i++){
               for(int j = 0; j<board[i].length; j++){
                    if(board[i][j] == 'X'){
                         count += 1;
                    }else if(board[i][j] == 'O'){
                         count += (-1); 
                    }
               }  
               if(count == 3 || count == -3){
                    return count;
               }else{
               count = 0;
               }
          }


          //Win the colums 

          for(int i =0; i<board.length; i++){
               if(board[i][0] == 'X'){
                    count+=1;
               }else if(board[i][0] == 'O'){
                    count += (-1);
               }
               if(count == 3 || count == -3){
                    return count;
               }
          }
          count = 0;

          //Win with left diagonal

          for(int i=0; i<board.length; i++){
               if(board[i][i] == 'X'){
                    count+=1;
               }else if(board[i][i] == 'O'){
                    count += (-1);
               }
               if(count == 3 || count == -3){
                    return count;
               }
          }
          count = 0;

          //Win with the right diagonal

          for(int i = 0; i<3; i++){
               int index = 2-i;

               if(board[index][i] == 'X'){
                    count +=1;
               }else if(board[index][i] == 'O'){
                    count += (-1);
               }
               if(count == 3 || count == -3){
                    return count;
               }
          }

          return count;
     }
     
}
