package org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class PdfServlet
 */
@WebServlet("/PdfServlet")
public class PdfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PdfServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/pdf");
		OutputStream out = response.getOutputStream();
		Document doc = new Document();
		try 
		{
			PdfWriter.getInstance(doc, out);
		} 
		catch (DocumentException e) 
		{
			e.printStackTrace();
		}
		doc.open();	
		doc.addTitle("My Resume 1");
		/*
		doc.addCreationDate();
		doc.addAuthor("Kuntal");
		doc.addSubject("Subject Here");
		*/		
		Paragraph p1 = new Paragraph();
		
		Font font1 = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLDITALIC,BaseColor.BLUE);
		Font font2 = new Font(Font.FontFamily.COURIER, 12, Font.NORMAL, BaseColor.ORANGE);
		Font font3 = new Font(Font.FontFamily.COURIER, 12, Font.NORMAL, BaseColor.GREEN);
		
		String my_str = "RESUME \n";
		String my_str1 = "email: myemail@gmail.com";
		
		p1.add(new Phrase(my_str, font1));
		p1.add(new Phrase(my_str1, font2));
		p1.setAlignment(Element.ALIGN_CENTER);
		p1.add(new Phrase(Chunk.NEWLINE));
		
		try 
		{
			doc.add(p1);
		} 
		catch (DocumentException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			doc.add(new Paragraph("____________________________________________________________________________\n"));
		}
		catch (DocumentException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			doc.add(new Paragraph("About Me :\n\n", font3));
			
			doc.add(new Paragraph("Lorem Ipsum is simply dummy text of the printing and"
					+ " typesetting industry. Lorem Ipsum has been the industry's standard "
					+ "dummy text ever since the 1500s, when an unknown printer took a galley"
					+ " of type and scrambled it to make a type specimen book. It has survived "
					+ "not only five centuries, but also the leap into electronic typesetting, "
					+ "remaining essentially unchanged. It was popularised in the 1960s with the "
					+ "release of Letraset sheets containing Lorem Ipsum passages, and more recently "
					+ "with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
			
		} 
		catch (DocumentException e) 
		{
			e.printStackTrace();
		}
		
		doc.close();
	    out.close();
		
	}

}



// http://127.0.0.1:8090//MyPDFCreateor/PdfServlet
