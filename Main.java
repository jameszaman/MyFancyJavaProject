class Fancy {
  public static Fancy fanciness;
  Fancy() {

  }
  public static Fancy getFancy() {
    if(fanciness == null) {
      System.out.println("Fancy Created");
      fanciness = new Fancy();
    }
    return fanciness;
  }
  void print(String str) {
    str = str.replace(" ", " 🎇 ");
    str = "🎇 " + str + " 🎇";
    System.out.println(str);
  }
}

public class Main {
  public static void main(String[] args) {
    String str = "This is a fancy project.";
    Fancy fancy = Fancy.getFancy();
    
    fancy.print(str);  
  }
}