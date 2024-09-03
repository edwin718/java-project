import static spark.Spark.*;
public class calculator{
    public static void main(String[]args){
        port(8080);

        get("/",(req,res)->{
            return "<html><head><title>Welcome</title></head><body><h1>Welcome to My Website</h1></body></html>";
        });

        get("/about",(req,res)->{
            return "<html><head><title>About</title></head><body><h1>About Us</h1><p>This is a sample website created using Java and Spark framework.</p></body></html>";
        });

        get("/contact",(req,res)->{
            return "<html><head><title>Contact</title></head><body><h1>Contact Us</h1><p>Email:ngugiedwin552@gmail.com</p></body></html>";
        });
 


    }
}