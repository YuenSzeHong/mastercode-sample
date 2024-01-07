# Sample Questions - HKJava MasterCode

## Question 1:
Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

#### Example 1:
- Input: s = "leetcodeisacommunityforcoders"
- Output: "ltcdscmmntyfrcdrs"

#### Example 2:
- Input: s = "aeiou"
- Output: ""
 
#### Constraints:
- 1 <= s.length <= 1000
- s consists of only lowercase English letters.

## Question 2:
There is a special keyboard with all keys in a single row.

Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25). Initially, your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is |i - j|.

You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.

#### Example 1:
- Input: keyboard = "abcdefghijklmnopqrstuvwxyz", word = "cba"
- Output: 4
- Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
- Total time = 2 + 1 + 1 = 4. 

#### Example 2:
- Input: keyboard = "pqrstuvwxyzabcdefghijklmno", word = "leetcode"
- Output: 73

#### Constraints:
- keyboard.length == 26
- keyboard contains each English lowercase letter exactly once in some order.
- 1 <= word.length <= 104
- word[i] is an English lowercase letter.

## Question 3:
You are given two integer arrays nums1 and nums2 where nums2 is an anagram of nums1. Both arrays may contain duplicates.

Return an index mapping array mapping from nums1 to nums2 where mapping[i] = j means the ith element in nums1 appears in nums2 at index j. If there are multiple answers, return any of them.

An array a is an anagram of an array b means b is made by randomizing the order of the elements in a.

#### Example 1:
- Input: nums1 = [12,28,46,32,50], nums2 = [50,12,32,46,28]
- Output: [1,4,3,2,0]
- Explanation: As mapping[0] = 1 because the 0th element of nums1 appears at nums2[1], and mapping[1] = 4 because the 1st element of nums1 appears at nums2[4], and so on.

#### Example 2:
- Input: nums1 = [84,46], nums2 = [84,46]
- Output: [0,1]
 
#### Constraints:
- 1 <= nums1.length <= 100
- nums2.length == nums1.length
- 0 <= nums1[i], nums2[i] <= 105
- nums2 is an anagram of nums1.

#### Scoring System: Completion Time + Time Complexity
- Details will be provided during the competition.