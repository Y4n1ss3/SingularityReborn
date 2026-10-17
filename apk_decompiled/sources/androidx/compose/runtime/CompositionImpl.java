package androidx.compose.runtime;

import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.changelist.ChangeList;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.ObservableComposition;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.ib0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.no0;
import defpackage.o;
import defpackage.o80;
import defpackage.q10;
import defpackage.rl0;
import defpackage.uf;
import defpackage.ut;
import defpackage.xe0;
import defpackage.xt;
import defpackage.yi;
import defpackage.zc0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition, ObservableComposition {
    public static final int $stable = 8;
    private final Applier<?> applier;
    private final Changes changes;
    private my composable;
    private final InternalComposer composer;
    private final gb0 conditionallyInvalidatedScopes;
    private final fb0 derivedStates;
    private final gb0 invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private fb0 invalidations;
    private final boolean isRoot;
    private final Changes lateChanges;
    private final fb0 observations;
    private final fb0 observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private PausedCompositionImpl pendingPausedComposition;
    private final RememberEventDispatcher rememberManager;
    private ShouldPauseCallback shouldPause;
    private final SlotStorage slotStorage;
    private int state;
    private final AtomicReference<Object> pendingModifications = new AtomicReference<>(null);
    private final Object lock = new Object();
    private final Set<RememberObserver> abandonSet = new ib0(new gb0());

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier) {
        this.parent = compositionContext;
        this.applier = applier;
        SlotStorage createSlotStorage = createSlotStorage();
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            createSlotStorage.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation$runtime()) {
            createSlotStorage.collectSourceInformation();
        }
        this.slotStorage = createSlotStorage;
        this.observations = ScopeMap.m3918constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new gb0();
        this.conditionallyInvalidatedScopes = new gb0();
        this.derivedStates = ScopeMap.m3918constructorimpl$default(null, 1, null);
        this.changes = createChangeList();
        this.lateChanges = createChangeList();
        this.observationsProcessed = ScopeMap.m3918constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m3918constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, compositionContext, 3, null);
        this.rememberManager = new RememberEventDispatcher();
        InternalComposer createComposer = createComposer();
        compositionContext.registerComposer$runtime(createComposer);
        this.composer = createComposer;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$954879418$runtime();
    }

    private final void addPendingInvalidationsLocked(Set<? extends Object> set, boolean z) {
        char c;
        long j;
        long j2;
        long j3;
        int i;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        int i4;
        long j4;
        boolean a;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long j5;
        boolean z2;
        int i5;
        int i6;
        long j6;
        long j7;
        char c2;
        long j8;
        int i7;
        int i8;
        int i9;
        Object obj = null;
        char c3 = 7;
        long j9 = -9187201950435737472L;
        int i10 = 8;
        if (set instanceof ScatterSetWrapper) {
            rl0 set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
            Object[] objArr = set$runtime.b;
            long[] jArr6 = set$runtime.a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i11 = 0;
                j2 = 128;
                while (true) {
                    long j10 = jArr6[i11];
                    j3 = 255;
                    if ((((~j10) << c3) & j10 & j9) != j9) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j10 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i11 << 3) + i13];
                                j8 = j9;
                                if (obj2 instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj2).invalidateForResult(obj);
                                } else {
                                    addPendingInvalidationsLocked(obj2, z);
                                    Object d = this.derivedStates.d(obj2);
                                    if (d != null) {
                                        if (d instanceof gb0) {
                                            gb0 gb0Var = (gb0) d;
                                            Object[] objArr2 = gb0Var.b;
                                            long[] jArr7 = gb0Var.a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                j7 = j10;
                                                int i14 = 0;
                                                while (true) {
                                                    long j11 = jArr7[i14];
                                                    int i15 = i10;
                                                    i7 = length;
                                                    if ((((~j11) << c2) & j11 & j8) != j8) {
                                                        int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                        int i17 = 0;
                                                        while (i17 < i16) {
                                                            if ((j11 & 255) < 128) {
                                                                i9 = i15;
                                                                addPendingInvalidationsLocked((DerivedState) objArr2[(i14 << 3) + i17], z);
                                                            } else {
                                                                i9 = i15;
                                                            }
                                                            j11 >>= i9;
                                                            i17++;
                                                            i15 = i9;
                                                        }
                                                        if (i16 != i15) {
                                                            break;
                                                        }
                                                    }
                                                    if (i14 == length2) {
                                                        break;
                                                    }
                                                    i14++;
                                                    length = i7;
                                                    i10 = 8;
                                                }
                                            }
                                        } else {
                                            j7 = j10;
                                            i7 = length;
                                            addPendingInvalidationsLocked((DerivedState) d, z);
                                        }
                                        i8 = 8;
                                    }
                                }
                                j7 = j10;
                                i7 = length;
                                i8 = 8;
                            } else {
                                j7 = j10;
                                c2 = c3;
                                j8 = j9;
                                i7 = length;
                                i8 = i10;
                            }
                            i13++;
                            length = i7;
                            i10 = i8;
                            c3 = c2;
                            j9 = j8;
                            j10 = j7 >> i8;
                            obj = null;
                        }
                        c = c3;
                        j = j9;
                        int i18 = length;
                        if (i12 != i10) {
                            break;
                        } else {
                            length = i18;
                        }
                    } else {
                        c = c3;
                        j = j9;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    c3 = c;
                    j9 = j;
                    obj = null;
                    i10 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj3 : set) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    addPendingInvalidationsLocked(obj3, z);
                    Object d2 = this.derivedStates.d(obj3);
                    if (d2 != null) {
                        if (d2 instanceof gb0) {
                            gb0 gb0Var2 = (gb0) d2;
                            Object[] objArr3 = gb0Var2.b;
                            long[] jArr8 = gb0Var2.a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j12 = jArr8[i];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i19 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            if ((j12 & 255) < 128) {
                                                addPendingInvalidationsLocked((DerivedState) objArr3[(i << 3) + i20], z);
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i19 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            addPendingInvalidationsLocked((DerivedState) d2, z);
                        }
                    }
                }
            }
        }
        gb0 gb0Var3 = this.conditionallyInvalidatedScopes;
        gb0 gb0Var4 = this.invalidatedScopes;
        if (z && gb0Var3.c()) {
            fb0 fb0Var = this.observations;
            long[] jArr9 = fb0Var.a;
            int length4 = jArr9.length - 2;
            if (length4 >= 0) {
                int i21 = 0;
                while (true) {
                    long j13 = jArr9[i21];
                    if ((((~j13) << c) & j13 & j) != j) {
                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                        int i23 = 0;
                        while (i23 < i22) {
                            if ((j13 & j3) < j2) {
                                int i24 = (i21 << 3) + i23;
                                Object obj4 = fb0Var.b[i24];
                                Object obj5 = fb0Var.c[i24];
                                if (obj5 instanceof gb0) {
                                    gb0 gb0Var5 = (gb0) obj5;
                                    Object[] objArr4 = gb0Var5.b;
                                    long[] jArr10 = gb0Var5.a;
                                    int length5 = jArr10.length - 2;
                                    jArr5 = jArr9;
                                    j5 = j13;
                                    if (length5 >= 0) {
                                        int i25 = 0;
                                        while (true) {
                                            long j14 = jArr10[i25];
                                            Object[] objArr5 = objArr4;
                                            long[] jArr11 = jArr10;
                                            if ((((~j14) << c) & j14 & j) != j) {
                                                int i26 = 8 - ((~(i25 - length5)) >>> 31);
                                                i5 = length5;
                                                for (int i27 = 0; i27 < i26; i27 = i6 + 1) {
                                                    if ((j14 & j3) < j2) {
                                                        i6 = i27;
                                                        int i28 = (i25 << 3) + i6;
                                                        j6 = j14;
                                                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr5[i28];
                                                        if (gb0Var3.a(recomposeScopeImpl) || gb0Var4.a(recomposeScopeImpl)) {
                                                            gb0Var5.n(i28);
                                                        }
                                                    } else {
                                                        i6 = i27;
                                                        j6 = j14;
                                                    }
                                                    j14 = j6 >> 8;
                                                }
                                                if (i26 != 8) {
                                                    break;
                                                }
                                            } else {
                                                i5 = length5;
                                            }
                                            if (i25 == i5) {
                                                break;
                                            }
                                            i25++;
                                            length5 = i5;
                                            objArr4 = objArr5;
                                            jArr10 = jArr11;
                                        }
                                    }
                                    z2 = gb0Var5.b();
                                } else {
                                    jArr5 = jArr9;
                                    j5 = j13;
                                    obj5.getClass();
                                    RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj5;
                                    z2 = gb0Var3.a(recomposeScopeImpl2) || gb0Var4.a(recomposeScopeImpl2);
                                }
                                if (z2) {
                                    fb0Var.k(i24);
                                }
                            } else {
                                jArr5 = jArr9;
                                j5 = j13;
                            }
                            j13 = j5 >> 8;
                            i23++;
                            jArr9 = jArr5;
                        }
                        jArr4 = jArr9;
                        if (i22 != 8) {
                            break;
                        }
                    } else {
                        jArr4 = jArr9;
                    }
                    if (i21 == length4) {
                        break;
                    }
                    i21++;
                    jArr9 = jArr4;
                }
            }
            gb0Var3.f();
            cleanUpDerivedStateObservations();
            return;
        }
        if (gb0Var4.c()) {
            fb0 fb0Var2 = this.observations;
            long[] jArr12 = fb0Var2.a;
            int length6 = jArr12.length - 2;
            if (length6 >= 0) {
                int i29 = 0;
                while (true) {
                    long j15 = jArr12[i29];
                    if ((((~j15) << c) & j15 & j) != j) {
                        int i30 = 8 - ((~(i29 - length6)) >>> 31);
                        int i31 = 0;
                        while (i31 < i30) {
                            if ((j15 & j3) < j2) {
                                int i32 = (i29 << 3) + i31;
                                Object obj6 = fb0Var2.b[i32];
                                Object obj7 = fb0Var2.c[i32];
                                if (obj7 instanceof gb0) {
                                    gb0 gb0Var6 = (gb0) obj7;
                                    Object[] objArr6 = gb0Var6.b;
                                    long[] jArr13 = gb0Var6.a;
                                    int length7 = jArr13.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j15;
                                        int i33 = 0;
                                        while (true) {
                                            long j16 = jArr13[i33];
                                            i3 = length6;
                                            i4 = i29;
                                            if ((((~j16) << c) & j16 & j) != j) {
                                                int i34 = 8 - ((~(i33 - length7)) >>> 31);
                                                int i35 = 0;
                                                while (i35 < i34) {
                                                    if ((j16 & j3) < j2) {
                                                        int i36 = (i33 << 3) + i35;
                                                        jArr3 = jArr12;
                                                        if (gb0Var4.a((RecomposeScopeImpl) objArr6[i36])) {
                                                            gb0Var6.n(i36);
                                                        }
                                                    } else {
                                                        jArr3 = jArr12;
                                                    }
                                                    j16 >>= 8;
                                                    i35++;
                                                    jArr12 = jArr3;
                                                }
                                                jArr2 = jArr12;
                                                if (i34 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr12;
                                            }
                                            if (i33 == length7) {
                                                break;
                                            }
                                            i33++;
                                            length6 = i3;
                                            i29 = i4;
                                            jArr12 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr12;
                                        i3 = length6;
                                        i4 = i29;
                                        j4 = j15;
                                    }
                                    a = gb0Var6.b();
                                } else {
                                    jArr2 = jArr12;
                                    i3 = length6;
                                    i4 = i29;
                                    j4 = j15;
                                    obj7.getClass();
                                    a = gb0Var4.a((RecomposeScopeImpl) obj7);
                                }
                                if (a) {
                                    fb0Var2.k(i32);
                                }
                            } else {
                                jArr2 = jArr12;
                                i3 = length6;
                                i4 = i29;
                                j4 = j15;
                            }
                            j15 = j4 >> 8;
                            i31++;
                            length6 = i3;
                            i29 = i4;
                            jArr12 = jArr2;
                        }
                        jArr = jArr12;
                        int i37 = length6;
                        int i38 = i29;
                        if (i30 != 8) {
                            break;
                        }
                        length6 = i37;
                        i2 = i38;
                    } else {
                        jArr = jArr12;
                        i2 = i29;
                    }
                    if (i2 == length6) {
                        break;
                    }
                    i29 = i2 + 1;
                    jArr12 = jArr;
                }
            }
            cleanUpDerivedStateObservations();
            gb0Var4.f();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x000f, B:5:0x0035, B:7:0x0039, B:10:0x0045, B:12:0x0049, B:13:0x004f, B:16:0x005a, B:24:0x0083, B:26:0x0094, B:89:0x0197, B:93:0x019d, B:94:0x01a2, B:112:0x01bd, B:113:0x01c2, B:116:0x0043, B:29:0x009b, B:32:0x00a7, B:34:0x00b7, B:36:0x00c3, B:38:0x00cd, B:40:0x00e1, B:43:0x00f3, B:45:0x0103, B:47:0x010d, B:49:0x0113, B:51:0x0123, B:53:0x012c, B:62:0x013e, B:64:0x014d, B:66:0x0166, B:69:0x0175, B:73:0x0152, B:84:0x018d, B:88:0x0194, B:18:0x0060, B:20:0x0064, B:23:0x0070, B:109:0x006e), top: B:2:0x000f, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void applyChangesInLocked(Changes changes) {
        Applier<?> applier;
        RememberEventDispatcher rememberEventDispatcher;
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean z;
        long[] jArr3;
        this.rememberManager.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
        try {
            if (changes.isEmpty()) {
                try {
                    if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                        this.rememberManager.dispatchAbandons();
                    }
                } finally {
                }
            } else {
                PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
                if (pausedCompositionImpl == null || (applier = pausedCompositionImpl.getPausableApplier$runtime()) == null) {
                    applier = this.applier;
                }
                PausedCompositionImpl pausedCompositionImpl2 = this.pendingPausedComposition;
                String str = q10.b(applier, pausedCompositionImpl2 != null ? pausedCompositionImpl2.getPausableApplier$runtime() : null) ? "Compose:recordChanges" : "Compose:applyChanges";
                Trace trace = Trace.INSTANCE;
                Object beginSection = trace.beginSection(str);
                try {
                    PausedCompositionImpl pausedCompositionImpl3 = this.pendingPausedComposition;
                    try {
                        if (pausedCompositionImpl3 != null) {
                            rememberEventDispatcher = pausedCompositionImpl3.getRememberManager$runtime();
                            if (rememberEventDispatcher == null) {
                            }
                            applier.onBeginChanges();
                            changes.execute(this.slotStorage, applier, rememberEventDispatcher, this.composer.getErrorContext$runtime());
                            applier.onEndChanges();
                            trace.endSection(beginSection);
                            this.rememberManager.dispatchRememberObservers();
                            this.rememberManager.dispatchSideEffects();
                            if (this.pendingInvalidScopes) {
                                beginSection = trace.beginSection("Compose:unobserve");
                                int i2 = 0;
                                try {
                                    this.pendingInvalidScopes = false;
                                    fb0 fb0Var = this.observations;
                                    long[] jArr4 = fb0Var.a;
                                    int length = jArr4.length - 2;
                                    if (length >= 0) {
                                        int i3 = 0;
                                        while (true) {
                                            long j3 = jArr4[i3];
                                            char c2 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i4 = 8;
                                                int i5 = 8 - ((~(i3 - length)) >>> 31);
                                                int i6 = i2;
                                                while (i6 < i5) {
                                                    if ((j3 & 255) < 128) {
                                                        int i7 = (i3 << 3) + i6;
                                                        c = c2;
                                                        Object obj = fb0Var.b[i7];
                                                        Object obj2 = fb0Var.c[i7];
                                                        j2 = j4;
                                                        if (obj2 instanceof gb0) {
                                                            gb0 gb0Var = (gb0) obj2;
                                                            Object[] objArr = gb0Var.b;
                                                            long[] jArr5 = gb0Var.a;
                                                            int length2 = jArr5.length - 2;
                                                            if (length2 >= 0) {
                                                                j = j3;
                                                                int i8 = i4;
                                                                int i9 = 0;
                                                                while (true) {
                                                                    long j5 = jArr5[i9];
                                                                    Object[] objArr2 = objArr;
                                                                    long[] jArr6 = jArr5;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                        int i11 = 0;
                                                                        while (i11 < i10) {
                                                                            if ((j5 & 255) < 128) {
                                                                                jArr3 = jArr4;
                                                                                int i12 = (i9 << 3) + i11;
                                                                                if (!((RecomposeScopeImpl) objArr2[i12]).getValid()) {
                                                                                    gb0Var.n(i12);
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr4;
                                                                            }
                                                                            j5 >>= i8;
                                                                            i11++;
                                                                            jArr4 = jArr3;
                                                                        }
                                                                        jArr2 = jArr4;
                                                                        if (i10 != i8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr2 = jArr4;
                                                                    }
                                                                    if (i9 == length2) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    objArr = objArr2;
                                                                    jArr5 = jArr6;
                                                                    jArr4 = jArr2;
                                                                    i8 = 8;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                                j = j3;
                                                            }
                                                            z = gb0Var.b();
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                            obj2.getClass();
                                                            z = !((RecomposeScopeImpl) obj2).getValid();
                                                        }
                                                        if (z) {
                                                            fb0Var.k(i7);
                                                        }
                                                        i = 8;
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        c = c2;
                                                        j2 = j4;
                                                        i = i4;
                                                    }
                                                    j3 = j >> i;
                                                    i6++;
                                                    i4 = i;
                                                    c2 = c;
                                                    j4 = j2;
                                                    jArr4 = jArr2;
                                                }
                                                jArr = jArr4;
                                                if (i5 != i4) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr4;
                                            }
                                            if (i3 == length) {
                                                break;
                                            }
                                            i3++;
                                            jArr4 = jArr;
                                            i2 = 0;
                                        }
                                    }
                                    cleanUpDerivedStateObservations();
                                    Trace.INSTANCE.endSection(beginSection);
                                } finally {
                                    Trace.INSTANCE.endSection(beginSection);
                                }
                            }
                            if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                                this.rememberManager.dispatchAbandons();
                            }
                        }
                        if (this.lateChanges.isEmpty()) {
                            this.rememberManager.dispatchAbandons();
                        }
                    } finally {
                    }
                    rememberEventDispatcher = this.rememberManager;
                    applier.onBeginChanges();
                    changes.execute(this.slotStorage, applier, rememberEventDispatcher, this.composer.getErrorContext$runtime());
                    applier.onEndChanges();
                    trace.endSection(beginSection);
                    this.rememberManager.dispatchRememberObservers();
                    this.rememberManager.dispatchSideEffects();
                    if (this.pendingInvalidScopes) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.lateChanges.isEmpty() && this.pendingPausedComposition == null) {
                    this.rememberManager.dispatchAbandons();
                }
                throw th2;
            } finally {
            }
        }
    }

    private final void cleanUpDerivedStateObservations() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        char c2;
        long j5;
        int i2;
        boolean z;
        long[] jArr3;
        int i3;
        int i4;
        fb0 fb0Var = this.derivedStates;
        long[] jArr4 = fb0Var.a;
        int length = jArr4.length - 2;
        long j6 = 255;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j8 = jArr4[i6];
                j3 = 128;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j8 & j6) < 128) {
                            j4 = j6;
                            int i9 = (i6 << 3) + i8;
                            Object obj = fb0Var.b[i9];
                            Object obj2 = fb0Var.c[i9];
                            c2 = c3;
                            if (obj2 instanceof gb0) {
                                gb0 gb0Var = (gb0) obj2;
                                Object[] objArr = gb0Var.b;
                                j5 = j7;
                                long[] jArr5 = gb0Var.a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    int i10 = i5;
                                    int i11 = 0;
                                    while (true) {
                                        long j9 = jArr5[i11];
                                        Object[] objArr2 = objArr;
                                        long[] jArr6 = jArr5;
                                        if ((((~j9) << c2) & j9 & j5) != j5) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j9 & j4) < 128) {
                                                    jArr3 = jArr4;
                                                    int i14 = (i11 << 3) + i13;
                                                    i3 = i8;
                                                    i4 = i13;
                                                    if (!ScopeMap.m3919containsimpl(this.observations, (DerivedState) objArr2[i14])) {
                                                        gb0Var.n(i14);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i8;
                                                    i4 = i13;
                                                }
                                                j9 >>= i10;
                                                i13 = i4 + 1;
                                                jArr4 = jArr3;
                                                i8 = i3;
                                            }
                                            jArr2 = jArr4;
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i8;
                                        }
                                        int i15 = i11;
                                        if (i15 == length2) {
                                            break;
                                        }
                                        i11 = i15 + 1;
                                        objArr = objArr2;
                                        jArr5 = jArr6;
                                        jArr4 = jArr2;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    i = i8;
                                }
                                z = gb0Var.b();
                            } else {
                                jArr2 = jArr4;
                                i = i8;
                                j5 = j7;
                                obj2.getClass();
                                z = !ScopeMap.m3919containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (z) {
                                fb0Var.k(i9);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            i = i8;
                            j4 = j6;
                            c2 = c3;
                            j5 = j7;
                            i2 = i5;
                        }
                        j8 >>= i2;
                        i8 = i + 1;
                        i5 = i2;
                        c3 = c2;
                        j6 = j4;
                        j7 = j5;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    j = j6;
                    c = c3;
                    j2 = j7;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c3 = c;
                j6 = j;
                j7 = j2;
                jArr4 = jArr;
                i5 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.c()) {
            return;
        }
        gb0 gb0Var2 = this.conditionallyInvalidatedScopes;
        Object[] objArr3 = gb0Var2.b;
        long[] jArr7 = gb0Var2.a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j10 = jArr7[i16];
            if ((((~j10) << c) & j10 & j2) != j2) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j10 & j) < j3) {
                        int i19 = (i16 << 3) + i18;
                        if (!((RecomposeScopeImpl) objArr3[i19]).isConditional()) {
                            gb0Var2.n(i19);
                        }
                    }
                    j10 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    private final boolean clearDeactivated() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    private final void composeInitial(my myVar) {
        this.composable = myVar;
        this.parent.composeInitial$runtime(this, myVar);
    }

    private final PausedComposition composeInitialPaused(boolean z, my myVar) {
        if (this.pendingPausedComposition != null) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, myVar, z, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    private final void composeInitialWithReuse(my myVar) {
        this.composer.startReuseFromRoot$runtime();
        composeInitial(myVar);
        this.composer.endReuseFromRoot$runtime();
    }

    private final Changes createChangeList() {
        ComposeRuntimeFlags composeRuntimeFlags = ComposeRuntimeFlags.INSTANCE;
        return new ChangeList();
    }

    private final InternalComposer createComposer() {
        ComposeRuntimeFlags composeRuntimeFlags = ComposeRuntimeFlags.INSTANCE;
        return new GapComposer(this.applier, this.parent, SlotTableKt.asGapBufferSlotTable(this.slotStorage), this.abandonSet, this.changes, this.lateChanges, this.observerHolder, this);
    }

    private final SlotStorage createSlotStorage() {
        ComposeRuntimeFlags composeRuntimeFlags = ComposeRuntimeFlags.INSTANCE;
        return new SlotTable();
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object obj;
        Object obj2;
        AtomicReference<Object> atomicReference = this.pendingModifications;
        obj = CompositionKt.PendingApplyNoModifications;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.PendingApplyNoModifications;
            if (andSet.equals(obj2)) {
                throw uf.a("pending composition has not been applied");
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                o.j();
                return;
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(null);
        obj = CompositionKt.PendingApplyNoModifications;
        if (q10.b(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.pendingPausedComposition == null) {
                ComposerKt.composeImmediateRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            o.j();
        }
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object obj;
        Object andSet = this.pendingModifications.getAndSet(xt.d);
        obj = CompositionKt.PendingApplyNoModifications;
        if (q10.b(andSet, obj) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            o.j();
            return;
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private final void ensureRunning() {
        int i = this.state;
        if (!(i == 0)) {
            PreconditionsKt.throwIllegalStateException(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime();
    }

    private final <T> T guardChanges(iy iyVar) {
        try {
            return (T) iyVar.invoke();
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                this.abandonChanges();
                throw th3;
            }
        }
    }

    private final <T> T guardInvalidationsLocked(ky kyVar) {
        fb0 m3838takeInvalidationsafanTW4 = m3838takeInvalidationsafanTW4();
        try {
            return (T) kyVar.invoke(ScopeMap.m3915boximpl(m3838takeInvalidationsafanTW4));
        } catch (Throwable th) {
            this.invalidations = m3838takeInvalidationsafanTW4;
            throw th;
        }
    }

    private final InvalidationResult invalidateChecked(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        int i;
        synchronized (this.lock) {
            try {
                CompositionImpl compositionImpl = this.invalidationDelegate;
                CompositionImpl compositionImpl2 = null;
                if (compositionImpl != null) {
                    if (!this.slotStorage.groupContainsAnchor(this.invalidationDelegateGroup, anchor)) {
                        compositionImpl = null;
                    }
                    compositionImpl2 = compositionImpl;
                }
                if (compositionImpl2 == null) {
                    if (tryImminentInvalidation(recomposeScopeImpl, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj == null) {
                        ScopeMap.m3935setimpl(this.invalidations, recomposeScopeImpl, ScopeInvalidated.INSTANCE);
                    } else {
                        boolean z = obj instanceof DerivedState;
                        fb0 fb0Var = this.invalidations;
                        if (z) {
                            Object d = fb0Var.d(recomposeScopeImpl);
                            if (d != null) {
                                if (d instanceof gb0) {
                                    gb0 gb0Var = (gb0) d;
                                    Object[] objArr = gb0Var.b;
                                    long[] jArr = gb0Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i2 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i2];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i3 = 8;
                                                int i4 = 8 - ((~(i2 - length)) >>> 31);
                                                int i5 = 0;
                                                while (i5 < i4) {
                                                    if ((j & 255) < 128) {
                                                        i = i3;
                                                        if (objArr[(i2 << 3) + i5] == ScopeInvalidated.INSTANCE) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i = i3;
                                                    }
                                                    j >>= i;
                                                    i5++;
                                                    i3 = i;
                                                }
                                                if (i4 != i3) {
                                                    break;
                                                }
                                            }
                                            if (i2 == length) {
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                } else if (d == ScopeInvalidated.INSTANCE) {
                                }
                            }
                            ScopeMap.m3911addimpl(this.invalidations, recomposeScopeImpl, obj);
                        } else {
                            ScopeMap.m3935setimpl(fb0Var, recomposeScopeImpl, ScopeInvalidated.INSTANCE);
                        }
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.invalidateChecked(recomposeScopeImpl, anchor, obj);
                }
                this.parent.invalidate$runtime(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object d = this.observations.d(obj);
        if (d == null) {
            return;
        }
        if (!(d instanceof gb0)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) d;
            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                ScopeMap.m3911addimpl(this.observationsProcessed, obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        gb0 gb0Var = (gb0) d;
        Object[] objArr = gb0Var.b;
        long[] jArr = gb0Var.a;
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
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                            ScopeMap.m3911addimpl(this.observationsProcessed, obj, recomposeScopeImpl2);
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

    private final CompositionObserver observer() {
        return this.observerHolder.current();
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final fb0 m3838takeInvalidationsafanTW4() {
        fb0 fb0Var = this.invalidations;
        this.invalidations = ScopeMap.m3918constructorimpl$default(null, 1, null);
        return fb0Var;
    }

    private final <T> T trackAbandonedValues(iy iyVar) {
        try {
            return (T) iyVar.invoke();
        } catch (Throwable th) {
            if (!this.abandonSet.isEmpty()) {
                RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                try {
                    rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                    rememberEventDispatcher.dispatchAbandons();
                } finally {
                    rememberEventDispatcher.clear();
                }
            }
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime(recomposeScopeImpl, obj);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            rememberEventDispatcher.dispatchAbandons();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        RememberEventDispatcher rememberEventDispatcher;
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime();
                if (!this.abandonSet.isEmpty()) {
                    rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    abandonChanges();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(my myVar) {
        try {
            synchronized (this.lock) {
                drainPendingModificationsForCompositionLocked();
                try {
                    this.composer.mo3841composeContentZbOJvo$runtime(m3838takeInvalidationsafanTW4(), myVar, this.shouldPause);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    public final int composerStacksSizes$runtime() {
        return this.composer.stacksSize$runtime();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                if (!(this.pendingPausedComposition == null)) {
                    PreconditionsKt.throwIllegalStateException("Deactivate is not supported while pausable composition is in progress");
                }
                boolean isEmpty = this.slotStorage.isEmpty();
                if (!isEmpty || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.INSTANCE;
                    Object beginSection = trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (!isEmpty) {
                                this.applier.onBeginChanges();
                                this.slotStorage.deactivateAll(this.rememberManager);
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            }
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                            trace.endSection(beginSection);
                        } catch (Throwable th) {
                            rememberEventDispatcher.clear();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        Trace.INSTANCE.endSection(beginSection);
                        throw th2;
                    }
                }
                ScopeMap.m3916clearimpl(this.observations);
                ScopeMap.m3916clearimpl(this.derivedStates);
                ScopeMap.m3916clearimpl(this.invalidations);
                this.changes.clear();
                this.lateChanges.clear();
                this.composer.deactivate$runtime();
                this.state = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i, iy iyVar) {
        if (controlledComposition == null || controlledComposition.equals(this) || i < 0) {
            return (R) iyVar.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) controlledComposition;
        this.invalidationDelegateGroup = i;
        try {
            return (R) iyVar.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.isComposing$runtime()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.getLambda$1918065384$runtime();
                    Changes deferredChanges$runtime = this.composer.getDeferredChanges$runtime();
                    if (deferredChanges$runtime != null) {
                        applyChangesInLocked(deferredChanges$runtime);
                    }
                    boolean isEmpty = this.slotStorage.isEmpty();
                    if (!isEmpty || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            if (!isEmpty) {
                                this.applier.onBeginChanges();
                                this.slotStorage.clear(this.rememberManager);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            }
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th) {
                            rememberEventDispatcher.clear();
                            throw th;
                        }
                    }
                    this.composer.dispose$runtime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.unregisterComposition$runtime(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
        try {
            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
            movableContentState.getSlotStorage$runtime().disposeUnusedMovableContent(this.rememberManager, movableContentState);
            rememberEventDispatcher.dispatchRememberObservers();
        } finally {
            rememberEventDispatcher.clear();
        }
    }

    public final List<xe0> extractInvalidationsOf$runtime(Anchor anchor) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        boolean z;
        Object obj;
        Object obj2;
        long j3;
        int i3;
        if (ScopeMap.m3926getSizeimpl(this.invalidations) <= 0) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        SlotStorage slotStorage = this.slotStorage;
        fb0 fb0Var = this.invalidations;
        long[] jArr3 = fb0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr3[i4];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j4 & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            c = c2;
                            Object obj3 = fb0Var.b[i8];
                            j2 = j5;
                            Object obj4 = fb0Var.c[i8];
                            obj3.getClass();
                            if (obj4 instanceof gb0) {
                                gb0 gb0Var = (gb0) obj4;
                                Object[] objArr = gb0Var.b;
                                int i9 = i5;
                                long[] jArr4 = gb0Var.a;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                j = j4;
                                if (length2 >= 0) {
                                    Object obj5 = obj3;
                                    int i10 = 0;
                                    while (true) {
                                        long j6 = jArr4[i10];
                                        Object[] objArr2 = objArr;
                                        i = i7;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j6 & 255) < 128) {
                                                    obj2 = obj5;
                                                    int i13 = (i10 << 3) + i12;
                                                    j3 = j6;
                                                    Object obj6 = objArr2[i13];
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                                                    i3 = i12;
                                                    Anchor anchor2 = recomposeScopeImpl.getAnchor();
                                                    if (anchor2 != null && slotStorage.inGroup(anchor, anchor2)) {
                                                        arrayList.add(new xe0(recomposeScopeImpl, obj6));
                                                        gb0Var.n(i13);
                                                    }
                                                } else {
                                                    obj2 = obj5;
                                                    j3 = j6;
                                                    i3 = i12;
                                                }
                                                j6 = j3 >> i9;
                                                i12 = i3 + 1;
                                                obj5 = obj2;
                                            }
                                            obj = obj5;
                                            if (i11 != i9) {
                                                break;
                                            }
                                        } else {
                                            obj = obj5;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i7 = i;
                                        objArr = objArr2;
                                        obj5 = obj;
                                        i9 = 8;
                                    }
                                } else {
                                    i = i7;
                                }
                                z = gb0Var.b();
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                                i = i7;
                                obj4.getClass();
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj3;
                                Anchor anchor3 = recomposeScopeImpl2.getAnchor();
                                if (anchor3 == null || !slotStorage.inGroup(anchor, anchor3)) {
                                    z = false;
                                } else {
                                    arrayList.add(new xe0(recomposeScopeImpl2, obj4));
                                    z = true;
                                }
                            }
                            if (z) {
                                fb0Var.k(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i7;
                            i2 = i5;
                        }
                        i7 = i + 1;
                        i5 = i2;
                        j4 = j >> i2;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    public final List<xe0> extractInvalidationsOfGroup$runtime(ky kyVar) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        boolean z;
        Object obj;
        long j3;
        Object obj2;
        int i3;
        if (ScopeMap.m3926getSizeimpl(this.invalidations) <= 0) {
            return ut.d;
        }
        ArrayList arrayList = new ArrayList();
        fb0 fb0Var = this.invalidations;
        long[] jArr3 = fb0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr3[i4];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j4 & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            c = c2;
                            Object obj3 = fb0Var.b[i8];
                            j2 = j5;
                            Object obj4 = fb0Var.c[i8];
                            obj3.getClass();
                            if (obj4 instanceof gb0) {
                                gb0 gb0Var = (gb0) obj4;
                                Object[] objArr = gb0Var.b;
                                long[] jArr4 = gb0Var.a;
                                int i9 = i5;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                j = j4;
                                if (length2 >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j6 = jArr4[i10];
                                        Object[] objArr2 = objArr;
                                        i = i7;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                            int i12 = 0;
                                            while (i12 < i11) {
                                                if ((j6 & 255) < 128) {
                                                    j3 = j6;
                                                    int i13 = (i10 << 3) + i12;
                                                    Object obj5 = objArr2[i13];
                                                    obj2 = obj3;
                                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                                                    i3 = i12;
                                                    Anchor anchor = recomposeScopeImpl.getAnchor();
                                                    if (anchor != null && ((Boolean) kyVar.invoke(anchor)).booleanValue()) {
                                                        arrayList.add(new xe0(recomposeScopeImpl, obj5));
                                                        gb0Var.n(i13);
                                                    }
                                                } else {
                                                    j3 = j6;
                                                    obj2 = obj3;
                                                    i3 = i12;
                                                }
                                                j6 = j3 >> i9;
                                                i12 = i3 + 1;
                                                obj3 = obj2;
                                            }
                                            obj = obj3;
                                            if (i11 != i9) {
                                                break;
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        i7 = i;
                                        objArr = objArr2;
                                        obj3 = obj;
                                        i9 = 8;
                                    }
                                } else {
                                    i = i7;
                                }
                                z = gb0Var.b();
                            } else {
                                jArr2 = jArr3;
                                j = j4;
                                i = i7;
                                obj4.getClass();
                                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj3;
                                Anchor anchor2 = recomposeScopeImpl2.getAnchor();
                                if (anchor2 == null || !((Boolean) kyVar.invoke(anchor2)).booleanValue()) {
                                    z = false;
                                } else {
                                    arrayList.add(new xe0(recomposeScopeImpl2, obj4));
                                    z = true;
                                }
                            }
                            if (z) {
                                fb0Var.k(i8);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i7;
                            i2 = i5;
                        }
                        i7 = i + 1;
                        i5 = i2;
                        j4 = j >> i2;
                        c2 = c;
                        jArr3 = jArr2;
                        j5 = j2;
                    }
                    jArr = jArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback) {
        ShouldPauseCallback shouldPauseCallback2 = this.shouldPause;
        this.shouldPause = shouldPauseCallback;
        return shouldPauseCallback2;
    }

    public final my getComposable() {
        return this.composable;
    }

    public final InternalComposer getComposer$runtime() {
        return this.composer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        if (q10.b(compositionServiceKey, CompositionKt.getObservableCompositionServiceKey())) {
            return this;
        }
        return null;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime() {
        gb0 gb0Var = this.conditionallyInvalidatedScopes;
        gb0Var.getClass();
        return yi.I0(new no0(gb0Var));
    }

    public final Set<Object> getDerivedStateDependencies$runtime() {
        fb0 fb0Var = this.derivedStates;
        fb0Var.getClass();
        return new o80(fb0Var).keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.lock) {
            z = ScopeMap.m3926getSizeimpl(this.invalidations) > 0;
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime;
        synchronized (this.lock) {
            hasPendingChanges$runtime = this.composer.getHasPendingChanges$runtime();
        }
        return hasPendingChanges$runtime;
    }

    public final Set<Object> getObservedObjects$runtime() {
        fb0 fb0Var = this.observations;
        fb0Var.getClass();
        return new o80(fb0Var).keySet();
    }

    public final CompositionObserverHolder getObserverHolder$runtime() {
        return this.observerHolder;
    }

    public final CompositionContext getParent() {
        return this.parent;
    }

    public final boolean getPendingInvalidScopes$runtime() {
        return this.pendingInvalidScopes;
    }

    public final SlotStorage getSlotStorage$runtime() {
        return this.slotStorage;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<xe0> list) {
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!q10.b(((MovableContentStateReference) list.get(i).d).getComposition$runtime(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(list);
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                    try {
                        rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                        rememberEventDispatcher.dispatchAbandons();
                        rememberEventDispatcher.clear();
                    } catch (Throwable th2) {
                        rememberEventDispatcher.clear();
                        throw th2;
                    }
                }
                throw th;
            } catch (Throwable th3) {
                abandonChanges();
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionObserver observer;
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotStorage.ownsRecomposeScope(recomposeScopeImpl)) {
            synchronized (this.lock) {
                compositionImpl = this.invalidationDelegate;
            }
            return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        }
        if (!recomposeScopeImpl.getCanRecompose()) {
            return InvalidationResult.IGNORED;
        }
        InvalidationResult invalidateChecked = invalidateChecked(recomposeScopeImpl, anchor, obj);
        if (invalidateChecked != InvalidationResult.IGNORED && (observer = observer()) != null) {
            observer.onScopeInvalidated(recomposeScopeImpl, obj);
        }
        return invalidateChecked;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        this.slotStorage.invalidateAll();
    }

    public final void invalidateGroupsWithKey(int i) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey;
        synchronized (this.lock) {
            invalidateGroupsWithKey = this.slotStorage.invalidateGroupsWithKey(i);
        }
        if (invalidateGroupsWithKey != null) {
            int size = invalidateGroupsWithKey.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (invalidateGroupsWithKey.get(i2).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime()) {
            this.parent.invalidate$runtime(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.state == 3;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean observesAnyOf(Set<? extends Object> set) {
        if (set instanceof ScatterSetWrapper) {
            rl0 set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
            Object[] objArr = set$runtime.b;
            long[] jArr = set$runtime.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (ScopeMap.m3919containsimpl(this.observations, obj) || ScopeMap.m3919containsimpl(this.derivedStates, obj)) {
                                    break loop0;
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
                if (ScopeMap.m3919containsimpl(this.observations, obj2) || ScopeMap.m3919containsimpl(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void pausedCompositionFinished$runtime(rl0 rl0Var) {
        this.pendingPausedComposition = null;
        if (rl0Var != null) {
            this.rememberManager.ignoreForgotten(rl0Var);
            this.state = 2;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(iy iyVar) {
        this.composer.prepareCompose$runtime(iyVar);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        synchronized (this.lock) {
            PausedCompositionImpl pausedCompositionImpl = this.pendingPausedComposition;
            if (pausedCompositionImpl != null && !pausedCompositionImpl.isRecomposing$runtime()) {
                pausedCompositionImpl.markIncomplete$runtime();
                pausedCompositionImpl.getPausableApplier$runtime().markRecomposePending();
                return false;
            }
            drainPendingModificationsForCompositionLocked();
            try {
                try {
                    boolean mo3842recomposeaFTiNEg$runtime = this.composer.mo3842recomposeaFTiNEg$runtime(m3838takeInvalidationsafanTW4(), this.shouldPause);
                    if (!mo3842recomposeaFTiNEg$runtime) {
                        drainPendingModificationsLocked();
                    }
                    return mo3842recomposeaFTiNEg$runtime;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = this.rememberManager;
                        try {
                            rememberEventDispatcher.prepare(this.abandonSet, this.composer.getErrorContext$runtime());
                            rememberEventDispatcher.dispatchAbandons();
                            rememberEventDispatcher.clear();
                        } catch (Throwable th2) {
                            rememberEventDispatcher.clear();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    abandonChanges();
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
        CompositionObserver observer = observer();
        if (observer != null) {
            observer.onScopeDisposed(recomposeScopeImpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void recordModificationsOf(Set<? extends Object> set) {
        Set<? extends Object> set2;
        AtomicReference<Object> atomicReference;
        Object obj;
        while (true) {
            Object obj2 = this.pendingModifications.get();
            if (obj2 != null) {
                obj = CompositionKt.PendingApplyNoModifications;
                if (!obj2.equals(obj)) {
                    if (obj2 instanceof Set) {
                        set2 = new Set[]{obj2, set};
                    } else {
                        if (!(obj2 instanceof Object[])) {
                            throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                        }
                        Set[] setArr = (Set[]) obj2;
                        int length = setArr.length;
                        ?? copyOf = Arrays.copyOf(setArr, length + 1);
                        copyOf[length] = set;
                        set2 = copyOf;
                    }
                    atomicReference = this.pendingModifications;
                    while (!atomicReference.compareAndSet(obj2, set2)) {
                        if (atomicReference.get() != obj2) {
                            break;
                        }
                    }
                    if (obj2 != null) {
                        synchronized (this.lock) {
                            drainPendingModificationsLocked();
                        }
                        return;
                    }
                    return;
                }
            }
            set2 = set;
            atomicReference = this.pendingModifications;
            while (!atomicReference.compareAndSet(obj2, set2)) {
            }
            if (obj2 != null) {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        int i;
        int i2;
        int i3;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime = this.composer.getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        int i4 = 1;
        currentRecomposeScope$runtime.setUsed(true);
        boolean recordRead = currentRecomposeScope$runtime.recordRead(obj);
        CompositionObserver observer = observer();
        if (observer != null) {
            observer.onReadInScope(currentRecomposeScope$runtime, obj);
        }
        if (recordRead) {
            return;
        }
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).m4166recordReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(1));
        }
        ScopeMap.m3911addimpl(this.observations, obj, currentRecomposeScope$runtime);
        if (obj instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) obj;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m3933removeScopeimpl(this.derivedStates, obj);
            zc0 dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.b;
            long[] jArr = dependencies.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j = jArr[i5];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j & 255) < 128) {
                                i2 = i4;
                                StateObject stateObject = (StateObject) objArr[(i5 << 3) + i8];
                                if (stateObject instanceof StateObjectImpl) {
                                    i3 = i6;
                                    ((StateObjectImpl) stateObject).m4166recordReadInh_f27i8$runtime(ReaderKind.m4154constructorimpl(i2));
                                } else {
                                    i3 = i6;
                                }
                                ScopeMap.m3911addimpl(this.derivedStates, stateObject, obj);
                            } else {
                                i2 = i4;
                                i3 = i6;
                            }
                            j >>= i3;
                            i8++;
                            i4 = i2;
                            i6 = i3;
                        }
                        i = i4;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        i = i4;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    i4 = i;
                }
            }
            currentRecomposeScope$runtime.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(Object obj) {
        synchronized (this.lock) {
            try {
                invalidateScopeOfLocked(obj);
                Object d = this.derivedStates.d(obj);
                if (d != null) {
                    if (d instanceof gb0) {
                        gb0 gb0Var = (gb0) d;
                        Object[] objArr = gb0Var.b;
                        long[] jArr = gb0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            invalidateScopeOfLocked((DerivedState) objArr[(i << 3) + i3]);
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
                    } else {
                        invalidateScopeOfLocked((DerivedState) d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime(DerivedState<?> derivedState) {
        if (ScopeMap.m3919containsimpl(this.observations, derivedState)) {
            return;
        }
        ScopeMap.m3933removeScopeimpl(this.derivedStates, derivedState);
    }

    public final void removeObservation$runtime(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        ScopeMap.m3931removeimpl(this.observations, obj, recomposeScopeImpl);
    }

    public final void setComposable(my myVar) {
        this.composable = myVar;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(my myVar) {
        boolean clearDeactivated = clearDeactivated();
        ensureRunning();
        if (clearDeactivated) {
            composeInitialWithReuse(myVar);
        } else {
            composeInitial(myVar);
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(my myVar) {
        clearDeactivated();
        ensureRunning();
        composeInitialWithReuse(myVar);
    }

    @Override // androidx.compose.runtime.tooling.ObservableComposition
    public CompositionObserverHandle setObserver(final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$setObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj;
                obj = CompositionImpl.this.lock;
                CompositionImpl compositionImpl = CompositionImpl.this;
                CompositionObserver compositionObserver2 = compositionObserver;
                synchronized (obj) {
                    if (q10.b(compositionImpl.getObserverHolder$runtime().getObserver(), compositionObserver2)) {
                        compositionImpl.getObserverHolder$runtime().setObserver(null);
                        compositionImpl.getObserverHolder$runtime().setRoot(false);
                    }
                }
            }
        };
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContent(my myVar) {
        return composeInitialPaused(clearDeactivated(), myVar);
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContentWithReuse(my myVar) {
        clearDeactivated();
        ensureRunning();
        return composeInitialPaused(true, myVar);
    }

    public final void setPendingInvalidScopes$runtime(boolean z) {
        this.pendingInvalidScopes = z;
    }

    public final void updateMovingInvalidations$runtime() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            try {
                this.composer.mo3843updateComposerInvalidationsRY85e9Y$runtime(m3838takeInvalidationsafanTW4());
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            if (!isComposing()) {
                this.composer.verifyConsistent$runtime();
                this.slotStorage.verifyWellFormed();
            }
        }
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime$annotations() {
    }

    public static /* synthetic */ void getSlotStorage$runtime$annotations() {
    }

    private final void addPendingInvalidationsLocked(Object obj, boolean z) {
        Object d = this.observations.d(obj);
        if (d == null) {
            return;
        }
        if (d instanceof gb0) {
            gb0 gb0Var = (gb0) d;
            Object[] objArr = gb0Var.b;
            long[] jArr = gb0Var.a;
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
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                            if (!ScopeMap.m3931removeimpl(this.observationsProcessed, obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                                if (recomposeScopeImpl.isConditional() && !z) {
                                    this.conditionallyInvalidatedScopes.d(recomposeScopeImpl);
                                } else {
                                    this.invalidatedScopes.d(recomposeScopeImpl);
                                }
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
        } else {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) d;
            if (ScopeMap.m3931removeimpl(this.observationsProcessed, obj, recomposeScopeImpl2) || recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (recomposeScopeImpl2.isConditional() && !z) {
                this.conditionallyInvalidatedScopes.d(recomposeScopeImpl2);
            } else {
                this.invalidatedScopes.d(recomposeScopeImpl2);
            }
        }
    }
}
