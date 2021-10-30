package primitivetypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
//        a változó: a típusa legyen int, az értéke 2!
        int a = 2;
//        b változó: a típusa legyen Integer, az értéke 2!
        int b = 2;
//        c változó: a típusa legyen Integer, az értéke legyen az a változó értéke!
        Integer c = Integer.valueOf(a);
        System.out.println(c.getClass().getName());
//        d változó: a típusa legyen Integer, az értéke legyen a b változó értéke!
        Integer d = Integer.valueOf(b);
        System.out.println(d.getClass().getSimpleName());
//        e változó: a típusa legyen Integer, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot a 2-es számból!
        Integer e = Integer.valueOf(2);
        System.out.println(e.getClass().getSimpleName());
//        f változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot a 2-es számból!
        int f = Integer.valueOf(2);
       // System.out.println(f.getClass().getSimpleName());
//        g változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot az a változó értékéből!
        int g = Integer.valueOf(a);
  //      System.out.println(g.getClass().getSimpleName());
//        h változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új Integer objektumot a c változó értékéből!
        int h = Integer.valueOf(c);
//        i változó: a típusa legyen int, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új int típusú értéket a "2" szövegből!
        int i = Integer.parseInt("2");
       //        j változó: a típusa legyen Integer, az értékét úgy add meg, hogy az Integer osztály megfelelő metódusával hozz létre egy új int típusú értéket a "2" szövegből!
        Integer j = Integer.parseInt("2");
        System.out.println(j.getClass().getSimpleName());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

//        k változó: a típusa legyen boolean, az értéke true!
        boolean k = true;
//        l változó: a típusa legyen Boolean, az értéke true!
        Boolean l = true;
        System.out.println(l.getClass().getSimpleName());
//        m változó: a típusa legyen boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új Boolean objektumot a true logikai literálból!
        boolean m = Boolean.valueOf(true);
        //System.out.println(m.getClass().getSimpleName());
//        n változó: a típusa legyen Boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új Boolean objektumot a true logikai literálból!
        Boolean n = Boolean.valueOf(true);
        System.out.println(l.getClass().getSimpleName());
//        o változó: a típusa legyen boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TrUe" szövegből!
        boolean o = Boolean.parseBoolean("TrUe");
//        p változó: a típusa legyen Boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TrUe" szövegből!
        Boolean p = Boolean.parseBoolean("TrUe");
//        q változó: a típusa legyen boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TreU" szövegből!
        boolean q = Boolean.parseBoolean("TreU");
//        r változó: a típusa legyen Boolean, az értékét úgy add meg, hogy a Boolean osztály megfelelő metódusával hozz létre egy új boolean típusú értéket a "TreU" szövegből!
        Boolean r = Boolean.parseBoolean("TreU");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
