public class App {
    public static void main(String[] args) throws Exception {

        char [][] Array4x3 = {{'1','1','1'},{'1','1','1'},{'1','1','1'},{'1', '1', '1'}};

        
    System.out.println("PATTERN 1");
                // Outer loop
                for (int row = 0; row < Array4x3.length; row++) {
                   
        System.out.println(" ");
                    // inner loop
                    for (int column = 0; column < 3; column++) {
                        
                            if (row %2 == 0){
                         System.out.print(Array4x3[row][column]);
                            } 

                        }
                    }
    
                            //Pattern 2
                        System.out.println("");
                        System.out.println("Pattern 2");
                        
                          
                        
                        for (int row = 0; row < Array4x3.length; row++) {
                            System.out.println("");
                        
                        for (int column = 0; column < 3; column++) {
                           
                        
                            if (row %2 == 0) {
                                System.out.print(Array4x3[row][column]);
                            } else if(row %2 != 0) {
                                System.out.print("z");
                            }
                            }
                        }
                        // PATTERN 3

        System.out.println("");

        System.out.println("3. PATTERN 3");



        // outer loop

        for (int row = 0; row < Array4x3.length; row++) {

            System.out.println("");



            // inner loop

            for (int column = 0; column < 3; column++) {



                if (row == 0 || row == 3){

                    System.out.print(Array4x3[row][column]);

                }

                    if (row == 1 || row == 2){

                        if (column == 0 || column == 2){

                            System.out.print(" ");

                        } else {

                            System.out.print(Array4x3[row][column]);

                        }
                    }
                }
            }
        
                    
                        // PATTERN 4
                        System.out.println("");
                        System.out.println("PATTERN 4");

                        for (int row = 0; row < Array4x3.length; row++) {

                            System.out.println(" ");
                
                            System.out.print("row " + row + ": ");
                
                        for (int column = 0; column < 3; column++) {
                
                            if(row == 0 || row == 2)
                
                            if (column == 0 || column == 2) {
                               System.out.print("  ");

                              }else{
                                System.out.print(Array4x3[row][column] + " ");
                              }
    
                            if (row == 1 || row ==3)
                
                            System.out.print(Array4x3[row][column] + " ");
                            }
                            
                            }
                        
                    
                
        // // Get the SUM
        System.out.println("");
        System.out.println("6. get the total sum");


        int Sum = 0;

        int [][] sumArray = {{1, 1, 1},{1, 1, 1},{1, 1, 1}, {1, 1, 1}};

         // outer loop
         for (int row = 0; row < Array4x3.length; row++) {

            // inner loop
            for (int column = 0; column < 3; column++) {

                Sum += sumArray[row][column];
            }

        }

        System.out.println("The total sum is: " + Sum);
        
    
    }

}

            

       