package highrq.core.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Characteristics {

    @Id
    @GeneratedValue
    private Long id;
    private int age;
    private int height_feet;
    private int height_inch;
    private int weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight_inch() {
        return height_inch;
    }

    public void setHeight_inch(int height_inch) {
        this.height_inch = height_inch;
    }

    public int getHeight_feet() {
        return height_feet;
    }

    public void setHeight_feet(int height_feet) {
        this.height_feet = height_feet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, height_feet, height_inch, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Characteristics other = (Characteristics) obj;
        return Objects.equals(this.id, other.id) && Objects.equals(this.age, other.age) && Objects.equals(this.height_feet, other.height_feet) && Objects.equals(this.height_inch, other.height_inch) && Objects.equals(this.weight, other.weight);
    }
}