package com.qihui.ssh;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.test.AbstractSingleSpringContextTests;

/**
 * base test case for testing using Spring
 */
public abstract class ContextTest extends AbstractSingleSpringContextTests {

	public ContextTest() {
		mockJndi();
	}

	public ContextTest(String testName) {
		super(testName);
		mockJndi();
	}

	protected void mockJndi() {
		BasicDataSource ds = null;
		try {
			Properties p = new Properties();
			p.load(this.getClass().getClassLoader().getResourceAsStream("ssh.properties"));
			ds = mockDataSource(p);
		} catch (Exception e) {
			if (ds != null) {
				try {
					ds.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			throw new RuntimeException(e);
		}
	}

	private BasicDataSource mockDataSource(Properties p) {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(p.getProperty("jdbc.driver"));
		ds.setUrl(p.getProperty("jdbc.url"));
		ds.setUsername(p.getProperty("jdbc.username"));
		ds.setPassword(p.getProperty("jdbc.password"));
		return ds;
	}

	protected String[] getConfigLocations() {
		return new String[] { "beans/beans.xml" };
	}

}