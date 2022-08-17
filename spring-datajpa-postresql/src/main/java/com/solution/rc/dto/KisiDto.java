package com.solution.rc.dto;

import java.util.List;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
public class KisiDto {

    private Long id;

    @NotNull
    private String adi;

    private String soyadi;

    private List<String> adresler;
}