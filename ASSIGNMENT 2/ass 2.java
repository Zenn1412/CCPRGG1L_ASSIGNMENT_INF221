public class App {
    
  public static void main(String[] args) throws Exception {



      //FOR LOOP
      for (int firstnameCount = 5; firstnameCount != 0; firstnameCount--) {
          
          //BREAK
          if (firstnameCount == 4){
              System.out.println("Tama ka na");
              break;
          }
          System.out.println("Paulo");
          
      }
      
      //WHILE LOOP
      int surnameCount = 5;
      while (surnameCount != 0) {
          surnameCount--;
          
      //CONTINUE
          if (surnameCount == 3) {
              System.out.println("Una ka na pre");
              continue;
          }
      System.out.println("Agapito");
      
      }
      
      //DO WHILE LOOP
      int nicknameCount = 5;
       do {
          System.out.println("Pau");
          nicknameCount--;
      } while (nicknameCount != 0);
      

  }
}