package androidx.compose.foundation.text.input.internal.undo;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextEditType {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ TextEditType[] $VALUES;
    public static final TextEditType Insert = new TextEditType("Insert", 0);
    public static final TextEditType Delete = new TextEditType("Delete", 1);
    public static final TextEditType Replace = new TextEditType("Replace", 2);

    private static final /* synthetic */ TextEditType[] $values() {
        return new TextEditType[]{Insert, Delete, Replace};
    }

    static {
        TextEditType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private TextEditType(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) $VALUES.clone();
    }
}
