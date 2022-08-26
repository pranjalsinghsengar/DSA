
// <----------------  Write YOUR Code ---------------->
	
static void rec(int l,int r,int arr[]){

	while(l<r){
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		l++;
		r--;
	}
}


static void Solution(int n,int d,int arr[]) {
	// for(int i=0;i<n;i++){
	// 	int temp = arr
	// }
	int l = 0;
	int r = n-1;
	rec(l,d-1,arr);
	rec(d,n-1,arr);
	rec(l,n-1,arr);
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}

}
