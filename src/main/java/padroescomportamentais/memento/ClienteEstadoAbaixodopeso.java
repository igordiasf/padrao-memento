package padroescomportamentais.memento;

public class ClienteEstadoAbaixodopeso implements ClienteEstado {

    private ClienteEstadoAbaixodopeso() {};
    private static ClienteEstadoAbaixodopeso instance = new ClienteEstadoAbaixodopeso();
    public static ClienteEstadoAbaixodopeso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Abaixodopeso";
    }

}
