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
        SERVICOS

    }

    private GerenciadorDB() {
    }

    public static GerenciadorDB getInstanceOf() {
        return gdb;
    }
    
    
    

    public ArrayList<Pessoa> getUsersDB() {
       
        try{            
            FileInputStream fi = new FileInputStream(new File("UsersDB.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            return (ArrayList<Pessoa>) oi.readObject();     
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
    }

    // ******* TENTATIVA DE FAZER UM GET_DB GENÉRICO   
    /*public ArrayList<Armazenavel> getDB(DB_TYPE tipo) {
         ArrayList<Armazenavel> db = new ArrayList<>();
         Class<?> classeDB = null;
         String path = "";
        switch(tipo){
            case USERS:
               path = "UsersDB.txt";   
               
               break;
            case SERVICOS : 
                path = "ServicosDB.txt";                
                break;
        }
        try {
            FileInputStream fi = new FileInputStream(new File(path));
            ObjectInputStream oi = new ObjectInputStream(fi);
            Class<?> aux = classeDB.getClass();
            System.out.println(aux.getClass().toString() + 
                                                classeDB.getClass().toString());
            switch (tipo){
                case USERS : 
                   return ((ArrayList<Pessoa>) oi.readObject());
                case SERVICOS :
                    return null;
            }             
            

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
    private static void startUpDB(ArrayList<?> db, String path) {
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

    public static void main(String[] args) {
        Administrador adminMaster = new Administrador("ADM",
                "ADM_address", "adm@adm.com", "000000000", "admin", "admin");
        ArrayList<Pessoa> initDB = new ArrayList<>();
        initDB.add(adminMaster);
        GerenciadorDB.startUpDB(initDB,"UsersDB.txt");
        GerenciadorDB db = GerenciadorDB.getInstanceOf();
        for(Pessoa p: db.getUsersDB()){
            System.out.println(p);
        }

    }

}
