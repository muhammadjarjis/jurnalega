/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan jumlah bilangan Fibonaci");
        int n= sc.nextInt();
        long fib[] = new long[n];
        fib[0]=1;
        fib[1]=1;
        for(int i=2 ; i<n ; i++){
            fib[i] = fib[i-1] + fib[i-2];
            
        }
        
        for(int i=n-1 ; i>=n ; i--){
          System.out.print(fib[i] + " ");
        
    }
}
}
