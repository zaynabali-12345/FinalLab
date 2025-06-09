import java.util.Arrays;

public class App {
    public int[] swap(int a, int b){
        int temp =a;
         a= b;
        b=temp; 
          return new int[]{a,b};
    }
    //return new int[]{a,b};

    public static void main(String[] args) {
        App a = new App();
        int[] result = a.swap(5,10);
        System.out.println("Swapped Numbers:" +Arrays.toString(result));
    }
}
