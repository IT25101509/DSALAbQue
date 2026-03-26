package Labtest01;

import java.util.Scanner;
public class MainD {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Enter Queue size : ");
        int size = io.nextInt();
        Queue q1 = new Queue(size);
        Queue q2 = new Queue(size);

        System.out.print("Enter the values to Queue : ");
        while(!q1.isFull()){
            int element = io.nextInt();
            q1.enqueue(element);
        }
        int max = q1.dequeue();
        while (!q1.isEmpty()){
            int temp = q1.dequeue();
            if(temp > max){
                q2.enqueue(max);
                max = temp;
            }
            else {
                q2.enqueue(temp);
            }
        }
        q2.display();
        System.out.println("\nMaximum number :- " + max);


    }
}
