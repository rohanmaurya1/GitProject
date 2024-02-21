package org.springframework.boot.BenchWorktRecords.entity;

import jakarta.persistence.*;

@Entity
@Table(name="contributor")
public class Contributor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Contibutor_name;
    private String project_name;
    private String project_desc;
    private String project_link;
    public String getContibutor_name() {
        return Contibutor_name;
    }
    public void setContibutor_name(String contibutor_name) {
        Contibutor_name = contibutor_name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getProject_name() {
        return project_name;
    }
    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
    public String getProject_desc() {
        return project_desc;
    }
    public void setProject_desc(String project_desc) {
        this.project_desc = project_desc;
    }
    public String getProject_link() {
        return project_link;
    }
    public void setProject_link(String project_link) {
        this.project_link = project_link;
    }
    public Contributor(String contibutor_name, Integer id, String project_name, String project_desc, String project_link) {
        super();
        Contibutor_name = contibutor_name;
        this.id = id;
        this.project_name = project_name;
        this.project_desc = project_desc;
        this.project_link = project_link;
    }
    public Contributor() {
    }

    public void display()
    {
        System.out.println("demo");
    }

}
