import java.util.Arrays;
import java.util.LinkedList;

public class test {

  public static void main (String[] args) {
    int[] a = new int[2];
    a[0] = 1;
    a[1] = 2;
    Arrays.stream(a)
        .forEach(System.out::println);

    System.out.println("====================");

    int[][] b = new int[2][2];
    b[0][0] = 1;
    b[0][1] = 2;
    b[1][0] = 3;
    b[1][1] = 4;
    Arrays.stream(b)
        .forEach(x -> Arrays.stream(x)
            .forEach(System.out::println));

    System.out.println("====================");

    int[][][] c = new int[2][2][2];
    c[0][0][0] = 1;
    c[0][0][1] = 2;
    c[0][1][0] = 3;
    c[0][1][1] = 4;
    c[1][0][0] = 5;
    c[1][0][1] = 6;
    c[1][1][0] = 7;
    c[1][1][1] = 8;
    Arrays.stream(c)
        .forEach(x -> Arrays.stream(x)
            .forEach(y -> Arrays.stream(y)
                .forEach(System.out::println)));

    LinkedList<Integer> d;
  }
}
