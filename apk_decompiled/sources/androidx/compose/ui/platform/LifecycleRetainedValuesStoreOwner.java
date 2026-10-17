package androidx.compose.ui.platform;

import androidx.compose.runtime.CancellationHandle;
import androidx.compose.runtime.retain.RetainedValuesStore;
import defpackage.h10;
import defpackage.iy;
import defpackage.na0;
import defpackage.w11;
import defpackage.xa0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LifecycleRetainedValuesStoreOwner extends w11 {
    public static final int $stable = 8;
    private final na0 scopes;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface FrameEndScheduler {
        CancellationHandle scheduleFrameEndCallback(iy iyVar);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class RetainedValuesStoreEntry {
        public static final int $stable = 8;
        private final LifecycleRetainedValuesStore _retainedValuesStore;
        private CancellationHandle endRetainCancellationHandle;
        private boolean isInUse;
        private final RetainedValuesStore retainedValuesStore;

        public RetainedValuesStoreEntry() {
            LifecycleRetainedValuesStore lifecycleRetainedValuesStore = new LifecycleRetainedValuesStore(null, 1, null);
            this._retainedValuesStore = lifecycleRetainedValuesStore;
            this.retainedValuesStore = lifecycleRetainedValuesStore;
        }

        private final void setEndRetainCancellationHandle(CancellationHandle cancellationHandle) {
            CancellationHandle cancellationHandle2 = this.endRetainCancellationHandle;
            if (cancellationHandle2 != null) {
                cancellationHandle2.cancel();
            }
            this.endRetainCancellationHandle = cancellationHandle;
        }

        public final RetainedValuesStore getRetainedValuesStore() {
            return this.retainedValuesStore;
        }

        public final boolean isInUse() {
            return this.isInUse;
        }

        public final void onCleared() {
            setEndRetainCancellationHandle(null);
            this._retainedValuesStore.dispose();
        }

        public final void release() {
            this.isInUse = false;
        }

        public final void setInUse(boolean z) {
            this.isInUse = z;
        }

        public final void startRetainingExitedValues() {
            if (this._retainedValuesStore.isRetainingExitedValues()) {
                setEndRetainCancellationHandle(null);
            } else {
                this._retainedValuesStore.startLifecycleTransition();
            }
        }

        public final void stopRetainingExitedValues(FrameEndScheduler frameEndScheduler) {
            CancellationHandle cancellationHandle;
            if (this._retainedValuesStore.isRetainingExitedValues()) {
                try {
                    cancellationHandle = frameEndScheduler.scheduleFrameEndCallback(new LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1(this));
                } catch (CancellationException unused) {
                    this._retainedValuesStore.endLifecycleTransition();
                    cancellationHandle = null;
                }
                setEndRetainCancellationHandle(cancellationHandle);
            }
        }
    }

    public LifecycleRetainedValuesStoreOwner() {
        na0 na0Var = h10.a;
        this.scopes = new na0();
    }

    public final RetainedValuesStoreEntry getOrCreateRetainedValuesStoreEntry(int i) {
        Object obj;
        na0 na0Var = this.scopes;
        Object b = na0Var.b(i);
        if (b == null) {
            b = new xa0(1);
            na0Var.i(i, b);
        }
        xa0 xa0Var = (xa0) b;
        Object[] objArr = xa0Var.a;
        int i2 = xa0Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                obj = null;
                break;
            }
            obj = objArr[i3];
            if (!((RetainedValuesStoreEntry) obj).isInUse()) {
                break;
            }
            i3++;
        }
        RetainedValuesStoreEntry retainedValuesStoreEntry = (RetainedValuesStoreEntry) obj;
        if (retainedValuesStoreEntry == null) {
            retainedValuesStoreEntry = new RetainedValuesStoreEntry();
            xa0Var.g(retainedValuesStoreEntry);
        }
        retainedValuesStoreEntry.setInUse(true);
        return retainedValuesStoreEntry;
    }

    @Override // defpackage.w11
    public void onCleared() {
        na0 na0Var = this.scopes;
        int[] iArr = na0Var.b;
        Object[] objArr = na0Var.c;
        long[] jArr = na0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        xa0 xa0Var = (xa0) objArr[i4];
                        Object[] objArr2 = xa0Var.a;
                        int i6 = xa0Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((RetainedValuesStoreEntry) objArr2[i7]).onCleared();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
