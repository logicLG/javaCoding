package xiaozhao.xz2017.jingri;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class third {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(1);
        List<Integer> b=new ArrayList<>();
        b.add(1);
        Set<List<Integer>> set=new HashSet<>();
        set.add(a);
        set.add(b);
        System.out.println(set.size());

    }
}
