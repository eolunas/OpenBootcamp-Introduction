public class App {
    public static void main(String[] args) throws Exception {
        Person myPerson = new Person();
        myPerson.setName("Eduardo Luna");
        myPerson.setAge(29);
        myPerson.setPhone(223645);

        System.out.println(myPerson.getName());
        System.out.println(myPerson.getAge());
        System.out.println(myPerson.getPhone());
    }

    public static class Person {
        private String name;
        private int age;
        private int phone;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public int getPhone() {
            return this.phone;
        }

    }
}
