package com.codeTestBFI.CodeTestBFI.TestingCodeF;

import com.codeTestBFI.CodeTestBFI.codeTestF.FindCityService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FIndCityTest {

    @Test
    void findCityTest()  {
        FindCityService findCityService = new FindCityService();
        List<String> test = new ArrayList<String>();
        test.add("Jakarta");
        try {
            assertEquals(test.size(),findCityService.findCity("zogjakarta").size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
