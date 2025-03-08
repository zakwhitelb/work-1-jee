package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres1 {
    public void main(String[] args) throws Exception{
        Scanner scan = new Scanner(new File("Config.txt"));
        String daoClassName = scan.nextLine();
        Class daoClass = Class.forName(daoClassName);
        IDao dao = (IDao) daoClass.getConstructor().newInstance(daoClass);

        String metierClassName = scan.nextLine();
        Class metierClass = Class.forName(metierClassName);
        IMetier metier = (IMetier) metierClass.getConstructor(IDao.class).newInstance(dao);

        System.out.println(metier.calcul());
    }
}