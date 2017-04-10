package entityTest;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;


public class TestStudents {
	
	@Test
	public void testSchemaExport(){
		//创建配置对象
		Configuration config = new Configuration().configure();
		//创建服务对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//创建sessionfactory
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//创建session对象
		Session session = sessionFactory.getCurrentSession();
		//创建SchemaExprot对象
		SchemaExport export = new SchemaExport(config);
		//生成表结构
		export.create(true, true);
	}
}
