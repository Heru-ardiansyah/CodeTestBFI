package com.codeTestBFI.CodeTestBFI.TestingCodeE;

import com.codeTestBFI.CodeTestBFI.codeTestE.Mask;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class MaskTest {

    @Test
    void testMask() {
        Mask m = new Mask();
        Map<String, String> tests = new HashMap<String, String>();

        tests.put("Tony Stark", "T**y S***k");
        tests.put("Peter Parker", "P***r P****r");
        tests.put("Bumblebee", "B*******e");
        tests.put("El Taurino", "El T*****o");
        tests.put("John Doe", "J**n D*e");
        tests.put("Crazy Rich Asian", "C***y R**h A***n");
        tests.put("Stephen Strange", "S*****n S*****e");
        tests.put("A Kid With Supernatural Abilities", "A K*d W**h S**********l A*******s");

        tests.forEach((original, masked) -> masked.equals(m.mask(original)));
    }



}
