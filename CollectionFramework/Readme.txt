1. Arrays
------
To represent huge number of variables in single variable with indexes, we go for arrays.

2. limitataions
------------
> fixed in size, the size has to be declared in declaration only.
> homogenous data elements.
> no underlying data structure; thats why ready made method support available

3. Syntax
---------
Students[] students = new Students[1000];
Books[] books = new Books[2000];

Object[] object = new Object[1000];
object[0] = new Student();
object[1] = new Student();
object[2] = new Student();

4. Arrays          v/s             Collections
--------------------------------------------------------------------------------------------------
> Fixed in size                 Growable in nature 
> Only homogenous elements      Homogenous and heterogenous objects
> no standard data structure    every Collection class is implemented based on 
                                some standard data structure.
> NotRecommended - Memory       Recommended - Memory
> Recommended - performance     NotRecommendede - performance
> No underlying data structure  Implemented based on some standard data structure
> primitives & objects          we can hold only objects not primitives

Note:
if you know size in advance, its highly recommended to go for Arrays
using collections, we're compromising performance 

5. Collection & Collection Framework
------------------------------------
If you want to represent group of individual objects as single entity, then we should opt collections.
Collection Framework defines several classes and interface, which can be used to represent a groupd of individual objects as single entity, are defined in Collection Framework.

6. 9 key interfaces of collection
----------------------------------
between interface and class, it is interface which provides much information and class is dummy thing which implements interfaces.

6.1. Collection (I)
-------------------
    > If we want to represent individual objects in a single entity, then we should go for Collection
    > Collection interface defines most common methods which are applicable for any collection object
    > Collection interface, in general, is considered as root interface of Collection Framework.
Note : there is no concrete class which implements Collection directly.

Collection                           v/s                            Collections
--------------------------------------------------------------------------------------------------
> interface                                             Utility class
> to represent group of objects as single               Defines several utility methds for Collection
entity                                                  objects
                                                        java.util.package

6.2 LIST (I)
------------
If the requirement is to allow duplicates and preserve the insertion order, then we go for LIST (I).
> Duplucates are allowed
> Insertion order is preserved

                         Implementations
Collection -> List (I) -> ArrayList               1.2V
Collection -> List (I) -> LinkedList              1.2V
Collection -> List (I) -> Vector                  1.2V
Collection -> List (I) -> Stack                   1.0V (Legacy classes)

6.3 SET (I)
-----------
If the requirement is not to allow duplicates and not worried about insertion order, then we got for SET (I)
> Duplicates are not allowed
> Insertion order is not preserved

                         Implementations
Collection -> Set (I) -> HashSet                    1.2V
Collection -> Set (I) -> HashSet -> LinkedHashSet   1.4V

List                                Set
------------------------------------------------------------
> Duplicates allowed        > Duplicates not allowed
> Insertion order preserved > Insertion order not preserved

6.4 SORTEDSET (I)
-----------------
To represent individual objects as single entity where duplicates are not allowed but should be inserted according to some sorting order the we should go for SortedSet.

6.5 NavigableSet : defines several methods for navigation purposes.
-----------------
Collection -> Set (I) -> SortedSet                  1.2V
Collection -> Set (I) -> SortedSet -> NavigableSet  1.6V
Collection -> Set (I) -> SortedSet -> TreeSet       1.2V

6.6 QUEUE (I)
-------------
If you want to represent group of individual object prior to processing, then you should go with Queue(I).
(Before sending an email, saving the email id's inside queue)

Collection -> Queue (I) -> PriorityQueue            1.5V
Collection -> Queue (I) -> BlockingQueue            1.5V
Collection -> Queue (I) -> BlockingQueue -> LinkedBlockingQueue
Collection -> Queue (I) -> BlockingQueue -> PriorityBlockingQueue

7. MAP (I)
----------
> Not child interface of collection
> Key Value pair 

Map (I) -> HashMap 
Map (I) -> HashMap -> LinkedHashMap
Map (I) -> WeakHashMap
Map (I) -> IdentityHashMap                          1.4V
Map (I) -> HashTable                                1.0V
Map (I) -> HashTable -> Dictionary                  1.0V
Map (I) -> HashTable -> Properties                  1.0V

8. SORTED MAP (I)
-----------------
> to represent group of individual key value pairs according to some sorting order
Map (I) -> SortedMap

9. NAVIGBLE MAP (I)
-------------------
> provides serveral utility methods for navigation purposes. 
> TreeMap is implementation class for NavigableMap
Map (I) -> NavigableMap -> SortedMap