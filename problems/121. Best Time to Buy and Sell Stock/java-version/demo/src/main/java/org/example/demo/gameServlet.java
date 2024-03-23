package org.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "gameServlet" ,urlPatterns = "/gameServlet")
public class gameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session =req.getSession();
        Player player= (Player) session.getAttribute("logedInPlayer");
        long score = player.getScore();
        int roll =0;
        // Check if the dice roll parameter exists
        String rollParam = req.getParameter("roll");
        System.out.println("score before"+score);
        System.out.println("roll "+rollParam);
        if (rollParam != null && !rollParam.isEmpty()) {
            roll = Integer.parseInt(rollParam);

            // Check if the roll is the same as the previous roll
            Integer previousRoll = (Integer) session.getAttribute("previousRoll");
            if (previousRoll != null && roll == previousRoll) {
                score += 20; // Increment the score by 20 if same result twice in a row
            }

            // Update the previous roll attribute in the session
            session.setAttribute("previousRoll", roll);
        }
        System.out.println("score after "+score);
        player.setScore(score);
        // Display the player's current score
        req.setAttribute("score",score);
        req.setAttribute("dice",roll);
        resp.sendRedirect("/game.jsp");

    }
}
