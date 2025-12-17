package com.example.portfolioapi.controller;

import com.example.portfolioapi.entity.Film;
import com.example.portfolioapi.repository.FilmRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    // ① 全件取得
    @GetMapping
    public List<Film> getFilms() {
        return filmRepository.findAll();
    }

    // ② IDで1件取得
    @GetMapping("/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable Integer id) {
        return filmRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // ③ 新規作成
    @PostMapping
    public Film createFilm(@RequestBody Film film) {
        return filmRepository.save(film);
    }

    // ④ 更新
    @PutMapping("/{id}")
    public ResponseEntity<Film> updateFilm(
            @PathVariable Integer id,
            @RequestBody Film filmDetails) {

        return filmRepository.findById(id)
                .map(film -> {
                    film.setTitle(filmDetails.getTitle());
                    film.setDescription(filmDetails.getDescription());
                    return ResponseEntity.ok(filmRepository.save(film));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // ⑤ 削除
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFilm(@PathVariable Integer id) {
        if (!filmRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        filmRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
