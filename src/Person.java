public class Person {
    private String name;
    private Integer idade;
    private String cpf;

    public Person() {

    }

    public Person(String name, Integer age){
        this.name = name;
        this.idade = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //    public void say() {
//        System.out.println("I'm saying something...");
//    }
//
//    public static String walk() {
//        return "I'm walking...";
//    }

}
