package com.codeTestBFI.CodeTestBFI.codeTestF;

import com.codeTestBFI.CodeTestBFI.codeTestF.Entity.City;
import com.fasterxml.jackson.databind.ObjectMapper;
import info.debatty.java.stringsimilarity.Levenshtein;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCityService {
    public HashMap<String, List<String>> findCity(String cityName) throws IOException {
        HashMap<String, List<String>> result = new HashMap<>();
        List<String> lists = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        Levenshtein lv = new Levenshtein();

        City[] cities = objectMapper.readValue(new URL("https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json"), City[].class);
        for (City c : cities){
            String text = "Code Country = ID ";
            if (c.getCountry().equals("ID") && lv.distance(c.getName(), cityName)<=5){
                lists.add(c.getName());
            }
            result.put(text,lists);
        }
        return result;

    }

}