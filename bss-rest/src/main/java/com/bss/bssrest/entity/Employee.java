package com.bss.bssrest.entity;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeemaster")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "EmployeeIDOffice")
    private String employeeIDOffice;

    @Column(name = "SalaryRate")
    private String salaryRate;

    @Column(name = "ConvExtra")
    private String conversionExtra;

    @Column(name = "SeniorityAlw")
    private String seniorityAllowance;

    @Column(name = "EmployedTo")
    private String employer;

    @Column(name = "DesignationID")
    private String designationID;

    @Column(name = "EmployeeBankACNo")
    private String bankACNo;

    @Column(name = "Initial")
    private String initial;

    @Column(name = "EmployeeName")
    private String employeeName;

    @Column(name = "FathersInitial")
    private String fathersInitial;

    @Column(name = "FathersName")
    private String fathersName;

    @Column(name = "LocalAddress")
    private String localAddress;

    @Column(name = "PermanentAddress")
    private String permanentAddress;

    @Column(name = "PoliceStation")
    private String policeStation;

    @Column(name = "DOB")
    private Date dob;

    @Column(name = "Sex")
    private String sex;

    @Column(name = "MarriedUnmarried")
    private Boolean maritalStatus;

    @Column(name = "DOJ")
    private Date doj;

    @Column(name = "Age")
    private Integer age;

    @Column(name = "EduQualification")
    private String educationalQualification;

    @Column(name = "Experience")
    private String experience;

    @Column(name = "IdentificationMarks1")
    private String identificationMarkA;

    @Column(name = "IdentificationMarks2")
    private String identificationMarkB;

    @Column(name = "Height")
    private String height;

    @Column(name = "Weight")
    private String weight;

    @Column(name = "AnyotherDetails1")
    private String anyOtherDetailsA;

    @Column(name = "AnyotherDetails2")
    private String anyOtherDetailsB;

    @Column(name = "EmergencyContactPerson")
    private Integer emergencyContactPerson;

    // @Column(name = "Photograph")
    // private String photograph;

    @Column(name = "PFACNo")
    private String PFACNo;

    @Column(name = "ESICACNo")
    private String ESICACNo;

    @Column(name = "AdvanceOpening")
    private String AdvanceOpening;

    @Column(name = "ELOpening")
    private String ELOpening;

    @Column(name = "CLOpening")
    private String CLOpening;

    @Column(name = "ESIBool")
    private Integer ESICReqd;

    // @Column(name = "PFYesNo")
    // private Integer PF;

    // @Column(name = "BasicRate")
    // private String basicRate;

    // @Column(name = "HRARate")
    // private String HRARate;

    // @Column(name = "ConveyanceRate")
    // private String conveyanceRate;

    // @Column(name = "SrAlwRate")
    // private String srAllowanceRate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeIDOffice() {
        return employeeIDOffice;
    }

    public void setEmployeeIDOffice(String employeeIDOffice) {
        this.employeeIDOffice = employeeIDOffice;
    }

    public String getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(String salaryRate) {
        this.salaryRate = salaryRate;
    }

    public String getConversionExtra() {
        return conversionExtra;
    }

    public void setConversionExtra(String conversionExtra) {
        this.conversionExtra = conversionExtra;
    }

    public String getSeniorityAllowance() {
        return seniorityAllowance;
    }

    public void setSeniorityAllowance(String seniorityAllowance) {
        this.seniorityAllowance = seniorityAllowance;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getDesignationID() {
        return designationID;
    }

    public void setDesignationID(String designationID) {
        this.designationID = designationID;
    }

    public String getBankACNo() {
        return bankACNo;
    }

    public void setBankACNo(String bankACNo) {
        this.bankACNo = bankACNo;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getFathersInitial() {
        return fathersInitial;
    }

    public void setFathersInitial(String fathersInitial) {
        this.fathersInitial = fathersInitial;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Boolean getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getIdentificationMarkA() {
        return identificationMarkA;
    }

    public void setIdentificationMarkA(String identificationMarkA) {
        this.identificationMarkA = identificationMarkA;
    }

    public String getIdentificationMarkB() {
        return identificationMarkB;
    }

    public void setIdentificationMarkB(String identificationMarkB) {
        this.identificationMarkB = identificationMarkB;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAnyOtherDetailsA() {
        return anyOtherDetailsA;
    }

    public void setAnyOtherDetailsA(String anyOtherDetailsA) {
        this.anyOtherDetailsA = anyOtherDetailsA;
    }

    public String getAnyOtherDetailsB() {
        return anyOtherDetailsB;
    }

    public void setAnyOtherDetailsB(String anyOtherDetailsB) {
        this.anyOtherDetailsB = anyOtherDetailsB;
    }

    public Integer getEmergencyContactPerson() {
        return emergencyContactPerson;
    }

    public void setEmergencyContactPerson(Integer emergencyContactPerson) {
        this.emergencyContactPerson = emergencyContactPerson;
    }

    public String getPFACNo() {
        return PFACNo;
    }

    public void setPFACNo(String pFACNo) {
        PFACNo = pFACNo;
    }

    public String getESICACNo() {
        return ESICACNo;
    }

    public void setESICACNo(String eSICACNo) {
        ESICACNo = eSICACNo;
    }

    public String getAdvanceOpening() {
        return AdvanceOpening;
    }

    public void setAdvanceOpening(String advanceOpening) {
        AdvanceOpening = advanceOpening;
    }

    public String getELOpening() {
        return ELOpening;
    }

    public void setELOpening(String eLOpening) {
        ELOpening = eLOpening;
    }

    public String getCLOpening() {
        return CLOpening;
    }

    public void setCLOpening(String cLOpening) {
        CLOpening = cLOpening;
    }

    public Integer getESIC() {
        return ESICReqd;
    }

    public void setESIC(Integer eSIC) {
        ESICReqd = eSIC;
    }

    // public Integer getPF() {
    //     return PF;
    // }

    // public void setPF(Integer pF) {
    //     PF = pF;
    // }

    // public String getBasicRate() {
    //     return basicRate;
    // }

    // public void setBasicRate(String basicRate) {
    //     this.basicRate = basicRate;
    // }

    // public String getHRARate() {
    //     return HRARate;
    // }

    // public void setHRARate(String hRARate) {
    //     HRARate = hRARate;
    // }

    // public String getConveyanceRate() {
    //     return conveyanceRate;
    // }

    // public void setConveyanceRate(String conveyanceRate) {
    //     this.conveyanceRate = conveyanceRate;
    // }

    // public String getSrAllowanceRate() {
    //     return srAllowanceRate;
    // }

    // public void setSrAllowanceRate(String srAllowanceRate) {
    //     this.srAllowanceRate = srAllowanceRate;
    // }

    
    


}