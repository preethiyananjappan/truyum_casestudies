import java.util.*;
public class Validate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String s1 = sc.nextLine();
    System.out.println("Enter the City Name");
    String s2 = sc.nextLine();
    boolean b = validateIDLocations(s1, s2);
    if (b == true)
      System.out.println("Valid");
    else
      System.out.println("Invalid");
  }
  public static boolean validateIDLocations(String s1, String s2) {
    String s3 = s2.substring(0, 3);
    boolean b = false;
    StringTokenizer t = new StringTokenizer(s1, "-");
    String s4 = t.nextToken();
    String s5 = t.nextToken();
    String s6 = t.nextToken();
    if (s4.equals("CBJ") && s5.equals(s3) && s6.matches("[0-9]{4}"))
      b = true;
    else {
      b = false;
    }
    return b;
  }
}