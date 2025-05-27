public class Carro extends Veiculo implements Manutencao{
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Veículo: Carro");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no Carro...");
    }
}
