package cl.aperturefixtures.clientes_service.exception;

public class ClienteYaExisteException extends RuntimeException {
    public ClienteYaExisteException (String mensaje) {
        super(mensaje);
    }
}
