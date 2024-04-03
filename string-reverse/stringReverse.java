import java.lang.ref.Cleaner;

public class stringReverse {

   public static void main(String[] args) {
      char[] a = {'a', 'b', 'c', 'd'};
   
      stringRecursion(a, 0, a.length-1);
   
      for (int i = 0; i < a.length; i++) {
         System.out.print(a[i]);
      }
   }

   public static void stringRecursion(char[] a, int p, int q) {
      if (q < p) return;
      swap(a, p, q);
      stringRecursion(a, p+1, q-1);
   }

   public static void swap(char[] a, int p, int q) {
      char temp = a[p];
      a[p] = a[q];
      a[q] = temp;
   }
}