package one.digitalinnovation.gof.service.impl;

public class EnderecoNaoEncontradoException extends RuntimeException{
    public EnderecoNaoEncontradoException(String cep) {
        super("Endereçio não encontrado para o CEP: " + cep);
    }
}
