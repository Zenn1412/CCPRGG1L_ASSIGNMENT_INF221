public class App {
    public static void main(String[] args) throws Exception {

        char [][] Array4x3 = {{'1','1','1'},{'1','1','1'},{'1','1','1'},{'1', '1', '1'}};

        
    
                // Outer loop
                for (int row = 0; row < Array4x3.length; row++) {
                    // if (row %2 == 0){
                    //     System.out.print(Array4x3[row]);
        System.out.println(" ");
                    // inner loop
                    for (int column = 0; column < 3; column++) {
                        
                            if (row %2 != 0){
                         System.out.print(Array4x3[row][column]);
                            }
                    }   
                }
            }
        }
    
            

       