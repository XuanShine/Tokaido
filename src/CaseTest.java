import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuan on 11/11/15.
 */
public class CaseTest {

    @Test
    public void testGetNom() throws Exception {
        Case testCase = new Case("Depart");
        assertEquals(testCase.getNom(), "Depart");
    }

    @Test
    public void testGetContenu() throws Exception {
        Case testCase = new Case("Depart");
        assertEquals(testCase.getContenu(), null);
        IJoueur testJoueur = new Robot("testNom");
        testCase.setContenu(testJoueur);
        assertEquals(testCase.getContenu(), testJoueur);
    }

    @Test
    public void testSetContenu() throws Exception {
        Case testCase = new Case("Depart");
        IJoueur testJoueur = new Robot("testNom");
        testCase.setContenu(testJoueur);
        assertNotNull(testCase.getContenu());
        testCase.setContenu(null);
        assertNull(testCase.getContenu());
    }
}