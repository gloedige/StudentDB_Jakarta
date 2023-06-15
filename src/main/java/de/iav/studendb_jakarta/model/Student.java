package de.iav.studendb_jakarta.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record Student(
        @NotBlank(message = "Content of field id is not allowed to be empty!")
        @Size(min = 1, max = 6, message = "The size of id must be in between 1 and 6 digits!")
        String id,
        @NotBlank(message = "Content of field name is not allowed to be empty!")
        @Size(min = 1, max = 40, message = "The size of name must be in between 1 and 6 digits!")
        @Pattern(regexp="[a-zA-z]+", message="Typs of field name must contiane letter a-z and A-Z!")
        String name,
        @NotBlank(message = "Content of field course is not allowed to be empty!")
        @Size(min = 1, max = 40, message = "The size of course must be in between 1 and 6 digits!")
        @Pattern(regexp="[a-zA-z]+", message="Typs of field course must contiane letter a-z and A-Z!")
        String course) {
}
