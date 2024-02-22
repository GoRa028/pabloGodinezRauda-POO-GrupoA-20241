public class Person {
    String name;
    int age;
    String genre;

    public Person(String n, int a, String g) {
        name = n;
        age = a;
        genre = g;
    }

    public void print() {
        System.out.println("");
        System.out.println("Name: " + name + "\n" +
                            "Age: " + age + "\n" +
                            "Genre: " + genre);
    }
}
