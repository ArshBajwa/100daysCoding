class KthLargest {
    private PriorityQueue<Integer>p=new PriorityQueue<>();
    private int k;
        public KthLargest(int k, int[] nums) {
            this.k=k;
              for(int e:nums){
                  add(e);
              }
              
        }
        
        public int add(int val) {
            p.add(val);
            if(p.size()>k){
                p.poll();
            }
            return p.peek();
            
        }
    }