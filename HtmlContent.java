
import javax.swing.JEditorPane; 
import javax.swing.JFrame; 
public class HtmlContent extends JFrame {
    public static void main(String args[])
    {
        new HtmlContent().start();
    } 
    void start()
    { 
        { String html; html="<html><head><title>Simple Page</title></head>";
            html+="Click <a href='http://www.yahoo.com'>here</a> to go to your playlist."; 
            html+="</body></html>"; 
            JEditorPane ed1=new JEditorPane("text/html",html); 
            add(ed1); setVisible(true); setSize(600,600); 
            setDefaultCloseOperation(EXIT_ON_CLOSE); 
        }
            
        } 
        }

