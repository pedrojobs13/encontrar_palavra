import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {
  public static void main(String[] args) {
    String texto =
        String.format(
            "Caminhando pela praia ao entardecer, "
                + "senti a brisa suave acariciar meu rosto enquanto as "
                + "ondas dançavam ritmicamente na areia. "
                + "O sol se despedia lentamente, pintando o ceu com tons de laranja e rosa. "
                + "Ao longe, criancas riam e construiam castelos de areia, "
                + "enquanto casais apaixonados caminhavam de maos dadas a beira d'agua. "
                + "Neste momento, percebi a beleza efemera da vida e a "
                + "importancia de apreciar os pequenos momentos de felicidade que a vida nos oferece. "
                + "A praia, com sua serenidade e encanto, despedia "
                + "me lembrou que a simplicidade "
                + "muitas vezes e o que torna a vida mais rica e significativa.");

    EncontrarPosicao encontrarPosicao = new EncontrarPosicao(texto);
    PosicaoPalavraService posicaoPalavraService = new PosicaoPalavraService(encontrarPosicao);

    posicaoPalavraService.adicionar("Caminhando");
    posicaoPalavraService.adicionar("despedia");
    posicaoPalavraService.adicionar("areia");
    posicaoPalavraService.adicionar("vasco");

    posicaoPalavraService.mostrarTabela();
  }
}
