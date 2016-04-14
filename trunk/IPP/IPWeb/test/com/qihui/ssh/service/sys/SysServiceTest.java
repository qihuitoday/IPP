package com.qihui.ssh.service.sys;

import com.qihui.ssh.ContextTest;

@SuppressWarnings("unused")
public class SysServiceTest extends ContextTest {

	private static SysService sysService;

	private SysService getService() {
		if (sysService == null) {
			return (SysService) applicationContext.getBean("sysService");
		} else {
			return sysService;
		}
	}
}
