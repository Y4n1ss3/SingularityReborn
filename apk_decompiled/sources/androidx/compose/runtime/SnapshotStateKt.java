package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import defpackage.iw;
import defpackage.iy;
import defpackage.kn;
import defpackage.my;
import defpackage.ur0;
import defpackage.xe0;
import defpackage.z20;
import java.util.Collection;

/* loaded from: classes.dex */
public final class SnapshotStateKt {
    public static final <T extends R, R> State<R> collectAsState(iw iwVar, R r, kn knVar, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(iwVar, r, knVar, composer, i, i2);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    public static final <T> State<T> derivedStateOf(iy iyVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(iyVar);
    }

    public static final <T> T getValue(State<? extends T> state, Object obj, z20 z20Var) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, z20Var);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, iy iyVar) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, iyVar);
    }

    public static final <T> State<T> produceState(T t, my myVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, myVar, composer, i);
    }

    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t, composer, i);
    }

    public static final <T> void setValue(MutableState<T> mutableState, Object obj, z20 z20Var, T t) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, z20Var, t);
    }

    public static final <T> iw snapshotFlow(iy iyVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(iyVar);
    }

    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    public static final <T> SnapshotStateList<T> toMutableStateList(Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(Iterable<? extends xe0> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    public static final <T> State<T> collectAsState(ur0 ur0Var, kn knVar, Composer composer, int i, int i2) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(ur0Var, knVar, composer, i, i2);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, iy iyVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, iyVar);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(xe0... xe0VarArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(xe0VarArr);
    }

    public static final <T> SnapshotStateSet<T> mutableStateSetOf(T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    public static final <T> State<T> produceState(T t, Object obj, my myVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, myVar, composer, i);
    }

    public static final <T> iw snapshotFlow(SnapshotFlowManager snapshotFlowManager, iy iyVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(snapshotFlowManager, iyVar);
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, my myVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, myVar, composer, i);
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, my myVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState(t, obj, obj2, obj3, myVar, composer, i);
    }

    public static final <T> State<T> produceState(T t, Object[] objArr, my myVar, Composer composer, int i) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t, objArr, myVar, composer, i);
    }
}
