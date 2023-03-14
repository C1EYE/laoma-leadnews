package com.laoma.model.media.dtos;

import com.laoma.model.annotation.IdEncrypt;
import lombok.Data;

@Data
public class WmMaterialDto {

    @IdEncrypt
    private Integer id;

//    private String url;
}
