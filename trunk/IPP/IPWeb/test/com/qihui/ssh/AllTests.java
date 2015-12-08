package com.qihui.ssh;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.qihui.ssh.service.user.UserServiceTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for all");
		suite.addTestSuite(UserServiceTest.class);
		return suite;
	}
}
