package net.h0lg.autodns.xml.request.contact;

import com.neovisionaries.i18n.CountryCode;
import net.h0lg.autodns.xml.adapter.HandleExtensionModeAdapter;
import net.h0lg.autodns.xml.adapter.HandleGenderAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

public class HandleExtension {

	private HandleExtensionMode extensionMode;
	private HandleGender gender;
	private String idNumber;
	private String vatNumber;
	private String trademarkName;
	private String trademarkNumber;
	private CountryCode trademarkCountry;
	private Date trademarkRegistrationDate;
	private Date trademarkApplicationDate;
	private String companyNumber;
	private Date birthDate;
	private String birthPlace;
	private CountryCode birthCountry;
	private String language;
	private String mobileNumber;

	// TODO add rest of extensions


	@XmlJavaTypeAdapter(HandleExtensionModeAdapter.class)
	@XmlElement(name = "mode")
	public HandleExtensionMode getExtensionMode() {
		return extensionMode;
	}

	public void setExtensionMode(HandleExtensionMode extensionMode) {
		this.extensionMode = extensionMode;
	}

	@XmlJavaTypeAdapter(HandleGenderAdapter.class)
	public HandleGender getGender() {
		return gender;
	}

	public void setGender(HandleGender gender) {
		this.gender = gender;
	}

	@XmlAttribute(name = "idnumber")
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@XmlAttribute(name = "vatnumber")
	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	@XmlAttribute(name = "trademark_name")
	public String getTrademarkName() {
		return trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
	}

	@XmlAttribute(name = "trademark_number")
	public String getTrademarkNumber() {
		return trademarkNumber;
	}

	public void setTrademarkNumber(String trademarkNumber) {
		this.trademarkNumber = trademarkNumber;
	}

	@XmlAttribute(name = "trademark_country")
	public CountryCode getTrademarkCountry() {
		return trademarkCountry;
	}

	public void setTrademarkCountry(CountryCode trademarkCountry) {
		this.trademarkCountry = trademarkCountry;
	}

	@XmlAttribute(name = "trademark_regdate")
	public Date getTrademarkRegistrationDate() {
		return trademarkRegistrationDate;
	}

	public void setTrademarkRegistrationDate(Date trademarkRegistrationDate) {
		this.trademarkRegistrationDate = trademarkRegistrationDate;
	}

	@XmlAttribute(name = "trademark_appdate")
	public Date getTrademarkApplicationDate() {
		return trademarkApplicationDate;
	}

	public void setTrademarkApplicationDate(Date trademarkApplicationDate) {
		this.trademarkApplicationDate = trademarkApplicationDate;
	}

	@XmlAttribute(name = "companynumberr")
	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	@XmlAttribute(name = "birthday")
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public CountryCode getBirthCountry() {
		return birthCountry;
	}

	public void setBirthCountry(CountryCode birthCountry) {
		this.birthCountry = birthCountry;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@XmlAttribute(name = "mobile_phone")
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
