public class Caminhao extends Veiculo{
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Veículo: Caminhão");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }
}
