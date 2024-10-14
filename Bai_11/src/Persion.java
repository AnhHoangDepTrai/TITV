public class Persion {
    private String name;

    private String address;

    private Persion next = null;

    public Persion(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Persion getNext() {
        return next;
    }

    public void setNext(Persion next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
