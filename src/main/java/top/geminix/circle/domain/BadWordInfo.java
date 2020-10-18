package top.geminix.circle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BadWordInfo {
    private String badWordId;
    private String badWordContent;

//    getter setter toStr

}
