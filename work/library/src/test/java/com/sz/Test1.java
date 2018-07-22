package com.sz;

import com.sz.pojo.Book;
import com.sz.pojo.User;
import com.sz.service.BookService;
import com.sz.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Test1 {

    Scanner input = new Scanner(System.in);

    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService = ctx.getBean("userService", UserService.class);
    BookService bookService = ctx.getBean("bookService", BookService.class);

    public static void main(String [] args){
        Test1 t= new Test1();
        t.selectUser();
    }

    public void selectUser() {

        System.out.println("你好欢迎来到深圳书城!");
        Boolean flag = true;
        do {
            System.out.println("请输入账户名：");
            String name = input.next();
            System.out.println("请输入密码：");
            String pwd = input.next();

            User user = new User(name, pwd);
            int findUser = userService.getFindUser(user);

            if (findUser == 1) {
                System.out.println("恭喜！登录成功！");
                System.out.println("------------------------------------------------");
                Book();
                flag = false;
            } else {
                System.out.println("用户名或者密码输入错误 请重新登录！");
                System.out.println("------------------------------------------------");
                flag = true;
            }
        } while (flag);

    }

    public void Book() {
        do {
            System.out.println("1.上架书本");
            System.out.println("2.下架书本");
            System.out.println("3.更新书库");
            System.out.println("4.查看书库");
            System.out.println("0.退出系统");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("请输入书名:");
                    String book_name = input.next();
                    System.out.print("请输入价格:");
                    Integer book_price = input.nextInt();
                    System.out.print("请输入分类:");
                    System.out.println("1：历史 2：神话 3：儿童 4：人文 5：宇宙");
                    Integer book_type = input.nextInt();
                    System.out.println("请输入种类:");
                    System.out.println("1：典藏  2：不可外界  3：英文 4：公开");
                    Integer book_restrict = input.nextInt();

                    Book book = new Book(book_name, book_price, book_type, book_restrict);
                    int count = bookService.addBook(book);
                    if (count == 1) {
                        System.out.println("书本上架成功！");
                        System.out.println("------------------------------------------------");
                        System.out.println();
                        continue;
                    } else {
                        System.out.println("书本上架失败！");
                        System.out.println("------------------------------------------------");
                        System.out.println();
                        continue;
                    }
                case 2:
                    selectBook();
                    System.out.println("请输入要下架图书的编号:");
                    int id = input.nextInt();
                    int i = bookService.delBook(id);
                    if (i == 1) {
                        System.out.println("书本下架成功！");
                        System.out.println("------------------------------------------------");
                        System.out.println();
                        continue;
                    } else {
                        System.out.println("书本下架失败！");
                        System.out.println("------------------------------------------------");
                        System.out.println();
                        continue;
                    }
                case 3:
                    selectBook();
                    updateBook();
                    System.out.println();
                    continue;
                case 4:
                    selectBook();
                    System.out.println();
                    continue;
                default:
                    System.out.println("系统退出谢谢使用！");
                    System.out.println("------------------------------------------------");
                    break;
            }
            break;
        } while (true);

    }

    public void selectBook() {
        System.out.println("编号\t书名\t\t\t价格\t分类\t种类");
        System.out.println("------------------------------------------------");
        List<Book> books = bookService.selBook();
        String type = "";
        String restrict = "";
        for (Book bookss : books) {
            if (bookss.getBook_type() == 1) {
                type = "历史";
            }
            if (bookss.getBook_type() == 2) {
                type = "神话";
            }
            if (bookss.getBook_type() == 3) {
                type = "儿童";
            }
            if (bookss.getBook_type() == 4) {
                type = "人文";
            }
            if (bookss.getBook_type() == 5) {
                type = "宇宙";
            }
            if (bookss.getBook_restrict() == 1) {
                restrict = "典藏";
            }
            if (bookss.getBook_restrict() == 2) {
                restrict = "不可外界";
            }
            if (bookss.getBook_restrict() == 3) {
                restrict = "英文";
            }
            if (bookss.getBook_restrict() == 4) {
                restrict = "公开";
            }
            System.out.println(bookss.getBook_id() + "\t" + bookss.getBook_name() + "\t\t\t" + bookss.getBook_price() + "\t\t" + type + "\t" + restrict);
        }
    }

    public void updateBook() {
        System.out.println("请输入要修改的书本编号:");
        Integer num = input.nextInt();
        System.out.println("请输入要修改的书名:");
        String name = input.next();
        System.out.println("请输入要修改的价格:");
        Integer price = input.nextInt();
        System.out.println("请输入要修改的分类:");
        System.out.println("1：历史 2：神话 3：儿童 4：人文 5：宇宙");
        Integer type = input.nextInt();
        System.out.println("请输入要修改的种类:");
        System.out.println("1：典藏  2：不可外界  3：英文 4：公开");
        Integer res = input.nextInt();

        Book book = new Book(num, name, price, type, res);
        int i = bookService.updBook(book);

        if (i == 1) {
            System.out.println("书库修改成功！");
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("书库修改失败！");
            System.out.println("------------------------------------------------");
        }

    }

}
