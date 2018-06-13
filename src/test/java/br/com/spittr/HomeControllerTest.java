package br.com.spittr;

import org.junit.Test;
import br.com.spittr.web.HomeController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.test.web.servlet.MockMvc;

/**
 * <b> Home Controller Test:</b> a test for Home Controller. Using the org.springframework.test abstract object "MockMvc"
 * was possible emulate and check a "GET" call that return a view from the controller.
 * <ul>
 *     <li><b>From <i>request.MockMvcRequestBuilder:</i></b> the "get" method to call the root address;</li>
 *     <li><b>From <i>result.MockMvcResultMatchers:</i></b> the "view().name() to return the expected view (home.jsp in this case)</li>
 *     <li><b>From <i>resul.MOckMvcBuilders: </i></b>standaloneSetup(controller).build() to create the controller </li>
 * </ul>
 * @author marcio.souza
 * @version 1.0
 * @since 12/06/2018
 */

public class HomeControllerTest {
    /**
     * A object from HomeController class is created to be used as mock. The Mocke is created using the MockMvcBuilder method
     * called standalone(variable with object).build.
     * After the mock creation, you can perform the test using the Mock valiable using the perfom and expected methods.
     * @throws Exception
     */
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));
    }
}
