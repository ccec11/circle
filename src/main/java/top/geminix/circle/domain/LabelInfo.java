package top.geminix.circle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelInfo {
    private String labelId;
    private String labelName;
    private String sortID;//自关联的 指向自身


}
