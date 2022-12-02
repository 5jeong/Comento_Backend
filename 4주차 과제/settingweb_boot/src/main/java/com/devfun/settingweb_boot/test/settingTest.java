package com.devfun.settingweb_boot.test;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
public class settingTest {
    
 
    @Autowired
    private StatisticService service;
    
    @ResponseBody 
    @RequestMapping("/yearStatistic")
    public Map<String, Object> sqltest(String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody 
    @RequestMapping("/monthStatistic")
	public Map<String, Object> sqltest2(String yearMonth) throws Exception {

		return service.yearMonthloginNum(yearMonth);
	}
    
    @ResponseBody 
    @RequestMapping("/dayStatistic")
	public Map<String, Object> sqltest3(String yearMonthDay) throws Exception {

		return service.yearMonthDayloginNum(yearMonthDay);
	}
    
    @ResponseBody 
    @RequestMapping("/departmentMonthStatistic")
	public Map<String, Object> sqltest4(String yearMonth,String department) throws Exception {
    
		return service.yearMonthDepartmentloginNum(yearMonth, department);
	}
    
    @ResponseBody 
    @RequestMapping("/monthDayAverageStatistic")
	public Map<String, Object> sqltest5(String yearMonth) throws Exception {
    
		return service.yearMonthAverageloginNum(yearMonth);
	}
    
    @ResponseBody 
    @RequestMapping("/exceptHolidaymonthStatistic")
	public Map<String, Object> sqltest6(String yearMonth) throws Exception {
    
		return service.exceptHolidaymonthloginNum(yearMonth);
	}
    
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}