/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ExhibitionTest {

    @Test
    public void EnsureSameObjectStandIsEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Exhibition exhibition = new Exhibition(20, null, "Exhibition", "Cool Exhibition", beginning, end, local);
        assertEquals(exhibition, exhibition);
    }

    @Test
    public void EnsureSameObjectsStandAreNotEqual() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Exhibition exhibition = new Exhibition(20, null, "Exhibition", "Cool Exhibition", beginning, end, local);
        Exhibition exhibition2 = new Exhibition(10, null, "Exhibition", "Cool Exhibition", beginning, end, local);
        assertNotEquals(exhibition, exhibition2);
    }

    @Test
    public void EnsureDifferentObjectsStandAreNotEqual() throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Exhibition exhibition = new Exhibition(20, null, "Exhibition", "Cool Exhibition", beginning, end, local);
        assertEquals(exhibition, exhibition);
        Object expectedResult = new Object();
        assertNotEquals(exhibition, expectedResult);
    }
}
