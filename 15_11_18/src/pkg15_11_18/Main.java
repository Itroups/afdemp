package pkg15_11_18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//    List <String> listStrings=new ArrayList<>();
//    listStrings.add("One");
//    listStrings.add("Two");
//    listStrings.add("Three");
//    listStrings.add("Four");
//    
//    List<String> ListStrings=new LinkedList();
//    listStrings.add("One");
//    listStrings.add("Two");
//    listStrings.add("Three");
//    listStrings.add("Four");
//    ArrayList ListofStrings=new ArrayList();
//    
////     //Hashset
//     Set<String>names=new HashSet();
//     names.add("Jake");
//     names.add("Robert");
//     names.add("Marisa");
//     names.add("Kasey");
//     System.out.println(names);
//     //TreeSet
//     Set<String>namess=new TreeSet();
//     namess.add("Jake");
//     namess.add("Robert");
//     namess.add("Marisa");
//     namess.add("Kasey");
//     System.out.println(namess);
//     //LinkedHashSet
//     Set<String>Names=new LinkedHashSet();
//     Names.add("Jake");
//     Names.add("Robert");
//     Names.add("Marisa");
//     Names.add("Kasey");
//     System.out.println(Names);
//     //Print sets with for "for each" loop
//     for (String name :names){
//         System.out.println(name);
//     }
//     List list=new ArrayList();
//     list.add("qwe");
//     list.add(6);
//     Object o=list.get(0);
//     for (int i=0;i<list.size();i++){
//        if(list.get(i)instanceof String){
//            String NAme=(String)list.get(i);
//            System.out.println("String");
//        }else if (list.get(i)instanceof Integer){
//            System.out.println("Integer");
//        }
//     }

Map<String,Integer>ages=new TreeMap();

ages.put("Geneva",2);
ages.put("Vicki",57);
ages.put("Marty",19);
Collection list=ages.values();
System.out.println(list);
Set<String>S=ages.keySet();
System.out.println(S);
for (String name:ages.keySet()){
    int age=ages.get(name);
    System.out.println(name+" -> "+age);
}
Set <Integer>Scores=new HashSet();
Scores.add(76);
Scores.add(89);
Scores.add(22);
Scores.add(42);
Scores.add(33);
Scores.add(68);
Iterator<Integer> itr=Scores.iterator();
int a =itr.next();
System.out.println(a);
int b = itr.next();
System.out.println(b);
while(itr.hasNext()){
    int score=itr.next();
System.out.println("The score is" + Scores);
    if (score<60){
        itr.remove();
    }
}
    }
    
}