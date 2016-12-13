package algorithm;

public class Heap {
	private int heap[];
	private int maxSize;
	private int size;

	public void HeapMin(int max) {
		maxSize = max;
		heap = new int[maxSize];
		size = 0;
		heap[0] = Integer.MIN_VALUE;
	}

	private int leftChild(int pos) {
		return 2 * pos;
	}

	private int rightChild(int pos) {
		return 2 * pos + 1;
	}

	private int parent(int pos) {
		return pos >> 1;
	}

	private boolean isLeaf(int pos) {
		return (pos < size >> 1) && (pos <= size);
	}

	private void swap(int pos1, int pos2) {
		heap[pos1] = heap[pos1] ^ heap[pos2];
		heap[pos2] = heap[pos1] ^ heap[pos2];
		heap[pos1] = heap[pos1] ^ heap[pos2];
	}

	private void insert(int elem) {
		size++;
		heap[size] = elem;
		int cur = size;
		while (heap[cur] < heap[parent(cur)]) {
			swap(cur, parent(cur));
			cur = parent(cur);
		}
	}

	private void shiftDown(int pos) {
		int smallestChild;
		while (!isLeaf(pos)) {
			smallestChild = leftChild(pos);
			if (smallestChild < size
					&& heap[smallestChild] > heap[smallestChild + 1]) {
				smallestChild += 1;
				if (heap[pos] <= heap[smallestChild]) {
					return;
				}
				swap(pos, smallestChild);
				pos = smallestChild;
			}
		}
	}
}