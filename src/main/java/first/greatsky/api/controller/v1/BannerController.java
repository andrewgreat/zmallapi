package first.greatsky.api.controller.v1;

import first.greatsky.Validator.IdConstraint;
import first.greatsky.entity.Banner;
import first.greatsky.exception.ExceptionEnum;
import first.greatsky.exception.NoFoundExcepiton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import first.greatsky.service.BannerService;

@RestController
@RequestMapping("/api/v1")
@Validated
public class BannerController {

	private final static Logger logger = LoggerFactory.getLogger(BannerController.class);

	@Autowired
	private BannerService bannerService;

	@RequestMapping(value = "/banner", method = RequestMethod.GET)
	public String selectBanner(@IdConstraint @RequestParam("id") Integer id) throws NoFoundExcepiton {
		Banner banner = bannerService.selectBanner(id);

		logger.info("selectBanner/{id}接口，参数id = " + id);
		if (banner == null) {
			logger.error("根据Banner ID，查询异常：e=" + ExceptionEnum.ERROR_NOFOUND.getValue());
			throw new NoFoundExcepiton(ExceptionEnum.ERROR_NOFOUND.getValue());
		}
		return banner.toString();
	}

}
