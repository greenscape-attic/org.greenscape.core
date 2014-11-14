package org.greenscape.core.model;

import java.util.Date;
import java.util.Set;

import org.greenscape.persistence.PersistedModel;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	String ROLES = "roles";

	Long getUserId();

	UserModel setUserId(Long userId);

	String getUserName();

	UserModel setUserName(String userName);

	@JsonIgnore
	String getPassword();

	UserModel setPassword(String password);

	@JsonIgnore
	Boolean isPasswordReset();

	UserModel setPasswordReset(Boolean passwordReset);

	@JsonIgnore
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

	@JsonIgnore
	Date getLoginDate();

	UserModel setLoginDate(Date loginDate);

	@JsonIgnore
	String getLoginIP();

	UserModel setLoginIP(String loginIP);

	@JsonIgnore
	Date getLastLoginDate();

	UserModel setLastLoginDate(Date lastLoginDate);

	@JsonIgnore
	String getLastLoginIP();

	UserModel setLastLoginIP(String lastLoginIP);

	@JsonIgnore
	Date getLastFailedLoginDate();

	UserModel setLastFailedLoginDate(Date lastFailedLoginDate);

	@JsonIgnore
	Integer getFailedLoginAttempts();

	UserModel setFailedLoginAttempts(Integer failedLoginAttempts);

	@JsonIgnore
	Boolean isLockout();

	UserModel setLockout(Boolean lockout);

	@JsonIgnore
	Date getLockoutDate();

	UserModel setLockoutDate(Date lockoutDate);

	@JsonIgnore
	Boolean isAgreedToTermsOfUse();

	UserModel setAgreedToTermsOfUse(Boolean agreedToTermsOfUse);

	@JsonIgnore
	Boolean isEmailAddressVerified();

	UserModel setEmailAddressVerified(Boolean emailAddressVerified);

	Integer getStatus();

	UserModel setStatus(Integer status);

	Set<String> getRoles();

	UserModel setRoles(Set<String> roles);
}
