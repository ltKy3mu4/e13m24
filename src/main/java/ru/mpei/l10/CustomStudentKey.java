package ru.mpei.l10;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
public class CustomStudentKey {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String group;
    @Getter
    @Setter
    private String surname;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomStudentKey that = (CustomStudentKey) o;
        return Objects.equals(name, that.name) && Objects.equals(group, that.group) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return getHs(name) + getHs(group) + getHs(surname);
//        return Objects.hash(name, group, surname);
    }

    private int getHs(String s) {
        int sum = 1;
        for (char c : s.toCharArray()) {
            sum= 31*sum + c*26;
        }
        return sum;
    }
}
