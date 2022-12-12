import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AnnotationProcessorSampleTest {
    @Test
    void name() {
        AnnotationProcessorSample annotationProcessorSample = new AnnotationProcessorSample("fuga");
        String actual = annotationProcessorSample.getA();
        assertThat(actual).isEqualTo("hoge");


    }
}