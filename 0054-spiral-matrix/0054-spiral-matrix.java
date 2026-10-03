class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        while(left<=right && top<=bottom){
            for (int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for (int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if (top<=bottom){
                for (int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
            }    
            bottom--;
            if (left<=right){
                for (int i=bottom;i>=top;i--){
                   list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }
}
//┌─────────────────────────────────────────┐ │ SPIRAL MATRIX TRAVERSAL INTUITION │ └────────────────────┬────────────────────┘ │ ┌──────────────────────────────────┼──────────────────────────────────┐ │ │ │ ┌────────┴────────┐ ┌────────┴────────┐ ┌────────┴────────┐ │ BOUNDING BOX │ │ 4-STEP CYCLE │ │ EDGE CASES │ │ MENTAL MODEL │ │ (CLOCKWISE) │ │ &amp; TERMINATION │ └────────┬────────┘ └────────┬────────┘ └────────┬────────┘ │ │ │ ├─ 4 Boundary Walls ├─ Step 1: Top Row ├─ Loop Condition │ • top = 0 │ • Move: left → right │ • left &lt;= right &amp;&amp; │ • bottom = n-1 │ • Row fixed: top │ top &lt;= bottom │ • left = 0 │ • Shrink: top++ │ │ • right = m-1 │ ├─ Single Row Check │ ├─ Step 2: Right Col │ • if (top &lt;= bottom) ├─ Layer Peeling Concept │ • Move: top → bottom │ • Prevents duplicate │ • Process outer perimeter │ • Col fixed: right │ bottom-row print │ • Shrink boundaries inward │ • Shrink: right-- │ │ • Repeat for inner sub-matrix │ └─ Single Col Check │ ├─ Step 3: Bottom Row • if (left &lt;= right) └─ Space Efficiency │ • Move: right → left • Prevents duplicate • O(1) auxiliary space │ • Row fixed: bottom left-col print • Just 4 pointer variables │ • Shrink: bottom-- │ └─ Step 4: Left Col • Move: bottom → top • Col fixed: left • Shrink: left++