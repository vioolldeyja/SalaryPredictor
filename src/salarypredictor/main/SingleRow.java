/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarypredictor.main;

import salarypredictor.helpers.*;

/**
 *
 * @author kuba
 */
public class SingleRow {
    private int id;
    private int age;
    private int fnlwgt;
    private int educationnum;
    private int capitalgain;
    private int capitalloss;
    private int huorsperweek;
    private WorkClass workClass;
    private Education education;
    private MaritalStatus maritalStatus;
    private NativeCountry nativeCountry;
    private Occupation occupation;
    private Race race;
    private Relationship relationship;
    private Sex sex;
    private String salary;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the fnlwgt
     */
    public int getFnlwgt() {
        return fnlwgt;
    }

    /**
     * @param fnlwgt the fnlwgt to set
     */
    public void setFnlwgt(int fnlwgt) {
        this.fnlwgt = fnlwgt;
    }

    /**
     * @return the educationnum
     */
    public int getEducationnum() {
        return educationnum;
    }

    /**
     * @param educationnum the educationnum to set
     */
    public void setEducationnum(int educationnum) {
        this.educationnum = educationnum;
    }

    /**
     * @return the capitalgain
     */
    public int getCapitalgain() {
        return capitalgain;
    }

    /**
     * @param capitalgain the capitalgain to set
     */
    public void setCapitalgain(int capitalgain) {
        this.capitalgain = capitalgain;
    }

    /**
     * @return the capitalloss
     */
    public int getCapitalloss() {
        return capitalloss;
    }

    /**
     * @param capitalloss the capitalloss to set
     */
    public void setCapitalloss(int capitalloss) {
        this.capitalloss = capitalloss;
    }

    /**
     * @return the huorsperweek
     */
    public int getHuorsperweek() {
        return huorsperweek;
    }

    /**
     * @param huorsperweek the huorsperweek to set
     */
    public void setHuorsperweek(int huorsperweek) {
        this.huorsperweek = huorsperweek;
    }

    /**
     * @return the workClass
     */
    public WorkClass getWorkClass() {
        return workClass;
    }

    /**
     * @param workClass the workClass to set
     */
    public void setWorkClass(WorkClass workClass) {
        this.workClass = workClass;
    }

    /**
     * @return the education
     */
    public Education getEducation() {
        return education;
    }

    /**
     * @param education the education to set
     */
    public void setEducation(Education education) {
        this.education = education;
    }

    /**
     * @return the maritalStatus
     */
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = MaritalStatus.fromString(maritalStatus);
    }
    /**
     * @return the nativeCountry
     */
    public NativeCountry getNativeCountry() {
        return nativeCountry;
    }

    public void setNativeCountry(String nativeCountry) {
        this.nativeCountry = NativeCountry.fromString(nativeCountry);
    }
    /**
     * @param nativeCountry the nativeCountry to set
     */
    public void setNativeCountry(NativeCountry nativeCountry) {
        this.nativeCountry = nativeCountry;
    }

    /**
     * @return the occupation
     */
    public Occupation getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = Occupation.fromString(occupation);
    }
    /**
     * @return the race
     */
    public Race getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(Race race) {
        this.race = race;
    }

    /**
     * @return the relationship
     */
    public Relationship getRelationship() {
        return relationship;
    }

    /**
     * @param relationship the relationship to set
     */
    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    /**
     * @return the sex
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }
}
