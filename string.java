
// string introduction 

// class string{
//     public static void main(String[] args) {
//         String s = "Hey Bro i am practicing 100 days of code ";
//         System.out.println(s);

//     }
// }



// import java.util.*;
// class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the name : ");
//         String a =sc.next();
//         System.out.println("Your name is " + a);
//     }
// }


// import java.util.*;
// class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Introduce your self : ");
//         String a = sc.nextLine();
//         String b = sc.nextLine();
//         System.out.println("Hey its me " + a + " pursuing " + b);

//     }
// }

// import java. util.*;
// class string {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         String ch = sc.nextLine();
//         char p = ch.charAt(2);
//         System.out.println(p);


//     }

class string{
    public static void main(String[] args) {
        String a = "Rounit kashyap";
        String b = " And his life is best";
        System.out.println(a.startsWith("Rou"));
        System.out.println(a.startsWith("yap"));
        System.out.println(a.endsWith("Rou"));
        System.out.println(a.endsWith("yap"));
        System.out.println(a.contains("Rounit"));
        System.out.println(a.contains("jam"));
        System.out.println(a.concat(b));
        
    }
}