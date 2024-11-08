

public class InlineClass {
}

class Address  {
    private String street;
    private String city;
    private String detailAddress;

    public Address(String street, String city, String detailAddress) {
        this.street = street;
        this.city = city;
        this.detailAddress = detailAddress;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getDetailAddress() {
        return detailAddress;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public Address getAddress() {
        return address;
    }
}


class Client {
    public static void main(String[] args) {
        Person minco = new Person ("minco", new Address("송리단길", "송송시", "00동00호"));
        minco.getAddress().setCity("서울시");
    }
}