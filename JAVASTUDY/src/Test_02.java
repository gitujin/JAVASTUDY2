import java.util.*;

public class Test_02 {
	
	static class Interval implements Comparable<Interval>{
			public Integer begin, end;
			
		public Interval(Integer begin, Integer end) {
				this.begin = begin;
				this.end = end;
			}

		@Override
		public int compareTo(Interval other) {
			// TODO Auto-generated method stub
			return this.begin.compareTo(other.begin);
		}
	}
		
		public static ArrayList<Interval> solution(Interval[] a){
			int n = a.length;
			ArrayList<Interval> result = new ArrayList<>();
			Arrays.sort(a); //오름차순으로 정리
			result.add(a[0]);
			for(int i = 1; i<n; i++) {
				Interval last = result.get(result.size()-1);
				if(a[i].begin > last.end) { // 새로 들어온 배열의 시작 값이 원래 있던 오른쪽 값 보다 큰 경우
					result.add(a[i]); // 배열에  추가
				}
			}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Interval[] data = new Interval[n];
		for(int i = 0; i<n; i++) {
			Integer b = sc.nextInt();
			Integer e = sc.nextInt();
			data[i] = new Interval(b,e);
		}
		sc.close();
		
		ArrayList<Interval> result = solution(data);
		for(Interval i:result)
			System.out.println(i.begin + " " + i.end);
	}

}
