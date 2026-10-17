package androidx.compose.ui.text;

import defpackage.bu;
import defpackage.p01;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AnnotationType {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ AnnotationType[] $VALUES;
    public static final AnnotationType Paragraph = new AnnotationType("Paragraph", 0);
    public static final AnnotationType Span = new AnnotationType("Span", 1);
    public static final AnnotationType VerbatimTts = new AnnotationType("VerbatimTts", 2);
    public static final AnnotationType Url = new AnnotationType("Url", 3);
    public static final AnnotationType Link = new AnnotationType("Link", 4);
    public static final AnnotationType Clickable = new AnnotationType("Clickable", 5);
    public static final AnnotationType String = new AnnotationType("String", 6);

    private static final /* synthetic */ AnnotationType[] $values() {
        return new AnnotationType[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        AnnotationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private AnnotationType(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) $VALUES.clone();
    }
}
