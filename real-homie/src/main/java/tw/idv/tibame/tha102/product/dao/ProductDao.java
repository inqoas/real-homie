package tw.idv.tibame.tha102.product.dao;

import java.util.List;

import tw.idv.tibame.tha102.product.vo.Product;

public interface ProductDao {
	public void insert(Product product);

	public void update(Product product);

	public void delete(Integer product_id);

	public List<Product> getAll();
}
