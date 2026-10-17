package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = new SnapshotThreadLocal<>();

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    public static final <T> State<T> derivedStateOf(iy iyVar) {
        return new DerivedSnapshotState(iyVar, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, iy iyVar) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers2.content;
        int size = derivedStateObservers2.getSize();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            derivedStateObserverArr[i2].start(derivedState);
        }
        try {
            return (R) iyVar.invoke();
        } finally {
            DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers2.content;
            int size2 = derivedStateObservers2.getSize();
            while (i < size2) {
                derivedStateObserverArr2[i].done(derivedState);
                i++;
            }
        }
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, iy iyVar) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers2.add(derivedStateObserver);
            iyVar.invoke();
        } finally {
            derivedStateObservers2.removeAt(derivedStateObservers2.getSize() - 1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(ky kyVar) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return (T) kyVar.invoke(intRef);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, iy iyVar) {
        return new DerivedSnapshotState(iyVar, snapshotMutationPolicy);
    }
}
