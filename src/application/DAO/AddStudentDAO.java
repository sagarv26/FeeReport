package application.DAO;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

import application.DTO.AddAccountantDTO;
import application.DTO.AddStudentDTO;

public class AddStudentDAO  {
	SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void Create(AddStudentDTO addStudentDTO){
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		try{
		session.save(addStudentDTO);
		tx.commit();
		}catch (HibernateException he) 
		{
			he.printStackTrace();
			tx.rollback();
		}
		finally 
		{
			session.close();
		}
	}
	
	public String[] fetch(String obj){
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] data=new String[size];
		switch(obj){
			case "id":
			for(AddStudentDTO aList:list){				
				data[row]=String.valueOf(aList.getStuID());
				row++;
			}
			break;
			case "name":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuName();
					row++;
				}
				break;
			case "email":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuEmail();
					row++;
				}
				break;
			case "course":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuCourse();
					row++;
				}
				break;
			case "fee":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuFee();
					row++;
				}
				break;
			case "due":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuDue();
					row++;
				}
				break;
			case "address":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuAddress();
					row++;
				}
				break;
			case "city":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuCity();
					row++;
				}
				break;
			case "country":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuCountry();
					row++;
				}
				break;
			case "contact":
				for(AddStudentDTO aList:list){				
					data[row]=aList.getStuContact();
					row++;
				}
				break;
		}

		return data;
	}
	
	public String[] fetchID(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataID=new String[size];

		for(AddStudentDTO aList:list){				
			dataID[row]=String.valueOf(aList.getStuID());
			row++;
		}
		
		return dataID;
	 }
	
	public String[] fetchName(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataName=new String[size];

		for(AddStudentDTO aList:list){				
			dataName[row]=aList.getStuName();
			row++;
		}
		
		return dataName;
	 }

	public String[] fetchEmail(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataEmail=new String[size];

		for(AddStudentDTO aList:list){				
			dataEmail[row]=aList.getStuEmail();
			row++;
		}
		
		return dataEmail;
	 }

	public String[] fetchCourse(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataCourse=new String[size];

		for(AddStudentDTO aList:list){				
			dataCourse[row]=aList.getStuCourse();
			row++;
		}
		
		return dataCourse;
	 }

	public String[] fetchFee(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataFee=new String[size];

		for(AddStudentDTO aList:list){				
			dataFee[row]=aList.getStuFee();
			row++;
		}
		
		return dataFee;
	 }

	public String[] fetchDue(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataDue=new String[size];

		for(AddStudentDTO aList:list){				
			dataDue[row]=aList.getStuDue();
			row++;
		}
		
		return dataDue;
	 }

	public String[] fetchContact(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataContact=new String[size];

		for(AddStudentDTO aList:list){				
			dataContact[row]=aList.getStuContact();
			row++;
		}
		
		return dataContact;
	 }

	public String[] fetchAddress(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataAddress=new String[size];

		for(AddStudentDTO aList:list){				
			dataAddress[row]=aList.getStuAddress();
			row++;
		}
		
		return dataAddress;
	 }

	public String[] fetchCity(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataCity=new String[size];

		for(AddStudentDTO aList:list){				
			dataCity[row]=aList.getStuCity();
			row++;
		}
		
		return dataCity;
	 }

	public String[] fetchState(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] dataState=new String[size];

		for(AddStudentDTO aList:list){				
			dataState[row]=aList.getStuState();
			row++;
		}
		
		return dataState;
	 }
	
	public String[] fetchCountry(){
		SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddStudentDTO> list=(query).list();
		int size=list.size(),row=0;
		String[] dataCountry=new String[size];

		for(AddStudentDTO aList:list){				
			dataCountry[row]=aList.getStuCountry();
			row++;
		}
		
		return dataCountry;
	 }
	
    public void UpdateDueFee(String fee,String id){
    	Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="update AddStudentDTO set stuDue=:f where stuID=:i";
		org.hibernate.Query query= session.createQuery(hql);
		query.setParameter("f",fee);
		query.setParameter("i",Integer.valueOf(id));
		query.executeUpdate();
		tx.commit();
    }
    
    
    public void UpdateStudentData(String name,String email,String course,String fee,String due,String address,String city,String state,String country,String contact,String id){
    	Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="update AddStudentDTO set stuName=:n, stuEmail=:e, stuCourse=:co, stuFee=:f, stuDue=:d, stuAddress=:a, stuCity=:ci, stuState=:s, stuCountry=:cou, stuContact=:con where stuID=:i";
		org.hibernate.Query query= session.createQuery(hql);
		query.setParameter("i",Integer.valueOf(id));
		query.setParameter("n",name);
		query.setParameter("e",email);
		query.setParameter("co",course);
		query.setParameter("f",fee);
		query.setParameter("d",due);
		query.setParameter("a",address);
		query.setParameter("ci",city);
		query.setParameter("s",state);
		query.setParameter("cou",country);
		query.setParameter("con",contact);
		query.executeUpdate();
		tx.commit();
    }


    public String fetchToUpdate(String obj, int id){
		Session session = sessionFactory.openSession();
		String hql="from AddStudentDTO where stuID=:i";
		org.hibernate.Query query= session.createQuery(hql);
		query.setParameter("i", id);
		List<AddStudentDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String data1 = null;
		String[] data=new String[size];
		switch(obj){
			case "id":
			for(AddStudentDTO aList:list){				
				data[row]=String.valueOf(aList.getStuID());
				row++;
			}
			break;
			case "name":
				data1=list.get(0).getStuName();
				break;
			case "email":					
				data1=list.get(0).getStuEmail();
				break;
			case "course":
				data1=list.get(0).getStuCourse();		
				break;
			case "fee":
				data1=list.get(0).getStuFee();
				break;
			case "due":
				data1=list.get(0).getStuDue();
				break;
			case "address":
				data1=list.get(0).getStuAddress();
				break;
			case "city":
				data1=list.get(0).getStuCity();
				break;
			case "state":
				data1=list.get(0).getStuState();
				break;
			case "country":
				data1=list.get(0).getStuCountry();
				break;
			case "contact":
				data1=list.get(0).getStuContact();
				break;
		}

		return data1;
	}


}
