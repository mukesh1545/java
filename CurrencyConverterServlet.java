import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CurrencyConverterServlet")
public class CurrencyConverterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String fromCurrency = request.getParameter("from");
        String toCurrency = request.getParameter("to");
        double amount = Double.parseDouble(request.getParameter("amount"));

        // Here, you can implement the logic to fetch current exchange rates
        // and perform the currency conversion calculation

        double result = amount * 75.0; // Just an example; replace this with actual conversion logic

        PrintWriter out = response.getWriter();
        out.print(result);
    }
}
