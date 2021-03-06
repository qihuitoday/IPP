package com.qihui.ssh.web;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.CookiesAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
public abstract class BaseAction extends ActionSupport implements SessionAware,
		CookiesAware {

	private Map<String, String> mapCookie;
	private Map<String, Object> mapSession;

	protected void setSessionData(String sessionName, Object obj) {
		Map session = ServletActionContext.getContext().getSession();
		if (obj != null) {
			session.put(sessionName, obj);
		}
	}

	protected Object getSessionData(String sessionName) {
		Map session = ServletActionContext.getContext().getSession();
		Object o = session.get(sessionName);
		return o;
	}

	/**
	 * Empty the session.
	 */
	protected void emptySession() {
		ServletActionContext.getRequest().getSession().invalidate();
	}

	public void addCookie(String name, String value) throws Exception {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "UTF-8"));
		cookie.setMaxAge(60 * 10);
		// cookie.setMaxAge(60 * 60 * 24 * 365);
		ServletActionContext.getResponse().addCookie(cookie);
	}

	/**
	 * Remove the cookie.
	 * 
	 * @param name
	 * @throws Exception
	 */
	public void removeCookie(String name) throws Exception {
		Cookie cookie = new Cookie(name, null);
		cookie.setMaxAge(0);
		ServletActionContext.getResponse().addCookie(cookie);
	}

	public String getCookie(String name) throws Exception {
		String value = mapCookie.get(name);
		if (value != null) {
			return URLDecoder.decode(value, "UTF-8");
		}
		return null;
	}

	public String getSession(String name) throws Exception {
		String value = (String) mapSession.get(name);
		if (value != null) {
			return URLDecoder.decode(value, "UTF-8");
		}
		return null;
	}

	public void setSession(Map<String, Object> sessions) {
		this.mapSession = sessions;

	}

	public void setCookiesMap(Map<String, String> cookies) {
		this.mapCookie = cookies;
	}
}
