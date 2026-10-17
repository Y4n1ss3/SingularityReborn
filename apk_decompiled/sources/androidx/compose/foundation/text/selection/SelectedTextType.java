package androidx.compose.foundation.text.selection;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectedTextType {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SelectedTextType[] $VALUES;
    public static final SelectedTextType EditableText = new SelectedTextType("EditableText", 0);
    public static final SelectedTextType StaticText = new SelectedTextType("StaticText", 1);

    private static final /* synthetic */ SelectedTextType[] $values() {
        return new SelectedTextType[]{EditableText, StaticText};
    }

    static {
        SelectedTextType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SelectedTextType(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SelectedTextType valueOf(String str) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, str);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) $VALUES.clone();
    }
}
