package de.dortmunddev;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.dortmunddev.rebrickable.dto.color.ColorDTO;
import de.dortmunddev.rebrickable.dto.color.ColorResponseDTO;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class RebrickableAPITest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RebrickableAPITest(String testName) {

        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {

        return new TestSuite(RebrickableAPITest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testFetchAllColors() {

        assertTrue(true);

        RebrickableAPI api = new RebrickableAPI();

        try {
            ColorResponseDTO colorResponse = api.getColorService().fetchAllColors();

            assertTrue(colorResponse.getCount() > 0);
            assertFalse(colorResponse.getResults().isEmpty());

            colorResponse.getResults().forEach(color -> {
                assertNotNull(color.getName());
                assertNotNull(color.getRgb());
                assertNotNull(color.getExternalIds());
            });

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void testFetchSpecificColor() {

        RebrickableAPI api = new RebrickableAPI();

        try {
            ColorDTO colorResponse = api.getColorService().fetchColorById("-1");

            assertNotNull(colorResponse.getName());
            assertNotNull(colorResponse.getRgb());
            assertNotNull(colorResponse.getExternalIds());

            assertEquals("[Unknown]", colorResponse.getName());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
