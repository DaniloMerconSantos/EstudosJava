public class Carro extends Veiculo{

    private Integer marcha;

    public Carro(){
        super();
    }

    public Carro(String cor, Double topSpeed){
        super(cor, topSpeed);
    }

    public Integer getMarcha() {
        return this.marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public void methodOverriding() {
        System.out.println("Este é um metodo da class filho orverriding.");
    }
}
