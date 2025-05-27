public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Veiculo veiculo1 = new Carro("Toyota", "Corolla", 2020);
        Veiculo veiculo2 = new Moto("Honda", "CB500", 2019);
        Veiculo veiculo3 = new Caminhao("Volvo", "FH", 2018);

        frota.adicionarVeiculo(veiculo1);
        frota.adicionarVeiculo(veiculo2);
        frota.adicionarVeiculo(veiculo3);

        frota.exibirFrota();

    }
}
