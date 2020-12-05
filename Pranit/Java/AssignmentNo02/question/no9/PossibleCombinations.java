package question.no9;

import java.util.Scanner;

public class PossibleCombinations {
public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        int [] array = new int[3];
        
        System.out.println ("Enter digit: ");
        for (int i = 0; i < 3; i++)
        {
            array[i] = sc.nextInt();
        }
        
		for (int x = 0; x < 3; x++)
        {
			for (int y = 0; y < 3; y++) 
            {
				for (int z = 0; z < 3; z++) 
                {
					if (x != y && y != z && z != x) 
                    {
						System.out.println(array[x] + "" + array[y] + "" + array[z]);
					}
				}
			}

		}

	}
}
