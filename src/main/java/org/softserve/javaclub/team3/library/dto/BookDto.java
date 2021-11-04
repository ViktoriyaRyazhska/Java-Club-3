package org.softserve.javaclub.team3.library.dto;

import lombok.Data;

@Data
public class BookDto {
    private String title;
    private int takenCount;
    private int copies;
    private int authorId;
}
