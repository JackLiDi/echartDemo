package service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import controller.DrugController;
import mapper.DrugMapper;
import pojo.Drug;

@Service("drugService")
public class DrugServiceImpl implements DrugService{

	private Logger logger=Logger.getLogger(DrugController.class);

	
	@Override
	public List<Drug> queryList() {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory  sessionFactory  =(SqlSessionFactory) context.getBean("sqlSessionFactory");
		
		SqlSession session = sessionFactory.openSession();
		System.out.println("session:======"+session);
		
		DrugMapper drugMapper =session.getMapper(DrugMapper.class);
		
		
		return drugMapper.qureDrugList();
	
		
	}





}
