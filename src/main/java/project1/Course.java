package project1;

import org.joda.time.DateTime;

public class Course {
    private String name;
    private Module[] modules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, Module[] modules, DateTime startDate, DateTime endDate){
        this.name = name;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
