import exception.TextoVazioException;
import java.util.Objects;

public class EncontrarPosicao implements EncontraPosicao {

  private int posicao;
  private String texto;

  public EncontrarPosicao(String texto) {
    if (texto.isEmpty()) {
      throw new TextoVazioException("A String não pode ser vazia");
    }
    this.texto = texto;
  }

  @Override
  public int StringProcurada(String palavra) {
    if (palavra.isEmpty()) {
      throw new TextoVazioException("A String não pode ser vazia");
    }
    return texto.indexOf(palavra);
  }
}
