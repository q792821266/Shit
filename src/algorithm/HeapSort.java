package algorithm;

public class HeapSort {
	
		public void heapSort(int a[]) {
			if (a == null || a.length <= 1) {
				return;
			}
			buildMaxHeap(a);
			for (int i = a.length - 1; i >= 1; i--) {
				a[0] = a[0] ^ a[i];
				a[i] = a[0] ^ a[i];
				a[0] = a[0] ^ a[i];
				maxHeap(a, i, 0);
			}
		}

		public void buildMaxHeap(int a[]) {
			if (a == null || a.length <= 1) {
				return;
			}
			int half = a.length / 2;
			for (int i = half; i >= 0; i--) {
				maxHeap(a, a.length, i);
			}
		}

		public void maxHeap(int a[], int heapSize, int index) {
			int left = index * 2 + 1;
			int right = index * 2 + 2;

			int largest = index;
			if (left < heapSize && a[left] > a[index]) {
				largest = left;
			}

			if (right < heapSize && a[right] > a[largest]) {
				largest = right;
			}
			if (index != largest) {
				a[index] = a[index] ^ a[largest];
				a[largest] = a[index] ^ a[largest];
				a[index] = a[index] ^ a[largest];
				maxHeap(a, heapSize, largest);
			}
		}
}
