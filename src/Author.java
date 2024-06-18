import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;

    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getAllFields() {
        return firstName + " " + lastName;
    }

//  объекты сравнить

    public int compare() {
        return firstName.length() + lastName.length();

    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }

    // @Override
    //public boolean equals(Object obj) {
    // if (this == obj) {
    //   return true;
    //}
    //if (obj == null || this.getClass() != obj.getClass()) {
    //   return false;
    //}
    // return true;
    //}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Author temp = (Author) obj;
        boolean result = temp.firstName.equals(this.firstName) &&
                temp.lastName.equals(this.lastName);
        return result;

    }

}

