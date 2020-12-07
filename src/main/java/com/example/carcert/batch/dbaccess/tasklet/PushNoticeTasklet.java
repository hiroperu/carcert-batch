package com.example.carcert.batch.dbaccess.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.repeat.RepeatStatus;
// import org.springframework.batch.repeat.support.RepeatTemplate;
import org.springframework.stereotype.Component;
import com.example.carcert.batch.common.dto.DeviceInfoDto;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Component
public class PushNoticeTasklet implements Tasklet {

    private static final int CHUNK_SIZE = 1;

    @Inject // (8)
    ItemStreamReader<DeviceInfoDto> reader; // (9)

    @Inject // (8)
    ItemWriter<DeviceInfoDto> writer; // (10)

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        DeviceInfoDto item = null;
        List<DeviceInfoDto> items = new ArrayList<>(CHUNK_SIZE);
        try {
            reader.open(chunkContext.getStepContext().getStepExecution().getExecutionContext());
            while ((item = reader.read()) != null) {
                System.out.println(item.getId());
                System.out.println(item.getPushtoken());
                System.out.println(item.getExdate());
                System.out.println(item.getNotice_count());
                int count = item.getNotice_count();
                item.setNotice_count(count + 1);
                items.add(item);
                writer.write(items);
            }
        } finally {
            reader.close();
        }
        return RepeatStatus.FINISHED;
    }
}
