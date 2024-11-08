
public class ClassExtract {
}

class Person {
    private String name;
    private String street;
    private String city;
    private String detailAddress;

    public String getName() {
        return name;
    }
    public String getAddress() {
        return city + " " + street + "," + detailAddress;
    }
}


