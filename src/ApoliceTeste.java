public class ApoliceTeste {
    public static void main(String[] args) {
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Mateus");
        apolice.setIdade(34);
        apolice.setValorPremio(5000f);

        apolice.imprimir();
    }

}