package authenticate.dhya.demo.demo;


import authenticate.dhya.demo.demo.controller.TestController;
import authenticate.dhya.demo.demo.services.impl.HelloServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
/*@ActiveProfiles("test")*/
public class TestTest {

    private static final ObjectMapper om = new ObjectMapper();


    @InjectMocks
    TestController testController;

    @Mock
    HelloServiceImpl helloService;

    @Test
    public void test() throws Exception {

        String test = testController.hello();

        System.out.println(test);
    }

}
