package vo;

import lombok.Data;

import java.util.List;

@Data
public class RList<T> {
    private Integer pagenum;

    private Integer pagesize;

    private Long total;

    private List<T> objects;

    public RList(Integer pagenum, Integer pagesize, Long total,List objects) {
        this.pagenum = pagenum;
        this.pagesize = pagesize;
        this.total = total;
        this.objects = objects;
    }
}
