package pl.ulatwdiete.diet.database.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import sun.security.util.Password;

@Document(collation = "Users")
public class users {

    @Id
    private String user_id;
    private String user_name;
    private Password password;


}
