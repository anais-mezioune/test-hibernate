package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Film;
import models.Pays;
import models.TestHibernate;

/**
 * Servlet implementation class Hibernate
 */
@WebServlet("/hibernate")
public class Hibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static TestHibernate hiber = null;
    private static final String VUES="/vues/hibernate/";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hibernate() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("action : "+action);

		String maVue = "/index.jsp";
		if(action== null){
		}else if(hiber == null && action.equals("connexion")){
			hiber = new TestHibernate();
			maVue = VUES+"connexion.jsp";
		}else if(action.equals("insertion") && hiber != null){
			Pays monPays = new Pays("IS","Islande","Islandais");
			hiber.insertPays(monPays);
			maVue = VUES + "insertion.jsp";
		}
		else if(action.equals("requetePays")){
			List<Pays> pays = hiber.cherchePays();
			request.setAttribute("pays", pays);
			maVue = VUES + "list_pays.jsp";
		}else if(action.equals("requeteFilm")){
			List<Film> films = hiber.chercheFilms();
			request.setAttribute("films", films);
			maVue = VUES + "liste_films.jsp";
		}else if(action.equals("deco")){
			hiber = null;
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
