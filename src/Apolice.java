public class Apolice {
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

       private String nomeSegurado;
       private int idade;
       private float valorPremio;


    public void imprimir(){
        System.out.println("Nome do segurado = " + nomeSegurado);
        System.out.println("Idade do segurado = " + idade);
        System.out.println("Valor do premio = " + valorPremio);
    }
}
