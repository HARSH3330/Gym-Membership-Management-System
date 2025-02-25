package com.example.GymManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Member {

    @Id
    private String memberId;

    private String name;
    private String membershipType; // Monthly or Annual
    private boolean activeStatus;
    private String workoutPlan; // e.g., Strength, Cardio, Yoga

    public Member() {}

    public Member(String memberId, String name, String membershipType, boolean activeStatus, String workoutPlan) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.activeStatus = activeStatus;
        this.workoutPlan = workoutPlan;
    }

    // Getters and Setters
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMembershipType() { return membershipType; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }

    public boolean isActiveStatus() { return activeStatus; }
    public void setActiveStatus(boolean activeStatus) { this.activeStatus = activeStatus; }

    public String getWorkoutPlan() { return workoutPlan; }
    public void setWorkoutPlan(String workoutPlan) { this.workoutPlan = workoutPlan; }
}
