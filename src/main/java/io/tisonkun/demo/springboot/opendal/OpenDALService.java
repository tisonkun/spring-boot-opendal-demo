package io.tisonkun.demo.springboot.opendal;

import java.io.IOException;
import lombok.extern.log4j.Log4j2;
import org.apache.opendal.Operator;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Log4j2
public class OpenDALService {

    private final Operator operator;

    public OpenDALService(Operator operator) {
        this.operator = operator;
    }

    public void uploadFile(String keyName, MultipartFile file) throws IOException {
        operator.write(keyName, file.getBytes());
        final var stat = operator.stat(keyName);
        log.info("File uploaded: {}", stat);
    }

    public CombinedObject getFile(String keyName) {
        final var content = operator.read(keyName);
        final var stat = operator.stat(keyName);
        return new CombinedObject(stat, content);
    }
}
