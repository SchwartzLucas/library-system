package br.com.library.Utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    public void deveSeConectarComBancoDeTeste() throws Exception {
        try  {
            Connection connection = Utils.getTestConnection();
            assertNotNull(connection, "Falha ao tentar se conectar no banco");
            assertTrue(connection.isValid(2));

            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}