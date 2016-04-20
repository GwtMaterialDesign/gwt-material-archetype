package ${package}.client.place;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Randy May
 *         Date: 2016-04-11
 */
public class NameTokensTest {
    @Test
    public void testHomeToken() {
        assertEquals("/", NameTokens.HOME);
    }
}