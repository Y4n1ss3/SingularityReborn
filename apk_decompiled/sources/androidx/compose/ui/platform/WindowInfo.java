package androidx.compose.ui.platform;

import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface WindowInfo {
    /* renamed from: getContainerDpSize-MYxV2XQ */
    default long mo6768getContainerDpSizeMYxV2XQ() {
        return DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
    }

    /* renamed from: getContainerSize-YbymL2g */
    default long mo6769getContainerSizeYbymL2g() {
        return IntSize.m7777constructorimpl(-9223372034707292160L);
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A */
    default int mo6770getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().getValue().m6170unboximpl();
    }

    boolean isWindowFocused();
}
