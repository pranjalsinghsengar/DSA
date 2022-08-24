// <----------------  Write YOUR Code ---------------->
	
	static void arrayRotation(int n,int d,int arr[]) {
		int s=1;
		while(s<=d){
			int last = arr[0];
			for(int i=0;i<n-1;i++){
				arr[i]=arr[i+1];
			}
			arr[n-1]=last;
			s++;
		}

		for(int i=0; i<n;i++){
			System.out.println(arr[i]);

		}
	}