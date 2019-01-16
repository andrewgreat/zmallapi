package first.greatsky.mapper;

import first.greatsky.entity.Banner;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerMapper {

	@Select("SELECT * FROM banner WHERE id = #{id}")
	Banner selectBanner(int id);
}
