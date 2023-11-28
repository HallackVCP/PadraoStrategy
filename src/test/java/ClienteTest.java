import org.example.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteTest {
    Cliente cliente;


    @BeforeEach
    void setup(){
        cliente = new Cliente("cliente@email.com", "32-91234-5678", "Aa1234");
    }


    @Test
    void deveValidarSenhaValida(){
        assertTrue(cliente.validarSenha());
    }

    @Test
    void deveValidarTelefoneValido(){
        assertTrue(cliente.validarTelefone());
    }
    @Test
    void deveValidarEmailValido(){
        assertTrue(cliente.validarEmail());
    }

    @Test
    void deveValidarSenhaInvalida(){
        cliente.setSenha("aa1234");
        assertFalse(cliente.validarSenha());
    }

    @Test
    void deveValidarTelefoneInvalido(){
        cliente.setTelefone("32912345678");
        assertFalse(cliente.validarTelefone());
    }
    @Test
    void deveValidarEmailInvalido(){
        cliente.setEmail("clienteemail.com");
        assertFalse(cliente.validarEmail());
    }
}
