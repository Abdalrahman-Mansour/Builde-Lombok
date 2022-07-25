import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public  class Customer {
    private  int ID ;
    private  String name;
    private String Email;
    private  String phonenumber ;
}
