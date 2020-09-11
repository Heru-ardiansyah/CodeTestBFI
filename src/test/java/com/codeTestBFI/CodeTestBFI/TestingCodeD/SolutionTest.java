package com.codeTestBFI.CodeTestBFI.TestingCodeD;

import com.codeTestBFI.CodeTestBFI.codeTestD.Solution;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SolutionTest {
    @Test
    void testSolution() {
        Solution s = new Solution();
        Map<Integer[], Integer> tests = new HashMap<Integer[], Integer>();

        tests.put(new Integer[] { 3, 2, -5, 0 }, -1);
        tests.put(new Integer[] { 10, -1, -2, -3 }, -4);
        tests.put(new Integer[] { 100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5 }, -6);
        tests.put(new Integer[] { 0, 2, 4, -1, -3, -4 }, -2);
        tests.put(new Integer[] { 3, 2, -5, -1, -2, 0 }, -3);

        tests.forEach((problem, solution) -> assertTrue(s.solution(problem) == solution));
    }
}
