package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveArmazenarEstados() {
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoPesonormal.getInstance());
        cliente.setEstado(ClienteEstadoAbaixodopeso.getInstance());
        assertEquals(2, cliente.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoPesonormal.getInstance());
        cliente.setEstado(ClienteEstadoAbaixodopeso.getInstance());
        cliente.restauraEstado(0);
        assertEquals(ClienteEstadoPesonormal.getInstance(), cliente.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoPesonormal.getInstance());
        cliente.setEstado(ClienteEstadoSobrepeso.getInstance());
        cliente.setEstado(ClienteEstadoPesonormal.getInstance());
        cliente.setEstado(ClienteEstadoAbaixodopeso.getInstance());
        cliente.restauraEstado(2);
        assertEquals(ClienteEstadoPesonormal.getInstance(), cliente.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Cliente cliente = new Cliente();
            cliente.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}