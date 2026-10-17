package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LazyWindowInfo implements WindowInfo {
    public static final int $stable = 0;
    private MutableState<DerivedSize> _containerSize;
    private final MutableState isWindowFocused$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    private iy onInitializeContainerSize;

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerDpSize-MYxV2XQ, reason: not valid java name */
    public long mo6768getContainerDpSizeMYxV2XQ() {
        DerivedSize zero;
        MutableState<DerivedSize> mutableState = this._containerSize;
        if (mutableState == null) {
            iy iyVar = this.onInitializeContainerSize;
            if (iyVar == null || (zero = (DerivedSize) iyVar.invoke()) == null) {
                zero = DerivedSize.Companion.getZero();
            }
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zero, null, 2, null);
            this._containerSize = mutableState;
            this.onInitializeContainerSize = null;
        }
        mutableState.getClass();
        return mutableState.getValue().m6734getDpSizeMYxV2XQ();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getContainerSize-YbymL2g, reason: not valid java name */
    public long mo6769getContainerSizeYbymL2g() {
        DerivedSize zero;
        MutableState<DerivedSize> mutableState = this._containerSize;
        if (mutableState == null) {
            iy iyVar = this.onInitializeContainerSize;
            if (iyVar == null || (zero = (DerivedSize) iyVar.invoke()) == null) {
                zero = DerivedSize.Companion.getZero();
            }
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(zero, null, 2, null);
            this._containerSize = mutableState;
            this.onInitializeContainerSize = null;
        }
        mutableState.getClass();
        return mutableState.getValue().m6735getPxSizeYbymL2g();
    }

    @Override // androidx.compose.ui.platform.WindowInfo
    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public int mo6770getKeyboardModifiersk7X9c1A() {
        return WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().getValue().m6170unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.platform.WindowInfo
    public boolean isWindowFocused() {
        return ((Boolean) this.isWindowFocused$delegate.getValue()).booleanValue();
    }

    /* renamed from: setKeyboardModifiers-5xRPYO0, reason: not valid java name */
    public void m6771setKeyboardModifiers5xRPYO0(int i) {
        WindowInfoImpl.Companion.getGlobalKeyboardModifiers$ui().setValue(PointerKeyboardModifiers.m6164boximpl(i));
    }

    public final void setOnInitializeContainerSize(iy iyVar) {
        if (this._containerSize == null) {
            this.onInitializeContainerSize = iyVar;
        }
    }

    public void setWindowFocused(boolean z) {
        this.isWindowFocused$delegate.setValue(Boolean.valueOf(z));
    }

    public final void updateContainerSizeIfObserved(iy iyVar) {
        MutableState mutableState = this._containerSize;
        if (mutableState != null) {
            mutableState.setValue(iyVar.invoke());
        }
    }
}
