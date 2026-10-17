package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import defpackage.bq;
import defpackage.cq;
import defpackage.fg;
import defpackage.gb0;
import defpackage.hm;
import defpackage.kb0;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.rl0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.wr0;
import defpackage.z10;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2 extends us0 implements my {
    final /* synthetic */ ny $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1081}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ ny $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ny nyVar, MonotonicFrameClock monotonicFrameClock, hm hmVar) {
            super(2, hmVar);
            this.$block = nyVar;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                un unVar = (un) this.L$0;
                ny nyVar = this.$block;
                MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                Object invoke = nyVar.invoke(unVar, monotonicFrameClock, this);
                vn vnVar = vn.d;
                if (invoke == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, ny nyVar, MonotonicFrameClock monotonicFrameClock, hm hmVar) {
        super(2, hmVar);
        this.this$0 = recomposer;
        this.$block = nyVar;
        this.$parentFrameClock = monotonicFrameClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(Recomposer recomposer, Set set, Snapshot snapshot) {
        kb0 kb0Var;
        fg fgVar;
        gb0 gb0Var;
        synchronized (recomposer.stateLock) {
            try {
                kb0Var = recomposer._state;
                if (((Recomposer.State) ((wr0) kb0Var).getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    gb0Var = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        rl0 set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
                        Object[] objArr = set$runtime.b;
                        long[] jArr = set$runtime.a;
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
                                            if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m4165isReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(1))) {
                                                gb0Var.d(obj);
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
                                }
                                i++;
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m4165isReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(1))) {
                                gb0Var.d(obj2);
                            }
                        }
                    }
                    fgVar = recomposer.deriveStateLocked();
                } else {
                    fgVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (fgVar != null) {
            fgVar.resumeWith(w01.a);
        }
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, hmVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((Recomposer$recompositionRunner$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z10 s;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl;
        ObserverHandle observerHandle;
        Throwable th;
        Object obj2;
        z10 z10Var;
        fg deriveStateLocked;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl2;
        z10 z10Var2;
        fg deriveStateLocked2;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl3;
        vn vnVar = vn.d;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            s = cq.s(((un) this.L$0).getCoroutineContext());
            this.this$0.registerRunnerJob(s);
            ObserverHandle registerApplyObserver = Snapshot.Companion.registerApplyObserver(new f(this.this$0, i2));
            Recomposer.Companion companion = Recomposer.Companion;
            recomposerInfoImpl = this.this$0.recomposerInfo;
            companion.addRunning(recomposerInfoImpl);
            try {
                List knownCompositions = this.this$0.knownCompositions();
                int size = knownCompositions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ControlledComposition) knownCompositions.get(i3)).invalidateAll();
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, null);
                this.L$0 = s;
                this.L$1 = registerApplyObserver;
                this.label = 1;
                if (p10.n(anonymousClass2, this) == vnVar) {
                    return vnVar;
                }
                observerHandle = registerApplyObserver;
            } catch (Throwable th2) {
                observerHandle = registerApplyObserver;
                th = th2;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj2) {
                    try {
                        z10Var = recomposer.runnerJob;
                        if (z10Var == s) {
                            recomposer.runnerJob = null;
                        }
                        deriveStateLocked = recomposer.deriveStateLocked();
                        if (deriveStateLocked != null) {
                            ComposerKt.composeImmediateRuntimeError("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Recomposer.Companion companion2 = Recomposer.Companion;
                recomposerInfoImpl2 = this.this$0.recomposerInfo;
                companion2.removeRunning(recomposerInfoImpl2);
                throw th;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            observerHandle = (ObserverHandle) this.L$1;
            s = (z10) this.L$0;
            try {
                p10.Q(obj);
            } catch (Throwable th4) {
                th = th4;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                Recomposer recomposer2 = this.this$0;
                synchronized (obj2) {
                }
            }
        }
        observerHandle.dispose();
        Object obj3 = this.this$0.stateLock;
        Recomposer recomposer3 = this.this$0;
        synchronized (obj3) {
            try {
                z10Var2 = recomposer3.runnerJob;
                if (z10Var2 == s) {
                    recomposer3.runnerJob = null;
                }
                deriveStateLocked2 = recomposer3.deriveStateLocked();
                if (deriveStateLocked2 != null) {
                    ComposerKt.composeImmediateRuntimeError("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        Recomposer.Companion companion3 = Recomposer.Companion;
        recomposerInfoImpl3 = this.this$0.recomposerInfo;
        companion3.removeRunning(recomposerInfoImpl3);
        return w01.a;
    }
}
