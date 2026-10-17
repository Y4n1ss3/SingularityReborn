package androidx.compose.material3.internal;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeEdge {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SwipeEdge[] $VALUES;
    public static final SwipeEdge Left = new SwipeEdge("Left", 0);
    public static final SwipeEdge Right = new SwipeEdge("Right", 1);
    public static final SwipeEdge None = new SwipeEdge("None", 2);

    private static final /* synthetic */ SwipeEdge[] $values() {
        return new SwipeEdge[]{Left, Right, None};
    }

    static {
        SwipeEdge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SwipeEdge(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SwipeEdge valueOf(String str) {
        return (SwipeEdge) Enum.valueOf(SwipeEdge.class, str);
    }

    public static SwipeEdge[] values() {
        return (SwipeEdge[]) $VALUES.clone();
    }
}
