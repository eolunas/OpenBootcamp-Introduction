public class App {
    public static void main(String[] args) throws Exception {
        // First part:
        int param1 = 1;
        int param2 = 2;
        int param3 = 3;
        var valor = suma(param1, param2, param3);
        System.out.println(valor);

        // Second part:
        Coche miCoche = new Coche();
        miCoche.addDoor();
        System.out.println(miCoche.getNdoors());
        miCoche.removeDoor();
        System.out.println(miCoche.getNdoors());

    }

    // First part:
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    // Second part:
    public static class Coche {
        public int doors = 4;

        public void addDoor() {
            this.doors++;
        }

        public void removeDoor() {
            this.doors--;
        }

        public int getNdoors() {
            return this.doors;
        }
    }
}
