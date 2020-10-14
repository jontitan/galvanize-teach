import java.util.Objects;

public class StudentDto {
    private final String name;

    private final boolean isAdult;

    public String getName() {
        return name;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public StudentDto(String name, boolean isAdult) {
        this.name = name;
        this.isAdult = isAdult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        return isAdult == that.isAdult &&
            Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isAdult);
    }
}
