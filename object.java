public class object {
   public  static class Student{
    String name ;
    int roll ;
    double percentage ;
    }
    public static class car{
        String name ;
        String type;
        String color;
        int price;
    }
    public static void main(String[] args) {


        car c = new car();
        c.name = "B M W";
        c.type = "BMW M2";
        c.price = 7200000;
        System.out.println("NAME : " + c.name);
        System.out.println("MODEL : " + c.type);
        System.out.println("PRICE : " + c.price);


        Student  sc = new Student();
        sc.name = "Rounit kumar";
        sc.roll = 26;
        sc.percentage = 75.75;
        System.out.println(sc.name);
        System.out.println(sc.roll);
        System.out.println(sc.percentage);
    }
}
 