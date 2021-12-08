package inftrasutructure.repo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import inftrasutructure.support.JsonUtil;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public abstract class IDataSource<D> {

    public Map<String, D> data = new HashMap<>();
    private final ObjectMapper mapper = new ObjectMapper();

    public D save(String Id, D objectData) {
        this.data.put(Id, objectData);
        return this.data.get(Id);
    }

    public abstract List<D> saveAll(List<D> data);

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


//    public boolean wireData(String ownerName, List<D> data) {
//        FileInputStream fis = null;
//        try {
//            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
//            File f = new File(ownerName + ".txt");
//
//            //Bước 2: Đọc dữ liệu
//            PrintWriter pw = new PrintWriter(f);
//            String objectSrt = JsonUtil.convertToJsonString(data);
//            pw.println(objectSrt);
//
//            pw.close();
////            FileWriter fw = new FileWriter(f);
//            //Bước 2: Ghi dữ liệu
////            fw.write(data.toString());
//            //Bước 3: Đóng luồng
////            fw.close();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//        return false;
//    }
//
//    public List<D> loadData(String ownerName) {
//        try {
//            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
//            File f = new File(ownerName + ".txt");
//            FileReader fr = new FileReader(f);
//            //Bước 2: Đọc dữ liệu
//            BufferedReader br = new BufferedReader(fr);
//            String line;
//            List<D> objectList = new ArrayList<>();
//            while ((line = br.readLine()) != null) {
////                objectList.add((D) line);
//                objectList = this.getListOptionProduct(line);
//            }
//            //Bước 3: Đóng luồng
//            fr.close();
//            br.close();
//            return objectList;
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println("Loi doc file: " + ex);
//            ex.printStackTrace();
//        }
//        return new ArrayList<>();
//    }
//
//    ;
//
//    public boolean wireData(String ownerName, D data) {
//        try {
//            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
//            File f = new File(ownerName + ".txt");
//            FileWriter fw = new FileWriter(f);
//            //Bước 2: Ghi dữ liệu
//            fw.write("Ghi dữ liệu bằng luồng character");
//            //Bước 3: Đóng luồng
//            fw.close();
//            this.data.put(ownerName, data);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//        return false;
//    }
//
//    private List<D> getListOptionProduct(String json) {
//        try {
//            return mapper.readValue(json, new TypeReference<List<D>>() {
//            });
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return new ArrayList<>();
//    }
}
