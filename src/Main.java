public class Main {

     public static void main(String[] args) {
        Person person = new Person("Danilo", 34);

        System.out.println(person.malk("Este é Walkgin"));
        System.out.println(person.malk("Este é polimofismo walking.", 2));

        Cao cao = new Cao();

        cao.makeNoise  ();

        Gato gato =  new Gato();

        gato.makeNoise();

//        Person person2 = new Person();
//
//        person2.setName("Nícolas");
//        person2.setIdade(2);
//        person2.setCpf("32132132132");
//
//        person.setCpf("12312312312");

        Carro car = new Carro("azul", 220.00);
        Veiculo veiculo = new Veiculo();

        car.methodOverriding();
        veiculo.methodOverriding();
//        car.setCor("azul");
//        car.setTopSpeed(220.00);
//        car.setMarcha(5);

//        CarroComposition carroComposition = new CarroComposition();
//
//        carroComposition.getVeiculo().setCor("vermelho");
//        carroComposition.getVeiculo().setTopSpeed(220.00);
//        carroComposition.;

//        System.out.println("Hello World! " + person.getName() + " idade: " + person.getIdade());
//        System.out.println("Cor do carro: " + car.getCor() + " velocidade do carro: " + car.getTopSpeed() + " marchas: " + car.getMarcha());
//        System.out.println("Cor do carro: " + carroComposition.getVeiculo().getCor() + ". velocidade do carro: " + carroComposition.getVeiculo().getTopSpeed());
    }
}
