package inftrasutructure.Service;

import inftrasutructure.domain.Principal;
import inftrasutructure.repo.PrincipalDAO;

import java.util.List;
import java.util.Objects;

public class PrincipalSerivce {

    private PrincipalDAO pricipalDAO = new PrincipalDAO();

    public void menu() {
        System.out.println("1. Add a new teacher");
        System.out.println("2. Add a new student");
        System.out.println("3. create ACCOUNT PRINCIPAL");
        System.out.println("4. get Teacher detail");
        System.out.println("5. add new class");
        System.out.println("6. get class detail");
        System.out.println("7. modify class");
    }

    public int createAccountPrincipal(String name, String email, String password) {
        Principal principal = new Principal(name, email, password);
        if (Objects.nonNull(principal)) {
            List<Principal> principalList = pricipalDAO.loadData(Principal.class.getName());
            principalList.add(principal);
            pricipalDAO.saveAll(principalList);
            return principalList.size();
        }
        return 0;
    }
}
