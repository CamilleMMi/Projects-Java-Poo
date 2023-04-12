public class exercice3 {
    public static void main(String[] args) {
        int total = 1;
        for (int x = 1; x < 10000; x += 1) {
            total += x;
        }
        System.out.println(total);
    }
}
