package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarDuration {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SnackbarDuration[] $VALUES;
    public static final SnackbarDuration Short = new SnackbarDuration("Short", 0);
    public static final SnackbarDuration Long = new SnackbarDuration("Long", 1);
    public static final SnackbarDuration Indefinite = new SnackbarDuration("Indefinite", 2);

    private static final /* synthetic */ SnackbarDuration[] $values() {
        return new SnackbarDuration[]{Short, Long, Indefinite};
    }

    static {
        SnackbarDuration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SnackbarDuration(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) $VALUES.clone();
    }
}
