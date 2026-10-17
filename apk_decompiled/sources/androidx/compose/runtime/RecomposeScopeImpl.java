package androidx.compose.runtime;

import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.tooling.IdentifiableRecomposeScope;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.fb0;
import defpackage.k00;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.q10;
import defpackage.rl0;
import defpackage.ta0;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope, IdentifiableRecomposeScope {
    private Anchor anchor;
    private my block;
    private int currentToken;
    private int flags;
    private RecomposeScopeOwner owner;
    private fb0 trackedDependencies;
    private ta0 trackedInstances;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    private final boolean checkDerivedStateChanged(DerivedState<?> derivedState, fb0 fb0Var) {
        derivedState.getClass();
        SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
        if (policy == null) {
            policy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), fb0Var.d(derivedState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 end$lambda$0$1(RecomposeScopeImpl recomposeScopeImpl, int i, ta0 ta0Var, Composition composition) {
        int i2;
        if (recomposeScopeImpl.currentToken == i && q10.b(ta0Var, recomposeScopeImpl.trackedInstances) && (composition instanceof CompositionImpl)) {
            long[] jArr = ta0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((255 & j) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = ta0Var.b[i7];
                                boolean z = ta0Var.c[i7] != i;
                                if (z) {
                                    CompositionImpl compositionImpl = (CompositionImpl) composition;
                                    compositionImpl.removeObservation$runtime(obj, recomposeScopeImpl);
                                    i2 = i4;
                                    if (obj instanceof DerivedState) {
                                        compositionImpl.removeDerivedStateObservation$runtime((DerivedState) obj);
                                        fb0 fb0Var = recomposeScopeImpl.trackedDependencies;
                                        if (fb0Var != null) {
                                            fb0Var.j(obj);
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                if (z) {
                                    ta0Var.g(i7);
                                }
                            } else {
                                i2 = i4;
                            }
                            j >>= i2;
                            i6++;
                            i4 = i2;
                        }
                        if (i5 != i4) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return w01.a;
    }

    private final boolean getFlag(int i) {
        return (this.flags & i) != 0;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setFlag(int i, boolean z) {
        int i2 = this.flags;
        this.flags = z ? i | i2 : (~i) & i2;
    }

    private final void setRereading(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 32 : i & (-33);
    }

    private final void setSkipped(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 16 : i & (-17);
    }

    public final void adoptedBy(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void compose(Composer composer) {
        my myVar = this.block;
        if (myVar != null) {
            myVar.invoke(composer, 1);
        } else {
            o.f("Invalid restart scope");
        }
    }

    public final ky end(int i) {
        ta0 ta0Var = this.trackedInstances;
        if (ta0Var == null || getSkipped$runtime()) {
            return null;
        }
        Object[] objArr = ta0Var.b;
        int[] iArr = ta0Var.c;
        long[] jArr = ta0Var.a;
        int i2 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i3 = 0;
        while (true) {
            long j = jArr[i3];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j) < 128) {
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        if (iArr[i6] != i) {
                            return new k00(this, i, ta0Var, i2);
                        }
                    }
                    j >>= 8;
                }
                if (i4 != 8) {
                    return null;
                }
            }
            if (i3 == length) {
                return null;
            }
            i3++;
        }
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    @Override // androidx.compose.runtime.tooling.IdentifiableRecomposeScope
    public Object getIdentity() {
        return this.anchor;
    }

    public final RecomposeScopeOwner getOwner$runtime() {
        return this.owner;
    }

    public final boolean getPaused() {
        return (this.flags & Fields.RotationX) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getResetReusing() {
        return (this.flags & Fields.RotationZ) != 0;
    }

    public final boolean getResuming() {
        return (this.flags & Fields.RotationY) != 0;
    }

    public final boolean getReusing() {
        return (this.flags & Fields.SpotShadowColor) != 0;
    }

    public final boolean getSkipped$runtime() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        if (this.owner != null) {
            Anchor anchor = this.anchor;
            if (anchor != null ? anchor.getValid() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidate;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    public final boolean isInvalidFor(Object obj) {
        fb0 fb0Var;
        if (obj == null || (fb0Var = this.trackedDependencies) == null) {
            return true;
        }
        if (obj instanceof DerivedState) {
            return checkDerivedStateChanged((DerivedState) obj, fb0Var);
        }
        if (!(obj instanceof rl0)) {
            return true;
        }
        rl0 rl0Var = (rl0) obj;
        if (rl0Var.c()) {
            Object[] objArr = rl0Var.b;
            long[] jArr = rl0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj2 = objArr[(i << 3) + i3];
                                if (!(obj2 instanceof DerivedState) || checkDerivedStateChanged((DerivedState) obj2, fb0Var)) {
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
                return true;
            }
        }
        return false;
    }

    public final void recordDerivedStateValue(DerivedState<?> derivedState, Object obj) {
        fb0 fb0Var = this.trackedDependencies;
        if (fb0Var == null) {
            fb0Var = new fb0();
            this.trackedDependencies = fb0Var;
        }
        fb0Var.l(derivedState, obj);
    }

    public final boolean recordRead(Object obj) {
        int i;
        if (getRereading()) {
            return false;
        }
        ta0 ta0Var = this.trackedInstances;
        if (ta0Var == null) {
            ta0Var = new ta0();
            this.trackedInstances = ta0Var;
        }
        int i2 = this.currentToken;
        int e = ta0Var.e(obj);
        if (e < 0) {
            e = ~e;
            i = -1;
        } else {
            i = ta0Var.c[e];
        }
        ta0Var.b[e] = obj;
        ta0Var.c[e] = i2;
        return i == this.currentToken;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    public final void rereadTrackedInstances() {
        ta0 ta0Var;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (ta0Var = this.trackedInstances) == null) {
            return;
        }
        setRereading(true);
        try {
            Object[] objArr = ta0Var.b;
            int[] iArr = ta0Var.c;
            long[] jArr = ta0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                recomposeScopeOwner.recordReadOf(obj);
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
        } finally {
            setRereading(false);
        }
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        setSkipped(true);
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 2 : i & (-3);
    }

    public final void setDefaultsInvalid(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 4 : i & (-5);
    }

    public final void setForcedRecompose(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 64 : i & (-65);
    }

    public final void setOwner$runtime(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void setPaused(boolean z) {
        int i = this.flags;
        this.flags = z ? i | Fields.RotationX : i & (-257);
    }

    public final void setRequiresRecompose(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 8 : i & (-9);
    }

    public final void setResetReusing(boolean z) {
        int i = this.flags;
        this.flags = z ? i | Fields.RotationZ : i & (-1025);
    }

    public final void setResuming(boolean z) {
        int i = this.flags;
        this.flags = z ? i | Fields.RotationY : i & (-513);
    }

    public final void setReusing(boolean z) {
        int i = this.flags;
        this.flags = z ? i | Fields.SpotShadowColor : i & (-129);
    }

    public final void setUsed(boolean z) {
        int i = this.flags;
        this.flags = z ? i | 1 : i & (-2);
    }

    public final void start(int i) {
        this.currentToken = i;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(my myVar) {
        this.block = myVar;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final void adoptAnchoredScopes$runtime(SlotWriter slotWriter, List<GapAnchor> list, RecomposeScopeOwner recomposeScopeOwner) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object slot = slotWriter.slot(list.get(i), 0);
                RecomposeScopeImpl recomposeScopeImpl = slot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) slot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime(SlotTable slotTable, List<GapAnchor> list) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    GapAnchor gapAnchor = list.get(i);
                    if (slotTable.ownsAnchor(gapAnchor) && (slotTable.slot$runtime(slotTable.anchorIndex(gapAnchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getIdentity$annotations() {
    }
}
