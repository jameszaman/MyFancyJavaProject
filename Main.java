class Fancy {
  void print(String str) {
    str = str.replace(" ", " 🎇 ");
    str = "🎇 " + str + " 🎇";
    System.out.println(str);
  }
}

public class Main {
  public static void main(String[] args) {
    Fancy fancy = new Fancy();
    fancy.print("This is a fancy project.");
  }
}
