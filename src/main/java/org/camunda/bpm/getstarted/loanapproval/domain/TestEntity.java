package org.camunda.bpm.getstarted.loanapproval.domain;

import javax.persistence.*;

@Entity
public class TestEntity {

    @Column
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
