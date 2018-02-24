public class Person implements IPerson{
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

    public String malk(String msg){
        return msg;
    }

    public String malk(String msg, Integer number) {
        return msg + "" + number.toString();
    }

    @Override
    public void metodo1() {

    }

    @Override
    public void metodo2() {

    }

    @Override
    public void metodo3() {

    }

}
