/*My answer
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i=left; i<=right; i++) {
            if (i<10) {
                list.add(i);
            } else {
                int j = 10;
                boolean flag = true;
                while (i*10/j!=0) {
                    if((i%j)*10/j==0) {
                        flag = false;
                    } else if (i%((i%j)*10/j)!=0) {
                        flag = false;
                    }
                    j *= 10;
                }
                if (flag) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}

/*Reference
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) break;
            }
            if (j == 0) list.add(i); 
        }
        return list;
    }
}*/

// optimize
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i<10) {
                list.add(i);
                continue;
            }
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) break;
            }
            if (j == 0) list.add(i); 
        }
        return list;
    }
}