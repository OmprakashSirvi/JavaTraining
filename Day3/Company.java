package Day3;

public class Company {
    private String name;
    private String employees;
    private String team_lead;

    public Company(String name, String employees, String team_lead) {
        this.name = name;
        this.employees = employees;
        this.team_lead = team_lead;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployees() {
        return this.employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getTeam_lead() {
        return this.team_lead;
    }

    public void setTeam_lead(String team_lead) {
        this.team_lead = team_lead;
    }

    @Override
    public String toString() {
        return "name='" + getName() + "'" +
                ", \nemployees='" + getEmployees() + "'" +
                ", \nLead='" + getTeam_lead() + "'";
    }

}
