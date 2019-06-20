public class Main {
    public static void main(String[] args) {

        int n = args.length;
        int[] indexes = new int[n];

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                indexes[i] = Integer.parseInt(args[i]);
            }
        } else {
            System.out.println("Не введено ни одного аргумента");
        }

        TransportCreator tc = new TransportCreator();
        tc.createTransport(indexes);
    }
}
