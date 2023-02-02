package practice;

import java.util.Objects;

public class Department {

    int deptId;
    String deptName;

    public Department(int id, String deptName) {
        this.deptId = id;
        this.deptName = deptName;
    }
    public Department() {}

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department that)) return false;
        return getDeptId() == that.getDeptId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeptId());
    }

}
