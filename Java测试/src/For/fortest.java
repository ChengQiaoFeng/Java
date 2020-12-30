package For;


import java.util.Arrays;

public class fortest {
    public static void main(String[] args) {
        //  int i;

        /*   能被3或5或7整除的数i后面分别加foo，biz，baz;*/

//        for(i=1;i<=150;i++){
//            String str = "";
//            str +=i;
//            if(i%3==0){
//                str +="foo";
//            }
//            if(1%5==0){
//                str +="biz";
//            }
//            if(i%7==0){
//                str +="baz";
//            }
//            System.out.println(str);

        /* 输出能被7整除的整数的个数，并输出总数;*/

//        for (i = 1; i <= 100; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//                q++;
//                result +=i;
//            }
//        }System.out.println("结果是"+result+"，1-100一共有："+
//                q+"个能被7整除的数。");

        /* 输出石str=i*i*i+j*j*j+p*p*p; */

//        for (i = 100; i <= 999; i++) {
//            //145,145=145/100=1;145=(145-1*100)/10=4;145=(145-1*100-4*10)=5;
//            int result = i / 100;
//            int q = (i - result * 100) / 10;
//            int m = (i - result * 100 - q * 10);
//  //            System.out.println(i);
//  //            System.out.println(result+" "+q+" "+m);
//            int str = result * result * result + q * q * q + m * m * m;
//            if (str == i) {
//                System.out.println(i);
//            }
//        }

        /* 输出乘法口诀表9*9，排列整齐;*/

//        for(int i=1;i<=9;i++) {
//            for(int j=1;j<=i;j++){
//                System.out.print(i+"*"+j+"="+(i*j)+"  ");
//            }
//            System.out.println();
//        }

        /* 1-100之间的质数(质数是一个大于1的自然数并且只能被1和它本身整除)
        //  7，循环i到7，用7与循环1到7之间的数分别取模，看能被整除的次数，如果
        整除的次数只有2次，那可以判断是一个质数
        //  4,1 2 4,能被整除3次，不是质数。 */

//        for(int i = 1; i <=100; i++){
//            int k =0;
//            for(int j=1;j<=i;j++){
//                if(i % j == 0){
//                    k++;
//                }
//            }
//            if(k==2)
//                System.out.println(i);
//        }

        /* 获取arr数组中所有元素的和；使用for循环。*/

//        int[][] arr = new int[][]{
//                {3,8,2},
//                {2,7},
//                {9,0,1,6}
//        };
//        int i,j;
//
//        int result=0;
//        for(i=0;i< arr.length;i++){
//            for(j=0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]);
//                result += arr[i][j];
//            }
//        }
//        System.out.println(result);

        /* 遍历排序数组求最大值和最小值，总和，平均数；*/

        int[] arr =  new int[]{4,7,8,6,5,9,2,0};
        //最大值
//        int max= arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(max < arr[i]){
//                max=arr[i];
//            }
//        }
//        System.out.println("最大值:" + max);
//        //最小值
//        int min = arr[0];
//        for(int j=0;j< arr.length;j++){
//            if(min > arr[j]){
//                min = arr[j];
//            }
//        }
//        System.out.println("最小值:" + min);
//        //总和
//        int add = 0;
//        for(int i= 0;i< arr.length;i++){
//            add += arr[i];
//        }
//        System.out.println("总和:" + add);
//        //求平均数
//        System.out.println("平均数:" + (add / arr.length));
        /*复制数组*/
//        int[] copy = new int[arr.length];//声明一个与arr长度一致的数组；
//        for(int i = 0;i< arr.length;i++){
//            copy[i] = arr[i];
//               //  System.out.println(copy[i]);//两种输出copy方式；
//        }
//
//        for(int j = 0;j<arr.length;j = j + 2){
//            copy[j]=j;
//        }
//        System.out.println(Arrays.toString(copy));

        /*数组的反转*/

//        //int[] arr = new int[]{4,2,7,1,3,5};
//        //考虑声明一个数组temp，数组temp的长度与arr的长度一致，倒着循环arr，正着赋值;
//        //temp就是arr的倒叙色数组，然后在把temp赋值给arr；
//        //一个数组的最后一个元素，他的下标等于数组的长度-1，因为元素的下标是从0开始;
//
//        int[] temp = new int[arr.length];
//        int k = 0;
//        for (int i = arr.length-1;i>=0;i--){
//          //  System.out.println(arr[i]);
//            temp[k] = arr[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(temp));
//        for(int j = 0;j<= arr.length;j++){
//            arr[j] = temp[j];
//        }
//        System.out.println(Arrays.toString(arr));

        /*冒泡排序法排列数组元素大小*/

//        //正序，从小到大;
//        int b;
//        for(int i= 0;i<arr.length-1;i++){//外层循环轮次，轮次循环的次数是数字长度-1
//            for (int j = 0;j < arr.length - 1 - i;j++){//每一轮次的数字对比排序
//                if(arr[j] > arr[j+1]){
//                    b = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = b;
//                }
//            }
//        }
//        System.out.println("从小到大排列:arr" + Arrays.toString(arr));
//
//        //倒序，从大到小;
//        for(int i= 0;i<arr.length-1;i++){//外层循环轮次，轮次循环的次数是数字长度-1
//            for (int j = 0;j < arr.length - 1 - i;j++){//每一轮次的数字对比排序
//                if(arr[j] < arr[j+1]){
//                    b = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = b;
//                }
//            }
//        }
//        System.out.println("从大到小排序:arr" + Arrays.toString(arr));

    }
}
