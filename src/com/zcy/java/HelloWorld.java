package com.zcy.java;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Helloworld!");

//模板一：psvm
//模板二：sout
//模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//模板四：list.for
        /*ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        for (Object o : list) {

        }*/

//模板五：ifn
        /*ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);
        if (list == null) {

        }*/
    }
//模板六：prsf可生成private static final
//    private static final Customer cust = new Customer();
    
    public void testUpdate(){
//这是自定义的test快捷方式
    }
    
    /**
    *客户的id
    */
    private int id;

    /**
    *客户的姓名
    */
    private String name;
    
    

}