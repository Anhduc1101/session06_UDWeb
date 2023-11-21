package com.example.productdiscountcalculator;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "Product Discount Calculator", value = "/discount")
public class Discount extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    }

    // lấy dữ liêu jtwf request
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String proDes = request.getParameter("proDes");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double disPer = Double.parseDouble(request.getParameter("disPer"));

        // tinh toan
        double disAmount = listPrice * disPer * 0.01;
        double disPrice = listPrice - disAmount;

        // hiển thi jkeets quả
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Discount Result</h1>");
        writer.println("<strong>Pro.Description:</strong> " + proDes+"<br>");
        writer.println("<strong>Discount Amount:</strong> "+disAmount+"% <br>");
        writer.println("<strong>Discount Price:</strong> " + disPrice+"<br>");
    }

    public void destroy() {
    }
}