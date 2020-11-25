import java.util.Scanner;
import java.util.ArrayList;
public class productCategories implements ProductManipulation{
    private String categories;
    private products[] products;
    static int x=0;
    ArrayList proucts = new ArrayList();
    public productCategories(String categories) {
        this.categories = categories;
    }
    public productCategories() {
        this.categories = "";
    }
    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public products[] getProducts() {
        return products;
    }

    @Override
    public void addProduct() {


       Scanner input = new Scanner(System.in);

        System.out.print("Product Name: ");
        String PN1 = input.nextLine();
        proucts.add(PN1);
      //  this.products[x].setProductName(input.nextLine());
        System.out.print("\nProduct Serial Number: ");
        double PS1 = input.nextDouble();
        proucts.add(PS1);
        System.out.println(proucts);

        // this.products[x].setSerialNumber(input.nextInt());

    }

    @Override
    public void removeProduct() {

    }
}