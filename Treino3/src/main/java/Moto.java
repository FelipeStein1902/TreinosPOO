public class Moto extends Veiculo implements Manutencao{
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Veículo: Moto");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção na Moto...");
    }
}
