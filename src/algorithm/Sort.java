package algorithm;

public class Sort {
	// 插入排序--直接插入排序 ,时间复杂度为O(n^2)
	public static void InsertSort(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				int j = i - 1;
				int x = a[i];
				a[i] = a[i - 1];
				while (j >= 0 && x < a[j]) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = x;
			}
			print(a, n, i);
		}
	}

	// 插入排序--希尔排序(缩小增量排序)
	public static void shellSort(int a[]) {
		int n = a.length;
		int dk = n / 2;
		while (dk >= 1) {
			for (int i = dk; i < n; i++) {
				if (a[i] < a[i - dk]) {
					int j = i - dk;
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
			dk = dk / 2;
			print(a, 8, 8);
		}
	}

	// 选择排序--简单选择排序
	public static void selectedSort(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[i]) {
					int x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
			print(a, 8, 8);
		}
	}

	// 選擇排序--二元選擇排序(好像就是二分法)
	public static void tSelectorSort(int a[]) {
		int n = a.length;
		for (int j = 0; j < n / 2; j++) {
			for (int i = j + 1; i < n - j - 1; i++) {
				if (a[i] < a[j]) {
					a[i] = a[i] ^ a[j];
					a[j] = a[i] ^ a[j];
					a[i] = a[i] ^ a[j];
					print(a, 8, 8);
					continue;
				}
				if (a[i] > a[n - j - 1]) {
					a[i] = a[i] ^ a[n - j - 1];
					a[n - j - 1] = a[i] ^ a[n - j - 1];
					a[i] = a[i] ^ a[n - j - 1];
					print(a, 8, 8);
				}
			}
		}
	}

	// // 堆排序
	// public static void HeapAdjust(int a[], int s) {
	// int length = a.length;
	// int child = 2 * s + 1;
	// int tmp = a[s];
	// while (child < length) {
	// if (child + 1 < length && a[child] < a[child + 1]) {
	// ++child;
	// }
	// if (a[s] < a[child]) {
	// a[s] = a[child];
	// s = child;
	// child = 2 * s + 1;
	// } else {
	// break;
	// }
	// a[s] = tmp;
	// }
	// print(a,8,8);
	// }
	//
	// public static void buildingHeap(int a[]){
	//
	// }

	// 冒泡算法
	public static void bubbleSort(int a[]) {
		int n = a.length;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n - j - 1; i++) {
				if (a[i] > a[i + 1]) {
					a[i] = a[i] ^ a[i + 1];
					a[i + 1] = a[i] ^ a[i + 1];
					a[i] = a[i] ^ a[i + 1];
					print(a, 8, 8);
				}
			}
		}
	}

	// 快速排序
	public static void quickSort(int a[], int left, int right) {
		if (left > right) {
			return;
		}
		int temp = a[left];
		int i, j;
		i = left;
		j = right;
		while (i != j) {
			while (a[j] >= temp && j > i) {
				j--;
			}
			System.out.println(j);
			while (a[i] <= temp && j > i) {
				i++;
			}
			System.out.println(i);
			if (i < j) {
				a[i] = a[i] ^ a[j];
				a[j] = a[i] ^ a[j];
				a[i] = a[i] ^ a[j];
				print(a, 8, 8);
			}
		}
		a[left] = a[i];
		a[i] = temp;
		print(a, 8, 8);
		quickSort(a, left, i - 1);
		quickSort(a, i + 1, right);
	}

	/**
	 * 用於將
	 * 
	 * @param a
	 *            要處理的數組
	 * @param i
	 *            要處理數組的節點位置
	 */
	public void shiftDown(int a[], int i) {
		int t, flag = 0;// t记录最小值的编号，flag判断是否需要往下平移
		int n = a.length;
		while (i << 1 <= n && flag == 0) {
			boolean l = a[i] > a[i << 1];// 判斷左兒子
			t = l ? i << 1 : i;
			if (i << 1 + 1 < n) {
				if (a[t] > a[i << 1 + 1]) {// 判断右儿子
					t = t << 1 + 1;
				}
			}
			if (t != i) {
				a[t] = a[t] ^ a[i];
				a[i] = a[t] ^ a[i];
				a[t] = a[t] ^ a[i];
				i = t;
			} else {
				flag = 1;
			}
		}
	}

	public void shiftUp(int a[], int i) {
		int t, flag = 0;
		int n =a.length;
		while(1==1){
			
		}

	}

	public static void print(int a[], int n, int i) {
		System.out.println(i + ":");
		for (int j = 0; j < 8; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("/n");
	}

}
