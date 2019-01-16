package first.greatsky.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdValidator implements ConstraintValidator<IdConstraint, Integer> {
	//int为校验的类型
	@Override
	public void initialize(IdConstraint idConstraint) {
		//启动时执行
	}

	@Override
	public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
			if (integer > 0)
			return true;
		return false;
	}


}
