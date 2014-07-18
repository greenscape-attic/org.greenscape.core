package org.greenscape.core.model;

import java.util.Date;

import org.greenscape.persistence.PersistedModel;

public interface UserModel extends PersistedModel {

	String MODEL_NAME = "User";
	String USER_ID = "userId";
	String USER_NAME = "userName";
	String FIRST_NAME = "firstName";
	String MIDDLE_NAME = "middleName";
	String LAST_NAME = "lastName";
	String PASSWORD = "password";
	String PASSWORD_MODIFIED_DATE = "passwordModifiedDate";
	String EMAIL = "email";
	String PASSWORD_RESET = "passwordReset";
	String LANGUAGE_ID = "languageId";
	String TIMEZONE_ID = "timeZoneId";
	String LOGIN_DATE = "loginDate";
	String LOGIN_IP = "loginIP";
	String LAST_LOGIN_DATE = "lastLoginDate";
	String LAST_LOGIN_IP = "lastLoginIP";
	String LAST_FAILED_LOGIN_DATE = "lastFailedLoginDate";
	String FAILED_LOGIN_ATTEMPTS = "failedLoginAttempts";
	String LOCKOUT = "lockout";
	String LOCKOUT_DATE = "lockoutDate";
	String AGREED_TO_TERMS_OF_USE = "agreedToTermsOfUse";
	String EMAIL_ADDRESS_VERIFIED = "emailAddressVerified";
	String STATUS = "status";

	Long getUserId();

	UserModel setUserId(Long userId);

	String getUserName();

	UserModel setUserName(String userName);

	String getPassword();

	UserModel setPassword(String password);

	Boolean isPasswordReset();

	UserModel setPasswordReset(Boolean passwordReset);

	Date getPasswordModifiedDate();

	UserModel setPasswordModifiedDate(Date passwordModifiedDate);

	String getFirstName();

	UserModel setFirstName(String firstName);

	String getMiddleName();

	UserModel setMiddleName(String middleName);

	String getLastName();

	UserModel setLastName(String lastName);

	String getEmail();

	UserModel setEmail(String email);

	String getLanguageId();

	UserModel setLanguageId(String languageId);

	String getTimeZoneId();

	UserModel setTimeZoneId(String timeZoneId);

	Date getLoginDate();

	UserModel setLoginDate(Date loginDate);

	String getLoginIP();

	UserModel setLoginIP(String loginIP);

	Date getLastLoginDate();

	UserModel setLastLoginDate(Date lastLoginDate);

	String getLastLoginIP();

	UserModel setLastLoginIP(String lastLoginIP);

	Date getLastFailedLoginDate();

	UserModel setLastFailedLoginDate(Date lastFailedLoginDate);

	Integer getFailedLoginAttempts();

	UserModel setFailedLoginAttempts(Integer failedLoginAttempts);

	Boolean isLockout();

	UserModel setLockout(Boolean lockout);

	Date getLockoutDate();

	UserModel setLockoutDate(Date lockoutDate);

	Boolean isAgreedToTermsOfUse();

	UserModel setAgreedToTermsOfUse(Boolean agreedToTermsOfUse);

	Boolean isEmailAddressVerified();

	UserModel setEmailAddressVerified(Boolean emailAddressVerified);

	Integer getStatus();

	UserModel setStatus(Integer status);
}
