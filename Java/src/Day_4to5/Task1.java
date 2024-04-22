package Day_4to5;

public class Task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{1,2,3},{1,2,3},{1,2,4}
		};
		matrix m=new matrix(3,3);
		m.matrixvalues(arr);
		

	}
}
class matrix {
	int[][] matrix;
	int row;
	int column;
		
		public matrix(int row, int column)
		{
			this.row=row;
			this.column=column;
			this.matrix=new int[row][column];
		}
		public void matrixvalues(int[][] arr)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					matrix[i][j]=arr[i][j];
				}
			}
			for (int i=0;i<row;i++) {
	            for (int j=0;j<column;j++) {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
		}

	}



