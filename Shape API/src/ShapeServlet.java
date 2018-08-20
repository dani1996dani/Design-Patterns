
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShapeServlet
 */
@WebServlet("/ShapeServlet")
public class ShapeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int shapeCounter;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	@Override
	public void init() throws ServletException {
		super.init();
		shapeCounter = 0;
	}

	public ShapeServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		shapeCounter++;

		String shapeType = request.getParameter("type");
		if (shapeType.isEmpty())
			return;

		Shape result = null;

		switch (shapeType) {
		case "Triangle":
			result = new Triangle(shapeCounter);
			break;

		case "Square":
			result = new Square(shapeCounter);
			break;

		case "Oval":
			result = new Oval(shapeCounter);
			break;

		default:
			break;
		}

		response.setContentType("application/json");
		response.getWriter().append(result.shapeToJSON().toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
