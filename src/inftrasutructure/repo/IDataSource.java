package inftrasutructure.repo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public abstract class IDataSource<D> {

    public Map<String, D> data = new HashMap<>();

    public D save(String Id, D objectData) {
        this.data.put(Id, objectData);
        return this.data.get(Id);
    }

    public abstract List<D> saveAll(List<D> data) ;

//    public void update(String id, D data) {
//        this.data.put(id, data);
//    }

    public int delete(String objectIds) {
        this.data.remove(objectIds);
        return 1;
    }

    public D updateInstantInDataSource(String objectId, D data) {
        this.data.put(objectId, data);
        return data;
    }

    public List<D> loadAll() {
        List<D> list = new ArrayList<>(data.values());
        return list;
    }

    public abstract List<D> search(String filter);


    public D findById(String objectId) {
        return data.get(objectId);
    }


    public boolean wireData(String ownerName, List<D> data) {
        try {
            String fileName = ownerName + ".dat";
            Path path = Paths.get(fileName);
            if (!Files.exists(path)) {
                new File(fileName).createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(path.toFile());
            ObjectOutputStream oos = new ObjectOutputStream(fos); // ghi file theo từng object
            oos.writeObject(data);
            oos.close();
            fos.close();
            System.out.println("Ghi file thành công" + path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }

    public List<D> loadData(String ownerName) {
        try {
            String fileName = ownerName + ".dat";
            Path path = Paths.get(fileName);
            FileInputStream fis = new FileInputStream(path.toString());
            ObjectInputStream ois = new ObjectInputStream(fis); // DÙng để đọc file theo từng object
            List<D> data = (List<D>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException io) {
            System.out.println("Có lỗi xảy ra!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy class");
        }

        return new ArrayList<>();
    }

    public boolean wireData(String ownerName, D data) {
        try {
            String fileName = ownerName + ".dat";
            Path path = Paths.get(fileName);
            if (!Files.exists(path)) {
                new File(fileName).createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(ownerName);
            ObjectOutputStream oos = new ObjectOutputStream(fos); // ghi file theo từng object
            oos.writeObject(data);
            oos.close();
            fos.close();
            this.data.put(ownerName, data);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
