/**
 *      file    :  proxy.cpp 
 *      author  :  Kapil Aggarwal 
 *      created :  2026 Feb 28 17:05:58 
 *      lastMod :  Sat Feb 28 17:05:58 2026 
 **/

#include <bits/stdc++.h>

class EmployeeDao {
  public:
    virtual void getEmployeeInfo(int EmpId) = 0;
    virtual void createEmployee(Employee obj) = 0;
};

class EmployeeImpl {
  public:
    void getEmployeeInfo(int empID) {
      cout << "Fetching employee info for ID: " << empID;
    }
    void createEmployee(EmployeeDo obj) {
      cout << "Creating employee: " << obj;
    }
};

class Employee {

};


int main() {
        
  return 0;
}

