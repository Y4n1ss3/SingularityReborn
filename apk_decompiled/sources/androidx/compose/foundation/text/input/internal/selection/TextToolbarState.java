package androidx.compose.foundation.text.input.internal.selection;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextToolbarState {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ TextToolbarState[] $VALUES;
    public static final TextToolbarState None = new TextToolbarState("None", 0);
    public static final TextToolbarState Cursor = new TextToolbarState("Cursor", 1);
    public static final TextToolbarState Selection = new TextToolbarState("Selection", 2);

    private static final /* synthetic */ TextToolbarState[] $values() {
        return new TextToolbarState[]{None, Cursor, Selection};
    }

    static {
        TextToolbarState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private TextToolbarState(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) $VALUES.clone();
    }
}
