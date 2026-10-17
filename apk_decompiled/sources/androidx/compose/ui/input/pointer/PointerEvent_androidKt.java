package androidx.compose.ui.input.pointer;

import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PointerEvent_androidKt {
    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m6165constructorimpl(0);
    }

    /* renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m6058getAreAnyPressedaHzCxE(int i) {
        return i != 0;
    }

    /* renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m6059indexOfFirstPressedaHzCxE(int i) {
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = (i & (-97)) | ((i & 96) >>> 5); (i3 & 1) == 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m6060indexOfLastPressedaHzCxE(int i) {
        int i2 = -1;
        for (int i3 = (i & (-97)) | ((i & 96) >>> 5); i3 != 0; i3 >>>= 1) {
            i2++;
        }
        return i2;
    }

    /* renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6061isAltGraphPressed5xRPYO0(int i) {
        return false;
    }

    /* renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6062isAltPressed5xRPYO0(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m6063isBackPressedaHzCxE(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m6064isCapsLockOn5xRPYO0(int i) {
        return (i & 1048576) != 0;
    }

    /* renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6065isCtrlPressed5xRPYO0(int i) {
        return (i & Fields.TransformOrigin) != 0;
    }

    /* renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m6066isForwardPressedaHzCxE(int i) {
        return (i & 16) != 0;
    }

    /* renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6067isFunctionPressed5xRPYO0(int i) {
        return (i & 8) != 0;
    }

    /* renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6068isMetaPressed5xRPYO0(int i) {
        return (i & 65536) != 0;
    }

    /* renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m6069isNumLockOn5xRPYO0(int i) {
        return (i & 2097152) != 0;
    }

    /* renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m6070isPressedbNIWhpI(int i, int i2) {
        return i2 != 0 ? i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4) ? (i & (1 << i2)) != 0 : (i & (1 << (i2 + 2))) != 0 : m6073isSecondaryPressedaHzCxE(i) : m6071isPrimaryPressedaHzCxE(i);
    }

    /* renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m6071isPrimaryPressedaHzCxE(int i) {
        return (i & 33) != 0;
    }

    /* renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m6072isScrollLockOn5xRPYO0(int i) {
        return (i & 4194304) != 0;
    }

    /* renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m6073isSecondaryPressedaHzCxE(int i) {
        return (i & 66) != 0;
    }

    /* renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6074isShiftPressed5xRPYO0(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m6075isSymPressed5xRPYO0(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m6076isTertiaryPressedaHzCxE(int i) {
        return (i & 4) != 0;
    }
}
