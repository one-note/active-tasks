class Person {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    private Person() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.age = this.age;
            person.address = this.address;
            person.phoneNumber = this.phoneNumber;
            return person;
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        Person person = new Person.Builder("Ansu").age(23).address("Bhubaneswar").phoneNumber("9876543210").build();

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone Number: " + person.getPhoneNumber());
    }
}
