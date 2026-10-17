package androidx.compose.runtime.retain;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class RetainContentPresenceIndicator implements RememberObserver {
    private final MutableState composer$delegate;
    private boolean didEnterComposition;
    private CancellationHandle enterCompositionCancellationHandle;
    private final RetainedValuesStore store;

    public RetainContentPresenceIndicator(RetainedValuesStore retainedValuesStore, Composer composer) {
        this.store = retainedValuesStore;
        this.composer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(composer, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onRemembered$lambda$0(RetainContentPresenceIndicator retainContentPresenceIndicator) {
        retainContentPresenceIndicator.didEnterComposition = true;
        retainContentPresenceIndicator.store.onContentEnteredComposition();
        return w01.a;
    }

    private final void setEnterCompositionCancellationHandle(CancellationHandle cancellationHandle) {
        CancellationHandle cancellationHandle2 = this.enterCompositionCancellationHandle;
        if (cancellationHandle2 != null) {
            cancellationHandle2.cancel();
        }
        this.enterCompositionCancellationHandle = cancellationHandle;
    }

    public final Composer getComposer() {
        return (Composer) this.composer$delegate.getValue();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        CancellationHandle cancellationHandle = this.enterCompositionCancellationHandle;
        if (cancellationHandle != null) {
            cancellationHandle.cancel();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        CancellationHandle cancellationHandle = this.enterCompositionCancellationHandle;
        if (cancellationHandle != null) {
            cancellationHandle.cancel();
        }
        if (this.didEnterComposition) {
            this.store.onContentExitComposition();
            this.didEnterComposition = false;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        setEnterCompositionCancellationHandle(getComposer().scheduleFrameEndCallback(new iy() { // from class: androidx.compose.runtime.retain.a
            @Override // defpackage.iy
            public final Object invoke() {
                w01 onRemembered$lambda$0;
                onRemembered$lambda$0 = RetainContentPresenceIndicator.onRemembered$lambda$0(RetainContentPresenceIndicator.this);
                return onRemembered$lambda$0;
            }
        }));
    }

    public final void setComposer(Composer composer) {
        this.composer$delegate.setValue(composer);
    }
}
