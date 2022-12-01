package TestaColecoes;

// Java program to show servlet example
// Importing required Java libraries
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

  
// Extend HttpServlet class
public class AdvanceJavaConcepts
    extends HttpServlet {
    private String output;
  
    // Initializing servelet
    public void init() throws ServerException
    {
        output = "Advance Java Concepts";
    }
  
    // Requesting and printing the output
    public void doGet(HttpServlet req,
                      HttpServlet resp)
        throws ServerException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println(output);
    }
  
    public void destroy()
    {
        System.out.println("Over");
    }
}

