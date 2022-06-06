import com.thinking.machines.util.*;
class ForEachTestCase
{
public static void main(String gg[])
{
TMList list1=new TMArrayList();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.forEach((p)->{
System.out.println(p);
});
System.out.println("************************");
TMList list2=new TMLinkedList();
list2.add(500);
list2.add(5004);
list2.add(50055);
list2.add(50004);
list2.add(500456);
list2.forEach((m)->{
System.out.println(m);
});

}

}