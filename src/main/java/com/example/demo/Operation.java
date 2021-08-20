package com.example.demo;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Operation {
	
	@PostMapping("/add")
	public Result postAdd(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam1() + addRequest.getParam2();
		System.out.println("tested");
		Result result = new Result();
		result.setSum(sum);
		System.out.println(addRequest.getParam1());
		System.out.println(addRequest.getParam2());
		System.out.println(sum);
		
	    return result;
	}
	@PostMapping("/add1")
	public Result postAdd1(@RequestBody AddRequest addRequest) {
		int sum = addRequest.getParam3() + addRequest.getParam4();
		System.out.println("tested");
		Result result = new Result();
		result.setSum(sum);
		//System.out.println(addRequest.getParam3());
	    return result;
	}
	
	

}
