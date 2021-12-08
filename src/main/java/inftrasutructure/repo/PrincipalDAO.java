package inftrasutructure.repo;

import inftrasutructure.domain.Principal;

import java.util.ArrayList;
import java.util.List;

public class PrincipalDAO extends IDataSource<Principal> {
    @Override
    public List<Principal> saveAll(List<Principal> data) {
//        this.wireData(Principal.class.getName(), data);
        return data;
    }

    @Override
    public List<Principal> search(String filter) {
        return null;
    }

    public static void main(String[] args) {
        PrincipalDAO dao = new PrincipalDAO();
        List<Principal> data = new ArrayList<>();
//        data.add(new Principal("chao ban","huynq","12312321"));
//        data.add(new Principal("chao ban","huynq","12312321"));
//        data.add(new Principal("chao ban","huynq","12312321"));
//        data.add(new Principal("chao ban","huynq","12312321"));
//        dao.saveAll(data);
//
//        List<Principal> list = dao.loadData(Principal.class.getName());
//        System.out.println(list.get(0));

    }
}
