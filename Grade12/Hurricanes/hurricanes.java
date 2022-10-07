import java.util.Scanner;

public class hurricanes {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int answer;

    System.out.println("Enter the hurricanes category 1-5");
    answer = input.nextInt();

    switch (answer) {
      case 1:
        System.out.println("The wind speed is 74-95mph or 64-82kt or 119-153km/h!🌀");
        break;

      case 2:
        System.out.println("The wind speed is 96-110mph or 83-95kt or 154-177km/h!🌀");
        break;

      case 3:
        System.out.println("The wind speed is 111-130mph or 96-113kt or 178-209km/h!🌀");
        break;

      case 4:
        System.out.println("The wind speed is 131-155mph or 114-135kt or 178-209km/h!🌀🤕");
        break;

      case 5:
        System.out.println("The wind speed is greater than 115 mph or 135kt or 249km/h!🌀🤕⛔");
        break;

    }
    input.close();
  }
}

// Made by MBlais with ♥