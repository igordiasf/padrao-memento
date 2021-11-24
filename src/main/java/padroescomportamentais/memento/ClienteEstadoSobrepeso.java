package padroescomportamentais.memento;


public class ClienteEstadoSobrepeso implements ClienteEstado {

    private ClienteEstadoSobrepeso() {};
    private static ClienteEstadoSobrepeso instance = new ClienteEstadoSobrepeso();
    public static ClienteEstadoSobrepeso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Sobrepeso";
    }

}
