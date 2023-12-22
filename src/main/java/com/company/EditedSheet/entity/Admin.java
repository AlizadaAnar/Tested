package com.company.EditedSheet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Admin {

    @Id
    private Long id;

    private String firstName;

    private String lastname;

    private int number;

    private String email;

    private int marineDaysOn;

    private int trainingDays;

    private int sickDays;

    private int vacationDays;

    private int unpaidWorkingDays;

    private int educationalVacation;

    private String username;

    private String password;

    public Admin() {

    }

    public Admin(Long id) {
        this.id = id;
    }

    public Admin(Long id, String firstName, String lastname, int number, String email, int marineDaysOn, int trainingDays, int sickDays, int vacationDays, int unpaidWorkingDays, int educationalVacation, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.marineDaysOn = marineDaysOn;
        this.trainingDays = trainingDays;
        this.sickDays = sickDays;
        this.vacationDays = vacationDays;
        this.unpaidWorkingDays = unpaidWorkingDays;
        this.educationalVacation = educationalVacation;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMarineDaysOn() {
        return marineDaysOn;
    }

    public void setMarineDaysOn(int marineDaysOn) {
        this.marineDaysOn = marineDaysOn;
    }

    public int getTrainingDays() {
        return trainingDays;
    }

    public void setTrainingDays(int trainingDays) {
        this.trainingDays = trainingDays;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getUnpaidWorkingDays() {
        return unpaidWorkingDays;
    }

    public void setUnpaidWorkingDays(int unpaidWorkingDays) {
        this.unpaidWorkingDays = unpaidWorkingDays;
    }

    public int getEducationalVacation() {
        return educationalVacation;
    }

    public void setEducationalVacation(int educationalVacation) {
        this.educationalVacation = educationalVacation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                ", marineDaysOn=" + marineDaysOn +
                ", trainingDays=" + trainingDays +
                ", sickDays=" + sickDays +
                ", vacationDays=" + vacationDays +
                ", unpaidWorkingDays=" + unpaidWorkingDays +
                ", educationalVacation=" + educationalVacation +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin admin)) return false;
        return getNumber() == admin.getNumber() && getMarineDaysOn() == admin.getMarineDaysOn() && getTrainingDays() == admin.getTrainingDays() && getSickDays() == admin.getSickDays() && getVacationDays() == admin.getVacationDays() && getUnpaidWorkingDays() == admin.getUnpaidWorkingDays() && getEducationalVacation() == admin.getEducationalVacation() && Objects.equals(getId(), admin.getId()) && Objects.equals(getFirstName(), admin.getFirstName()) && Objects.equals(getLastname(), admin.getLastname()) && Objects.equals(getEmail(), admin.getEmail()) && Objects.equals(getUsername(), admin.getUsername()) && Objects.equals(getPassword(), admin.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastname(), getNumber(), getEmail(), getMarineDaysOn(), getTrainingDays(), getSickDays(), getVacationDays(), getUnpaidWorkingDays(), getEducationalVacation(), getUsername(), getPassword());
    }
}
