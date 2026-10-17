package androidx.compose.runtime;

import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.composer.RememberManager;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.GapAnchorKt;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.tooling.ComposeStackTraceMode;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.iy;
import defpackage.my;
import defpackage.uo;
import defpackage.ut;
import defpackage.w01;
import defpackage.w5;
import defpackage.xe0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;
    private static CompositionTracer compositionTracer = null;
    public static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static int composeStackTraceMode = ComposeStackTraceMode.Companion.m4176getNoneMD5MrJc();
    private static final Object invocation = new OpaqueKey("provider");
    private static final Object provider = new OpaqueKey("provider");
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");
    private static final Object providerValues = new OpaqueKey("providerValues");
    private static final Object providerMaps = new OpaqueKey("providers");
    private static final Object reference = new OpaqueKey("reference");

    @ComposeCompilerApi
    public static final <T> T cache(Composer composer, boolean z, iy iyVar) {
        T t = (T) composer.rememberedValue();
        if (!z && t != Composer.Companion.getEmpty()) {
            return t;
        }
        T t2 = (T) iyVar.invoke();
        composer.updateRememberedValue(t2);
        return t2;
    }

    public static final void composeImmediateRuntimeError(String str) {
        throw new ComposeRuntimeError(uo.d("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void composeRuntimeError(String str) {
        throw new ComposeRuntimeError(uo.d("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [ut] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static final MovableContentState extractMovableContentAtCurrent(final ControlledComposition controlledComposition, MovableContentStateReference movableContentStateReference, SlotWriter slotWriter, Applier<?> applier) {
        final MovableContentStateReference movableContentStateReference2;
        SlotTable slotTable;
        ?? r8;
        Anchor anchor;
        long[] jArr;
        Anchor anchor2;
        SlotTable slotTable2;
        int i;
        long[] jArr2;
        long j;
        int i2;
        boolean z;
        Object obj;
        int i3;
        SlotTable slotTable3;
        long j2;
        Object obj2;
        SlotTable slotTable4 = new SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable4.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable4.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                Object node = slotWriter.node(parent);
                int i4 = parent + 1;
                int groupSize = slotWriter.groupSize(parent) + parent;
                int i5 = 0;
                while (i4 < groupSize) {
                    int groupSize2 = slotWriter.groupSize(i4) + i4;
                    if (groupSize2 > currentGroup) {
                        break;
                    }
                    i5 += slotWriter.isNode(i4) ? 1 : slotWriter.nodeCount(i4);
                    i4 = groupSize2;
                }
                int nodeCount = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(node);
                applier.remove(i5, nodeCount);
                applier.up();
            }
        }
        Anchor anchor$runtime = movableContentStateReference.getAnchor$runtime();
        if (anchor$runtime.getValid()) {
            controlledComposition.getClass();
            CompositionImpl compositionImpl = (CompositionImpl) controlledComposition;
            if (ScopeMap.m3926getSizeimpl(compositionImpl.invalidations) > 0) {
                r8 = new ArrayList();
                fb0 fb0Var = compositionImpl.invalidations;
                long[] jArr3 = fb0Var.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr3[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j3 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    int i11 = i7;
                                    Object obj3 = fb0Var.b[i10];
                                    anchor2 = anchor$runtime;
                                    Object obj4 = fb0Var.c[i10];
                                    obj3.getClass();
                                    i = i9;
                                    if (obj4 instanceof gb0) {
                                        gb0 gb0Var = (gb0) obj4;
                                        Object[] objArr = gb0Var.b;
                                        long[] jArr4 = gb0Var.a;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i12 = 0;
                                            while (true) {
                                                long j4 = jArr4[i12];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    int i14 = 0;
                                                    while (i14 < i13) {
                                                        if ((j4 & 255) < 128) {
                                                            i3 = i14;
                                                            int i15 = (i12 << 3) + i3;
                                                            j2 = j4;
                                                            Object obj5 = objArr[i15];
                                                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj3;
                                                            Anchor anchor3 = recomposeScopeImpl.getAnchor();
                                                            if (anchor3 != null) {
                                                                obj2 = obj3;
                                                                slotTable3 = slotTable4;
                                                                if (slotWriter.inGroup(GapAnchorKt.asGapAnchor(anchor2), GapAnchorKt.asGapAnchor(anchor3))) {
                                                                    r8.add(new xe0(recomposeScopeImpl, obj5));
                                                                    gb0Var.n(i15);
                                                                }
                                                                j4 = j2 >> i11;
                                                                i14 = i3 + 1;
                                                                obj3 = obj2;
                                                                slotTable4 = slotTable3;
                                                            } else {
                                                                slotTable3 = slotTable4;
                                                            }
                                                        } else {
                                                            i3 = i14;
                                                            slotTable3 = slotTable4;
                                                            j2 = j4;
                                                        }
                                                        obj2 = obj3;
                                                        j4 = j2 >> i11;
                                                        i14 = i3 + 1;
                                                        obj3 = obj2;
                                                        slotTable4 = slotTable3;
                                                    }
                                                    slotTable2 = slotTable4;
                                                    obj = obj3;
                                                    if (i13 != i11) {
                                                        break;
                                                    }
                                                } else {
                                                    slotTable2 = slotTable4;
                                                    obj = obj3;
                                                }
                                                if (i12 == length2) {
                                                    break;
                                                }
                                                i12++;
                                                obj3 = obj;
                                                slotTable4 = slotTable2;
                                                i11 = 8;
                                            }
                                        } else {
                                            slotTable2 = slotTable4;
                                            j = j3;
                                        }
                                        z = gb0Var.b();
                                    } else {
                                        slotTable2 = slotTable4;
                                        jArr2 = jArr3;
                                        j = j3;
                                        obj4.getClass();
                                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj3;
                                        Anchor anchor4 = recomposeScopeImpl2.getAnchor();
                                        if (anchor4 == null || !slotWriter.inGroup(GapAnchorKt.asGapAnchor(anchor2), GapAnchorKt.asGapAnchor(anchor4))) {
                                            z = false;
                                        } else {
                                            r8.add(new xe0(recomposeScopeImpl2, obj4));
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        fb0Var.k(i10);
                                    }
                                    i2 = 8;
                                } else {
                                    anchor2 = anchor$runtime;
                                    slotTable2 = slotTable4;
                                    i = i9;
                                    jArr2 = jArr3;
                                    j = j3;
                                    i2 = i7;
                                }
                                j3 = j >> i2;
                                i9 = i + 1;
                                i7 = i2;
                                anchor$runtime = anchor2;
                                jArr3 = jArr2;
                                slotTable4 = slotTable2;
                            }
                            anchor = anchor$runtime;
                            slotTable = slotTable4;
                            jArr = jArr3;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            anchor = anchor$runtime;
                            slotTable = slotTable4;
                            jArr = jArr3;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        anchor$runtime = anchor;
                        jArr3 = jArr;
                        slotTable4 = slotTable;
                    }
                } else {
                    slotTable = slotTable4;
                }
            } else {
                slotTable = slotTable4;
                r8 = ut.d;
            }
            movableContentStateReference2 = movableContentStateReference;
            movableContentStateReference2.setInvalidations$runtime(yi.A0(movableContentStateReference.getInvalidations$runtime(), r8));
        } else {
            movableContentStateReference2 = movableContentStateReference;
            slotTable = slotTable4;
        }
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference2.getContent$runtime());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference2.getParameter$runtime());
            List<GapAnchor> moveTo = slotWriter.moveTo(GapAnchorKt.asGapAnchor(movableContentStateReference2.getAnchor$runtime()), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close(true);
            SlotTable slotTable5 = slotTable;
            MovableContentState movableContentState = new MovableContentState(slotTable5);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (!companion.hasAnchoredRecomposeScopes$runtime(slotTable5, moveTo)) {
                return movableContentState;
            }
            RecomposeScopeOwner recomposeScopeOwner = new RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl3, Object obj6) {
                    InvalidationResult invalidationResult;
                    ControlledComposition controlledComposition2 = ControlledComposition.this;
                    RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof RecomposeScopeOwner ? (RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(recomposeScopeImpl3, obj6)) == null) {
                        invalidationResult = InvalidationResult.IGNORED;
                    }
                    if (invalidationResult != InvalidationResult.IGNORED) {
                        return invalidationResult;
                    }
                    MovableContentStateReference movableContentStateReference3 = movableContentStateReference2;
                    movableContentStateReference3.setInvalidations$runtime(yi.B0(movableContentStateReference3.getInvalidations$runtime(), new xe0(recomposeScopeImpl3, obj6)));
                    return InvalidationResult.SCHEDULED;
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl3) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public void recordReadOf(Object obj6) {
                }
            };
            openWriter = slotTable5.openWriter();
            try {
                companion.adoptAnchoredScopes$runtime(openWriter, moveTo, recomposeScopeOwner);
                openWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    public static final int getComposeStackTraceMode() {
        return composeStackTraceMode;
    }

    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final Object getInvocation() {
        return invocation;
    }

    private static final int getNextGroup(SlotWriter slotWriter) {
        return slotWriter.groupSize(slotWriter.getCurrentGroup()) + slotWriter.getCurrentGroup();
    }

    public static final Object getProvider() {
        return provider;
    }

    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static final Object getProviderValues() {
        return providerValues;
    }

    public static final Object getReference() {
        return reference;
    }

    public static final boolean isAfterFirstChild(SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    public static final void removeCurrentGroup(SlotWriter slotWriter, RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new w5(rememberManager, 2));
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 removeCurrentGroup$lambda$0(RememberManager rememberManager, int i, Object obj) {
        if (obj instanceof ComposeNodeLifecycleCallback) {
            rememberManager.releasing((ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof RememberObserverHolder) {
            rememberManager.forgetting((RememberObserverHolder) obj);
        }
        if (obj instanceof RecomposeScopeImpl) {
            ((RecomposeScopeImpl) obj).release();
        }
        return w01.a;
    }

    public static final void runtimeCheck(boolean z, iy iyVar) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError((String) iyVar.invoke());
    }

    /* renamed from: setComposeStackTraceMode-76WK1J0, reason: not valid java name */
    public static final void m3837setComposeStackTraceMode76WK1J0(int i) {
        composeStackTraceMode = i;
    }

    @ComposeCompilerApi
    public static final void sourceInformation(Composer composer, String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(Composer composer, int i, String str) {
        composer.sourceInformationMarkerStart(i, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, String str) {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i, i2, i3, str);
        }
    }

    public static final <R> void withAfterAnchorInfo(SlotWriter slotWriter, Anchor anchor, my myVar) {
        int i;
        int i2;
        if (anchor == null || !anchor.getValid()) {
            i = -1;
            i2 = -1;
        } else {
            i = slotWriter.anchorIndex(GapAnchorKt.asGapAnchor(anchor));
            i2 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime(i);
        }
        myVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final void debugRuntimeCheck(boolean z, iy iyVar) {
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    public static final boolean isAfterFirstChild(SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final void debugRuntimeCheck(boolean z) {
    }
}
