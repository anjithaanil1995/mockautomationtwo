package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bases.Ebase;
import pages.EPage;

public class Etestcases extends Ebase {
	EPage ePage;

    @BeforeClass
    public void setup() throws Exception {
        initializeDriver();
        ePage = new EPage(driver);
    }

    @Test
    public void testSearch() {
        ePage.searchProduct("Apple Watches", "Electronics");
    }

    @AfterClass
    public void tearDownTest() {
        tearDown();
    }
}
