package androidx.compose.runtime.retain;

import androidx.compose.runtime.retain.impl.PreconditionsKt;
import androidx.compose.runtime.retain.impl.SafeMultiValueMap;
import defpackage.fb0;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ManagedRetainedValuesStore implements RetainedValuesStore {
    public static final int $stable = 8;
    private boolean isContentComposed;
    private boolean isDisposed;
    private boolean isEnabled = true;
    private final fb0 keptExitedValues = SafeMultiValueMap.m4129constructorimpl$default(null, 1, null);

    private final void purgeUnusedExitedValues() {
        fb0 fb0Var = this.keptExitedValues;
        Object[] objArr = fb0Var.c;
        long[] jArr = fb0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof xa0) {
                                xa0 xa0Var = (xa0) obj;
                                Object[] objArr2 = xa0Var.a;
                                int i4 = xa0Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                    if (obj2 instanceof RetainObserver) {
                                        ((RetainObserver) obj2).onRetired();
                                    }
                                }
                            } else if (obj instanceof RetainObserver) {
                                ((RetainObserver) obj).onRetired();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        SafeMultiValueMap.m4127clearimpl(this.keptExitedValues);
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public Object consumeExitedValueOrDefault(Object obj, Object obj2) {
        return SafeMultiValueMap.m4140removeLastimpl(this.keptExitedValues, obj, obj2);
    }

    public final void disableRetainingExitedValues() {
        this.isEnabled = false;
        purgeUnusedExitedValues();
    }

    public final void dispose() {
        this.isDisposed = true;
        disableRetainingExitedValues();
    }

    public final void enableRetainingExitedValues() {
        if (this.isDisposed) {
            PreconditionsKt.throwIllegalStateException("Cannot call enableRetainingExitedValues on a disposed store");
        }
        this.isEnabled = true;
    }

    public final boolean isRetainingExitedValues() {
        return this.isEnabled && !this.isContentComposed;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentEnteredComposition() {
        if (this.isDisposed) {
            return;
        }
        if (this.isContentComposed) {
            PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        purgeUnusedExitedValues();
        this.isContentComposed = true;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void onContentExitComposition() {
        if (this.isDisposed) {
            return;
        }
        if (!this.isContentComposed) {
            PreconditionsKt.throwIllegalStateException("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!SafeMultiValueMap.m4136isEmptyimpl(this.keptExitedValues)) {
            PreconditionsKt.throwIllegalStateException("Attempted to start retaining exited values with pending exited values");
        }
        this.isContentComposed = false;
    }

    @Override // androidx.compose.runtime.retain.RetainedValuesStore
    public void saveExitingValue(Object obj, Object obj2) {
        if (isRetainingExitedValues()) {
            SafeMultiValueMap.m4125addimpl(this.keptExitedValues, obj, obj2);
        } else if (obj2 instanceof RetainObserver) {
            ((RetainObserver) obj2).onRetired();
        }
    }
}
