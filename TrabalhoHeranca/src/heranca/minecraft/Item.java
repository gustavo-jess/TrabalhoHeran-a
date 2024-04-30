package heranca.minecraft;

public class Item {
    protected String nome;
    protected String meterial;
    protected String durabilidade;

    public String getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(String durabilidade) {
        this.durabilidade = durabilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMeterial() {
        return meterial;
    }

    public void setMeterial(String meterial) {
        this.meterial = meterial;
    }

}
