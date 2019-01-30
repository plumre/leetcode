package binarytree;

/*
 * Created by renhongjiang on 2019/1/30.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 *
 * @author renhongjiang
 * @version 1.0
 * @date 2019/1/30 17:04
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        List<Integer> integers = solution.preorderTraversal(root);

        System.out.println(integers);
    }


}

class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {


        List<Integer> list = new ArrayList<>();
        Stack<Object> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop == null) {
                continue;
            }
            if (pop instanceof TreeNode) {
                TreeNode node = (TreeNode) pop;
                stack.push(node.right);
                stack.push(node.left);
                stack.push(node.val);
            } else {
                list.add((Integer) pop);
            }
        }
        return list;
    }
}
