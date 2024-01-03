import javax.swing.JOptionPane;

public class HomeWorkFour {
 
    public static void disply(int[] numbers) {
        display(numbers[3]);
    }
    public static void getNumber() {
        String input;
        int[] numbers = new numbers[3];
        for (int x = 0; x < 3; x++) {
 
            input[x] = JOptionPane.showInputDialog("Enter your numbers");
            number = Integer.parseInt(input);
        }
    }
    public static void main(String[] args) {
 
        getNumbers();
        display();
    }
}