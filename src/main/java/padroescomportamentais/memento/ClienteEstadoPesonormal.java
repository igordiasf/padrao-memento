package padroescomportamentais.memento;


public class ClienteEstadoPesonormal implements ClienteEstado {

    private ClienteEstadoPesonormal() {};
    private static ClienteEstadoPesonormal instance = new ClienteEstadoPesonormal();
    public static ClienteEstadoPesonormal getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pesonormal";
    }

}
