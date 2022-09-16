# Sorter Project

All of the sorting algorithms will be keeping the duplicate values. The methods will not be modifying the original array, this will be done by cloning the array at the start of the algorithm where needed. where needed, 

## Bubble sort

We have two things that will be optimizing the bubble sort. Each new pass is 1 less than the previous one, and if no
swaps are made then the list is sorted.

```java
boolean swaps=true;
int j=len-1;
```

The latter will make bubble sort efficient for nearly sorted lists.

The j variable is the length (end point of the pass)

```java
while(!swaps){
        for(int i=0;i<j;i++){
```

We reduce j on each pass by one.

## Merge Sort

### merge method:

We have a function merger that assumes we have two sorted arrays and merges them into a sorted array
This iterates through both arrays and each time adds the value to an ArrayList structure. The counter for the array from
which we took the smaller value is incremented.

If the iterator reached the end of one of the arrays, then the merge method adds all the remaining items from the other
array.

```java
if(c1==len1||c2==len2){
        while(c1<len1){
        outList.add(arr1[c1]);
        c1++;
        }
        while(c2<len2){
        outList.add(arr2[c2]);
        c2++;
        }
        if(c1==len1&&c2==len2)merged=true;
        }
```

### The recursive part:

Base cases:

```java
if(len==0||len==1){
        return ints;
```

For arrays of length 1 or 0 we return them as sorted.
</br>

</br>



We use copyOfRange method to split the intput array into two. We call sortArray on each half and merge the two halves.

```java
int[]arr1=Arrays.copyOfRange(ints,0,len/2);
        int[]arr2=Arrays.copyOfRange(ints,len/2,len);
        return Merger.merge(sortArray(arr1),sortArray(arr2));
```

## Binary Sort

### Binary Tree

The binary structure has left child nodes smaller than the parent, but right nodes are greater or equal. This is to
support non removal of duplicates.

The tree has two methods, addData and getData. The latter gives an in-order traversal of the binary subtree starting
from the supplied node.
It returns an ArrayList object.

### Binary Sort itself

We have a special case to handle 0-length arrays

```java
        if(len==0){
        return arrayToSort;
        }
```
As the code that follows presupposes at least one value, which can be the root of the binary tree.
</br>
We populate the binary tree by iterating through the supplied array, and the call getData to do an inorder traversal of the tree and obtain an ArrayList object which is in order.
We then convert this to an array.
## Testing

We check if zero length arrays break the sorters

```java
    @Test//test to check if zero arrays break the program
public void testZero(){
        int[]empty=new int[0];
        assertArrayEquals(empty,bubble.sortArray(empty));assertArrayEquals(empty,merge.sortArray(empty));assertArrayEquals(empty,binary.sortArray(empty));
        }
```