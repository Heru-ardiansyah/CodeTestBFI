package com.codeTestBFI.CodeTestBFI.codeTestD;

public class Solution {
    public int solution(Integer[] a) {
        int result = -1;
        int n = 0;
        do { if (a[n] == result) { result--;n = -1; }
            if (n == a.length-1) { break; }
            n++;
        } while (true);
        return result;
    }
}