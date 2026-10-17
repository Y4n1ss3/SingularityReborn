package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import defpackage.ac;
import defpackage.p80;
import defpackage.xe0;
import defpackage.z20;
import java.util.Collection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final <T> T getValue(State<? extends T> state, Object obj, z20 z20Var) {
        return state.getValue();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(ac.n0(tArr));
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(xe0... xe0VarArr) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(p80.Q(xe0VarArr));
        return snapshotStateMap;
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotState_androidKt.createSnapshotMutableState(t, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        if ((i & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        SnapshotStateSet<T> snapshotStateSet = new SnapshotStateSet<>();
        snapshotStateSet.addAll(ac.o0(tArr));
        return snapshotStateSet;
    }

    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:340)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(t);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, z20 z20Var, T t) {
        mutableState.setValue(t);
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends xe0> iterable) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(p80.P(iterable));
        return snapshotStateMap;
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return new SnapshotStateSet<>();
    }
}
