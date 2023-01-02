package com.naver.member;

import com.github.scribejava.core.builder.api.DefaultApi20;

public class NaverLoginApi extends DefaultApi20 {
	protected NaverLoginApi() {
	}

	private static class InstanceHolder {
		private static final NaverLoginApi INSTANCE = new NaverLoginApi();
	}

	public static NaverLoginApi instance() {
		return InstanceHolder.INSTANCE;
	}

	//DefaultApi20에 abstract로 돼있음
	@Override
	public String getAccessTokenEndpoint() {
		//NAVER ACCESS TOKEN;
		return "https://nid.naver.com/oauth2.0/token?grant_type=authorization_code";
	}

	
	@Override
	protected String getAuthorizationBaseUrl() {
		//NAVER AUTH;
		return "https://nid.naver.com/oauth2.0/authorize";
	}
}