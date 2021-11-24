package padroescomportamentais.memento;


public class ClienteEstadoObesidade implements ClienteEstado {

    private ClienteEstadoObesidade() {};
    private static ClienteEstadoObesidade instance = new ClienteEstadoObesidade();
    public static ClienteEstadoObesidade getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Obesidade";
    }

}
