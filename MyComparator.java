package hackveda.bhavesh.firstProject;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			
			if (o1 >= o2) {
				
				return o1;
				
			}else {
				
				return o2;
			}
			
		}

}
