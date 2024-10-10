class Main{

  public static void main(String[] args) {

    boolean[] flag = new boolean[100001];

    for(int i = 1; i <= 10000; i++){
      int dnum = d(i);
      if(dnum <= 10000){
        flag[dnum] = true;
      }
    }

    for(int i = 1; i <= 10000; i++){
      if(!flag[i]){
        System.out.println(i);
      }
    }


  }

  public static int d(int num){
    int sum = num;
    while(num > 0){
      sum += num % 10;
      num = num / 10;
    }
    return sum;
  }
}
