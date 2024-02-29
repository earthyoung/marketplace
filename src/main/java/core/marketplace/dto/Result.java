package core.marketplace.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Result<T> {
    public T data;

    public Result(T data) {
        this.data = data;
    }

}
