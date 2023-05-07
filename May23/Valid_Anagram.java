// @DSA Sheet by Apna collage
// https://leetcode.com/problems/valid-anagram/

package Analysis;

import java.util.Arrays;

public class Practice
{

	public static void main(String[] args)
	{
		System.out.println(isAnagram("rat", "tur"));

	}

	private static int[] getfreq(String s)
	{
		int[] freq = new int[26];

		for(int i = 0; i < s.length(); i++)
		{
			freq[s.charAt(i) - 'a'] += 1;
		}

		return freq;
	}

	public static boolean isAnagram(String s, String t)
	{
		return (Arrays.equals(getfreq(s), getfreq(t)));
	}

}
