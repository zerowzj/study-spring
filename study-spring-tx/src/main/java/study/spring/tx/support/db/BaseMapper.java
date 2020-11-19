package study.spring.tx.support.db;

public interface BaseMapper<PK, E extends BaseEO> {

    int insert(final E entity);

    int delete(final PK id);

    int update(final E entity);

    E get(final PK id);
}
