package edu.icet.orm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class Patient {

    private Integer id;
    private String name;
    private String nic;
    private String address;
    private String bloodGroup;
    private String category;
    private String gender;
    private String contact ;
    private String note;
    private String age;
    private String allergic;

}
