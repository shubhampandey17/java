public class final_modifiers {
    int x = 10;
    double PI = 3.14;
  
    public static void main(String[] args) {
      final_modifiers myObj = new final_modifiers();
      myObj.x = 50; // will generate an error
      myObj.PI = 25; // will generate an error
      System.out.println(myObj.x); 
    }
  }
  