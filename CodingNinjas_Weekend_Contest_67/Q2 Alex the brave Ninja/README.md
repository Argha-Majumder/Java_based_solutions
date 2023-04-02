# Problem Description:
Once upon a time, there was a Ninja named Alex. One day, while on a mission, Alex stumbled upon a strange code written in digits. The code was a string 'S' consisting of 'N' digits from 0 to 9. Being a skilled Ninja, Alex knew he could use his abilities to manipulate the code to make it the lexicographically smallest possible.

Alex had the power to perform a special operation on the code as many times as he wanted. The operation allowed him to select a digit 'd' at a specific position 'i' in string and delete it. Then, he could insert the digit 'min(d+1,9)' at any position he desired, whether it be at the beginning, end, or in between any two adjacent digits.

The goal for Alex was to use this operation to rearrange the code and make it the lexicographically smallest string possible. 

## Example:
Input: 'N' = 5, 'S' = "04829"

Output: "02599"

The original string "S" is "04829".

First, Alex decided to delete the digit "8" at position 3 and insert the digit "9" at the end of the notation. The resulting notation is "04299".

Next, Alex decided to delete the digit "4" at position 2 and insert the digit "5" in the 3rd position of the notation. The resulting notation is "02599".

At this point, Alex has rearranged the string string so that it is the lexicographically smallest string possible. The final answer is "02599".

It's important to note that the order of the operation is important. In case of the example, if Alex had chosen to insert 5 first, then the string would have become 54829, and the next operation would have resulted in a bigger number.

