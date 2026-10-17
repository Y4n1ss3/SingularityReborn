package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.TransparentObserverMutableSnapshot;
import androidx.compose.runtime.snapshots.TransparentObserverSnapshot;
import defpackage.ac;
import defpackage.bq;
import defpackage.fg;
import defpackage.gb0;
import defpackage.hm;
import defpackage.ky;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.sl0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {615, 626}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends us0 implements ny {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, hm hmVar) {
        super(3, hmVar);
        this.this$0 = recomposer;
    }

    private static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, gb0 gb0Var, gb0 gb0Var2, gb0 gb0Var3, gb0 gb0Var4) {
        char c;
        long j;
        long j2;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    ControlledComposition controlledComposition = list3.get(i);
                    controlledComposition.abandonChanges();
                    recomposer.recordFailedCompositionLocked(controlledComposition);
                }
                list3.clear();
                Object[] objArr = gb0Var.b;
                long[] jArr = gb0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i2 << 3) + i4];
                                    controlledComposition2.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                gb0Var.f();
                Object[] objArr2 = gb0Var2.b;
                long[] jArr2 = gb0Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((ControlledComposition) objArr2[(i5 << 3) + i7]).changesApplied();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                gb0Var2.f();
                gb0Var3.f();
                Object[] objArr3 = gb0Var4.b;
                long[] jArr3 = gb0Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i8 << 3) + i10];
                                    controlledComposition3.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                gb0Var4.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    list.add((MovableContentStateReference) list2.get(i));
                }
                list3 = recomposer.movableContentAwaitingInsert;
                list3.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0308 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0355 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w01 invokeSuspend$lambda$2(Recomposer recomposer, gb0 gb0Var, gb0 gb0Var2, List list, List list2, gb0 gb0Var3, List list3, gb0 gb0Var4, Set set, long j) {
        boolean hasBroadcastFrameClockAwaiters;
        MutableVector mutableVector;
        boolean z;
        MutableVector mutableVector2;
        List knownCompositionsLocked;
        MutableVector mutableVector3;
        Object[] objArr;
        List performInsertValues;
        MutableVector mutableVector4;
        ControlledComposition performRecompose;
        char c;
        long j2;
        long j3;
        fg deriveStateLocked;
        BroadcastFrameClock broadcastFrameClock;
        Recomposer recomposer2 = recomposer;
        List list4 = list;
        List list5 = list3;
        gb0 gb0Var5 = gb0Var4;
        hasBroadcastFrameClockAwaiters = recomposer2.getHasBroadcastFrameClockAwaiters();
        if (hasBroadcastFrameClockAwaiters) {
            Trace trace = Trace.INSTANCE;
            Object beginSection = trace.beginSection("Recomposer:animation");
            try {
                broadcastFrameClock = recomposer2.broadcastFrameClock;
                broadcastFrameClock.sendFrame(j);
                Snapshot.Companion.sendApplyNotifications();
                trace.endSection(beginSection);
            } finally {
                Trace.INSTANCE.endSection(beginSection);
            }
        }
        Object beginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer2.recordComposerModifications();
            synchronized (recomposer2.stateLock) {
                try {
                    mutableVector = recomposer2.compositionInvalidations;
                    Object[] objArr2 = mutableVector.content;
                    int size = mutableVector.getSize();
                    z = 0;
                    for (int i = 0; i < size; i++) {
                        list4.add((ControlledComposition) objArr2[i]);
                    }
                    mutableVector2 = recomposer2.compositionInvalidations;
                    mutableVector2.clear();
                } finally {
                }
            }
            gb0Var.f();
            gb0Var2.f();
        } catch (Throwable th) {
            throw th;
        }
        while (true) {
            if (list4.isEmpty() && list2.isEmpty()) {
                break;
            }
            List list6 = list4;
            List list7 = list5;
            try {
                int size2 = list6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ControlledComposition controlledComposition = (ControlledComposition) list6.get(i2);
                    performRecompose = recomposer2.performRecompose(controlledComposition, gb0Var);
                    if (performRecompose != null) {
                        list7.add(performRecompose);
                    }
                    gb0Var2.d(controlledComposition);
                }
                list6.clear();
                if (!gb0Var.c()) {
                    mutableVector4 = recomposer2.compositionInvalidations;
                    if (mutableVector4.getSize() == 0) {
                        if (list6.isEmpty()) {
                            recomposer2 = recomposer;
                            list4 = list;
                            list5 = list3;
                            gb0Var5 = gb0Var4;
                            z = 0;
                        } else {
                            try {
                                invokeSuspend$fillToInsert(list2, recomposer2);
                                while (!list2.isEmpty()) {
                                    performInsertValues = recomposer2.performInsertValues(list2, gb0Var);
                                    gb0Var3.getClass();
                                    performInsertValues.getClass();
                                    Iterator it = performInsertValues.iterator();
                                    while (it.hasNext()) {
                                        gb0Var3.l(it.next());
                                    }
                                    invokeSuspend$fillToInsert(list2, recomposer2);
                                }
                                list4 = list6;
                                list5 = list7;
                                z = 0;
                                gb0Var5 = gb0Var4;
                            } catch (Throwable th2) {
                                Recomposer.processCompositionError$default(recomposer2, th2, null, true, 2, null);
                                invokeSuspend$clearRecompositionState(recomposer, list6, list2, list7, gb0Var3, gb0Var4, gb0Var, gb0Var2);
                                return w01.a;
                            }
                        }
                    }
                }
                synchronized (recomposer2.stateLock) {
                    try {
                        knownCompositionsLocked = recomposer2.knownCompositionsLocked();
                        int size3 = knownCompositionsLocked.size();
                        for (int i3 = 0; i3 < size3; i3++) {
                            ControlledComposition controlledComposition2 = (ControlledComposition) knownCompositionsLocked.get(i3);
                            if (!gb0Var2.a(controlledComposition2) && controlledComposition2.observesAnyOf(set)) {
                                list6.add(controlledComposition2);
                            }
                        }
                        mutableVector3 = recomposer2.compositionInvalidations;
                        int size4 = mutableVector3.getSize();
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            objArr = mutableVector3.content;
                            if (i4 >= size4) {
                                break;
                            }
                            ControlledComposition controlledComposition3 = (ControlledComposition) objArr[i4];
                            if (!gb0Var2.a(controlledComposition3) && !list6.contains(controlledComposition3)) {
                                list6.add(controlledComposition3);
                                i5++;
                            } else if (i5 > 0) {
                                Object[] objArr3 = mutableVector3.content;
                                objArr3[i4 - i5] = objArr3[i4];
                            }
                            i4++;
                        }
                        int i6 = size4 - i5;
                        ac.X(objArr, i6, size4, null);
                        mutableVector3.setSize(i6);
                    } finally {
                    }
                }
                if (list6.isEmpty()) {
                }
            } catch (Throwable th3) {
                try {
                    Recomposer.processCompositionError$default(recomposer, th3, null, true, 2, null);
                    invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, gb0Var3, gb0Var4, gb0Var, gb0Var2);
                    return w01.a;
                } finally {
                    list.clear();
                }
            }
            throw th;
        }
        Snapshot current = Snapshot.Companion.getCurrent();
        Snapshot transparentObserverMutableSnapshot = current instanceof MutableSnapshot ? new TransparentObserverMutableSnapshot((MutableSnapshot) current, null, null, true, false) : new TransparentObserverSnapshot(current, null, true, z);
        try {
            Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
            try {
                if (!list5.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                    try {
                        int size5 = list5.size();
                        for (int i7 = z; i7 < size5; i7++) {
                            gb0Var5.d((ControlledComposition) list5.get(i7));
                        }
                        int size6 = list5.size();
                        for (int i8 = z; i8 < size6; i8++) {
                            ((ControlledComposition) list5.get(i8)).applyChanges();
                        }
                        list5.clear();
                    } catch (Throwable th4) {
                        try {
                            Recomposer.processCompositionError$default(recomposer2, th4, null, false, 6, null);
                            invokeSuspend$clearRecompositionState(recomposer, list4, list2, list5, gb0Var3, gb0Var5, gb0Var, gb0Var2);
                            w01 w01Var = w01.a;
                            transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                            return w01Var;
                        } finally {
                            list3.clear();
                        }
                    }
                }
                if (gb0Var3.c()) {
                    try {
                        gb0Var5.k(gb0Var3);
                        Object[] objArr4 = gb0Var3.b;
                        long[] jArr = gb0Var3.a;
                        c = 7;
                        int length = jArr.length - 2;
                        j2 = 128;
                        int i9 = z;
                        if (length >= 0) {
                            while (true) {
                                long j4 = jArr[i9];
                                j3 = 255;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        if ((j4 & 255) < 128) {
                                            ((ControlledComposition) objArr4[(i9 << 3) + i11]).applyLateChanges();
                                        }
                                        j4 >>= 8;
                                    }
                                    if (i10 != 8) {
                                        break;
                                    }
                                }
                                if (i9 == length) {
                                    break;
                                }
                                i9++;
                            }
                        } else {
                            j3 = 255;
                        }
                    } catch (Throwable th5) {
                        try {
                            Recomposer.processCompositionError$default(recomposer, th5, null, false, 6, null);
                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, gb0Var3, gb0Var5, gb0Var, gb0Var2);
                            w01 w01Var2 = w01.a;
                            transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                            return w01Var2;
                        } finally {
                            gb0Var3.f();
                        }
                    }
                } else {
                    c = 7;
                    j2 = 128;
                    j3 = 255;
                }
                if (gb0Var5.c()) {
                    try {
                        Object[] objArr5 = gb0Var5.b;
                        long[] jArr2 = gb0Var5.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j5 = jArr2[i12];
                                if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j5 & j3) < j2) {
                                            ((ControlledComposition) objArr5[(i12 << 3) + i14]).changesApplied();
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i13 != 8) {
                                        break;
                                    }
                                }
                                if (i12 == length2) {
                                    break;
                                }
                                i12++;
                            }
                        }
                        gb0Var5.f();
                    } catch (Throwable th6) {
                        try {
                            Recomposer.processCompositionError$default(recomposer, th6, null, false, 6, null);
                            invokeSuspend$clearRecompositionState(recomposer, list, list2, list3, gb0Var3, gb0Var5, gb0Var, gb0Var2);
                            w01 w01Var3 = w01.a;
                            transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                            return w01Var3;
                        } finally {
                            gb0Var4.f();
                        }
                    }
                }
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                transparentObserverMutableSnapshot.dispose();
                synchronized (recomposer.stateLock) {
                    deriveStateLocked = recomposer.deriveStateLocked();
                    if (deriveStateLocked != null) {
                        ComposerKt.composeImmediateRuntimeError("unexpected to get continuation here");
                    }
                }
                Snapshot.Companion.notifyObjectsInitialized();
                gb0Var2.f();
                gb0Var.f();
                recomposer.compositionsRemoved = null;
                Trace.INSTANCE.endSection(beginSection2);
                return w01.a;
            } catch (Throwable th7) {
                transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                throw th7;
            }
        } finally {
            transparentObserverMutableSnapshot.dispose();
        }
    }

    @Override // defpackage.ny
    public final Object invoke(un unVar, MonotonicFrameClock monotonicFrameClock, hm hmVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, hmVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0101 -> B:6:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0118 -> B:7:0x00ac). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        gb0 gb0Var;
        gb0 gb0Var2;
        List list;
        Set set;
        final List list2;
        gb0 gb0Var3;
        List list3;
        gb0 gb0Var4;
        final List list4;
        final gb0 gb0Var5;
        final List list5;
        final gb0 gb0Var6;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        NextFrameEndCallbackQueue nextFrameEndCallbackQueue;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            gb0 gb0Var7 = sl0.a;
            gb0Var = new gb0();
            gb0 gb0Var8 = new gb0();
            gb0 gb0Var9 = new gb0();
            Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(gb0Var9);
            gb0Var2 = new gb0();
            list = arrayList;
            set = wrapIntoSet;
            list2 = arrayList2;
            gb0Var3 = gb0Var9;
            list3 = arrayList3;
            gb0Var4 = gb0Var8;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            gb0 gb0Var10 = (gb0) this.L$8;
            set = (Set) this.L$7;
            gb0Var3 = (gb0) this.L$6;
            gb0Var4 = (gb0) this.L$5;
            gb0 gb0Var11 = (gb0) this.L$4;
            List list6 = (List) this.L$3;
            list2 = (List) this.L$2;
            List list7 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            p10.Q(obj);
            gb0Var6 = gb0Var10;
            monotonicFrameClock = monotonicFrameClock2;
            list4 = list6;
            list5 = list7;
            gb0Var5 = gb0Var11;
            final Set set2 = set;
            final gb0 gb0Var12 = gb0Var4;
            final gb0 gb0Var13 = gb0Var3;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gb0 gb0Var14 = (gb0) this.L$8;
            set = (Set) this.L$7;
            gb0Var3 = (gb0) this.L$6;
            gb0Var4 = (gb0) this.L$5;
            gb0Var = (gb0) this.L$4;
            list3 = (List) this.L$3;
            list2 = (List) this.L$2;
            list = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            p10.Q(obj);
            gb0Var2 = gb0Var14;
            monotonicFrameClock = monotonicFrameClock3;
            this.this$0.discardUnusedMovableContentState();
            nextFrameEndCallbackQueue = this.this$0.nextFrameEndCallbackQueue;
            nextFrameEndCallbackQueue.markFrameComplete();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                Recomposer recomposer = this.this$0;
                this.L$0 = monotonicFrameClock;
                this.L$1 = list;
                this.L$2 = list2;
                this.L$3 = list3;
                this.L$4 = gb0Var;
                this.L$5 = gb0Var4;
                this.L$6 = gb0Var3;
                this.L$7 = set;
                this.L$8 = gb0Var2;
                this.label = 1;
                awaitWorkAvailable = recomposer.awaitWorkAvailable(this);
                if (awaitWorkAvailable != vnVar) {
                    List list8 = list;
                    gb0Var5 = gb0Var;
                    gb0Var6 = gb0Var2;
                    list4 = list3;
                    list5 = list8;
                    final Set set22 = set;
                    final gb0 gb0Var122 = gb0Var4;
                    final gb0 gb0Var132 = gb0Var3;
                    recordComposerModifications = this.this$0.recordComposerModifications();
                    if (recordComposerModifications) {
                        List list9 = list4;
                        gb0Var2 = gb0Var6;
                        gb0Var = gb0Var5;
                        list = list5;
                        list3 = list9;
                        gb0Var3 = gb0Var132;
                        gb0Var4 = gb0Var122;
                        set = set22;
                        shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                        if (!shouldKeepRecomposing) {
                        }
                    } else {
                        final Recomposer recomposer2 = this.this$0;
                        ky kyVar = new ky() { // from class: androidx.compose.runtime.i
                            @Override // defpackage.ky
                            public final Object invoke(Object obj2) {
                                w01 invokeSuspend$lambda$2;
                                invokeSuspend$lambda$2 = Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$lambda$2(Recomposer.this, gb0Var132, gb0Var6, list5, list2, gb0Var5, list4, gb0Var122, set22, ((Long) obj2).longValue());
                                return invokeSuspend$lambda$2;
                            }
                        };
                        this.L$0 = monotonicFrameClock;
                        this.L$1 = list5;
                        this.L$2 = list2;
                        this.L$3 = list4;
                        this.L$4 = gb0Var5;
                        this.L$5 = gb0Var122;
                        this.L$6 = gb0Var132;
                        this.L$7 = set22;
                        this.L$8 = gb0Var6;
                        this.label = 2;
                        if (monotonicFrameClock.withFrameNanos(kyVar, this) != vnVar) {
                            List list10 = list4;
                            gb0Var2 = gb0Var6;
                            gb0Var = gb0Var5;
                            list = list5;
                            list3 = list10;
                            gb0Var3 = gb0Var132;
                            gb0Var4 = gb0Var122;
                            set = set22;
                            this.this$0.discardUnusedMovableContentState();
                            nextFrameEndCallbackQueue = this.this$0.nextFrameEndCallbackQueue;
                            nextFrameEndCallbackQueue.markFrameComplete();
                            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                            if (!shouldKeepRecomposing) {
                                return w01.a;
                            }
                        }
                    }
                }
                return vnVar;
            }
        }
    }
}
