package edu.bzu.a1170271_mohammadhajjeh_assignment2.Model;

public class CV {
    private String name;
    private String email;
    private String phone;
    private String gender;
    private String month;
    private String day;
    private String year;
    private String country;
    private String address;
    private String summary;
    private String skill;
    private String certification;
    private String hobbies;
    private String education;
    private String experience;

    public CV() {
    }

    public CV(String name, String email, String phone, String gender, String month, String day, String year, String country, String address, String summary, String skill, String certification, String hobbies, String education, String experience) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.country = country;
        this.address = address;
        this.summary = summary;
        this.skill = skill;
        this.certification = certification;
        this.hobbies = hobbies;
        this.education = education;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
