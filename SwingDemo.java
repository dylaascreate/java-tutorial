import javax.swing.JOptionPane;
public class SwingDemo {
   public static void main(String[] args) {
      String[] sports = { "Football", "Cricket", "Squash", "Baseball", "Fencing", "Volleyball", "Basketball" };
      String res = (String) JOptionPane.showInputDialog(null, "Which sports you play the most?", "Sports",
         JOptionPane.PLAIN_MESSAGE, null, sports, sports[0]);
      switch (res) {
         case "Football":
            System.out.println("I Love Football");
         break;
         case "Cricket":
            System.out.println("I Love Cricket");
         break;
         case "Squash":
            System.out.println("I Love Squash");
         break;
         case "Baseball":
            System.out.println("I Love Baseball");
         break;
         case "Fencing":
            System.out.println("I Love Fencing");
         break;
         case "Volleyball":
            System.out.println("I Love Volleyball");
         break;
         case "Basketball":
            System.out.println("I Love Basketball");
         break;
      }
   }
}