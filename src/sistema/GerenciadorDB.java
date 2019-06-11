package sistema;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.lang.*;

public class GerenciadorDB {

    private static final GerenciadorDB gdb = new GerenciadorDB();

    public enum DB_TYPE {

        USERS,
        SERVICOS, 
        PEDIDOS

    }

    private GerenciadorDB() {
    }

    public static GerenciadorDB getInstanceOf() {
        return gdb;
    }

    public ArrayList<Pessoa> getUsersDB() {

        try {
            FileInputStream fi = new FileInputStream(new File("UsersDB.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (ArrayList<Pessoa>) oi.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<Pedido> getPedidosDB() {

        try {
            FileInputStream fi = new FileInputStream(new File("UsersDB.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (ArrayList<Pedido>) oi.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<TipoServico> getServicosDB() {

        try {
            FileInputStream fi = new FileInputStream(new File("UsersDB.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (ArrayList<TipoServico>) oi.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    private static void startUpDB(ArrayList<?> db, DB_TYPE tipo) {
        String path = null;
        switch (tipo) {
            case USERS:
                path = "UsersDB.txt";
                break;
            case SERVICOS:
                path = "ServicosDB.txt";
                break;
            case PEDIDOS:
                path = "PedidosDB.txt";
                break;
        }

        try {
            FileOutputStream usersDBFile = new FileOutputStream(new File(path));
            ObjectOutputStream o = new ObjectOutputStream(usersDBFile);
            o.writeObject(db);
            o.close();
            usersDBFile.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
        // TODO Auto-generated catch block

    }

    /**
     * Method to update a Data Base. The old DB will be overwritten by the
     * ArrayList received as param.
     *
     * @param db A generic ArrayList, to be saved in the Data Base.
     * @param tipo the ArrayList type to select in which DB it'll be saved.
     * @return true if update was sucessful, false otherwise.
     */
    public boolean updateDB(ArrayList<?> db, DB_TYPE tipo) {
        this.startUpDB(db, tipo);
        return true;
    }

    public static void main(String[] args) {
        Administrador adminMaster = new Administrador("ADM",
                "ADM_address", "adm@adm.com", "000000000", "admin", "admin");
        ArrayList<Pessoa> initDB = new ArrayList<>();
        initDB.add(adminMaster);
        GerenciadorDB.startUpDB(initDB, DB_TYPE.USERS);
        GerenciadorDB db = GerenciadorDB.getInstanceOf();
        for (Pessoa p : db.getUsersDB()) {
            System.out.println(p);
        }

    }

}




 /*
    // ******* TENTATIVA DE FAZER UM GET_DB GENÉRICO   
    public ArrayList<?> getDB(DB_TYPE tipo) {
         ArrayList<?> db = new ArrayList<>();         
         String path = "";
         Class c = null;
        switch(tipo){
            case USERS:
               path = "UsersDB.txt";                  
               
               
               break;
            case SERVICOS : 
                path = "ServicosDB.txt";    
                c = TipoServico.class;
                break;
        }
        try {
            FileInputStream fi = new FileInputStream(new File(path));
            ObjectInputStream oi = new ObjectInputStream(fi);           
            db = (ArrayList<?>)A( oi.readObject());

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }*/
    /**
     * Created only to startup the data base
     */