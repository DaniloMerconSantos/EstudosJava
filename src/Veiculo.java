public class Veiculo {
    private String cor;
    private Double topSpeed;

    public Veiculo() {

    }

    public Veiculo(String cor, Double topSpeed) {
        this.cor = cor;
        this.topSpeed = topSpeed;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
