package androidx.compose.material3;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarValue {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SearchBarValue[] $VALUES;
    public static final SearchBarValue Collapsed = new SearchBarValue("Collapsed", 0);
    public static final SearchBarValue Expanded = new SearchBarValue("Expanded", 1);

    private static final /* synthetic */ SearchBarValue[] $values() {
        return new SearchBarValue[]{Collapsed, Expanded};
    }

    static {
        SearchBarValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SearchBarValue(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SearchBarValue valueOf(String str) {
        return (SearchBarValue) Enum.valueOf(SearchBarValue.class, str);
    }

    public static SearchBarValue[] values() {
        return (SearchBarValue[]) $VALUES.clone();
    }
}
