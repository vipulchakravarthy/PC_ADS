
import java.util.Scanner;
import java.util.Arrays;

class QuickFind{
	int[] id;
	QuickFind(int N){
		id = new int[N];
		for(int i =0; i < N; i++){
			id[i] = i;
		}
	}

	//to check whether both are connected or not
	//if they are connected they will have the same id
	public boolean connected(int p, int q){
		if(id[p] == id[q]) return true;
		return false;
	}

	// to make a union operation convert all the id[p] to id[q]
	public void union(int p, int q){
		//value of id[p]
		int pid = id[p];
		//value of id[q]
		int qid = id[q];

		for(int i = 0; i < id.length; i++){
			if(id[i] == pid){
				id[i] = qid;
			}
		}
	}

}
class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		QuickFind qf = new QuickFind(n);
		for(int  i = 0; i < n;i++){
			int p = scan.nextInt();
			int q = scan.nextInt();
			if(!qf.connected(p,q)){
				qf.union(p,q);
			}
		}
		System.out.println("****");
		System.out.println(Arrays.toString(qf.id));
		System.out.println("****");
	}
}
