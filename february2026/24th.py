# You are given the root of a binary tree where each node has a value 0 or 1.
# Each root-to-leaf path represents a binary number starting with the most significant bit.

# For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent
#  01101 in binary, which is 13.
# For all leaves in the tree, consider the numbers represented by the path from 
# the root to that leaf. Return the sum of these numbers.

# The test cases are generated so that the answer fits in a 32-bits integer.
                #         1
                #     /       \
                #     0       1
                # /   \      /    \
                # 0   1      0    1

# corresponds to 1010101 = 22
# each root -> leaf pathforms a binary number
# 100 = 4
# 101 = 5
# 110 = 6
# 111 = 7    total is 22

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def sumRootToLeaf(self, root) -> int:
        def dfs(node, current):
            if not node:
                return 0
            
            current = current*2 + node.val

            if not node.left and not node.right:
                return current
            
            return dfs(node.left, current) + dfs(node.right, current)
        
        return dfs(root, 0)
 
root = TreeNode(1)
root.left = TreeNode(0)
root.right = TreeNode(1)

root.left.left = TreeNode(0)
root.left.right = TreeNode(1)

root.right.left = TreeNode(0)
root.right.right = TreeNode(1)
print(Solution().sumRootToLeaf(root))
        

