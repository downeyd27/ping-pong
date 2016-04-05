import java.io.Console;

public class PingPong {
  // Ask user for a number to print up to
  // If the number is divisible by 3 display "Ping" instead of the number
  // If the number is divisible by 5 display "Pong" instad of the number
  // If the number is divisible by 3 and 5 display "Ping Pong" instead of the
  // number
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What number would you like to print up to?");
    Integer userInputedNumber = Integer.parseInt(console.readLine());
    System.out.println("Alright! Let's count up to " + userInputedNumber + "!");
    pingPong(userInputedNumber);
  }

  public static void pingPong(Integer userInputedNumber) {
    for (Integer count = 1 ; count <= userInputedNumber ; count++) {
      if (count % 15 == 0) {
        System.out.println("Ping Pong");
      } else if (count % 3 == 0) {
        System.out.println("Ping");
      } else if (count % 5 == 0) {
        System.out.println("Pong");
      } else {
        System.out.println(String.valueOf(count));
      }
    }
  }
}
