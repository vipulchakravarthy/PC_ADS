

import java.util.Scanner;
import java.util.Arrays;

class WeightedQuickUnion{
	int[] id;
	//to maintain the size of each root
	int[] sz;
	WeightedQuickUnion(int N){
		id = new int[N];
		sz = new int[N];
		for(int i =0; i < N; i++){
			id[i] = i;
		}
		for(int i =0; i < N; i++){
			sz[i] = 1;
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
		if(pid == qid) return;
		//if the p tree is smaller then add it to q or else vice versa
		if(sz[pid] < sz[qid]){
			id[pid] = qid;
			sz[qid] += sz[pid];
		}else{
			id[qid] = pid;
			sz[pid] += sz[qid];
		}
	}
}

class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		WeightedQuickUnion qu = new WeightedQuickUnion(n);
		for(int  i = 0; i < n;i++){
			int p = scan.nextInt();
			int q = scan.nextInt();
			if(!qu.connected(p,q)){
				qu.union(p,q);
			}
		}
		System.out.println("****");
		System.out.println(Arrays.toString(qu.id));
		System.out.println(Arrays.toString(qu.sz));
		System.out.println("****");
	}
}
