package Utils;

import br.com.library.Utils.Utils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void deveSeConectarComBancoDeTeste() throws Exception {
        Utils utils = new Utils();

        try (Connection connection = Utils.getTestConnection()) {
            assertNotNull(connection);
            assertTrue(connection.isValid(2));
        }
    }
}