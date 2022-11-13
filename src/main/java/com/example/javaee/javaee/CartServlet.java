package com.example.javaee.javaee;

import com.example.javaee.javaee.model.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Cart cart = (Cart)httpSession.getAttribute("cart");
        String name = request.getParameter("name");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        if(cart==null){
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
        }
        httpSession.setAttribute("cart",cart);
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
