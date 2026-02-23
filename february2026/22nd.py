#question

# Given a positive integer n, find and return the longest 
# distance between any two adjacent 1's in the binary '
# 'representation of n. If there are no two adjacent 1's, return 0.

# Example 1:

# Input: n = 22
# Output: 2
# Explanation: 22 in binary is "10110".
# The first adjacent pair of 1's is "10110" with a distance of 2.
# The second adjacent pair of 1's is "10110" with a distance of 1.
# The answer is the largest of these two distances, which is 2.
# Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.
# Example 2:

# Input: n = 8
# Output: 0
# Explanation: 8 in binary is "1000".
# There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.
# Example 3:

# Input: n = 5
# Output: 2
# Explanation: 5 in binary is "101".
 

# Constraints:

# 1 <= n <= 109

# first alternative converting first to string

# def binaryGap(n: int) -> int:
#     binary = bin(n)[2:]  # remove '0b'
    
#     max_distance = 0
#     last_position = -1
    
#     for i in range(len(binary)):
#         if binary[i] == '1':
#             if last_position != -1:
#                 max_distance = max(max_distance, i - last_position)
#             last_position = i
    
#     return max_distance

#second alternative bitwise operation
def binaryGap(n):
    max_distance = 0
    last_position = -1
    position = 0

    while n > 0:
        if n & 1:
            if last_position != -1:
                distance = position - last_position
                if distance > max_distance:
                    max_distance = distance
            last_position = position
        
        n >>= 1
        position += 1

    return max_distance
    
num = 10

print(binaryGap(num))