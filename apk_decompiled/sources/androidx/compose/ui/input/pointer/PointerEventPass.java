package androidx.compose.ui.input.pointer;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerEventPass {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ PointerEventPass[] $VALUES;
    public static final PointerEventPass Initial = new PointerEventPass("Initial", 0);
    public static final PointerEventPass Main = new PointerEventPass("Main", 1);
    public static final PointerEventPass Final = new PointerEventPass("Final", 2);

    private static final /* synthetic */ PointerEventPass[] $values() {
        return new PointerEventPass[]{Initial, Main, Final};
    }

    static {
        PointerEventPass[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private PointerEventPass(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }
}
