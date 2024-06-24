
import java.util.Arrays;

public class HeapFile {
    private int[] heapArray;
    private int size;
    
    public HeapFile(int x) {
        heapArray = new int[x];
        size = 0;
    }
    
    public int getSize() {
        return size;
    }
    
    public int[] getHeapArray() {
        return heapArray;
    }
    
    public void insert(int value) {
        if (size == heapArray.length) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }
        
        heapArray[size] = value;
        size++;
        
        bubbleUp(size - 1);
    }
    
    private void bubbleUp(int index) {
        int parentIndex = (index - 1) / 2;
        
        while (index > 0 && heapArray[index] > heapArray[parentIndex]) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }
    
    public int popMax() {
        if (size == 0) {
            System.out.println("Heap is empty. Cannot pop max element.");
            return -1; // Return a default value or throw an exception based on your requirements
        }
        
        int max = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        size--;
        
        bubbleDown(0);
        
        return max;
    }
    
    private void bubbleDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int maxIndex = index;
        
        if (leftChildIndex < size && heapArray[leftChildIndex] > heapArray[maxIndex]) {
            maxIndex = leftChildIndex;
        }
        
        if (rightChildIndex < size && heapArray[rightChildIndex] > heapArray[maxIndex]) {
            maxIndex = rightChildIndex;
        }
        
        if (maxIndex != index) {
            swap(index, maxIndex);
            bubbleDown(maxIndex);
        }
    }
    
    private void swap(int index1, int index2) {
        int temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }
    
    public static void main(String[] args) {
        int heapSize = 10;
        HeapFile heap = new HeapFile(heapSize);
        
        // Inserting elements into the heap
        heap.insert(5);
        heap.insert(10);
        heap.insert(3);
        heap.insert(8);
        
        // Accessing the heap size and array
        System.out.println("Heap size: " + heap.getSize());
        System.out.println("Heap array: " + Arrays.toString(heap.getHeapArray()));
        
        // Popping the maximum element from the heap
        int max = heap.popMax();
        System.out.println("Popped max element: " + max);
        
        // Accessing the updated heap size and array
        System.out.println("Heap size after pop: " + heap.getSize());
        System.out.println("Heap array after pop: " + Arrays.toString(heap.getHeapArray()));
    }
}
