import java.util.*;
public class primeSieve{
	public static void sieve(int n){
		ArrayList<Boolean> isPrime = new ArrayList<Boolean>();
		for(int i=0;i<=n;i++){
			isPrime.add(true);
		}	
		for(int i=2;i<=Math.sqrt(n);i++){
			if(isPrime.get(i)){
				for(int j=i*2;j<=n;j+=i){
					isPrime.set(j, false);
				}
			}
		}
		System.out.println("Primes: ");
		for(int i=0;i<=n;i++){
			if(isPrime.get(i)){
				System.out.print(Integer.toString(i)+" ");
			}
		}
		System.out.println();
	}
}
