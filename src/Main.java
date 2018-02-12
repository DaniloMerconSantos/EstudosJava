public class Main {

     public static void main(String[] args) {
        Person person = new Person("Danilo", 34);

        Person person2 = new Person();

        person2.setName("Nícolas");
        person2.setIdade(2);
        person2.setCpf("32132132132");

        person.setCpf("12312312312");

        Carro car = new Carro();

        car.setCor("azul");
        car.setTopSpeed(220.00);
        car.setMarcha(5);

        System.out.println("Hello World! " + person.getName() + " idade: " + person.getIdade());
        System.out.println("Cor do carro: " + car.getCor() + " velocidade do carro: " + car.getTopSpeed() + " marchas: " + car.getMarcha());
    }
}
