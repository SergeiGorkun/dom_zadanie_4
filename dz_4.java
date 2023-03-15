// 1. Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

// public static void main(String[] args) {
         
//     String str1 = "Java";
//     String str2 = new String(); // пустая строка
//     String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
//     String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);
         
//     System.out.println(str1); 
//     System.out.println(str2);
//     System.out.println(str3); 
//     System.out.println(str4);
// }



// 2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.


// import com.google.common.collect.Lists;
 
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
 
// class Main
// {
//     public static<T> List<T> reverseList(List<T> list) {
//         return new ArrayList<>(Lists.reverse(list));
//     }
 
//     public static void main(String[] args)
//     {
//         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 
//         List<Integer> reverse = reverseList(list);
//         System.out.println(reverse);
//     }
// }