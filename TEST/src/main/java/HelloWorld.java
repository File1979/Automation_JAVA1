import java.util.Scanner;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class HelloWorld {

	public static void main(String[] args) {

		 int s = 9068000; int sec = s % 60; int m = s / 60; int min = m % 60;
		 int h = m / 60; int hours = h % 60; int days = h / 24; int w = days / 7;
		 System.out.println(w + " неделя " +days + " дней "+ hours + " часов " + min +
		 " минут " + sec + " секунд");

		 /*
		 * Scanner in = new Scanner(System.in); int x1; x1 = in.nextInt(); int x2; x2 =
		 * in.nextInt(); int y1; y1 = in.nextInt(); int y2; y2 = in.nextInt(); double
		 * ras;
		 * 
		 * ras = Math.sqrt ((Math.pow((x2-x1),2)+ Math.pow((y2-y1),2)));
		 * System.out.println (ras);
		 */

		/*
		 * int A, B, tmp; A=10; B=20; tmp=A; A=B; B=tmp; System.out.println (A);
		 * System.out.println (B);
		 */

		/*
		 * int a=52, lev, prav; lev = a/10; prav = a%10; System.out.println (lev);
		 * System.out.println (prav);
		 */

		/*
		 * int a=479, lev, sred, prav; lev = a/100; prav = a%10; sred = (a%100)/10;
		 * System.out.print (prav); System.out.print (sred); System.out.print (lev);
		 */

		/*
		 * int A; Scanner in = new Scanner(System.in); A = in.nextInt(); if (A>0)
		 * {System.out.println (A+1);} else {System.out.println (A-2); }
		 */

		/*
		 * int A, B, C, K1, K2; Scanner in = new Scanner(System.in); K1=0; K2=0; A =
		 * in.nextInt(); B = in.nextInt(); C = in.nextInt(); if (A>0) {K1=K1+1;} else
		 * {K2=K2+1;} if (B>0) {K1=K1+1;} else {K2=K2+1;} if (C>0) {K1=K1+1;} else
		 * {K2=K2+1;} System.out.println
		 * ("количество положительных чисел в наборе равно "+ K1); System.out.println
		 * ("количество отрицательных чисел в наборе равно "+ K2);
		 */

		/*
		 * int A, B, K1; Scanner in = new Scanner(System.in); A = in.nextInt(); K1=A; B
		 * = in.nextInt(); if (A!=B) {A=A+B; B=K1+B;} else {A=0; B=0;}
		 * 
		 * System.out.println ("переменная A="+A + "  переменная B="+B);
		 */

		/*
		 * int g = 2016; if(g % 4 == 0) { if(g % 100 == 0) { if(g % 400 == 0) {
		 * System.out.println("Високосный"); } else {
		 * System.out.println("Не високосный"); } } else {
		 * System.out.println("Високосный"); } } else {
		 * System.out.println("Не високосный"); }
		 */

		/*
		 * int x = (int) (Math.random()*21-10); if(0 < x && x < 9000) {
		 * System.out.println("Значение x=" + x + " попадает в промежуток."); }
		 * 
		 * else {System.out.println ("Не попадает в промежуток"); }
		 */

		/*
		 * if(n == 1) { System.out.println("Понедельник"); } else if(n == 2) {
		 * System.out.println("Вторник"); } else if(n == 3) {
		 * System.out.println("Среда"); } else if(n == 4) {
		 * System.out.println("Четверг"); } else if(n == 5) {
		 * System.out.println("Пятница"); } else if(n == 6) {
		 * System.out.println("Суббота"); } else if(n == 7) {
		 * System.out.println("Воскресенье"); } else {
		 * System.out.println("Дня с таким номером не существует"); }
		 */
		
		/*
		 * Scanner in = new Scanner(System.in); int n; n = in.nextInt(); switch (n) {
		 * case 1: System.out.print("День недели: "); System.out.println("Понедельник");
		 * break; case 2: System.out.print("День недели: ");
		 * System.out.println("Вторник"); break; case 3:
		 * System.out.print("День недели: "); System.out.println("Среда"); break; case
		 * 4: System.out.print("День недели: "); System.out.println("Четверг"); break;
		 * case 5: System.out.print("День недели: "); System.out.println("Пятница");
		 * break; case 6: System.out.print("День недели: ");
		 * System.out.println("Суббота"); break; case 7:
		 * System.out.print("День недели: "); System.out.println("Воскресенье"); break;
		 * default: System.out.println("Дня с таким номером не существует"); }
		 */

		/*
		 * int x = (int)(Math.random()*100); String s = x % 10 == 0 ?
		 * "Заканчивается на ноль." : "Не заканчивается на ноль.";
		 * System.out.println(s);
		 */

		/*
		 * Scanner in = new Scanner(System.in); int n; n = in.nextInt(); switch (n%10) {
		 * case 0: System.out.print(n +" рублей "); break; case 1: System.out.print(n
		 * +" рубль "); break; case 2: System.out.print(n +" рубля "); break; case 3:
		 * System.out.print(n +" рубля "); break; case 4: System.out.print(n
		 * +" рубля "); break; case 5: System.out.print(n +" рублей "); break; case 6:
		 * System.out.print(n +" рублей "); break; case 7: System.out.print(n
		 * +" рублей "); break; case 8: System.out.print(n +" рублей "); break; case 9:
		 * System.out.print(n +" рублей "); break;
		 * 
		 * default: System.out.println("таких денег не существует"); }
		 */

// ДЗ про дату, дни недели через 1000 дней

		/*
		 * Date currentDate = new Date(); Long time = currentDate.getTime();
		 * SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyyг EEEE");
		 * System.out.println(sdf2.format(currentDate)); for (int i = 0; i <= 50; i++) {
		 * long anotherDate = 1000; time = time + (60 * 60 * 24 * 1000 * anotherDate);
		 * System.out.println(sdf2.format(time));
		 * 
		 * }
		 */

// ДЗ про массив (array 3)

		
		/*
		 * Scanner in = new Scanner(System.in); int n, a, d; n = in.nextInt(); int[] M =
		 * new int[n]; // вводим размер массива a = in.nextInt(); // вводим первый
		 * элемент массива d = in.nextInt(); // вводим разность арифметической
		 * прогрессии M[0] = a; System.out.print("Первые " + n +
		 * " членов арифметической прогрессии ");
		 * System.out.print("с первым элементом массива " + a + " и разницей " + d +
		 * ":"); for (int i = 0; i < n; i++) { M[i] = a + i * d; System.out.print("  " +
		 * M[i]); }
		 */
		 

// ДЗ про матрицу 21

		/*
		 * Scanner in = new Scanner(System.in); int M, N; M = in.nextInt(); N =
		 * in.nextInt(); int[] [] arr = new int[M][N]; // задаем количество строк и
		 * столбцов массива for (int i = 0; i < M; i++) { arr [i]=(int[(Math.random()];
		 * System.out.println("Случайная матрица " + arr[i]); } for (int j = 0; j < N;
		 * j++) { arr [j]=(int) (Math.random()); System.out.println("Случайная матрица "
		 * + arr[j]); }
		 * 
		 * for(int i=1;i<M;i+=2) { double avg=0; for(int j=0;j<N;j++) avg+=x[i][j];
		 * avg/=N; cout<<i<<' '<<avg<<endl; } System.out.print("  " + M[i]); }
		 */

		/*
		 * int s = 0; int i = 1; while(i<=200) { s = s + i; i++; }
		 * 
		 * System.out.print("  " + s);
		 */

// надо получить ряд случайных чисел, и посчитать среднее арифметическое от них.
// Ввод чисел прекращается, если очередным числом будет ноль.

		/*
		 * double sr = 0; double sum =0; int n = 0; int x = (int)(Math.random()*20);
		 * while(x != 0) { sum += x; n ++; x = (int)(Math.random()*20); } if(n != 0) {
		 * sr = sum / n; } else sr = 0; System.out.println("среднее:" + sr);
		 */

// вывести на экран первые десять целых чисел, которые делятся на 3 без остатка.

		 /*int n = 10; int k = 1; for(int i = 1; k <= n; i++) { if(i % 3 == 0) {
		 System.out.println("\n" + k + ":   " + i); k++; } }*/


// таблица умножения
		/*
		 * for(int i=1;i<10;i++) { for(int j=1;j<10;j++) { System.out.print(i*j + "  ");
		 * } System.out.println(" "); }
		 */

		

//необходимо распечатать набор единиц в виде треугольника	
		// Внешний цикл обеспечивает перебор строк, 
		// а вложенный — выводит сами значения внутри одной строки. Здесь в условии вложенного цикла присутсвует переменная i — счетчик внешнего. 
		// Именно за счет нее происходит изменение количества ввыводимых единиц в каждой строке.
		
		/*int i;
		for (i = 1; i < 20; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("1 ");
			}
			System.out.println("");
		}*/
		
// Имеется программа распечатывающая числа в виде треугольника, где первая строка — самая длинная, вторая короче и тд. 
// В каждой строке выводятся номера строк, начиная с единицы
		
	       /* for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 10-i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
		}*/
		
		
// работа оператора break
		
		/*double x;
		double y;
		for(x = -2; x <= 2; x +=0.25)
		{
		  if(x == 0)
		    break;
		  y = 1 / x;
		  System.out.println("x=" + x + " y=" + y );
		}*/

		
// работа оператора continue (пропускаем один проход)
// В результате будут выведены все строки, кроме строки с x равным нулю
		
		/*double x;
		double y;
		for(x = -2; x <= 2; x +=0.25)
		{
		  if(x == 0)
		    continue;
		  y = 1 / x;
		  System.out.println("x=" + x + " y=" + y );
		}*/
	
// заполнение массива случайными числами
		
		/*int size = 20;
		int marks[] = new int[size];
		int i;
		System.out.print("Элементы массива :");
		for(i=0;i<size;i++)
		{
		  marks[i] = (int)(Math.random()*100+1);
		  System.out.print(" "+ marks[i]);
		}*/
		
// Следует провести воспитательную работу с учениками, получившими неудовлетворительные оценки (т.е. 3 и ниже), 
//	для этого вам необходимо получить список номеров этих учеников:
		
		/*int marks []= {10,3,6,9,4,3,8,6,4,8,7,9,8,8,5,2,9,4,6,9};
		for(int i=0;i<marks.length;i++)
		{
		  if(marks[i] <= 3)
		    System.out.println("Ученик №" + i + "=" + marks[i]);
		}*/
		
// перед нами стоит задача поиска максимального элемента массива
		
		/*int marks[]= {1,3,6,9,4,3,8,6,4,8,7,9,10,8,5,2,9,4,6,9};
		int m = marks[0];
		for(int i=0;i<marks.length;i++)
		{
		  if(m < marks[i])
		    m = marks[i];
		}
		System.out.println("максимальная оценка =" + m);*/
		
// задача, в которой требуется найти номер элемента массива с указанным значением
		
		/*int val = 6;
		int num = -1;
		int marks[]= {1,3,6,9,4,3,8,6,4,8,7,9,10,8,5,2,9,4,6,9};
		for(int i=0;i<marks.length;i++)
		{
		  if(marks[i] == val)
		    num = i;
		}
		if(num == -1)
		  System.out.println("Элемент с таким значением не найден.");
		else
		  System.out.println("Номер элемента = "+num);*/
		
//сортировка	
		
		/*int marks[]= {1,3,6,9,4,3,8,6,4,8,7,9,10,8,5,2,9,4,6,9};
		int m;
		System.out.print("Сортировка массива по убыванию: ");
		for(int i=0;i<marks.length;i++)
		{
		  m=i;
		  for(int j=i;j<marks.length;j++)
		  {
		     if(marks[m] < marks[j])
		       m = j;
		  }
		  int t;
		  t = marks[m];
		  marks[m] = marks[i];
		  marks[i] = t;
		  System.out.print(marks[i]+ "  ");
		}*/
		
// сравнение строк
		
		/*String s1 = "x="+(int)(Math.random()*10);
		String s2 = "x=" + (int)(Math.random()*20);
		System.out.println(s1 + " " + s2);
		if((s1).compareTo(s2) > 0)  {
		  System.out.println("Первая строка больше второй");
		}
		else{
		  System.out.println("Вторая строка больше либо равна первой");
		}*/
		
		
// подсчет количества символов при помощи функции charAt
		
		/*String str = "Тест,овая, строка, !!, &, **,с нес,,коль,кими,, запятыми";
		int n = 0;
		char symbol;
		for(int i=0;i < str.length();i++){
		  symbol = str.charAt(i);
		  if((symbol == ',')||(symbol == '&')||(symbol == '!')||(symbol == '*'))
		    n++;
		}
		System.out.println("У нас есть " + n + " спецсимволов");*/
		
// подсчет количества двойных запятых при помощи функции indexOf
		
	/*	String str = "Тестовая,, строка, с нескол,,ькими,, запятыми";
		int n = 0;
		int p = 0;
		while(p != -1) {
		  p = str.indexOf(",,",p);
		  if(p != -1) {
		    p++;
		    n++;
		  }
		}
		System.out.println("У нас есть " + n + " запятых");*/
		
		
//Имеется строка, в которой надо найти все числа (именно числа, а не отдельные цифры) и распечатать их
		
		/*String s = "x=12 y=15 z=256";
		String sn = "";
		for(int i=0;i < s.length();i++)
		{
		  if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
		  {
		    sn += s.charAt(i);
		  }
		  else
		  {
		    if(!sn.equals(""))
		    {
		      System.out.println(sn);
		      sn="";
		    }
		  }
		}
		if(!sn.equals(""))
		  System.out.println(sn);*/
		
	
//Будет выведен результат NOT EQUALS, не смотря на то, что сравниваются строки с одним и тем же текстом. 
// при этом если в условии написать "Test String".equals(s2) будут сравнены тексты строк и выдан результат EQUALS.	
		
	/*	String s2 = new String("Test String");
		if("Test String" == s2)
			  System.out.println("EQUALS");
			else 
			  System.out.println("NOT EQUALS");*/
		
		 
		/*int s="123".compareTo("93");
		System.out.println(s);*/
	}
		
}
