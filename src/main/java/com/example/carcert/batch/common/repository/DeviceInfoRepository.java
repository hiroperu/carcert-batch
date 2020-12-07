package com.example.carcert.batch.common.repository;

import com.example.carcert.batch.common.dto.DeviceInfoDto;
import org.apache.ibatis.cursor.Cursor;

public interface DeviceInfoRepository {
    Cursor<DeviceInfoDto> cursor(); // (1)

    int updateDeviceInfo(DeviceInfoDto deviceInfo); // (2)

}
