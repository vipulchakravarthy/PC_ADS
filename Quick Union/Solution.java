
import java.util.Scanner;
import java.util.Arrays;

class QuickUnion{
	int[] id;
	QuickUnion(int N){
		id = new int[N];
		for(int i =0; i < N; i++){
			id[i] = i;
		}
	}

	public int root(int i){
		//reach untill the i is equal to is root
		while(i != id[i]){
			i = id[i];
		}
		return i;
	}

	//to check whether both are connected or not
	//if they are connected they will have the same id
	public boolean connected(int p, int q){
		if(root(p) == root(q)) return true;
		return false;
	}

	// to make a union operation convert all the id[p] to id[q]
	public void union(int p, int q){
		//get the root of p
		int pid = root(p);
		//get the root of q
		int qid = root(q);
		id[pid] = qid;
	}
}

class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		QuickUnion qu = new QuickUnion(n);
		for(int  i = 0; i < n;i++){
			int p = scan.nextInt();
			int q = scan.nextInt();
			if(!qu.connected(p,q)){
				qu.union(p,q);
				System.out.println("****");
				System.out.println(Arrays.toString(qu.id));
				System.out.println("****");
			}
		}
		System.out.println("****");
		System.out.println(Arrays.toString(qu.id));
		System.out.println("****");
	}
}
