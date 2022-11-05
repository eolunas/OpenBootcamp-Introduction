public class App {
    public static void main(String[] args) throws Exception {
        Customer myCustomer = new Customer();
        myCustomer.setName("Yuri Ochoa");
        myCustomer.setAge(28);
        myCustomer.setPhone(7538355);
        myCustomer.setCredit(1000);
        
        System.out.println("Name:" + myCustomer.getName() +
                           "\nAge:" + myCustomer.getAge() +
                           "\nPhone:" + myCustomer.getPhone() +
                           "\nCredit:" + myCustomer.getCredit());

        Worker myWorker = new Worker();
        myWorker.setName("Mario Espinosa");
        myWorker.setAge(59);
        myWorker.setPhone(2236455);
        myWorker.setSalary(4000);
        
        System.out.println("\nName:" + myWorker.getName() +
                           "\nAge:" + myWorker.getAge() +
                           "\nPhone:" + myWorker.getPhone() +
                           "\nSalary:" + myWorker.getSalary());
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
    public static class Customer extends Person {
        private int credit;

        public void setCredit(int credit) {
            this.credit = credit;
        }

        public int getCredit() {
            return this.credit;
        }
    }
    public static class Worker extends Person {
        private int salary;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return this.salary;
        }
    }
}
