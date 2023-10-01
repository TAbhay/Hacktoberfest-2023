import java.util.*;
public class only_first {
    static void findMissing(int a[], int b[],
    int n, int m)
{
HashSet<Integer> s = new HashSet<>();
for (int i = 0; i < m; i++)
s.add(b[i]);
for (int i = 0; i < n; i++)
if (!s.contains(a[i]))
System.out.print(a[i] + " ");
}
public static void main(String []args){
int a[] = { 1, 2, 6, 3, 4, 5 };
int b[] = { 2, 4, 3, 1, 0 };
int n = a.length;
int m = b.length;
findMissing(a, b, n, m);
}
}
