package personal.vahid.schedulerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class SimpleRealWorldJob {
    @JsonProperty("start")
    int start;
    @JsonProperty("end")
    int end;
    @JsonProperty("profit")
    long profit;

    @JsonProperty(value = "timeUnit", required = true)
    String unitSlug;
}
