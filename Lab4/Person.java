class Person implements Printable {
    private String name;
    private String roles;
    private int age;
    private String address;

    public Person(String name, String roles, int age, String address)
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getRoles() {
        return roles;
    }

    // Implementing Printable's print method
    @Override
    public void print() {
        System.out.println("Person Information:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Position: " + getRoles());
    }
}
