package org.example.spring2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
    //no는 autoincrement
    private int no;
    private String title;
    private String content;
    private String writer;
}
