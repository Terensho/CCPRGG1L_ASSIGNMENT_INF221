public class App {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
        // PATTERN 1
        for (int rows= 0; rows < mdArray.length; rows++){

                System.out.println("");
                for (int column = 0; column < 3; column++){
                    if (rows %2 !=0){
                    System.out.print(mdArray[rows][column]);

                }
            }               
        }
        // PATTERN 2
        for (int rows= 0; rows <mdArray.length; rows++){

            System.out.println("");

            for (int column = 0; column <3; column++){

                if (rows %2 ==0){

                System.out.print(mdArray[rows][column]);

                }

            else if(rows %2 != 0){

                System.out.print("x");

            }

            }

        }
        // PATTERN 3
        for (int rows= 0; rows <mdArray.length; rows++){

            System.out.println("");

            for (int column = 0; column <3; column++){

                if (rows == 0 || rows == 3){

                    System.out.print(mdArray[rows][column]);
                }
                    if (rows == 1 || rows == 2){
                       
                        if (column == 0 || column == 2){

                            System.out.print(" ");

                        } else {

                            System.out.print(mdArray[rows][column]);
                        }

                    }
        
                }
          }
        // PATTERN 4
        for (int rows= 0; rows <mdArray.length; rows++){

            System.out.println("");

            for (int column = 0; column <3; column++){

                if (rows == 1 || rows == 3){

                    System.out.print(mdArray[rows][column]);
                }
                    if (rows == 0 || rows == 2){
                       
                        if (column == 0 || column == 2){

                            System.out.print(" ");

                        } else {

                            System.out.print(mdArray[rows][column]);
                        }

                    }
        
                }
          }
        // PATTERN 5
        int [][] two  = {{1,1,1},{1,1,1},{1,1,1}, {1, 1, 1}};



        int sum=0;
  
  for (int rows= 0; rows <4; rows++){
  
              System.out.println("");
  
              for (int column = 0; column <3; column++){
  
                   sum += two[rows][column];        
  
  }
  
      }
  
      System.out.println("THE SUM IS: " + sum);
                
    } 
 } 
