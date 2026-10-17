package androidx.compose.foundation.text.input.internal.undo;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ TextFieldEditUndoBehavior[] $VALUES;
    public static final TextFieldEditUndoBehavior MergeIfPossible = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
    public static final TextFieldEditUndoBehavior ClearHistory = new TextFieldEditUndoBehavior("ClearHistory", 1);
    public static final TextFieldEditUndoBehavior NeverMerge = new TextFieldEditUndoBehavior("NeverMerge", 2);

    private static final /* synthetic */ TextFieldEditUndoBehavior[] $values() {
        return new TextFieldEditUndoBehavior[]{MergeIfPossible, ClearHistory, NeverMerge};
    }

    static {
        TextFieldEditUndoBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private TextFieldEditUndoBehavior(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) $VALUES.clone();
    }
}
