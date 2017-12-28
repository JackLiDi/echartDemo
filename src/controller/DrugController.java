package controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import pojo.Drug;
import service.DrugService;
import service.DrugServiceImpl;

@Controller
public class DrugController {
	
	@Autowired
	DrugService drugService;
		private Logger logger=Logger.getLogger(DrugController.class);
	
	@RequestMapping(value ="/ucexist.html")
	
	@ResponseBody
	public Object drugIsExit(){
		
		DrugService drugService =new DrugServiceImpl();
		List<Drug> listDrug= drugService.queryList();
		
		Gson gson =new Gson();
		String json = gson.toJson(listDrug);
		
		//String json = JSONArray.toJSONString(listDrug); 
		logger.info(json);
		System.out.println(json);
		return json;
		
	}
	
	
	
	
	@RequestMapping("/toline")
		public String toline(){

			return "line";
		
			
		}
		
}
