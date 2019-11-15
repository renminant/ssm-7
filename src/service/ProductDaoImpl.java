package service;

import mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Book;
import java.sql.SQLException;
import java.util.List;
@Service
public class ProductDaoImpl implements ProductDao {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Boolean RegisterProduct(Book product) throws SQLException {
        return productMapper.RegisterProduct(product);
    }

    @Override
    public List<Book> getProductList() throws SQLException {
        return productMapper.getProductList();
    }

    @Override
    public boolean updateProduct(Book product) throws SQLException {
        return productMapper.updateProduct(product);
    }

    @Override
    public boolean deleteProductByid(Integer id) throws SQLException {
        return productMapper.deleteProductByid(id);
    }

    @Override
    public Book getProductByid(Integer id) throws SQLException {
        return productMapper.getProductByid(id);
    }

    @Override
    public List<Book> selectProductByWhere(String productName, String productUnit, String payed) throws SQLException {
        return productMapper.selectProductByWhere(productName,productUnit,payed);
    }

    @Override
    public boolean borrow(Book product) throws Exception {
        return productMapper.borrow(product);
    }
}


