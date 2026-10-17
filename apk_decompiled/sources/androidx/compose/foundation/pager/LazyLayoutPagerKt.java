package androidx.compose.foundation.pager;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.ScrollableAreaKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.foundation.pager.LazyLayoutPagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bq;
import defpackage.eh0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.oy;
import defpackage.p10;
import defpackage.p9;
import defpackage.st;
import defpackage.un;
import defpackage.us0;
import defpackage.v4;
import defpackage.vn;
import defpackage.w01;
import defpackage.w20;
import defpackage.w30;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
    /* renamed from: Pager-eLwUrMk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m998PagereLwUrMk(final Modifier modifier, PagerState pagerState, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final TargetedFlingBehavior targetedFlingBehavior, final boolean z2, final OverscrollEffect overscrollEffect, int i, float f, final PageSize pageSize, NestedScrollConnection nestedScrollConnection, final ky kyVar, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final oy oyVar, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        float f2;
        int i8;
        int i9;
        final NestedScrollConnection nestedScrollConnection2;
        Composer composer2;
        final int i10;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        Modifier modifier2;
        final PagerState pagerState2 = pagerState;
        Composer startRestartGroup = composer.startRestartGroup(-572816025);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(pagerState2) ? 32 : 16;
        }
        int i12 = i2 & 384;
        int i13 = Fields.SpotShadowColor;
        if (i12 == 0) {
            i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
        }
        int i14 = i2 & 3072;
        int i15 = Fields.RotationZ;
        if (i14 == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= startRestartGroup.changed(orientation.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= startRestartGroup.changed(targetedFlingBehavior) ? Fields.RenderEffect : 65536;
        }
        int i16 = i2 & 1572864;
        int i17 = Fields.BlendMode;
        if (i16 == 0) {
            i5 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changed(overscrollEffect) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        int i18 = i4 & Fields.RotationX;
        if (i18 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i6 = 196608;
            i5 |= startRestartGroup.changed(i) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
            i7 = i4 & Fields.RotationY;
            if (i7 == 0) {
                i5 |= 805306368;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 805306368) == 0) {
                    i5 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                }
            }
            if ((i3 & 6) != 0) {
                i8 = i3 | (startRestartGroup.changed(pageSize) ? 4 : 2);
            } else {
                i8 = i3;
            }
            if ((i3 & 48) == 0) {
                i8 |= startRestartGroup.changedInstance(nestedScrollConnection) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if (startRestartGroup.changedInstance(kyVar)) {
                    i13 = 256;
                }
                i8 |= i13;
            }
            if ((i3 & 3072) == 0) {
                if (startRestartGroup.changed(horizontal)) {
                    i15 = 2048;
                }
                i8 |= i15;
            }
            if ((i3 & 24576) == 0) {
                i8 |= startRestartGroup.changed(vertical) ? 16384 : 8192;
            }
            if ((i3 & i6) == 0) {
                i8 |= startRestartGroup.changed(snapPosition) ? Fields.RenderEffect : 65536;
            }
            if ((i3 & 1572864) == 0) {
                if (startRestartGroup.changedInstance(oyVar)) {
                    i17 = 1048576;
                }
                i8 |= i17;
            }
            i9 = i8;
            int i19 = 0;
            if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i9) != 599186, i5 & 1)) {
                nestedScrollConnection2 = nestedScrollConnection;
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                i10 = i;
                f3 = f2;
            } else {
                int i20 = i18 != 0 ? 0 : i;
                float m7611constructorimpl = i7 != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-572816025, i5, i9, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:102)");
                }
                if (i20 < 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("beyondViewportPageCount should be greater than or equal to 0, you selected " + i20);
                }
                int i21 = i5 & 112;
                boolean z3 = i21 == 32;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new w30(pagerState2, i19);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i22 = i5 >> 3;
                int i23 = i22 & 14;
                int i24 = i9 >> 15;
                int i25 = i5;
                int i26 = i20;
                iy rememberPagerItemProviderLambda = rememberPagerItemProviderLambda(pagerState, oyVar, kyVar, (iy) rememberedValue, startRestartGroup, i23 | (i24 & 112) | (i9 & 896));
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                un unVar = (un) rememberedValue2;
                boolean z4 = i21 == 32;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue3 == companion.getEmpty()) {
                    i11 = 1;
                    rememberedValue3 = new w30(pagerState, i11);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                } else {
                    i11 = 1;
                }
                int i27 = i25 >> 9;
                int i28 = i9 << 15;
                int i29 = i11;
                LazyLayoutMeasurePolicy m1009rememberPagerMeasurePolicy8u0NR3k = PagerMeasurePolicyKt.m1009rememberPagerMeasurePolicy8u0NR3k(rememberPagerItemProviderLambda, pagerState, paddingValues, z, orientation, i26, m7611constructorimpl, pageSize, horizontal, vertical, snapPosition, unVar, (iy) rememberedValue3, startRestartGroup, (i25 & 65520) | (i27 & 458752) | (i27 & 3670016) | ((i9 << 21) & 29360128) | (i28 & 234881024) | (i28 & 1879048192), i24 & 14);
                float f4 = m7611constructorimpl;
                Orientation orientation2 = Orientation.Vertical;
                LazyLayoutSemanticState rememberPagerSemanticState = PagerSemanticsKt.rememberPagerSemanticState(pagerState, orientation == orientation2 ? i29 : 0, startRestartGroup, i23);
                int i30 = ((i25 & 458752) == 131072 ? i29 : 0) | (i21 == 32 ? i29 : 0);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (i30 != 0 || rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new PagerWrapperFlingBehavior(targetedFlingBehavior, pagerState);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) rememberedValue4;
                BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) startRestartGroup.consume(BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec());
                int i31 = (i21 == 32 ? i29 : 0) | (startRestartGroup.changed(bringIntoViewSpec) ? 1 : 0);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (i31 != 0 || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new PagerBringIntoViewSpec(pagerState, bringIntoViewSpec);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                PagerBringIntoViewSpec pagerBringIntoViewSpec = (PagerBringIntoViewSpec) rememberedValue5;
                if (z2) {
                    startRestartGroup.startReplaceGroup(-853822717);
                    modifier2 = LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(Modifier.Companion, PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(pagerState, i26, startRestartGroup, i23 | ((i25 >> 21) & 112)), pagerState.getBeyondBoundsInfo$foundation(), z, orientation);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-853392933);
                    startRestartGroup.endReplaceGroup();
                    modifier2 = Modifier.Companion;
                }
                Modifier scrollableArea = ScrollableAreaKt.scrollableArea(PagerKt.pagerSemantics(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(pagerState.getRemeasurementModifier$foundation()).then(pagerState.getAwaitLayoutModifier$foundation()), rememberPagerItemProviderLambda, rememberPagerSemanticState, orientation, z2, z, startRestartGroup, (i22 & 7168) | ((i25 >> 6) & 57344) | ((i25 << 6) & 458752)), pagerState, orientation == orientation2 ? i29 : 0, unVar, z2).then(modifier2), pagerState, orientation, overscrollEffect, z2, z, pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource$foundation(), pagerBringIntoViewSpec);
                pagerState2 = pagerState;
                nestedScrollConnection2 = nestedScrollConnection;
                LazyLayoutKt.LazyLayout(rememberPagerItemProviderLambda, NestedScrollModifierKt.nestedScroll$default(dragDirectionDetector(scrollableArea, pagerState2), nestedScrollConnection2, null, 2, null), pagerState2.getPrefetchState$foundation(), m1009rememberPagerMeasurePolicy8u0NR3k, startRestartGroup, 0, 0);
                composer2 = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f3 = f4;
                i10 = i26;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: x30
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 Pager_eLwUrMk$lambda$5;
                        int intValue = ((Integer) obj2).intValue();
                        Pager_eLwUrMk$lambda$5 = LazyLayoutPagerKt.Pager_eLwUrMk$lambda$5(Modifier.this, pagerState2, paddingValues, z, orientation, targetedFlingBehavior, z2, overscrollEffect, i10, f3, pageSize, nestedScrollConnection2, kyVar, horizontal, vertical, snapPosition, oyVar, i2, i3, i4, (Composer) obj, intValue);
                        return Pager_eLwUrMk$lambda$5;
                    }
                });
                return;
            }
            return;
        }
        i6 = 196608;
        i7 = i4 & Fields.RotationY;
        if (i7 == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        if ((i3 & 384) == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & i6) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i9 = i8;
        int i192 = 0;
        if (startRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i9) != 599186, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Pager_eLwUrMk$lambda$5(Modifier modifier, PagerState pagerState, PaddingValues paddingValues, boolean z, Orientation orientation, TargetedFlingBehavior targetedFlingBehavior, boolean z2, OverscrollEffect overscrollEffect, int i, float f, PageSize pageSize, NestedScrollConnection nestedScrollConnection, ky kyVar, Alignment.Horizontal horizontal, Alignment.Vertical vertical, SnapPosition snapPosition, oy oyVar, int i2, int i3, int i4, Composer composer, int i5) {
        m998PagereLwUrMk(modifier, pagerState, paddingValues, z, orientation, targetedFlingBehavior, z2, overscrollEffect, i, f, pageSize, nestedScrollConnection, kyVar, horizontal, vertical, snapPosition, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return w01.a;
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, final PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {285}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ PagerState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                int label;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {287, 291}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00101 extends ij0 implements my {
                    final /* synthetic */ PagerState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00101(PagerState pagerState, hm hmVar) {
                        super(hmVar);
                        this.$state = pagerState;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00101 c00101 = new C00101(this.$state, hmVar);
                        c00101.L$0 = obj;
                        return c00101;
                    }

                    @Override // defpackage.my
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                        return ((C00101) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
                    
                        if (r12 == r5) goto L17;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0062 -> B:6:0x0066). Please report as a decompilation issue!!! */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        AwaitPointerEventScope awaitPointerEventScope;
                        PointerInputChange pointerInputChange;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        int i = this.label;
                        PointerInputChange pointerInputChange2 = null;
                        vn vnVar = vn.d;
                        if (i == 0) {
                            p10.Q(obj);
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            PointerEventPass pointerEventPass = PointerEventPass.Initial;
                            this.L$0 = awaitPointerEventScope;
                            this.label = 1;
                            obj = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass, this);
                        } else if (i == 1) {
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            p10.Q(obj);
                        } else {
                            if (i != 2) {
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            PointerInputChange pointerInputChange3 = (PointerInputChange) this.L$2;
                            PointerInputChange pointerInputChange4 = (PointerInputChange) this.L$1;
                            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            p10.Q(obj);
                            PointerEvent pointerEvent = (PointerEvent) obj;
                            List<PointerInputChange> changes = pointerEvent.getChanges();
                            int size = changes.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    PointerInputChange pointerInputChange5 = pointerInputChange4;
                                    pointerInputChange2 = pointerEvent.getChanges().get(0);
                                    pointerInputChange = pointerInputChange5;
                                    break;
                                }
                                if (!PointerEventKt.changedToUp(changes.get(i2))) {
                                    pointerInputChange = pointerInputChange4;
                                    pointerInputChange2 = pointerInputChange3;
                                    break;
                                }
                                i2++;
                            }
                            if (pointerInputChange2 == null) {
                                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange;
                                this.L$2 = pointerInputChange2;
                                this.label = 2;
                                Object awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, this);
                                if (awaitPointerEvent != vnVar) {
                                    PointerInputChange pointerInputChange6 = pointerInputChange2;
                                    pointerInputChange4 = pointerInputChange;
                                    obj = awaitPointerEvent;
                                    pointerInputChange3 = pointerInputChange6;
                                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                                    List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                                    int size2 = changes2.size();
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= size2) {
                                        }
                                        i22++;
                                    }
                                    if (pointerInputChange2 == null) {
                                        this.$state.m1016setUpDownDifferencek4lQ0M$foundation(Offset.m4520minusMKHz9U(pointerInputChange2.m6101getPositionF1C5BW0(), pointerInputChange.m6101getPositionF1C5BW0()));
                                        return w01.a;
                                    }
                                }
                                return vnVar;
                            }
                        }
                        pointerInputChange = (PointerInputChange) obj;
                        this.$state.m1016setUpDownDifferencek4lQ0M$foundation(Offset.Companion.m4532getZeroF1C5BW0());
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        if (pointerInputChange2 == null) {
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, hm hmVar) {
                    super(2, hmVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = pagerState;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    return new AnonymousClass1(this.$this_pointerInput, this.$state, hmVar);
                }

                @Override // defpackage.my
                public final Object invoke(un unVar, hm hmVar) {
                    return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                }

                @Override // defpackage.mc
                public final Object invokeSuspend(Object obj) {
                    int i = this.label;
                    if (i == 0) {
                        p10.Q(obj);
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00101 c00101 = new C00101(this.$state, null);
                        this.label = 1;
                        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, c00101, this);
                        vn vnVar = vn.d;
                        if (awaitEachGesture == vnVar) {
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

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object n = p10.n(new AnonymousClass1(pointerInputScope, PagerState.this, null), hmVar);
                return n == vn.d ? n : w01.a;
            }
        }));
    }

    private static final iy rememberPagerItemProviderLambda(PagerState pagerState, oy oyVar, ky kyVar, iy iyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052364153, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:257)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(oyVar, composer, (i >> 3) & 14);
        State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(kyVar, composer, (i >> 6) & 14);
        int i2 = 6;
        boolean changed = ((((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4) | composer.changed(rememberUpdatedState) | composer.changed(rememberUpdatedState2) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(iyVar)) || (i & 3072) == 2048);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new v4(19, SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new p9(rememberUpdatedState, rememberUpdatedState2, iyVar, i2)), pagerState));
            rememberedValue = new eh0(derivedStateOf) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // defpackage.w20
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        w20 w20Var = (w20) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w20Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagerLayoutIntervalContent rememberPagerItemProviderLambda$lambda$0$0(State state, State state2, iy iyVar) {
        return new PagerLayoutIntervalContent((oy) state.getValue(), (ky) state2.getValue(), ((Number) iyVar.invoke()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagerLazyLayoutItemProvider rememberPagerItemProviderLambda$lambda$0$1(State state, PagerState pagerState) {
        PagerLayoutIntervalContent pagerLayoutIntervalContent = (PagerLayoutIntervalContent) state.getValue();
        return new PagerLazyLayoutItemProvider(pagerState, pagerLayoutIntervalContent, new NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation(), pagerLayoutIntervalContent));
    }
}
