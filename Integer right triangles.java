public class Q39 {

        public static void main(String[] args) {
            System.out.println(new Q39().run());
        }


        public String run() {
            int Per = 0;
            int Tri = 0;
            for (int i = 1; i <= 1000; i++) {
                int triangles = count(i);
                if (triangles > Tri) {
                    Tri = triangles;
                    Per = i;
                }
            }
            return Integer.toString(Per);
        }


        private static int count(int i) {
            int count = 0;
            for (int a = 1; a <= i; a++) {
                for (int b = a; b <= i; b++) {
                    int c = i - a - b;
                    if (b <= c && a * a + b * b == c * c)
                        count++;
                }
            }
            return count;
        }

    }
