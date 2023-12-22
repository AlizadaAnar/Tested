package com.company.EditedSheet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Worker {

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

    public Worker() {

    }

    public Worker(Long id) {
        this.id = id;
    }

    public Worker(Long id, String firstName, String lastname, int number, String email, int marineDaysOn, int trainingDays, int sickDays, int vacationDays, int unpaidWorkingDays, int educationalVacation, String username, String password) {
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
        return "Worker{" +
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
        if (!(o instanceof Worker worker)) return false;
        return getNumber() == worker.getNumber() && getMarineDaysOn() == worker.getMarineDaysOn() && getTrainingDays() == worker.getTrainingDays() && getSickDays() == worker.getSickDays() && getVacationDays() == worker.getVacationDays() && getUnpaidWorkingDays() == worker.getUnpaidWorkingDays() && getEducationalVacation() == worker.getEducationalVacation() && Objects.equals(getId(), worker.getId()) && Objects.equals(getFirstName(), worker.getFirstName()) && Objects.equals(getLastname(), worker.getLastname()) && Objects.equals(getEmail(), worker.getEmail()) && Objects.equals(getUsername(), worker.getUsername()) && Objects.equals(getPassword(), worker.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastname(), getNumber(), getEmail(), getMarineDaysOn(), getTrainingDays(), getSickDays(), getVacationDays(), getUnpaidWorkingDays(), getEducationalVacation(), getUsername(), getPassword());
    }
}
