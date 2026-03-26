package Labtest01;

import java.util.Scanner;
public class MainC {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Enter the Size Of the Queue : ");
        int size = io.nextInt();
        Queue q1 = new Queue(size);

        System.out.print("Enter the lements : ");

        for(int i = 0 ; i < size ; i++){
            int elements = io.nextInt();
            q1.enqueue(elements);
        }

        System.out.print("OUTPUT : ");
        while(!q1.isEmpty()){
            int temp = q1.dequeue();
            if(temp % 2 == 1){
                System.out.print(temp + " ");
            }
        }


    }
}
