import java.util.Scanner;

public class ques3 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the month number:");
                    int monthNumber = sc.nextInt();
                    int monthDay;
                    String monthName;
                    switch (monthNumber) {
                              case 1:
                                        monthDay = 31;
                                        monthName = "January";
                                        break;
                              case 2:
                                        monthDay = 28;
                                        monthName = "February";
                                        break;
                              case 3:
                                        monthDay = 31;
                                        monthName = "March";
                                        break;
                              case 4:
                                        monthDay = 30;
                                        monthName = "April";
                                        break;
                              case 5:
                                        monthDay = 31;
                                        monthName = "May";
                                        break;
                              case 6:
                                        monthDay = 30;
                                        monthName = "June";
                                        break;
                              case 7:
                                        monthDay = 31;
                                        monthName = "July";
                                        break;
                              case 8:
                                        monthDay = 31;
                                        monthName = "August";
                                        break;
                              case 9:
                                        monthDay = 30;
                                        monthName = "September";
                                        break;
                              case 10:
                                        monthDay = 31;
                                        monthName = "October";
                                        break;
                              case 11:
                                        monthDay = 30;
                                        monthName = "November";
                                        break;
                              case 12:
                                        monthDay = 31;
                                        monthName = "December";
                                        break;
                              default:
                                        monthDay = 0;
                                        monthName = "Invalid month";
                    }
                    System.out.println(monthName + " has " + monthDay + " days");
          }
}
