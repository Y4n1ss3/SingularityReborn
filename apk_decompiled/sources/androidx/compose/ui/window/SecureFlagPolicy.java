package androidx.compose.ui.window;

import defpackage.bu;
import defpackage.p01;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SecureFlagPolicy {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ SecureFlagPolicy[] $VALUES;
    public static final SecureFlagPolicy Inherit = new SecureFlagPolicy("Inherit", 0);
    public static final SecureFlagPolicy SecureOn = new SecureFlagPolicy("SecureOn", 1);
    public static final SecureFlagPolicy SecureOff = new SecureFlagPolicy("SecureOff", 2);

    private static final /* synthetic */ SecureFlagPolicy[] $values() {
        return new SecureFlagPolicy[]{Inherit, SecureOn, SecureOff};
    }

    static {
        SecureFlagPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = p01.k($values);
    }

    private SecureFlagPolicy(String str, int i) {
    }

    public static bu getEntries() {
        return $ENTRIES;
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) $VALUES.clone();
    }
}
