package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductServiceImpl;
import com.codegym.service.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "search":
                searchProduct(request, response);
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("searchByName");
        List<Product> result = productService.searchByName(search);
        request.setAttribute("result", result);
        request.getRequestDispatcher("/product/result.jsp").forward(request, response);

    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.searchById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            productService.delete(id);
            response.sendRedirect("/products");
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        String description = request.getParameter("description");
        String provider = request.getParameter("provider");
        Product product = productService.searchById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            product.setName(name);
            product.setPrice(price);
            product.setDescription(description);
            product.setProvider(provider);
            productService.edit(id, product);
            request.setAttribute("loadProduct", product);
            request.setAttribute("success", "Product information was updated");
            dispatcher = request.getRequestDispatcher("/product/editProduct.jsp");
        }
        dispatcher.forward(request, response);

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        String description = request.getParameter("description");
        String provider = request.getParameter("provider");
        int id = (int) (Math.random() * 1000);

        Product product = new Product(id, name, price, description, provider);
        productService.add(product);
        String successMessage = "Create new product successfully";
        request.setAttribute("success", successMessage);
        request.getRequestDispatcher("/product/createProduct.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateProductPage(request, response);
                break;
            case "edit":
                showEditPage(request, response);
                break;
            case "delete":
                showDeletePage(request, response);
                break;
            case "view":
                showProduct(request, response);
                break;
            default:
                listProducts(request, response);
                break;
        }
    }

    private void showProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.searchById(id);
        request.setAttribute("loadProduct", product);
        request.getRequestDispatcher("/product/viewProduct.jsp").forward(request, response);
    }

    private void showDeletePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.searchById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            request.setAttribute("loadProduct", product);
            dispatcher = request.getRequestDispatcher("/product/deleteProduct.jsp");
        }
        dispatcher.forward(request, response);
    }

    private void showEditPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = productService.searchById(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/error404.jsp");
        } else {
            request.setAttribute("loadProduct", product);
            dispatcher = request.getRequestDispatcher("/product/editProduct.jsp");
        }
        dispatcher.forward(request, response);
    }


    private void showCreateProductPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/product/createProduct.jsp").forward(request, response);
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = productService.displayAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/product/listProducts.jsp").forward(request, response);
    }
}
