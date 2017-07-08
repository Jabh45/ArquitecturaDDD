package domain.repository;

import domain.model.Item;

public interface ItemRepository extends GenericRepository<Item>{

	Item findByCode(String code);

}
