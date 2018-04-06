package application.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import application.DTO.AddAccountantDTO;

public class AddAccountDAO {
	SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();

	public void create(AddAccountantDTO AddAccountantDTO)
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();		
		try 
		{
			session.save(AddAccountantDTO);
			tx.commit();
		}
		catch (HibernateException he) 
		{
			he.printStackTrace();
			tx.rollback();
		}
		finally 
		{
			session.close();
		}
	}

	 public String[] fetch(){
		Session session = sessionFactory.openSession();
		String hql="from AddAccountantDTO";
		org.hibernate.Query query= session.createQuery(hql);
		List<AddAccountantDTO> list=((org.hibernate.Query) query).list();
		int size=list.size(),row=0;
		String[] data=new String[size];

		for(AddAccountantDTO aList:list){
			System.out.println("Name: "+aList.accName+"  Email: "+aList.accEmail+"  Contact: "+aList.accContact);
			data[row]="ID: "+aList.getAccId()+" - Name: "+aList.getAccName()+"  - Email: "+aList.getAccEmail()+"  - Contact: "+aList.getAccContact();
			row++;
		}
		
		return data;
	 }
	 
	 public String[] fetchContact(){
			Session session = sessionFactory.openSession();
			String hql="from AddAccountantDTO";
			org.hibernate.Query query= session.createQuery(hql);
			List<AddAccountantDTO> list=((org.hibernate.Query) query).list();
			int size=list.size(),row=0;
			String[] dataContact=new String[size];

			for(AddAccountantDTO aList:list){
				System.out.println("Name: "+aList.accName+"  Email: "+aList.accEmail+"  Contact: "+aList.accContact);
				dataContact[row]=aList.getAccContact();
				row++;
			}
			
			return dataContact;
		 }
	 
	 public String[] fetchName(){
			SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			String hql="from AddAccountantDTO";
			org.hibernate.Query query= session.createQuery(hql);
			List<AddAccountantDTO> list=((org.hibernate.Query) query).list();
			int size=list.size(),row=0;
			String[] dataName=new String[size];

			for(AddAccountantDTO aList:list){
				System.out.println("Name: "+aList.accName+"  Email: "+aList.accEmail+"  Contact: "+aList.accContact);
				dataName[row]=aList.getAccId()+". "+aList.getAccName();
				row++;
			}
			
			return dataName;
		 }
	 
	 public String[] fetchEmail(){
			Session session = sessionFactory.openSession();
			String hql="from AddAccountantDTO";
			org.hibernate.Query query= session.createQuery(hql);
			List<AddAccountantDTO> list=((org.hibernate.Query) query).list();
			int size=list.size(),row=0;
			String[] dataEmail=new String[size];

			for(AddAccountantDTO aList:list){		
				dataEmail[row]=aList.getAccEmail();
				row++;
			}
			
			return dataEmail;
		 }

	 public int ValidateAcctLogin(String name,String password){
		 int status=0;
		 Session session=sessionFactory.openSession();
		 String hql="from AddAccountantDTO where accName=:n and accPassword=:p";
		 org.hibernate.Query query= session.createQuery(hql);
		 query.setParameter("n", name);
		 query.setParameter("p", password);
		 AddAccountantDTO acctDTO=(AddAccountantDTO) query.uniqueResult();	
		 if(acctDTO!=null){
			 return 1; 
		 }else{
			 return 0;
		 }
		
	 }
	 
}
