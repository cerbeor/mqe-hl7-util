package org.immregistries.mqe.vxu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.immregistries.mqe.hl7util.model.MetaFieldInfo;
import org.immregistries.mqe.util.validation.MqeValidatedObject;
import org.immregistries.mqe.vxu.hl7.Id;
import org.immregistries.mqe.vxu.hl7.Name;
import org.immregistries.mqe.vxu.hl7.OrganizationName;
import org.immregistries.mqe.vxu.hl7.PatientIdNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MqePatient extends MqeValidatedObject {
  @Override
  public TargetType getTargetType() { return TargetType.Patient;}

  private static final Logger LOGGER = LoggerFactory.getLogger(MqePatient.class);
  private List<MqeAddress> patientAddressList = new ArrayList<MqeAddress>();
  private Name alias = new Name();

  private Date birthDate = null;
  private String birthDateString = "";
  private String birthMultipleInd = "";
  private String birthOrderNumber = "";// new String(CodesetType.BIRTH_ORDER);
  private String birthPlace = "";
  private String birthCounty = "";
  private String systemEntryDateString = "";
  private Date systemEntryDate = null;
  private Date deathDate = null;
  private String deathDateString;

  private String deathIndicator = "";

  private String ethnicity = "";// new String(CodesetType.PATIENT_ETHNICITY);
  private OrganizationName facility = new OrganizationName();

  private String financialEligibility = "";// new String(CodesetType.FINANCIAL_STATUS_CODE);
  private Date financialEligibilityDate = null;
  private String financialEligibilityDateString;

  private PatientIdNumber idMedicaid = new PatientIdNumber();
  private PatientIdNumber idRegistry = new PatientIdNumber();
  private PatientIdNumber idSsn = new PatientIdNumber();
  private PatientIdNumber idSubmitter = new PatientIdNumber();
  private PatientIdNumber idWic = new PatientIdNumber();

  private String motherMaidenName = "";
  private Name name = new Name();
  private long patientId = 0;
  private MqePhoneNumber phone = new MqePhoneNumber();
  private Id physician = new Id();
  private String primaryLanguage = "";// new String(CodesetType.PERSON_LANGUAGE);
  private String protection = "";// new String(CodesetType.PATIENT_PROTECTION);
  private String publicity = "";// CodesetType.PATIENT_PUBLICITY);
  private String race = "";// new String(CodesetType.PATIENT_RACE);
  private String registryStatus = "";// new String(CodesetType.REGISTRY_STATUS);
  private String patientClass = "";// new String(CodesetType.PATIENT_CLASS);

  private String sex = "";// new String(CodesetType.PATIENT_SEX);
  private boolean isUnderAged = false;
  private boolean skipped = false;
  private String registryStatusUniversal;
  // private List<PhoneNumber> patientPhoneList = new ArrayList<PhoneNumber>();
  private List<PatientImmunity> patientImmunityList = new ArrayList<PatientImmunity>();

  // This comes out of the transform step. The kin list will be interpreted, and one will be picked
  // as the responsible party.
  private MqeNextOfKin responsibleParty = new MqeNextOfKin();

  private String email = "";

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
  

  public String getRegistryStatusUniversal() {
	return registryStatusUniversal;
}

public void setRegistryStatusUniversal(String registryStatusUniversal) {
	this.registryStatusUniversal = registryStatusUniversal;
}

public List<PatientImmunity> getPatientImmunityList() {
    return patientImmunityList;
  }

public List<MqeAddress> getPatientAddressList() {
    return patientAddressList;
  }

  public MqeAddress getPatientAddress() {
    return getAddress(1);
  }

  
  public String getSystemEntryDateString() {
	return systemEntryDateString;
}

public void setSystemEntryDateString(String systemEntryDateString) {
	this.systemEntryDateString = systemEntryDateString;
}

public Name getAlias() {
    return alias;
  }

  public String getAliasFirst() {
    return alias.getFirst();
  }

  public String getAliasLast() {
    return alias.getLast();
  }

  public String getAliasMiddle() {
    return alias.getMiddle();
  }

  public String getAliasPrefix() {
    return alias.getPrefix();
  }

  public String getAliasSuffix() {
    return alias.getSuffix();
  }

  public String getAliasTypeCode() {
    return alias.getTypeCode();
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public String getBirthMultipleInd() {
    return birthMultipleInd;
  }

  public String getBirthOrder() {
    return birthOrderNumber;
  }

  public String getBirthPlace() {
    return birthPlace;
  }

  public Date getDeathDate() {
    return deathDate;
  }

  public String getDeathIndicator() {
    return deathIndicator;
  }

  public String getEthnicity() {
    return ethnicity;
  }

  public void setEthnicity(String eth) {
    this.ethnicity = eth;
  }


  public String getEthnicityCode() {
    return ethnicity;
  }

  public OrganizationName getFacility() {
    return facility;
  }

  public String getFacilityIdNumber() {
    return facility.getId();
  }

  public String getFacilityName() {
    return facility.getName();
  }

  public String getFinancialEligibility() {
    return financialEligibility;
  }

  public String getFinancialEligibilityCode() {
    return financialEligibility;
  }

  public PatientIdNumber getIdMedicaid() {
    return idMedicaid;
  }

  public String getIdMedicaidNumber() {
    return getIdMedicaid().getNumber();
  }

  public PatientIdNumber getIdRegistry() {
    return idRegistry;
  }

  public String getIdRegistryNumber() {
    return getIdRegistry().getNumber();
  }

  public PatientIdNumber getIdSsn() {
    return idSsn;
  }

  public String getIdSsnNumber() {
    return getIdSsn().getNumber();
  }

  public PatientIdNumber getIdSubmitter() {
    return idSubmitter;
  }

  public String getIdSubmitterAssigningAuthorityCode() {
    return getIdSubmitter().getAssigningAuthority();
  }

  public String getIdSubmitterNumber() {
    return getIdSubmitter().getNumber();
  }

  public String getIdSubmitterTypeCode() {
    return getIdSubmitter().getTypeCode();
  }

  public String getMotherMaidenName() {
    return motherMaidenName;
  }

  public Name getName() {
    return name;
  }

  public String getNameFirst() {
    return name.getFirst();
  }

  public String getNameLast() {
    return name.getLast();
  }

  public String getNameMiddle() {
    return name.getMiddle();
  }

  public String getNamePrefix() {
    return name.getPrefix();
  }

  public String getNameSuffix() {
    return name.getSuffix();
  }

  public String getNameTypeCode() {
    return name.getTypeCode();
  }

  public long getPatientId() {
    return patientId;
  }

  public MqePhoneNumber getPhone() {
    return phone;
  }

  public String getPhoneNumber() {
    return phone.getFormattedNumber();
  }

  public Id getPhysician() {
    return physician;
  }

  public String getPhysicianNameFirst() {
    return physician.getName().getFirst();
  }

  public String getPhysicianNameLast() {
    return physician.getName().getLast();
  }

  public String getPhysicianNumber() {
    return physician.getNumber();
  }

  public String getPrimaryLanguage() {
    return primaryLanguage;
  }

  public String getPrimaryLanguageCode() {
    return primaryLanguage;
  }

  public String getProtection() {
    return protection;
  }

  public String getProtectionCode() {
    return protection;
  }

  public String getPublicity() {
    return publicity;
  }

  public String getPublicityCode() {
    return publicity;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String raceCe) {
    this.race = raceCe;
  }

  public String getRaceCode() {
    return race;
  }

  public String getRegistryStatus() {
    return registryStatus;
  }

  public String getRegistryStatusCode() {
    return registryStatus;
  }

  public String getSex() {
    return sex;
  }

  public String getSexCode() {
    return sex;
  }

  public boolean isSkipped() {
    return skipped;
  }

  public void setAliasFirst(String nameFirst) {
    alias.setFirst(nameFirst);
  }

  public void setAliasLast(String nameLast) {
    alias.setLast(nameLast);
  }

  public void setAliasMiddle(String nameMiddle) {
    alias.setMiddle(nameMiddle);
  }

  public void setAliasPrefix(String namePrefix) {
    alias.setPrefix(namePrefix);
  }

  public void setAliasSuffix(String nameSuffix) {
    alias.setSuffix(nameSuffix);
  }

  public void setAliasTypeCode(String nameTypeCode) {
    alias.setTypeCode(nameTypeCode);
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public void setBirthMultipleIndicator(String birthMultiple) {
    this.birthMultipleInd = birthMultiple;
  }

  public void setBirthOrder(String birthOrderCode) {
    this.birthOrderNumber = birthOrderCode;
  }

  public void setBirthPlace(String birthPlace) {
    this.birthPlace = birthPlace;
  }

  public void setDeathDate(Date deathDate) {
    this.deathDate = deathDate;
  }

  public void setDeathIndicator(String deathIndicator) {
    this.deathIndicator = deathIndicator;
  }

  public void setEthnicityCode(String ethnicityCode) {
    ethnicity = ethnicityCode;
  }

  public void setFacilityIdNumber(String facilityIdNumber) {
    facility.setId(facilityIdNumber);
  }

  public void setFacilityName(String facilityName) {
    facility.setName(facilityName);
  }

  public void setFinancialEligibilityCode(String financialEligibilityCode) {
    this.financialEligibility = financialEligibilityCode;
  }

  public void setIdMedicaidNumber(String idMedicaidNumber) {
    this.getIdMedicaid().setNumber(idMedicaidNumber);
  }

  public void setIdRegistryNumber(String idRegistryNumber) {
    this.getIdRegistry().setNumber(idRegistryNumber);
  }

  public void setIdSsnNumber(String idSsnNumber) {
    this.getIdSsn().setNumber(idSsnNumber);
  }

  public void setIdSubmitterAssigningAuthorityCode(String assigningAuthorityCode) {
    getIdSubmitter().setAssigningAuthorityCode(assigningAuthorityCode);
  }

  public void setIdSubmitterNumber(String number) {
    getIdSubmitter().setNumber(number);
  }

  public void setIdSubmitterTypeCode(String typeCode) {
    getIdSubmitter().setTypeCode(typeCode);
  }

  public void setMotherMaidenName(String motherMaidenName) {
    this.motherMaidenName = motherMaidenName;
  }

  public void setNameFirst(String nameFirst) {
    name.setFirst(nameFirst);
  }

  public void setNameLast(String nameLast) {
    name.setLast(nameLast);
  }

  public void setNameMiddle(String nameMiddle) {
    name.setMiddle(nameMiddle);
  }

  public void setNamePrefix(String namePrefix) {
    name.setPrefix(namePrefix);
  }

  public void setNameSuffix(String nameSuffix) {
    name.setSuffix(nameSuffix);
  }

  public void setNameTypeCode(String nameTypeCode) {
    name.setTypeCode(nameTypeCode);
  }

  public void setPatientId(long patientId) {
    this.patientId = patientId;
  }

  public void setPhone(MqePhoneNumber phoneIn) {
    this.phone = phoneIn;
  }

  public void setPhysicianNameFirst(String physicianNameFirst) {
    physician.getName().setFirst(physicianNameFirst);
  }

  public void setPhysicianNameLast(String physicianNameLast) {
    physician.getName().setLast(physicianNameLast);
  }

  public void setPhysicianNumber(String physicianNumber) {
    physician.setNumber(physicianNumber);
  }

  public void setPrimaryLanguageCode(String primaryLanguageCode) {
    primaryLanguage = primaryLanguageCode;
  }

  public void setProtectionCode(String protectionCode) {
    protection = protectionCode;
  }

  public void setPublicityCode(String publicityCode) {
    publicity = publicityCode;
  }

  public void setRaceCode(String raceCode) {
    race = raceCode;
  }

  public void setRegistryStatusCode(String registryStatusCode) {
    this.registryStatus = registryStatusCode;
  }

  public void setSexCode(String sexCode) {
    this.sex = sexCode;
  }

  public void setSkipped(boolean skipped) {
    this.skipped = skipped;
  }

  public String getPatientClassCode() {
    return patientClass;
  }

  public void setPatientClassCode(String code) {
    patientClass = code;
  }

  public String getPatientClass() {
    return patientClass;
  }

  public Date getFinancialEligibilityDate() {
    return financialEligibilityDate;
  }

  public void setFinancialEligibilityDate(Date financialEligibilityDate) {
    this.financialEligibilityDate = financialEligibilityDate;
  }

  public boolean isUnderAged() {
    return isUnderAged;
  }

  public void setUnderAged(boolean isUnderAged) {
    this.isUnderAged = isUnderAged;
  }

  public String getBirthDateString() {
    return birthDateString;
  }

  public void setBirthDateString(String birthDateString) {
    this.birthDateString = birthDateString;
  }

  public void setPrimaryLanguage(String language) {
    this.primaryLanguage = language;
  }

  /**
   * @param idMedicaid the idMedicaid to set
   */
  public void setIdMedicaid(PatientIdNumber idMedicaid) {
    this.idMedicaid = idMedicaid;
  }

  /**
   * @param idRegistry the idRegistry to set
   */
  public void setIdRegistry(PatientIdNumber idRegistry) {
    this.idRegistry = idRegistry;
  }

  /**
   * @param idSsn the idSsn to set
   */
  public void setIdSsn(PatientIdNumber idSsn) {
    this.idSsn = idSsn;
  }

  /**
   * @param idSubmitter the idSubmitter to set
   */
  public void setIdSubmitter(PatientIdNumber idSubmitter) {
    this.idSubmitter = idSubmitter;
  }

  /**
   * @return the idWic
   */
  public PatientIdNumber getIdWic() {
    return idWic;
  }

  /**
   * @return the idWic
   */
  public String getIdWicNumber() {
    return idWic.getNumber();
  }

  /**
   * @param idWic the idWic to set
   */
  public void setIdWic(PatientIdNumber idWic) {
    this.idWic = idWic;
  }

  public void setDeathDateString(String deathDt) {
    this.deathDateString = deathDt;
  }


  public String getDeathDateString() {
    return this.deathDateString;

  }

  /**
   * @return the financialEligibilityDateString
   */
  public String getFinancialEligibilityDateString() {
    return financialEligibilityDateString;
  }

  /**
   * @param financialEligibilityDateString the financialEligibilityDateString to set
   */
  public void setFinancialEligibilityDateString(String financialEligibilityDateString) {
    this.financialEligibilityDateString = financialEligibilityDateString;
  }

  public String getBirthCounty() {
    return birthCounty;
  }

  public void setBirthCounty(String birthCounty) {
    this.birthCounty = birthCounty;
  }

  public void setResponsibleParty(MqeNextOfKin responsibleParty) {
    this.responsibleParty = responsibleParty;
  }

  public MqeNextOfKin getResponsibleParty() {
    return responsibleParty;
  }


  private MqeAddress getAddress(int pos) {
    pos--;
    while (patientAddressList.size() <= pos) {
      MqeAddress pa = new MqeAddress();
      patientAddressList.add(pa);
    }
    return patientAddressList.get(pos);
  }

  @Override
  protected void setFieldFromMetaFieldInfo(MetaFieldInfo metaFieldInfo) {
    String value = metaFieldInfo.getValue();
    int pos = metaFieldInfo.getHl7Location().getFieldRepetition();
    switch (metaFieldInfo.getVxuField()) {
      case PATIENT_ALIAS:
        break;
      case PATIENT_BIRTH_COUNTY:
        birthCounty = value;
        break;
      case PATIENT_BIRTH_DATE:
        birthDateString = value;
        break;
      case PATIENT_BIRTH_INDICATOR:
        birthMultipleInd = value;
        break;
      case PATIENT_BIRTH_ORDER:
        birthOrderNumber = value;
        break;
      case PATIENT_BIRTH_PLACE:
        birthPlace = value;
        break;
      case PATIENT_BIRTH_REGISTRY_ID:
        break;
      case PATIENT_CLASS:
        patientClass = value;
        break;
      case PATIENT_DEATH_DATE:
        deathDateString = value;
        break;
      case PATIENT_DEATH_INDICATOR:
        deathIndicator = value;
        break;
      case PATIENT_ETHNICITY:
        ethnicity = value;
        break;
      case PATIENT_GENDER:
        sex = value;
        break;
      case PATIENT_IMMUNITY_CODE:
        break;
      case PATIENT_IMMUNIZATION_REGISTRY_STATUS:
        registryStatus = value;
        break;
      case PATIENT_MEDICAID_NUMBER:
        idMedicaid.setNumber(value);
        break;
      case PATIENT_NAME_MIDDLE:
        name.setMiddle(value);
        break;
      case PATIENT_NAME_SUFFIX:
        name.setSuffix(value);
        break;
      case PATIENT_MOTHERS_MAIDEN_NAME:
        motherMaidenName = value;
        break;
      case PATIENT_NAME:
        break;
      case PATIENT_NAME_FIRST:
        name.setFirst(value);
        break;
      case PATIENT_NAME_LAST:
        name.setLast(value);
        break;
      case PATIENT_NAME_TYPE_CODE:
        name.setTypeCode(value);
        break;
      case PATIENT_PHONE:
        phone.setSingleFieldinput(value);
//        phone.setAreaCode(phone.getAreaCodeFrom(value));
//        phone.setLocalNumber(phone.getLocalNumberFrom(value));
        break;
      case PATIENT_PHONE_TEL_EQUIP_CODE:
        phone.setTelEquipCode(value);
        break;
      case PATIENT_PHONE_TEL_USE_CODE:
        phone.setTelUseCode(value);
        break;
      case PATIENT_PHONE_AREA_CODE:
        phone.setAreaCode(value);
        break;
      case PATIENT_PHONE_LOCAL_NUMBER:
        phone.setLocalNumber(value);
        break;
      case PATIENT_ADDRESS:
        break;
      case PATIENT_ADDRESS_CITY:
        getAddress(pos).setCity(value);
        break;
      case PATIENT_ADDRESS_COUNTRY:
        getAddress(pos).setCountryCode(value);
        break;
      case PATIENT_ADDRESS_COUNTY:
        getAddress(pos).setCountyParishCode(value);
        break;
      case PATIENT_ADDRESS_STATE:
        getAddress(pos).setStateCode(value);
        break;
      case PATIENT_ADDRESS_STREET:
        getAddress(pos).setStreet(value);
        break;
      case PATIENT_ADDRESS_STREET2:
        getAddress(pos).setStreet2(value);
        break;
      case PATIENT_ADDRESS_TYPE:
        getAddress(pos).setTypeCode(value);
        break;
      case PATIENT_ADDRESS_ZIP:
        getAddress(pos).setZip(value);
        break;
      case PATIENT_PRIMARY_FACILITY_ID:
        facility.setId(value);
        break;
      case PATIENT_PRIMARY_FACILITY_NAME:
        facility.setName(value);
        break;
      case PATIENT_PRIMARY_LANGUAGE:
        primaryLanguage = value;
        break;
      case PATIENT_PRIMARY_PHYSICIAN_ID:
        physician.setNumber(value);
        break;
      case PATIENT_PRIMARY_PHYSICIAN_NAME:
        break;
      case PATIENT_PROTECTION_INDICATOR:
        protection = value;
        break;
      case PATIENT_PUBLICITY_CODE:
        publicity = value;
        break;
      case PATIENT_RACE:
        race = value;
        break;
      case PATIENT_REGISTRY_ID:
        idRegistry.setNumber(value);
        break;
      case PATIENT_REGISTRY_STATUS:
        break;
      case PATIENT_SSN:
        idRegistry.setNumber(value);
        break;
      case PATIENT_SUBMITTER_ID:
        idSubmitter.setNumber(value);
        break;
      case PATIENT_SUBMITTER_ID_AUTHORITY:
        idSubmitter.setAssigningAuthorityCode(value);
        break;
      case PATIENT_SUBMITTER_ID_TYPE_CODE:
        idSubmitter.setTypeCode(value);
        break;
      case PATIENT_VFC_EFFECTIVE_DATE:
        break;
      case PATIENT_VFC_STATUS:
        break;
      case PATIENT_WIC_ID:
        idWic.setNumber(value);
        break;
      case PATIENT_EMAIL:
        email = value;
        break;
      case PATIENT_GUARDIAN_NAME_FIRST:
      case PATIENT_GUARDIAN_NAME_LAST:
      case PATIENT_GUARDIAN_ADDRESS_CITY:
      case PATIENT_GUARDIAN_ADDRESS_STATE:
      case PATIENT_GUARDIAN_ADDRESS_STREET:
      case PATIENT_GUARDIAN_ADDRESS_STREET2:
      case PATIENT_GUARDIAN_ADDRESS_ZIP:
      case PATIENT_GUARDIAN_ADDRESS_COUNTRY:
      case PATIENT_GUARDIAN_ADDRESS:
      case PATIENT_GUARDIAN_RELATIONSHIP:
      case PATIENT_GUARDIAN_PHONE:
      case PATIENT_GUARDIAN_PHONE_AREA_CODE:
      case PATIENT_GUARDIAN_PHONE_LOCAL_NUMBER:
      case PATIENT_GUARDIAN_PHONE_TEL_USE_CODE:
      case PATIENT_GUARDIAN_PHONE_TEL_EQUIP_CODE:
        getResponsibleParty().setField(metaFieldInfo);
        break;
      default:
        break;
    }
  }

  @Override
  public String toString() {
    return "\nMqePatient---------------------------------------------------------------{" +
        "\n  patientAddressList=" + patientAddressList +
        "\n, alias=" + alias +
        "\n, birthDate=" + birthDate +
        "\n, birthDateString='" + birthDateString + '\'' +
        "\n, birthMultipleInd='" + birthMultipleInd + '\'' +
        "\n, birthOrderNumber='" + birthOrderNumber + '\'' +
        "\n, birthPlace='" + birthPlace + '\'' +
        "\n, birthCounty='" + birthCounty + '\'' +
        "\n, deathDate=" + deathDate +
        "\n, deathDateString='" + deathDateString + '\'' +
        "\n, deathIndicator='" + deathIndicator + '\'' +
        "\n, ethnicity='" + ethnicity + '\'' +
        "\n, facility=" + facility +
        "\n, financialEligibility='" + financialEligibility + '\'' +
        "\n, financialEligibilityDate=" + financialEligibilityDate +
        "\n, financialEligibilityDateString='" + financialEligibilityDateString + '\'' +
        "\n, idMedicaid=" + idMedicaid +
        "\n, idRegistry=" + idRegistry +
        "\n, idSsn=" + idSsn +
        "\n, idSubmitter=" + idSubmitter +
        "\n, idWic=" + idWic +
        "\n, motherMaidenName='" + motherMaidenName + '\'' +
        "\n, name=" + name +
        "\n, patientId=" + patientId +
        "\n, phone=" + phone +
        "\n, physician=" + physician +
        "\n, primaryLanguage='" + primaryLanguage + '\'' +
        "\n, protection='" + protection + '\'' +
        "\n, publicity='" + publicity + '\'' +
        "\n, race='" + race + '\'' +
        "\n, registryStatus='" + registryStatus + '\'' +
        "\n, patientClass='" + patientClass + '\'' +
        "\n, sex='" + sex + '\'' +
        "\n, isUnderAged=" + isUnderAged +
        "\n, skipped=" + skipped +
        "\n, patientImmunityList=" + patientImmunityList +
        "\n, responsibleParty=" + responsibleParty +
        "\n, email='" + email + '\'' +
        "------------------------------------------------------------------------------------}" + '\n';
  }

public Date getSystemEntryDate() {
	return systemEntryDate;
}

public void setSystemEntryDate(Date systemEntryDate) {
	this.systemEntryDate = systemEntryDate;
}
}
