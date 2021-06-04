package com.mo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @create 2021-06-04 17:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    private int mid;
    private String mpassword;
    private String mpusername;
}
