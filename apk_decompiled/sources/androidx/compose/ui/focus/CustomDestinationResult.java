package androidx.compose.ui.focus;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CustomDestinationResult {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ CustomDestinationResult[] $VALUES;
    public static final CustomDestinationResult None = new CustomDestinationResult("None", 0);
    public static final CustomDestinationResult Cancelled = new CustomDestinationResult("Cancelled", 1);
    public static final CustomDestinationResult Redirected = new CustomDestinationResult("Redirected", 2);
    public static final CustomDestinationResult RedirectCancelled = new CustomDestinationResult("RedirectCancelled", 3);

    private static final /* synthetic */ CustomDestinationResult[] $values() {
        return new CustomDestinationResult[]{None, Cancelled, Redirected, RedirectCancelled};
    }

    static {
        CustomDestinationResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private CustomDestinationResult(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) $VALUES.clone();
    }
}
