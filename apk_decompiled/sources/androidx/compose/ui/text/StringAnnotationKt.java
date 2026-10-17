package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class StringAnnotationKt {
    public static final AnnotatedString.Range<String> unbox(AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        item.getClass();
        return new AnnotatedString.Range<>(((StringAnnotation) item).m7014unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
