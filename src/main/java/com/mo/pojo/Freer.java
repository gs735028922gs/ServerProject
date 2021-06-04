package com.mo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @create 2021-06-04 16:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Freer {

    private Integer fid;
    private String fname;
    private Integer ftype;
    private Integer phone;
    private String email;
    private String schedule;


}
