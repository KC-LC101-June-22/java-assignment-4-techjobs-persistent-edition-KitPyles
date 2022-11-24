package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Size(max = 250, message = "Description is capped at 250 characters")
    private String description;
    
    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();
    
    public Skill() {}
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public List<Job> getJobs() {
        return jobs;
    }
}