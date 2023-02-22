package com.webank.ai.fate.client.form.dsl;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.webank.ai.fate.common.deserializer.JsonListDeserializer;
import lombok.Data;

import java.util.List;

@Data
public class Output {

    @JsonDeserialize(using = JsonListDeserializer.class)
    private List<String> data;

    @JsonDeserialize(using = JsonListDeserializer.class)
    private List<String> model;

    @JsonDeserialize(using = JsonListDeserializer.class)
    private List<String> cache;

}
