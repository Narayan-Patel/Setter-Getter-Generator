import com.thinking.machines.util.*;
class psp
{
public static void main(String gg[])
{
TMArrayList<Integer> i=new TMArrayList<Integer>();
i.add(10);
i.add(20);
i.add(30);
i.add(40);
i.forEach((m)->{
System.out.println(m);
});
TMLinkedList<String> list=new TMLinkedList<String>();
list.add("Ujjain");
list.add("Indore");
list.add("Goa");
list.add("Pune");
list.forEach((j)->{
System.out.println("City :"+j);

});



}


}