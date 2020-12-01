package uk.axone.devintest.junit;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitFunctionalTests {
    /*
    login
    blook
    check-in
    cancel
    logout
     */
    //get run only once at the beginning of the class (before any tests are run)
    @BeforeClass
    public static void loadTestData() {
        //clear old data
        //load new data for checkin and cancel
        System.out.println("Loading test data");
    }
        @Before
        public void login () {
            System.out.println("Logging into the application");
        }
            @Test
            public void A_book_a_ticket () {
                System.out.println("booking a ticket");
            }
            @Test
            public void B_checkin () {
                System.out.println("Checking in");
            }
            @Test
            public void C_cancel () {
                System.out.println("cancel the ticket");
            }
            @After
            public void logout () {
                System.out.println("Logging out out of the application");
            }

        @AfterClass
        public static void tearDown () {
            System.out.println("Tidying up...");
        }
    }

