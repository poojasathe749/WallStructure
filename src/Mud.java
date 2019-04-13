import java.util.Scanner;

public class Mud {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of sticks");
		int noOfStick = sc.nextInt();
		int maxStick = 0;
		int maxHeight = 0;
		int temMaxHeight=0;
		int h=0;
		System.out.println("Position of sticks");
		int pos[] = new int[noOfStick];
		for (int i = 0; i < noOfStick; i++) {
			pos[i] = sc.nextInt();
			if (maxStick < pos[i]) {
				maxStick = pos[i];

			}

		}

		int height[] = new int[noOfStick];
		System.out.println("Height of sticks");
		for (int i = 0; i < noOfStick; i++) {
			height[i] = sc.nextInt();
			if (maxHeight < height[i]) {
				maxHeight = height[i];

			}

		}
		maxHeight += 2;
		String arr[][] = new String[maxHeight + 2][maxStick];
		for (int i = 0; i < noOfStick; i++) {
			int j = maxHeight - (height[i]);
			do {
				arr[j][pos[i] - 1] = Integer.toString(pos[i]);

				j++;
			} while (j < maxHeight);
		}
		System.out.println("Array og complet position and height");
		
		
		for (int i = 0; i < maxHeight; i++) {
			for (int j = 0; j < maxStick; j++) {

				System.out.print(arr[i][j] + "          ");

			}
			System.out.println();
		}


	
	
	for (int i =0; i <noOfStick-1;i ++) {
		int tempPos= pos[i+1]-pos[i];
		if(pos[i+1]-pos[i]!=1)
		
			{
				System.out.println("space is there"+ (pos[i+1]-pos[i] ));
		
					if(height[i]<height[i+1])
			
						{
							temMaxHeight=height[i]+1;
							System.out.println("Maximum height for the mud "+temMaxHeight);
								for(int position=1;position<tempPos;position++)
									{
			 
										for (int j=0;j<maxStick-1;j++) //row check for null
										{
											System.out.println("temp value of j "+j);
				
											if(arr[maxHeight-1][j]==null) //if found any field in row null
											{
												
												
												//if(h<(maxStick-1))
												//{
												for(int k =0 ;k<temMaxHeight;k++) //replace null to M for Temp max height
													
												{
														
													for(int p=maxHeight-1; p>=temMaxHeight; p--)//change the position of column
													{
														
													
																
															if(arr[maxHeight-1][h]==null) 
															{
														arr[p][k] = ((arr[p][k] == null) ? "M" : arr[p][k]);
														
															}
														
													}
													h++;		
													}
												
												//}
											} 
										}
     
		
		
		
									}

						}

			}
		}
			for (int i = 0; i < maxHeight; i++) {
				for (int j = 0; j < maxStick; j++) {

					System.out.print(arr[i][j] + "          ");

				}
				System.out.println();
			}
			
			//else{}
	}
}

