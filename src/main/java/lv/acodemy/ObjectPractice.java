package lv.acodemy;

public class ObjectPractice {

    public static void main(String[] args) {

        Animal barsik = new Animal();
        String name = barsik.getName();

        System.out.println(name);
        System.out.println(barsik);
//2
        barsik.setName("Barsik");
        System.out.println(barsik);
//3
        barsik.setAge(5);
        System.out.println(barsik);
        System.out.println("My cat is:" + barsik.getAge() + " Years old.");
//4

        barsik.setWeight(17.60);
        barsik.setColor("gray");
        barsik.setSize(Sizes.S);

        System.out.println(barsik);

        Animal ballzik = new Animal(13, "Ballzik");
        //My name is Ballzik. I am 13 years old.

        System.out.printf("My name is %s. I am %d old.\n", ballzik.getName(), ballzik.getAge());
        System.out.println("My name is " + ballzik.getName() + ". am " + ballzik.getAge() + " years old ");
// create all arguments cons
        Animal zhorik = new Animal(5, 10.11,"grey",  "zhorik", true);
        System.out.println(zhorik);





    }
}
