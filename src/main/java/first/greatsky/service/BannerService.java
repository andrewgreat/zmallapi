package first.greatsky.service;

import first.greatsky.entity.Banner;
import first.greatsky.mapper.BannerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService {

	private final static Logger logger = LoggerFactory.getLogger(BannerService.class);
	@Autowired
	private BannerMapper bannerMapper;

	public Banner selectBanner(int id) {
		return 	 bannerMapper.selectBanner(id);
	}
}
