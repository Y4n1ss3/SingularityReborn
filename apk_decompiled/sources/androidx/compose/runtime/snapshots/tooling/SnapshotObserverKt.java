package androidx.compose.runtime.snapshots.tooling;

import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import defpackage.dr0;
import defpackage.er0;
import defpackage.ky;
import defpackage.my;
import defpackage.rl0;
import defpackage.w01;
import defpackage.xe0;
import defpackage.xt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotObserverKt {
    private static PersistentList<? extends SnapshotObserver> observers;

    public static final <R extends Snapshot> R creatingSnapshot(Snapshot snapshot, ky kyVar, ky kyVar2, boolean z, my myVar) {
        Map map;
        PersistentList persistentList = observers;
        if (persistentList != null) {
            xe0 mergeObservers = mergeObservers(persistentList, snapshot, z, kyVar, kyVar2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) mergeObservers.d;
            ky readObserver = snapshotInstanceObservers.getReadObserver();
            kyVar2 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) mergeObservers.e;
            kyVar = readObserver;
        } else {
            map = null;
        }
        R r = (R) myVar.invoke(kyVar, kyVar2);
        if (persistentList != null) {
            dispatchCreatedObservers(persistentList, snapshot, r, map);
        }
        return r;
    }

    public static final void dispatchCreatedObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, Snapshot snapshot2, Map<SnapshotObserver, SnapshotInstanceObservers> map) {
        int size = persistentList.size();
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = persistentList.get(i);
            snapshotObserver.onCreated(snapshot2, snapshot, map != null ? map.get(snapshotObserver) : null);
        }
    }

    public static final void dispatchObserverOnApplied(Snapshot snapshot, rl0 rl0Var) {
        Set<? extends Object> set;
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (rl0Var == null || (set = ScatterSetWrapperKt.wrapIntoSet(rl0Var)) == null) {
            set = xt.d;
        }
        int size = persistentList.size();
        for (int i = 0; i < size; i++) {
            persistentList.get(i).onApplied(snapshot, set);
        }
    }

    public static final void dispatchObserverOnPreDispose(Snapshot snapshot) {
        PersistentList<? extends SnapshotObserver> persistentList = observers;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i = 0; i < size; i++) {
                persistentList.get(i).onPreDispose(snapshot);
            }
        }
    }

    public static final xe0 mergeObservers(PersistentList<? extends SnapshotObserver> persistentList, Snapshot snapshot, boolean z, ky kyVar, ky kyVar2) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i = 0; i < size; i++) {
            SnapshotObserver snapshotObserver = persistentList.get(i);
            SnapshotInstanceObservers onPreCreate = snapshotObserver.onPreCreate(snapshot, z);
            if (onPreCreate != null) {
                kyVar = mergeObservers(onPreCreate.getReadObserver(), kyVar);
                kyVar2 = mergeObservers(onPreCreate.getWriteObserver(), kyVar2);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, onPreCreate);
            }
        }
        return new xe0(new SnapshotInstanceObservers(kyVar, kyVar2), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 mergeObservers$lambda$1(ky kyVar, ky kyVar2, Object obj) {
        kyVar.invoke(obj);
        kyVar2.invoke(obj);
        return w01.a;
    }

    public static final ObserverHandle observeSnapshots(Snapshot.Companion companion, SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentList = observers;
                if (persistentList == null) {
                    persistentList = ExtensionsKt.persistentListOf();
                }
                observers = persistentList.add((PersistentList<? extends SnapshotObserver>) snapshotObserver);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new dr0(snapshotObserver, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeSnapshots$lambda$1(SnapshotObserver snapshotObserver) {
        synchronized (SnapshotKt.getLock()) {
            try {
                PersistentList<? extends SnapshotObserver> persistentList = observers;
                PersistentList<? extends SnapshotObserver> persistentList2 = null;
                PersistentList<? extends SnapshotObserver> remove = persistentList != null ? persistentList.remove((PersistentList<? extends SnapshotObserver>) snapshotObserver) : null;
                if (remove != null && !remove.isEmpty()) {
                    persistentList2 = remove;
                }
                observers = persistentList2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static /* synthetic */ void getObservers$annotations() {
    }

    private static final ky mergeObservers(ky kyVar, ky kyVar2) {
        if (kyVar == null || kyVar2 == null) {
            return kyVar == null ? kyVar2 : kyVar;
        }
        return new er0(2, kyVar, kyVar2);
    }
}
