class Series4 {
    public static void main(String[] args) {
        int num = 79;
        int count = 0;
        int diff = 29; // First prime difference

        System.out.print(num); // Print first number without comma

        for (int i = 0; count < 5; i++) { // Generate 5 more terms
            num += diff;
            System.out.print(" " + num); // Print numbers separated by space
            count++;

            // Find the next prime number after diff
            int next = diff + 1;
            while (true) {
                boolean flag = true;
                for (int j = 2; j * j <= next; j++) {
                    if (next % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    diff = next;
                    break;
                }
                next++;
            }
        }
    }
}
