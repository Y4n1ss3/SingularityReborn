package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnackbarResult {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SnackbarResult[] $VALUES;
    public static final SnackbarResult Dismissed = new SnackbarResult("Dismissed", 0);
    public static final SnackbarResult ActionPerformed = new SnackbarResult("ActionPerformed", 1);

    private static final /* synthetic */ SnackbarResult[] $values() {
        return new SnackbarResult[]{Dismissed, ActionPerformed};
    }

    static {
        SnackbarResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SnackbarResult(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) $VALUES.clone();
    }
}
