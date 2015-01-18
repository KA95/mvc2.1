package objects;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Sergio on 1/17/2015.
 */
@Entity
@Table(name = "shop_user")
public class User implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
