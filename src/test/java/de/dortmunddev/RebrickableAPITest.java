package de.dortmunddev;

import com.fasterxml.jackson.core.JsonProcessingException;
import de.dortmunddev.rebrickable.dto.color.ColorDTO;
import de.dortmunddev.rebrickable.dto.color.ColorResponseDTO;
import de.dortmunddev.rebrickable.dto.element.ElementResponseDTO;
import de.dortmunddev.rebrickable.dto.minifig.InventoryResponseDTO;
import de.dortmunddev.rebrickable.dto.minifig.MinifigDTO;
import de.dortmunddev.rebrickable.dto.minifig.MinifigResponseDTO;
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

    public void testFetchSpecificElement() {

        RebrickableAPI api = new RebrickableAPI();

        try {
            ElementResponseDTO colorResponse = api.getElementService().fetchElementById("6409192");

            assertNotNull(colorResponse.getElementId());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void testFetchAllMinifigs() {

        assertTrue(true);

        RebrickableAPI api = new RebrickableAPI();

        try {
            MinifigResponseDTO minifigResponseDTO = api.getMinifigService().fetchAllMinifigs();

            assertTrue(minifigResponseDTO.getCount() > 0);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void testFetchSpecificMinifig() {

        RebrickableAPI api = new RebrickableAPI();

        try {
            MinifigDTO minifigDTO = api.getMinifigService().fetchMinifigBySetNum("fig-000001");

            assertNotNull(minifigDTO.getSetNum());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void testFetchSpecificMinifigParts() {

        RebrickableAPI api = new RebrickableAPI();

        try {
            InventoryResponseDTO inventoryResponseDTO = api.getMinifigService().fetchMinifigPartsBySetNum("fig-000001");

            assertTrue(inventoryResponseDTO.getCount() > 0);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
