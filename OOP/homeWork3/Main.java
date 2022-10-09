package OOP.homeWork3;

import OOP.homeWork3.people.Human;
import OOP.homeWork3.people.Relation;
import OOP.homeWork3.people.Relative;
import OOP.homeWork3.service.LoaderListInMain;
import OOP.homeWork3.service.Controller;
import OOP.homeWork3.service.ViewService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    Scanner scannerMain = new Scanner(System.in);
    List<Human> listHumanMain = new ArrayList<>();
    List<Relative> listRelativeMain = new ArrayList<>();
    public List<Relative> tree = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        LoaderListInMain loaderMain = new LoaderListInMain();
        Controller controllerMain = new Controller();
        loaderMain.voidLoadHumanRelativeInMain(main.listHumanMain, main.listRelativeMain);
        main.menu(main.scannerMain, controllerMain);
        main.scannerMain.close();
    }

    void menu(Scanner mScn, Controller mCnt) {
        ViewService vs = new ViewService();
        String userMenuChoice;
        do {
            vs.printMenu();
            userMenuChoice = mScn.next();
            switch (userMenuChoice) {
                case "1": // 1. Print full info about humans
                    vs.printFullHumanList(listHumanMain);
                    break;
                case "2": // 2. Find Human
                    searchMenu(mScn, vs, mCnt);
                    break;
                case "3":
                    vs.printFullRelativesList(listRelativeMain);
                    break;
                case "0":
                    userMenuChoice = "exit";
                    break;
                default:
                    System.out.println("Wrong input.");
                    break;
            }
            scannerMain.reset();
        } while (!userMenuChoice.equals("exit"));
    }

    void searchMenu(Scanner mScn, ViewService vs, Controller mCnt) {
        System.out.print("Enter name: ");
        String name = mScn.next();
        System.out.print("Enter surname: ");
        String surname = mScn.next();
        List<Human> tmp = mCnt.getFindHumanByNameSurname(listHumanMain, name, surname);
        if (tmp.size() > 0)
            vs.printFullHumanList(tmp);
        else System.out.println("Nobody found");
        mScn.reset();
    }


    }
