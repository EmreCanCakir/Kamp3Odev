public class User {

    private String name;
    private String lastName;
    private String gmail;
    private String creditCard;
    private String addressInfo;

    public User() {

    }

    public User(String name, String lastName, String gmail, String creditCard, String addressInfo) {
        super();
        this.setName(name);
        this.setLastName(lastName);
        this.setGmail(gmail);
        this.setCreditCard(creditCard);
        this.setAddressInfo(addressInfo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(String addressInfo) {
        this.addressInfo = addressInfo;
    }
}
