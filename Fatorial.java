import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int factorial = 1;

    for(int i = 1; i <= n; i++){

      factorial *= i;
    }
    System.out.println(factorial);
    }
 
}
