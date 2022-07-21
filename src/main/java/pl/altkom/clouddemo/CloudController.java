package pl.altkom.clouddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/config-params")
    public ConfigParams getParams() {
        return new ConfigParams(configuration.getMinValue(), configuration.getMaxValue());
    }

}
