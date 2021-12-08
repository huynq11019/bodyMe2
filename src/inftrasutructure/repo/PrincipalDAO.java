package inftrasutructure.repo;

import inftrasutructure.domain.Principal;

import java.util.List;

public class PrincipalDAO extends IDataSource<Principal> {
    @Override
    public List<Principal> saveAll(List<Principal> data) {
        this.wireData(Principal.class.getName(), data);
        return null;
    }

    @Override
    public List<Principal> search(String filter) {
        return null;
    }
}
