// class Array{
//     public static void main(String[] args) {
//         int[] arr = {2,4,5,6,7,8};
//         System.out.print(arr[0] + " ");
//         System.out.print(arr[1] + " ");
//         System.out.print(arr[2] + " ");
//         System.out.print(arr[3] + " ");
//         System.out.print(arr[4] + " ");
//         // System.out.print(arr[5]);
//         arr[5] = 90;
//         System.out.println(arr[5]);
//     }
// }

// class Array {
//     public static void main(String[] args) {
//         int[] arr = new int[5];
//         arr[0] = 5;
//         arr[1] = 10;
//         arr[2] = 20;
//         arr[3] = 30;
//         arr[4] = 40;
//         System.out.println(arr[3]);
//     }
// }

// class Array{
//     public static void main(String[] args) {
//         int [] x = {2, 4, 6, 7, 9};
//         for(int i =0; i<=4; i++){
//             System.out.println(x[i]);
//         }
//     }
// }


// import java.util.*;
// class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size : ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0 ; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i = 0; i <n ; i++){
//             System.out.print(arr[i] + " ");

//         }
//     }
// }

// import java.util.*;
// class Array {
//     public static void main(String[] args) {
//         int[] x = new int[5];
//         for(int i = 0; i<5; i++){
//             System.out.println(x[i]);
            
//         }
//     }
// }


// import java.util.*;
// class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int x = sc.nextInt();
//         int[] num = new int[x];
//         System.out.print("Enter Array Element : ");
//         for(int i = 0; i<x; i++){
//             num[i] = sc.nextInt();
//         }
//         for(int i = 0; i<x; i++){
//             System.out.print(num[i] /2 + " ");
//             break;
//         }
//         for(int i = 0; i<x; i++){
//             System.out.print(num[i] +2 + " ");   
//         }
//         for(int i = 0; i<x; i++){
//             System.out.print(num[i] *2 + " "); 
//         }
//         for(int i = 0; i<x; i++){
//              System.out.print(num[i] -2 + " "); 
//         }
//          for(int i = 0; i<x; i++){
//             System.out.print(num[i]%2 + " ");
//         }
//     }
// }


// class Array{
//     public static void main(String[] args) {
//         int[] marks = { 50 , 55 , 80 , 30 , 34 , 90 , 20 , 95 , 25 };
//         for(int i = 0; i<marks.length; i++){
//             if(marks[i]<=35){
//                 System.out.print(marks[i] + " ");
//             }
//         }
//     }
// }


class Array{
    public static void main(String[] args) {
        int s = 0;
        int[] sum = {2 , 4 , 5 ,6};
        for(int i = 0; i<sum.length; i++){
            s +=sum[i];
        }
        System.out.println(s);
    }
}