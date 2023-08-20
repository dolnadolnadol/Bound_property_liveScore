import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        LiveScoreBean source = new LiveScoreBean();

        Subscriber senior = new Subscriber();
        Subscriber marketing = new Subscriber();

        source.addPropertyChangeListener(senior);
        source.addPropertyChangeListener(marketing);

        Scanner sc = new Scanner(System.in);
        String scoreInput = "empty";
        while (!scoreInput.equals("")) {
            System.out.print("Enter Score: ");
            scoreInput = sc.nextLine();
            if (scoreInput.isEmpty()) {
                break;
            }
            source.setScoreLine(scoreInput);
        }
        System.out.println("Thanks for using.");
        sc.close();
    }
}