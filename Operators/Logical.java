public class Logical {
    public static void main(String args[]){
       //and &&
        System.out.println((3>2) && (5>4));
        System.out.println((1>2) && (5>4));
        System.out.println((3>2) && (3>4));
        System.out.println((1>2) && (3>4));

        //or ||
        System.out.println((3>2) || (5>4));
        System.out.println((1>2) || (5>4));
        System.out.println((3>2) || (3>4));
        System.out.println((1>2) || (3>4));

        //not !
        System.out.println(3>2);
        System.out.println(!(3>2));
        System.out.println(1>2);
        System.out.println(!(1>2));


    }
}
