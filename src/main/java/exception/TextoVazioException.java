package exception;

public class TextoVazioException extends IllegalAccessError {

  public TextoVazioException(String message) {
    super(message);
  }
}
