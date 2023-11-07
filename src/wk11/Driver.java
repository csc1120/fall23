package wk11;

/*
4   fire
5   alarm
7   chowder
4   five
2   am
5   clock

           a
         f l
         i a
     a   r r
     m   e m
| | | | | | | | | |
 0 1 2 3 4 5 6 7 8

 */
public class Driver {
    public static void main(String[] args) {
        HashTable<Double> table = new HashTable<>();
        for (int i = 0; i < 1000; i++) {
            table.add((double)i);
        }
        System.out.println(table.contains(13));
    }
}
