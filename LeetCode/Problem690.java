package LeetCode;

import java.util.List;

public class Problem690 {
    public int getImportance(List<Employee> employees, int id) {
        int res = 0;
        for(int i = 0; i < employees.size(); ++i) {
            Employee leader = employees.get(i);
            if(id == leader.id) {
                res += leader.importance;
                for(int j = 0; j < leader.subordinates.size(); ++j){
                    int subordinateId = leader.subordinates.get(j);
                    res += getImportance(employees, subordinateId);
                }
            }
        }
        return res;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
