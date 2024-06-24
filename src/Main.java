import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int e;
        int d;
        int r;

        e = input.nextInt();
        d = input.nextInt();

        if(e > d){
            r = e + d;
        }
        else {
            r = 2*(d - e);
        }

        System.out.println(r);
    }
}