package com.example.baithigiuaki;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet ( name = "EmployeeServlet" , value = "/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException , ServletException {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Truong Duc Duy", "12/12/2005", "Nhan vien","Phong nhan vien", 1000000));
        employeeList.add(new Employee(2, "KIeu Tan Dungu", "17/12/2005", "Nhan vien","Phong nhan vien", 1000000));
        employeeList.add(new Employee(3, "Le Minh Hoa", "22/12/2004", "To Truong","Phong nhan vien",1500000));
        employeeList.add(new Employee(4, "Pham chubin", "05/01/2005", "nhan vien","Phong nhan vien", 1000000));

        req.setAttribute("EmployeeList", employeeList);


        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "add":
                RequestDispatcher rd = req.getRequestDispatcher("com/example/baithigiuaki/Employee.java");
                rd.forward(req,res);
                break;
        }

    }
}
