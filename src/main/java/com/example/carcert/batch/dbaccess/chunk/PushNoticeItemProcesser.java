package com.example.carcert.batch.dbaccess.chunk;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import com.example.carcert.batch.common.dto.DeviceInfoDto;

@Component("processor")
public class PushNoticeItemProcesser implements ItemProcessor<DeviceInfoDto, DeviceInfoDto> {

    @Override
    public DeviceInfoDto process(DeviceInfoDto item) throws Exception {
        System.out.println("------START-----" + item.getId() + ":" + item.getNotice_count());
        item.setNotice_count(item.getNotice_count() + 10);
        System.out.println("------END-------" + item.getId() + ":" + item.getNotice_count());
        return item;
    }

}
