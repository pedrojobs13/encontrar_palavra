import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PosicaoPalavraService {
  private final Map<Integer, String> stringMap = new HashMap<>();
  private final EncontraPosicao encontrarPosicao;

  public PosicaoPalavraService(EncontraPosicao encontrarPosicao) {
    this.encontrarPosicao = encontrarPosicao;
  }

  public void adicionar(String palavra) {
    if (posicaoNaoEncontrada(palavra) == false) {
      stringMap.put(encontrarPosicao.StringProcurada(palavra), palavra);
    }
  }

  public void mostrarTabela() {
    if (stringMap.isEmpty()) {
      throw new IllegalArgumentException("Não foi adicionado nenhuma palavra");
    }
    stringMap.forEach(
        (posicao, palavra) -> {
          System.out.println(posicao + ": " + palavra);
        });
  }

  public Map<Integer, String> getTabela() {
    return Collections.unmodifiableMap(stringMap);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PosicaoPalavraService that = (PosicaoPalavraService) o;
    return Objects.equals(stringMap, that.stringMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringMap);
  }

  private boolean posicaoNaoEncontrada(String palavra) {
    return encontrarPosicao.StringProcurada(palavra) == -1;
  }
}
