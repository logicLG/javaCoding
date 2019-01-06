package xiaozhao.xz2017;

import java.util.ArrayList;
import java.util.List;

public class forth {
    public static <T> void copy(List<T> dest, List<? extends T> src)
    {

        for (int i=0; i<src.size(); i++) {
            dest.add(src.get(i));

        }
    }
    public static void main(String[] args) {

            List<Number> a=new ArrayList<>();
            a.add(1);
            a.add(2);
            List<Number> s=new ArrayList<>();
            copy(s,a);
    }
}
