public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World !");
//        String hobby = "I love learn";
//        System.out.println(hobby);
        int age = 25;
        if(age>60){
            System.out.println("老年");
        } else if(age>40){
            System.out.println("中年");
        } else if(age>18) {
            System.out.println("青年");
        } else {
            System.out.println("童年");
        }
    }
}