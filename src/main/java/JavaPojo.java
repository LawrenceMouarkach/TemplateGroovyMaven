import java.util.Date;

public class JavaPojo {
    private String name;
    private int priority;
    private Date startDate;
    private Date endDate;
    private boolean completed;

    public JavaPojo() {
    }

    public JavaPojo(String name, int priority, Date startDate, Date endDate, boolean completed) {
        this.name = name;
        this.priority = priority;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = completed;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaPojo javaPojo = (JavaPojo) o;

        if (priority != javaPojo.priority) return false;
        if (completed != javaPojo.completed) return false;
        if (name != null ? !name.equals(javaPojo.name) : javaPojo.name != null) return false;
        if (startDate != null ? !startDate.equals(javaPojo.startDate) : javaPojo.startDate != null) return false;
        return endDate != null ? endDate.equals(javaPojo.endDate) : javaPojo.endDate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (completed ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JavaPojo{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", completed=" + completed +
                '}';
    }
}
