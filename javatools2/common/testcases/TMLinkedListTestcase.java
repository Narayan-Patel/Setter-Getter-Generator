import com.thinking.machines.util.*;
class TMLinkedListTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
list1.add(10);
list1.add(20);
list1.add(30);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
//TMLinkedList list2=new TMLinkedList();
//list2.copyFrom(list1);
//for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));
System.out.println("After Inserting");
list1.insert(0,5);
list1.insert(2,15);
list1.insert(25,1000);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

System.out.println("Removed :"+list1.removeAt(2));
System.out.println("After removing from index 2");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

System.out.println("Removed :"+list1.removeAt(4));
System.out.println("After removing from index 4");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

list1.update(0,100002);
list1.update(3,303030);
System.out.println("After updating");
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

System.out.println("Appending from list2 to list1");
TMLinkedList list2=new TMLinkedList();
list2.add(1000);
list2.add(2000);
list2.add(3000);
list1.appendFrom(list2);
for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));

list1.appendTo(list2);
System.out.println("Appending to list2 from list1");
for(int i=0;i<list2.size();i++) System.out.println(list2.get(i));

}
}




