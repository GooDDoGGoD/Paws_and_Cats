package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.osipov.DTO.CatDto;
import ru.osipov.database.CatService;

import java.util.List;


@RestController
@RequestMapping("/api/cats")
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping("/{id}")
    public ResponseEntity<List<CatDto>> getAllCats(@PathVariable int id) {
        return ResponseEntity.ok(catService.getAllCatsDto());
    }

    @GetMapping("/{filter}")
    public ResponseEntity<List<CatDto>> getCatsDtoByColor(@PathVariable String filter) {
        List<CatDto> cats = catService.getCatsDtoByColor(filter);
        return ResponseEntity.ok(cats);
    }
}
