package first.greatsky.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.Iterator;

public class ObjectToJson {


	public static String ObjToJson(Object obj) {

		return JSON.toJSONString(obj);
	}
}

