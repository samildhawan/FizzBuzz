public class Multiples {

    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        while (i < 1000){
            if (Multiple(i)) {
                count++;
            };
            i++;
        }
        System.out.println(count);
    }

    public static boolean Multiple(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        return divisibleBy3 || divisibleBy5;
    }
}
