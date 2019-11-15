package mapper;

import pojo.Book;

import java.sql.SQLException;
import java.util.List;

public interface ProductMapper {
    public Boolean RegisterProduct(Book product) throws SQLException;
    public List<Book> getProductList() throws SQLException;
    public boolean updateProduct(Book product) throws SQLException;
    public boolean deleteProductByid(Integer id) throws SQLException;
    public Book getProductByid(Integer id) throws SQLException;
    public List<Book> selectProductByWhere(String productName, String productUnit, String payed) throws SQLException;
    public boolean borrow(Book product)throws Exception;
}
