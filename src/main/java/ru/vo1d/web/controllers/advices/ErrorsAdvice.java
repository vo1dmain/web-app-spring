package ru.vo1d.web.controllers.advices;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.vo1d.web.data.dto.ErrorDto;

import java.util.NoSuchElementException;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
final class ErrorsAdvice {
    @NotNull
    @Contract("_ -> new")
    @ExceptionHandler(NoSuchElementException.class)
    @ResponseStatus(NOT_FOUND)
    ErrorDto notFoundHandler(final @NotNull NoSuchElementException e) {
        return new ErrorDto(NOT_FOUND.value(), e.getMessage());
    }
}
