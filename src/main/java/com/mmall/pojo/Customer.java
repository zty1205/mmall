package com.mmall.pojo;

import java.util.Date;

public class Customer {
    private Integer customer_id;

    private String phone;

    private String name;

    private String id_card;

    private String entrance_guard_id;

    private String education;

    private String graduated_from;

    private String work_unit;

    private Date create_time;

    private String customer_photo_url;

    private String customer_photo_url2;

    private String hometown;

    private String email;

    private String profession;

    private String sex;

    private String area;

    private String political;

    private String marriage_status;

    private String job_type;

    private String professional_level;

    private Date registration_time;

    private String rent_reason;

    private String room_type;

    private String registration_certification_situation;

    private Date estimated_due_time;

    private String unit_director;

    private String present_community;

    private String present_street;

    private String unit_contact_phone;

    private String unit_address;

    private String attendant_one_name;

    private String attendant_one_relationship;

    private String attendant_one_sex;

    private String attendant_one_card;

    private String attendant_one_if_vaccination;

    private String attendant_one_if_school;

    private String attendant_two_name;

    private String attendant_two_relationship;

    private String attendant_two_sex;

    private String attendant_two_card;

    private String attendant_two_if_vaccination;

    private String attendant_two_if_school;

    private String attendant_three_name;

    private String attendant_three_relationship;

    private String attendant_three_sex;

    private String attendant_three_card;

    private String attendant_three_if_vaccination;

    private String attendant_three_if_school;

    private String collector_name;

    private String entry_name;

    private Date update_Time;

    private String ethnicity;

    private String birth;

    private String residentialAddress;

    private String authority;

    private String startValidity;

    private String endValidity;

    private String mid;

    public Customer(Integer customer_id, String phone, String name, String id_card, String entrance_guard_id, String education, String graduated_from, String work_unit, Date create_time, String customer_photo_url, String customer_photo_url2, String hometown, String email, String profession, String sex, String area, String political, String marriage_status, String job_type, String professional_level, Date registration_time, String rent_reason, String room_type, String registration_certification_situation, Date estimated_due_time, String unit_director, String present_community, String present_street, String unit_contact_phone, String unit_address, String attendant_one_name, String attendant_one_relationship, String attendant_one_sex, String attendant_one_card, String attendant_one_if_vaccination, String attendant_one_if_school, String attendant_two_name, String attendant_two_relationship, String attendant_two_sex, String attendant_two_card, String attendant_two_if_vaccination, String attendant_two_if_school, String attendant_three_name, String attendant_three_relationship, String attendant_three_sex, String attendant_three_card, String attendant_three_if_vaccination, String attendant_three_if_school, String collector_name, String entry_name, Date update_Time, String ethnicity, String birth, String residentialAddress, String authority, String startValidity, String endValidity, String mid) {
        this.customer_id = customer_id;
        this.phone = phone;
        this.name = name;
        this.id_card = id_card;
        this.entrance_guard_id = entrance_guard_id;
        this.education = education;
        this.graduated_from = graduated_from;
        this.work_unit = work_unit;
        this.create_time = create_time;
        this.customer_photo_url = customer_photo_url;
        this.customer_photo_url2 = customer_photo_url2;
        this.hometown = hometown;
        this.email = email;
        this.profession = profession;
        this.sex = sex;
        this.area = area;
        this.political = political;
        this.marriage_status = marriage_status;
        this.job_type = job_type;
        this.professional_level = professional_level;
        this.registration_time = registration_time;
        this.rent_reason = rent_reason;
        this.room_type = room_type;
        this.registration_certification_situation = registration_certification_situation;
        this.estimated_due_time = estimated_due_time;
        this.unit_director = unit_director;
        this.present_community = present_community;
        this.present_street = present_street;
        this.unit_contact_phone = unit_contact_phone;
        this.unit_address = unit_address;
        this.attendant_one_name = attendant_one_name;
        this.attendant_one_relationship = attendant_one_relationship;
        this.attendant_one_sex = attendant_one_sex;
        this.attendant_one_card = attendant_one_card;
        this.attendant_one_if_vaccination = attendant_one_if_vaccination;
        this.attendant_one_if_school = attendant_one_if_school;
        this.attendant_two_name = attendant_two_name;
        this.attendant_two_relationship = attendant_two_relationship;
        this.attendant_two_sex = attendant_two_sex;
        this.attendant_two_card = attendant_two_card;
        this.attendant_two_if_vaccination = attendant_two_if_vaccination;
        this.attendant_two_if_school = attendant_two_if_school;
        this.attendant_three_name = attendant_three_name;
        this.attendant_three_relationship = attendant_three_relationship;
        this.attendant_three_sex = attendant_three_sex;
        this.attendant_three_card = attendant_three_card;
        this.attendant_three_if_vaccination = attendant_three_if_vaccination;
        this.attendant_three_if_school = attendant_three_if_school;
        this.collector_name = collector_name;
        this.entry_name = entry_name;
        this.update_Time = update_Time;
        this.ethnicity = ethnicity;
        this.birth = birth;
        this.residentialAddress = residentialAddress;
        this.authority = authority;
        this.startValidity = startValidity;
        this.endValidity = endValidity;
        this.mid = mid;
    }

    public Customer() {
        super();
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card == null ? null : id_card.trim();
    }

    public String getEntrance_guard_id() {
        return entrance_guard_id;
    }

    public void setEntrance_guard_id(String entrance_guard_id) {
        this.entrance_guard_id = entrance_guard_id == null ? null : entrance_guard_id.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getGraduated_from() {
        return graduated_from;
    }

    public void setGraduated_from(String graduated_from) {
        this.graduated_from = graduated_from == null ? null : graduated_from.trim();
    }

    public String getWork_unit() {
        return work_unit;
    }

    public void setWork_unit(String work_unit) {
        this.work_unit = work_unit == null ? null : work_unit.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCustomer_photo_url() {
        return customer_photo_url;
    }

    public void setCustomer_photo_url(String customer_photo_url) {
        this.customer_photo_url = customer_photo_url == null ? null : customer_photo_url.trim();
    }

    public String getCustomer_photo_url2() {
        return customer_photo_url2;
    }

    public void setCustomer_photo_url2(String customer_photo_url2) {
        this.customer_photo_url2 = customer_photo_url2 == null ? null : customer_photo_url2.trim();
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getMarriage_status() {
        return marriage_status;
    }

    public void setMarriage_status(String marriage_status) {
        this.marriage_status = marriage_status == null ? null : marriage_status.trim();
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type == null ? null : job_type.trim();
    }

    public String getProfessional_level() {
        return professional_level;
    }

    public void setProfessional_level(String professional_level) {
        this.professional_level = professional_level == null ? null : professional_level.trim();
    }

    public Date getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(Date registration_time) {
        this.registration_time = registration_time;
    }

    public String getRent_reason() {
        return rent_reason;
    }

    public void setRent_reason(String rent_reason) {
        this.rent_reason = rent_reason == null ? null : rent_reason.trim();
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type == null ? null : room_type.trim();
    }

    public String getRegistration_certification_situation() {
        return registration_certification_situation;
    }

    public void setRegistration_certification_situation(String registration_certification_situation) {
        this.registration_certification_situation = registration_certification_situation == null ? null : registration_certification_situation.trim();
    }

    public Date getEstimated_due_time() {
        return estimated_due_time;
    }

    public void setEstimated_due_time(Date estimated_due_time) {
        this.estimated_due_time = estimated_due_time;
    }

    public String getUnit_director() {
        return unit_director;
    }

    public void setUnit_director(String unit_director) {
        this.unit_director = unit_director == null ? null : unit_director.trim();
    }

    public String getPresent_community() {
        return present_community;
    }

    public void setPresent_community(String present_community) {
        this.present_community = present_community == null ? null : present_community.trim();
    }

    public String getPresent_street() {
        return present_street;
    }

    public void setPresent_street(String present_street) {
        this.present_street = present_street == null ? null : present_street.trim();
    }

    public String getUnit_contact_phone() {
        return unit_contact_phone;
    }

    public void setUnit_contact_phone(String unit_contact_phone) {
        this.unit_contact_phone = unit_contact_phone == null ? null : unit_contact_phone.trim();
    }

    public String getUnit_address() {
        return unit_address;
    }

    public void setUnit_address(String unit_address) {
        this.unit_address = unit_address == null ? null : unit_address.trim();
    }

    public String getAttendant_one_name() {
        return attendant_one_name;
    }

    public void setAttendant_one_name(String attendant_one_name) {
        this.attendant_one_name = attendant_one_name == null ? null : attendant_one_name.trim();
    }

    public String getAttendant_one_relationship() {
        return attendant_one_relationship;
    }

    public void setAttendant_one_relationship(String attendant_one_relationship) {
        this.attendant_one_relationship = attendant_one_relationship == null ? null : attendant_one_relationship.trim();
    }

    public String getAttendant_one_sex() {
        return attendant_one_sex;
    }

    public void setAttendant_one_sex(String attendant_one_sex) {
        this.attendant_one_sex = attendant_one_sex == null ? null : attendant_one_sex.trim();
    }

    public String getAttendant_one_card() {
        return attendant_one_card;
    }

    public void setAttendant_one_card(String attendant_one_card) {
        this.attendant_one_card = attendant_one_card == null ? null : attendant_one_card.trim();
    }

    public String getAttendant_one_if_vaccination() {
        return attendant_one_if_vaccination;
    }

    public void setAttendant_one_if_vaccination(String attendant_one_if_vaccination) {
        this.attendant_one_if_vaccination = attendant_one_if_vaccination == null ? null : attendant_one_if_vaccination.trim();
    }

    public String getAttendant_one_if_school() {
        return attendant_one_if_school;
    }

    public void setAttendant_one_if_school(String attendant_one_if_school) {
        this.attendant_one_if_school = attendant_one_if_school == null ? null : attendant_one_if_school.trim();
    }

    public String getAttendant_two_name() {
        return attendant_two_name;
    }

    public void setAttendant_two_name(String attendant_two_name) {
        this.attendant_two_name = attendant_two_name == null ? null : attendant_two_name.trim();
    }

    public String getAttendant_two_relationship() {
        return attendant_two_relationship;
    }

    public void setAttendant_two_relationship(String attendant_two_relationship) {
        this.attendant_two_relationship = attendant_two_relationship == null ? null : attendant_two_relationship.trim();
    }

    public String getAttendant_two_sex() {
        return attendant_two_sex;
    }

    public void setAttendant_two_sex(String attendant_two_sex) {
        this.attendant_two_sex = attendant_two_sex == null ? null : attendant_two_sex.trim();
    }

    public String getAttendant_two_card() {
        return attendant_two_card;
    }

    public void setAttendant_two_card(String attendant_two_card) {
        this.attendant_two_card = attendant_two_card == null ? null : attendant_two_card.trim();
    }

    public String getAttendant_two_if_vaccination() {
        return attendant_two_if_vaccination;
    }

    public void setAttendant_two_if_vaccination(String attendant_two_if_vaccination) {
        this.attendant_two_if_vaccination = attendant_two_if_vaccination == null ? null : attendant_two_if_vaccination.trim();
    }

    public String getAttendant_two_if_school() {
        return attendant_two_if_school;
    }

    public void setAttendant_two_if_school(String attendant_two_if_school) {
        this.attendant_two_if_school = attendant_two_if_school == null ? null : attendant_two_if_school.trim();
    }

    public String getAttendant_three_name() {
        return attendant_three_name;
    }

    public void setAttendant_three_name(String attendant_three_name) {
        this.attendant_three_name = attendant_three_name == null ? null : attendant_three_name.trim();
    }

    public String getAttendant_three_relationship() {
        return attendant_three_relationship;
    }

    public void setAttendant_three_relationship(String attendant_three_relationship) {
        this.attendant_three_relationship = attendant_three_relationship == null ? null : attendant_three_relationship.trim();
    }

    public String getAttendant_three_sex() {
        return attendant_three_sex;
    }

    public void setAttendant_three_sex(String attendant_three_sex) {
        this.attendant_three_sex = attendant_three_sex == null ? null : attendant_three_sex.trim();
    }

    public String getAttendant_three_card() {
        return attendant_three_card;
    }

    public void setAttendant_three_card(String attendant_three_card) {
        this.attendant_three_card = attendant_three_card == null ? null : attendant_three_card.trim();
    }

    public String getAttendant_three_if_vaccination() {
        return attendant_three_if_vaccination;
    }

    public void setAttendant_three_if_vaccination(String attendant_three_if_vaccination) {
        this.attendant_three_if_vaccination = attendant_three_if_vaccination == null ? null : attendant_three_if_vaccination.trim();
    }

    public String getAttendant_three_if_school() {
        return attendant_three_if_school;
    }

    public void setAttendant_three_if_school(String attendant_three_if_school) {
        this.attendant_three_if_school = attendant_three_if_school == null ? null : attendant_three_if_school.trim();
    }

    public String getCollector_name() {
        return collector_name;
    }

    public void setCollector_name(String collector_name) {
        this.collector_name = collector_name == null ? null : collector_name.trim();
    }

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name == null ? null : entry_name.trim();
    }

    public Date getUpdate_Time() {
        return update_Time;
    }

    public void setUpdate_Time(Date update_Time) {
        this.update_Time = update_Time;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity == null ? null : ethnicity.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress == null ? null : residentialAddress.trim();
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getStartValidity() {
        return startValidity;
    }

    public void setStartValidity(String startValidity) {
        this.startValidity = startValidity == null ? null : startValidity.trim();
    }

    public String getEndValidity() {
        return endValidity;
    }

    public void setEndValidity(String endValidity) {
        this.endValidity = endValidity == null ? null : endValidity.trim();
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }
}