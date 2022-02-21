public class CloneClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10, 0, 0), 5);
        s1.attach();

        System.out.println(s1);

        Swordsman s2 = (Swordsman) s1.clone();
        System.out.println("Cloned Swordsman: " + s2);
    }
}
