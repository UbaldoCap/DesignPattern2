public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder("Mario", "Rossi");
        personBuilder.setAge(5);
        Person person1 = personBuilder.build();
        System.out.println(person1);
    }
}
