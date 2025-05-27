import java.util.ArrayList;

public class Frota {
    ArrayList<Veiculo> veiculos = new ArrayList<>();

        public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }
    public void exibirFrota(){
        System.out.println("Exibindo veículos da frota:");
            for (Veiculo v: veiculos){
                v.exibirDetalhes();
                if (v instanceof Manutencao){ //VERIFICA A INTERFACE
                    ((Manutencao)v).realizarManutencao();
                }
            }
    }
}
