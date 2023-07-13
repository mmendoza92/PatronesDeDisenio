package Iterator;

public class Main {

    public static void main(String[] args) {

        Iterator iterator;

        ProductList products = new ProductList();

        products.addProduct(new Product("1","PC",5000));
        products.addProduct(new Product("2","Phone",2500));
        products.addProduct(new Product("3","SmartTV",4800));
        products.addProduct(new Product("4","Keyboard",250));
        products.addProduct(new Product("5","Mouse",180));

       iterator = products.iterator();
       while (iterator.hasNext()){
           Product product = (Product) iterator.getNext();
           System.out.println(product);
       }



       NumberList numbers = new NumberList(5);

       numbers.addNumber(1);
       numbers.addNumber(2);
       numbers.addNumber(3);
       numbers.addNumber(4);
       numbers.addNumber(5);

      iterator = numbers.iterator();
       while (iterator.hasNext()){
           int num = (int) iterator.getNext();
           System.out.println(num);
       }
    }
}
