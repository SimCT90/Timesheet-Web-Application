package com.biitconsulting.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by SimCT90 on 3/7/2016.
 */
@Entity
@Table(name = "EMPLOYEE_DETAILS",schema = "TIMESHEET")
public class Employee {

    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeId;

    @Column(name="EMPLOYEE_EMAIL")
    private String employeeEmail;

    @Column(name="EMPLOYEE_NAME")
    private String employeeName;

    @Column(name="EMPLOYEE_START_DT")
    private Date employeeStartDt;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeStartDt() {
        return employeeStartDt;
    }

    public void setEmployeeStartDt(Date employeeStartDt) {
        this.employeeStartDt = employeeStartDt;
    }
}
