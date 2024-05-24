package gt.gob.inacif.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

/**
 *
 * @author esvux
 */
@Entity
@Table(name = "demo_phrase")
public class DemoPhrase implements Serializable {

    @Id
    @Column(name = "phrase_id")
    private Integer phraseId;

    @NotBlank
    @Size(min = 5, max = 50)
    @Column(name = "phrase")
    private String phrase;

    @Column(name = "author")
    private String author;

    public Integer getPhraseId() {
        return phraseId;
    }

    public void setPhraseId(Integer phraseId) {
        this.phraseId = phraseId;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "DemoPhrase{" + "phraseId=" + phraseId + ", phrase=" + phrase + ", author=" + author + '}';
    }

}
