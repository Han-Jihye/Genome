
public class dna {

	public static void main(String[] args) {
		
		char ans[][] = {{'A', 'C', 'G', 'T', 'C', 'G', 'T', 'A', 'A', 'C'},
						{'G', 'A', 'T', 'A', 'T', 'A', 'G', 'G', 'C', 'A'},
						{'T', 'T', 'A', 'G', 'C', 'T', 'C', 'A', 'T', 'T'},
						{'A', 'G', 'C', 'C', 'G', 'G', 'A', 'G', 'A', 'C'}};
						  
		int percent = 0;
		
			for(int i=0; i<4; i++){
				for(int j=0; j<10; j++){
					if(args[j].charAt(0)==ans[i][j])
						percent+=10;
					
				}
				
				System.out.println((i+1)+"��°�� " +percent+"%�� ��ġ�մϴ�.");
				percent = 0;
			}
		}
	}


