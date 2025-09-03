package Java;

public class encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setName("Vivi");
        System.out.println("Name: " + obj.getName());
    }
}
