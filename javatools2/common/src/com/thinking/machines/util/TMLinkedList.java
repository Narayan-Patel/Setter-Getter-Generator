package com.thinking.machines.util;
public class TMLinkedList<T> implements TMList<T>
{
class TMNode<T>
{
public T data;
public TMNode<T> next;
TMNode()
{
this.data=null;
this.next=null;
}
}

public class TMLinkedListIterator<T> implements TMIterator<T>
{
private TMNode<T> ptr;
public TMLinkedListIterator(TMNode<T> ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
return this.ptr!=null;
}
public T next()
{
if(ptr==null) throw new InvalidIteratorException("Iterator has no more elements");
T data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
}
public TMIterator<T> iterator()
{
return new TMLinkedListIterator<T>(this.start);
}





private TMNode<T> start,end;
private int size;
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
}
public void add(T data)
{
TMNode<T> t=new TMNode<T>();
t.data=data;
if(this.start==null)
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
end=t;
}
this.size++;
}

public void add(int index,T data)
{
insert(index,data);
}
public void insert(int index, T data)
{
if(index<0) throw new ArrayIndexOutOfBoundsException("Invalid index : -1");
if(index>=size)
{
add(data);
return;
}
TMNode<T> node=new TMNode<T>();
node.data=data;
if(index==0)
{
node.next=this.start;
this.start=node;
}
else
{
TMNode<T> j,k;
int i;
j=this.start;
i=0;
k=null;
while(i<index)
{
k=j;
j=j.next;
i++;
}
k.next=node;
node.next=j;
}
this.size++;
}

public void removeAll()
{
this.clear();

}
public T removeAt(int index)
{
if(index<0 || index>=this.size) throw new ArrayIndexOutOfBoundsException("Invalid index : "+index);
T data;
if(start==end) // only one node
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
return data;
}
if(index==0) // many but remove first
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode<T> j,k;
k=null;
int i;
j=this.start;
i=0;
while(i<index)
{
k=j;
j=j.next;
i++;
}
data=j.data;
k.next=j.next;
if(this.end==j) this.end=k;
this.size--;
return data;
}

public void clear()
{
this.size=0;
this.start=null;
this.end=null;
}
public int size()
{
return this.size;
}
public T get(int index)
{
if(index<0 || index>=this.size) throw new ArrayIndexOutOfBoundsException("Invalid index : "+index);
int x;
x=0;
TMNode<T> t;
t=start;
while(x<index)
{
t=t.next;
x++;
}
return t.data;
}

public void update(int index,T data)
{
if(index<0 || index>=this.size) throw new ArrayIndexOutOfBoundsException("Invalid index : "+index);
if(index==0)
{
this.start.data=data;
return;
}
if(index==this.size-1)
{
this.end.data=data;
return;
}
TMNode<T> j;
int i;
i=0;
j=this.start;
while(i<index)
{
j=j.next;
i++;
}
j.data=data;
}

public void copyTo(TMList<T> other)
{
other.clear();
for(int e=0;e<this.size();e++) other.add(this.get(e));
}
public void copyFrom(TMList<T> other)
{
this.clear();
for(int e=0;e<other.size();e++) this.add(other.get(e));
}

public void appendTo(TMList<T> other)
{
for(int e=0;e<this.size();e++) other.add(this.get(e));
}

public void appendFrom(TMList<T> other)
{
for(int e=0;e<other.size();e++) this.add(other.get(e));
}

public void forEach(TMListItemAcceptor<T> a)
{
if(a==null) return;
TMNode<T> t;
for(t=start;t!=null;t=t.next) a.accept(t.data);
}
}






