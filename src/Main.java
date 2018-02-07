public class Main {

     public static void main(String[] args) {
        Person person = new Person();

        person.name= "Danilo";
        person.idade = 35;
        person.cpf = "12312312312";

        person.say();

        System.out.println(Person.walk());

        System.out.println("Hello World! " + person.name);
    }
}
