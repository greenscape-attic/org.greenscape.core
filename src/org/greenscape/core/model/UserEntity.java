package org.greenscape.core.model;

import java.util.Date;
import java.util.List;

import org.greenscape.persistence.PersistedModelBase;
import org.greenscape.persistence.annotations.Model;

@Model(name = UserModel.MODEL_NAME)
public class UserEntity extends PersistedModelBase implements UserModel {
	private static final long serialVersionUID = 6930254499438963734L;

	@Override
	public Long getUserId() {
		return getProperty(Long.class, USER_ID);
	}

	@Override
	public UserModel setUserId(Long userId) {
		setProperty(USER_ID, userId);
		return this;
	}

	@Override
	public String getUserName() {
		return getProperty(String.class, USER_NAME);
	}

	@Override
	public UserModel setUserName(String userName) {
		setProperty(USER_NAME, userName);
		return this;
	}

	@Override
	public String getPassword() {
		return (String) getProperty(PASSWORD);
	}

	@Override
	public UserModel setPassword(String password) {
		setProperty(PASSWORD, password);
		return this;
	}

	@Override
	public Boolean isPasswordReset() {
		return (Boolean) getProperty(PASSWORD_RESET);
	}

	@Override
	public UserModel setPasswordReset(Boolean passwordReset) {
		setProperty(PASSWORD_RESET, passwordReset);
		return this;
	}

	@Override
	public Date getPasswordModifiedDate() {
		return (Date) getProperty(PASSWORD_MODIFIED_DATE);
	}

	@Override
	public UserModel setPasswordModifiedDate(Date passwordModifiedDate) {
		setProperty(PASSWORD_MODIFIED_DATE, passwordModifiedDate);
		return this;
	}

	@Override
	public String getFirstName() {
		return (String) getProperty(FIRST_NAME);
	}

	@Override
	public UserModel setFirstName(String firstName) {
		setProperty(FIRST_NAME, firstName);
		return this;
	}

	@Override
	public String getMiddleName() {
		return (String) getProperty(MIDDLE_NAME);
	}

	@Override
	public UserModel setMiddleName(String middleName) {
		setProperty(MIDDLE_NAME, middleName);
		return this;
	}

	@Override
	public String getLastName() {
		return (String) getProperty(LAST_NAME);
	}

	@Override
	public UserModel setLastName(String lastName) {
		setProperty(LAST_NAME, lastName);
		return this;
	}

	@Override
	public String getEmail() {
		return (String) getProperty(EMAIL);
	}

	@Override
	public UserModel setEmail(String email) {
		setProperty(EMAIL, email);
		return this;
	}

	@Override
	public String getLanguageId() {
		return (String) getProperty(LANGUAGE_ID);
	}

	@Override
	public UserModel setLanguageId(String languageId) {
		setProperty(LANGUAGE_ID, languageId);
		return this;
	}

	@Override
	public String getTimeZoneId() {
		return (String) getProperty(TIMEZONE_ID);
	}

	@Override
	public UserModel setTimeZoneId(String timeZoneId) {
		setProperty(TIMEZONE_ID, timeZoneId);
		return this;
	}

	@Override
	public Date getLoginDate() {
		return (Date) getProperty(LOGIN_DATE);
	}

	@Override
	public UserModel setLoginDate(Date loginDate) {
		setProperty(LOGIN_DATE, loginDate);
		return this;
	}

	@Override
	public String getLoginIP() {
		return (String) getProperty(LOGIN_IP);
	}

	@Override
	public UserModel setLoginIP(String loginIP) {
		setProperty(LOGIN_IP, loginIP);
		return this;
	}

	@Override
	public Date getLastLoginDate() {
		return (Date) getProperty(LAST_LOGIN_DATE);
	}

	@Override
	public UserModel setLastLoginDate(Date lastLoginDate) {
		setProperty(LAST_LOGIN_DATE, lastLoginDate);
		return this;
	}

	@Override
	public String getLastLoginIP() {
		return (String) getProperty(LAST_LOGIN_IP);
	}

	@Override
	public UserModel setLastLoginIP(String lastLoginIP) {
		setProperty(LAST_LOGIN_IP, lastLoginIP);
		return this;
	}

	@Override
	public Date getLastFailedLoginDate() {
		return (Date) getProperty(LAST_FAILED_LOGIN_DATE);
	}

	@Override
	public UserModel setLastFailedLoginDate(Date lastFailedLoginDate) {
		setProperty(LAST_FAILED_LOGIN_DATE, lastFailedLoginDate);
		return this;
	}

	@Override
	public Integer getFailedLoginAttempts() {
		return (Integer) getProperty(FAILED_LOGIN_ATTEMPTS);
	}

	@Override
	public UserModel setFailedLoginAttempts(Integer failedLoginAttempts) {
		setProperty(FAILED_LOGIN_ATTEMPTS, failedLoginAttempts);
		return this;
	}

	@Override
	public Boolean isLockout() {
		return (Boolean) getProperty(LOCKOUT);
	}

	@Override
	public UserModel setLockout(Boolean lockout) {
		setProperty(LOCKOUT, lockout);
		return this;
	}

	@Override
	public Date getLockoutDate() {
		return (Date) getProperty(LOCKOUT_DATE);
	}

	@Override
	public UserModel setLockoutDate(Date lockoutDate) {
		setProperty(LOCKOUT_DATE, lockoutDate);
		return this;
	}

	@Override
	public Boolean isAgreedToTermsOfUse() {
		return (Boolean) getProperty(AGREED_TO_TERMS_OF_USE);
	}

	@Override
	public UserModel setAgreedToTermsOfUse(Boolean agreedToTermsOfUse) {
		setProperty(AGREED_TO_TERMS_OF_USE, agreedToTermsOfUse);
		return this;
	}

	@Override
	public Boolean isEmailAddressVerified() {
		return (Boolean) getProperty(EMAIL_ADDRESS_VERIFIED);
	}

	@Override
	public UserModel setEmailAddressVerified(Boolean emailAddressVerified) {
		setProperty(EMAIL_ADDRESS_VERIFIED, emailAddressVerified);
		return this;
	}

	@Override
	public Integer getStatus() {
		return (Integer) getProperty(STATUS);
	}

	@Override
	public UserModel setStatus(Integer status) {
		setProperty(STATUS, status);
		return this;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getRoles() {
		return (List<String>) getProperty(ROLES);
	}

	@Override
	public UserModel setRoles(List<String> roles) {
		setProperty(ROLES, roles);
		return this;
	}
}
