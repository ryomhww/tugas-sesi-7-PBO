public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<String, Double>mhs = new Mahasiswa<String, Double>("ryo", "gandasoli", 12345678.0);
        mhs.print();

        Libmath<Integer, Double>math = new Libmath<Integer,Double>(10, 20.0);
        System.out.println("Hasil penjumlahan: " + math.add());

        Libmath<Double, Double>math2 = new Libmath<Double,Double>(10.0, 20.0);
        System.out.println("Hasil pengurangan: " + math2.sub());

        Triangle.hitungkeliling(10, 20);
        System.out.println(Triangle.hitungkeliling(10, 20));
        System.out.println();

        Iteration.iterable();
        Iteration.iterator();
        Collections.addCollection();
        Collections.removeCollection();
        Collections.checkCollection();
        Lists.list();
        Sets.hashSet();
        Sets.LinkedHashSet();
    }
}