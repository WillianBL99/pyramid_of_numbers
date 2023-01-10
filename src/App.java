import java.util.Scanner;

public class App {

  public static String appName = "Pyramid Of Numbers";

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("### %s ###\n", appName);
    System.out.print("Digite o tamanho da pirâmide: ");

    int n = 0;

    try {
      n = scanner.nextInt();
      showPyramid(n);
    } catch (Exception e) {
      System.err.printf("%s: %s%n", e, e.getMessage());
    }
  }

  public static void showPyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.printf("%2d", i);
      }
      System.out.println();
    }
  }
}