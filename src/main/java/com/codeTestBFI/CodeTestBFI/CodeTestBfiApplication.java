package com.codeTestBFI.CodeTestBFI;

import com.codeTestBFI.CodeTestBFI.codeTestD.Solution;
import com.codeTestBFI.CodeTestBFI.codeTestE.Mask;
import com.codeTestBFI.CodeTestBFI.codeTestF.FindCityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class CodeTestBfiApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CodeTestBfiApplication.class, args);

		// Code test D
		System.out.println("Code Test D");
		Solution solution = new Solution();
		System.out.println(solution.solution(new Integer[]{3, 2, -5, 0}));// result -1
		System.out.println(solution.solution(new Integer[]{10, -1, -2, -3}));// result -4
		System.out.println(solution.solution(new Integer[]{100, 200, 300, -100, -200, -3, -1, -2, -4, 1000, -5}));// result -6
		System.out.println(solution.solution(new Integer[]{0, 2, 4, -1, -3, -4}));// result -2
		System.out.println("=============================================\n");

		//Code test E
		System.out.println("Code Test E");
		Mask maskText = new Mask();
		System.out.println(maskText.mask("testing code"));
		System.out.println(maskText.mask("es teh"));
		System.out.println(maskText.mask("es buah naga"));
		System.out.println("==============================================\n");

		//Code Test F
		System.out.println("Code Test F");
		FindCityService findCityService = new FindCityService();
		System.out.println(findCityService.findCity("subaraya"));
		System.out.println(findCityService.findCity("Depok"));

	}

}
