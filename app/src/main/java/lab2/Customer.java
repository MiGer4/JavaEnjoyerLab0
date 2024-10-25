package lab2;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The {@code Customer} class represents an accounting record for a specific
 * customer, including details such as the first name, last name, address, and phone.
 *
 * <p>The following fields are included:</p>
 * <ul>
 *   <li>{@link String} firstName - The first name of customer.</li>
 *   <li>{@link String} lastName - The second name of customer.</li>
 *   <li>{@link Address} address - The address of customer.</li>
 *   <li>{@link String} phone - The phone of customer.</li>
 * </ul>
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private String phone;

    @JsonCreator
    public Customer(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName, @JsonProperty("address") Address address, @JsonProperty("phone") String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Customer customer = (Customer) o;
        return firstName.equals(customer.firstName) && lastName.equals(customer.lastName) &&
                address.equals(customer.address) && phone.equals(customer.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, phone);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", address=" + address +
                ", phone=" + phone +
                "}";
    }
}
