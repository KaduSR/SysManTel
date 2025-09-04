package com.kadudev.SysManTel.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "serviceorder")
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String problemDescription;

    @Column(nullable = false)
    private String solutionDescription;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ServiceOrderRole status;

    @Column(nullable = false)
    private String technicalNotes;

    @Column(nullable = false)
    private LocalDateTime openingDate;

    @Column(nullable = true)
    private LocalDateTime closingDate;

    @Column(nullable = true)
    private LocalDateTime scheduledDateTime;

    @JoinColumn(name = "customer_id")
    @ManyToOne
    private Customer customer;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User technician;

    @JoinColumn(name = "serviceType_id")
    @ManyToOne
    private ServiceType serviceType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getSolutionDescription() {
        return solutionDescription;
    }

    public void setSolutionDescription(String solutionDescription) {
        this.solutionDescription = solutionDescription;
    }

    public ServiceOrderRole getServiceOrderRole() {
        return serviceOrderRole;
    }

    public void setServiceOrderRole(ServiceOrderRole serviceOrderRole) {
        this.serviceOrderRole = serviceOrderRole;
    }

    public String getTechnicalNotes() {
        return technicalNotes;
    }

    public void setTechnicalNotes(String technicalNotes) {
        this.technicalNotes = technicalNotes;
    }

    public LocalDateTime getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDateTime openingDate) {
        this.openingDate = openingDate;
    }

    public LocalDateTime getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDateTime closingDate) {
        this.closingDate = closingDate;
    }

    public LocalDateTime getScheduledDateTime() {
        return scheduledDateTime;
    }

    public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
        this.scheduledDateTime = scheduledDateTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User getTechnician() {
        return technician;
    }

    public void setTechnician(User technician) {
        this.technician = technician;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

}