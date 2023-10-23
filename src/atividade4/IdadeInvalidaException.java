package atividade4;

public class IdadeInvalidaException extends RuntimeException { // unchecked

  public IdadeInvalidaException(String mensagem) {
    super(mensagem);
  }

}
