package co.kr.gaepan.dto.pet;

import co.kr.gaepan.entity.pet.PetRegisterEntity;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetRegisterDTO {

    private int no;
    private String uid;
    private String tName;
    private String title;
    private String thumb;
    private MultipartFile filethumb;
    private String content;
    private String name;
    private int cate;
    private int type;
    private String regip;
    private LocalDateTime regDate;
    private int division;


    public PetRegisterEntity toEntity() {
        return PetRegisterEntity.builder()
              .no(no)
              .uid(uid)
              .title(title)
              .thumb(thumb)
              .content(content)
              .name(name)
              .cate(cate)
              .type(type)
              .regip(regip)
              .regDate(regDate)
              .division(division)
              .build();
    }

}
