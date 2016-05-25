package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class TestStudents {

	@Test
	public void testSchemaExport()
	{
		//创建配置对象
		Configuration configuration=new Configuration().configure();
//		//创建服务注册对象
//		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//		//创建SessionFactory
//		SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);
//		//创建Session对象
//		Session session=sessionFactory.getCurrentSession();
//		//创建SchemaExport对象
		SchemaExport schemaExport=new SchemaExport(configuration);
		
		schemaExport.create(true, true);
	}
}
