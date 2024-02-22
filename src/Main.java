public class Main {
    public static void main(String[] args) {

        //Class Person instances
        Person Person1 = new Person("Miles", 19, "Male");
        Person Person2 = new Person("Alexandra", 31, "Female");
        Person Person3 = new Person("Cinthia", 28, "Female");
        Person Person4 = new Person("Scott", 44, "Male");

        //Person instances print attributes
        Person1.print();
        Person2.print();
        Person3.print();
        Person4.print();

        //Book 1 instance
        Book book1 = new Book();

        //Book 1 print attributes
        book1.print();

        //Book 2 instance & attributes modified
        Book book2 = new Book();
        book2.title = "The Ar of War";
        book2.author = "Sun Tzu";
        book2.year = 1772;

        //Book 2 print
        book2.print();

        //Book 3 instance & attributes modified
        Book book3 = new Book();
        book3.title = "Don Juan Matus";
        book3.author = "Carlos Castañeda";
        book3.year = 1968;

        //Book 3 print
        book3.print();

        //Book 4 instance & attributes modified
        Book book4 = new Book();
        book4.title = "Das Parfum, die Geschichte eines Mörders";
        book4.author = "Patrick Süskind";
        book4.year = 1985;

        //Book 4 print
        book4.print();

        //Class Rectangle instances
        Rectangle rect1 = new Rectangle(11,22);
        Rectangle rect2 = new Rectangle(4,8);
        Rectangle rect3 = new Rectangle(35,63);

        //Rectangle 1 print
        System.out.println("");
        System.out.println("Area of the rectangle: " + rect1.getArea());
        System.out.println("Perimeter of the rectangle: " + rect1.getPerimeter());

        //Rectangle 2 print
        System.out.println("");
        System.out.println("Area of the rectangle: " + rect2.getArea());
        System.out.println("Perimeter of the rectangle: " + rect2.getPerimeter());

        //Rectangle 3 print
        System.out.println("");
        System.out.println("Area of the rectangle: " + rect3.getArea());
        System.out.println("Perimeter of the rectangle: " + rect3.getPerimeter());

    }
}