TreeSet
-------
underlying datastructure = Balanced Tree
duplicates = not allowed
insertion order = not preserved
null insertion = possible only once
elements type = homogenous only
sorting = DNSO

Constructors of TreeSet
-----------------------
1. TreeSet t = new TreeSet();                   -> creates an empty treeset object
2. TreeSet t = new TreeSet(new Comparator c)    -> provides customized sorting using Comparator
3. TreeSet t = new TreeSet(Collection c);
4. TreeSet t = new TreeSet(SortedSet s);