package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WindowInfoImpl implements WindowInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final MutableState<PointerKeyboardModifiers> GlobalKeyboardModifiers = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(PointerKeyboardModifiers.m6164boximpl(PointerEvent_androidKt.EmptyPointerKeyboardModifiers()), null, 2, null);
    private final MutableState<IntSize> _containerSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7774boximpl(IntSize.Companion.m7787getZeroYbymL2g()), null, 2, null);
    private final MutableState<DpSize> _containerDpSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DpSize.m7697boximpl(DpSize.Companion.m7719getZeroMYxV2XQ()), null, 2, null);
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ */
    public long mo6768getContainerDpSizeMYxV2XQ() {
        return this._containerDpSize.getValue().m7717unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g */
    public long mo6769getContainerSizeYbymL2g() {
        return this._containerSize.getValue().m7786unboximpl();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A */
    public int mo6770getKeyboardModifiersk7X9c1A() {
        return GlobalKeyboardModifiers.getValue().m6170unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setContainerDpSize-EaSLcWc, reason: not valid java name */
    public void m6809setContainerDpSizeEaSLcWc(long j) {
        this._containerDpSize.setValue(DpSize.m7697boximpl(j));
    }

    /* renamed from: setContainerSize-ozmzZPI, reason: not valid java name */
    public void m6810setContainerSizeozmzZPI(long j) {
        this._containerSize.setValue(IntSize.m7774boximpl(j));
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m6811setKeyboardModifiers5xRPYO0(int i) {
        GlobalKeyboardModifiers.setValue(PointerKeyboardModifiers.m6164boximpl(i));
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final MutableState<PointerKeyboardModifiers> getGlobalKeyboardModifiers$ui() {
            return WindowInfoImpl.GlobalKeyboardModifiers;
        }

        private Companion() {
        }
    }
}
