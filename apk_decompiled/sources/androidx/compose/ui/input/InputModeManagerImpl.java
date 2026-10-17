package androidx.compose.ui.input;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class InputModeManagerImpl implements InputModeManager {
    public static final int $stable = 8;
    private final MutableState inputMode$delegate;
    private final InputModeChangeRequester onRequestInputModeChange;

    private InputModeManagerImpl(int i, InputModeChangeRequester inputModeChangeRequester) {
        this.onRequestInputModeChange = inputModeChangeRequester;
        this.inputMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputMode.m5566boximpl(i), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: getInputMode-aOaMEAU */
    public int mo5576getInputModeaOaMEAU() {
        return ((InputMode) this.inputMode$delegate.getValue()).m5572unboximpl();
    }

    @Override // androidx.compose.ui.input.InputModeManager
    /* renamed from: requestInputMode-iuPiT84 */
    public boolean mo5577requestInputModeiuPiT84(int i) {
        return this.onRequestInputModeChange.mo5575requestiuPiT84(i);
    }

    /* renamed from: setInputMode-iuPiT84, reason: not valid java name */
    public void m5578setInputModeiuPiT84(int i) {
        this.inputMode$delegate.setValue(InputMode.m5566boximpl(i));
    }

    public /* synthetic */ InputModeManagerImpl(int i, InputModeChangeRequester inputModeChangeRequester, dq dqVar) {
        this(i, inputModeChangeRequester);
    }
}
