package inftrasutructure.repo;

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

    public abstract List<D> search( String filter);


    public  D findById(String objectId) {
        return data.get(objectId);
    }
}
