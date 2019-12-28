package cn.swc.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentMap;

/**
 * @Description 自定义日期转换器
 * @auther swc
 * @create 2019-12-28 13:45
 */
@Component("selfConvert")
public class DateConvert implements Converter<String,Date>{
    @Override
    public Date convert(String s) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = df.parse(s);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
