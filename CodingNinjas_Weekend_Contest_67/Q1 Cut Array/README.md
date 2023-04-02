# Problem Description:

You are given an array of length 'N'. You can cut an array at an index 'i' to split the array into two arrays, one containing elements from indices 0 to 'i-1' and the other containing the rest.

Your goal is to make all arrays sorted in non-decreasing order. You can perform cuts on 'A' and all subsequent arrays formed from cuts.

Return the minimum number of cuts you have to perform.

## For Example:

Let 'N' = 3, 'A' = [2, 5, 3].

We perform a cut at index '2' to obtain the arrays: [2, 5] and [5]. All arrays are now sorted in non-decreasing order.
It can be shown that this is the minimum number of cuts needed.
Thus, the answer is '1'.