package com.jd.web.controller.base;

public class ErrorCode {
	public static final int SUCCESS = 0;

	public static final int SYS_UNKNOWN = 9999;
	public static final int SYS_JIMDB_ERR = 9998;
	public static final int SYS_ES_ERR = 9997;
	public static final int SYS_DB_ERR = 9996;
	public static final int INVALID_PARAM = 9989;

	public static final int LOGIN_NOT_LOGIN = 100;
	public static final int LOGIN_WRONG_PASSWORD = 101;

	public static final int APPLY_FAILED = 200;
}
