public class Main {
    public static void main(String[] args) {
        for (int day = 1; day <= 10; day = day + 1) {
            if (day % 2 == 1) {
                System.out.println("Ngày " + day + " thức dậy lúc 5:00");
                System.out.println();
            }
        }
    }
}
