package com.qihui.ssh.service;

import com.qihui.ssh.service.sys.SysServiceTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllServicesTest {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for all service");
		suite.addTestSuite(SysServiceTest.class);
		return suite;
	}
}
