package androidx.compose.material3;

import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import defpackage.b9;
import defpackage.bq;
import defpackage.h7;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.j3;
import defpackage.ky;
import defpackage.lg;
import defpackage.my;
import defpackage.ny;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DragHandleKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalDragHandle(Modifier modifier, DragHandleSizes dragHandleSizes, DragHandleColors dragHandleColors, DragHandleShapes dragHandleShapes, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        DragHandleSizes dragHandleSizes2;
        DragHandleColors dragHandleColors2;
        DragHandleShapes dragHandleShapes2;
        MutableInteractionSource mutableInteractionSource2;
        DragHandleSizes dragHandleSizes3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        DragHandleSizes dragHandleSizes4;
        MutableInteractionSource mutableInteractionSource3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1693656835);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                dragHandleSizes2 = dragHandleSizes;
                if (startRestartGroup.changed(dragHandleSizes2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                dragHandleSizes2 = dragHandleSizes;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            dragHandleSizes2 = dragHandleSizes;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                dragHandleColors2 = dragHandleColors;
                if (startRestartGroup.changed(dragHandleColors2)) {
                    i5 = Fields.RotationX;
                    i3 |= i5;
                }
            } else {
                dragHandleColors2 = dragHandleColors;
            }
            i5 = Fields.SpotShadowColor;
            i3 |= i5;
        } else {
            dragHandleColors2 = dragHandleColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                dragHandleShapes2 = dragHandleShapes;
                if (startRestartGroup.changed(dragHandleShapes2)) {
                    i4 = Fields.CameraDistance;
                    i3 |= i4;
                }
            } else {
                dragHandleShapes2 = dragHandleShapes;
            }
            i4 = Fields.RotationZ;
            i3 |= i4;
        } else {
            dragHandleShapes2 = dragHandleShapes;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.Clip : 8192;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                dragHandleSizes3 = dragHandleSizes2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) != 0) {
                        dragHandleSizes4 = VerticalDragHandleDefaults.INSTANCE.sizes();
                        i3 &= -113;
                    } else {
                        dragHandleSizes4 = dragHandleSizes2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        dragHandleColors2 = VerticalDragHandleDefaults.INSTANCE.colors(startRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dragHandleShapes2 = VerticalDragHandleDefaults.INSTANCE.shapes(startRestartGroup, 6);
                    }
                    if (i8 != 0) {
                        mutableInteractionSource2 = null;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    dragHandleSizes4 = dragHandleSizes2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1693656835, i3, -1, "androidx.compose.material3.VerticalDragHandle (DragHandle.kt:78)");
                }
                if (mutableInteractionSource2 == null) {
                    startRestartGroup.startReplaceGroup(-1544610024);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-188374113);
                    startRestartGroup.endReplaceGroup();
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                State<Boolean> collectIsDraggedAsState = DragInteractionKt.collectIsDraggedAsState(mutableInteractionSource3, startRestartGroup, 0);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState = (MutableState) rememberedValue2;
                Modifier hoverable$default = HoverableKt.hoverable$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, false, 2, null);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                int i9 = 8;
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new j3(mutableState, i9);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                iy iyVar = (iy) rememberedValue3;
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                Modifier modifier4 = modifier3;
                int i10 = 9;
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new j3(mutableState, i10);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                Modifier pressable = pressable(hoverable$default, mutableInteractionSource3, iyVar, (iy) rememberedValue4);
                boolean changed = startRestartGroup.changed(collectIsDraggedAsState) | ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(dragHandleShapes2)) || (i3 & 3072) == 2048);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new defpackage.f1(dragHandleShapes2, collectIsDraggedAsState, mutableState, 8);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(pressable, (ky) rememberedValue5);
                boolean changed2 = startRestartGroup.changed(collectIsDraggedAsState) | ((((i3 & 112) ^ 48) > 32 && startRestartGroup.changed(dragHandleSizes4)) || (i3 & 48) == 32);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new b9(dragHandleSizes4, collectIsDraggedAsState, mutableState);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Modifier layout = LayoutModifierKt.layout(graphicsLayer, (ny) rememberedValue6);
                boolean changed3 = startRestartGroup.changed(collectIsDraggedAsState);
                if ((((i3 & 896) ^ 384) <= 256 || !startRestartGroup.changed(dragHandleColors2)) && (i3 & 384) != 256) {
                    z = false;
                }
                boolean z2 = changed3 | z;
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue7 == companion.getEmpty()) {
                    rememberedValue7 = new defpackage.f1(dragHandleColors2, collectIsDraggedAsState, mutableState, i10);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                BoxKt.Box(IndicationKt.indication(DrawModifierKt.drawBehind(layout, (ky) rememberedValue7), mutableInteractionSource3, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dragHandleSizes3 = dragHandleSizes4;
                modifier2 = modifier4;
            }
            DragHandleColors dragHandleColors3 = dragHandleColors2;
            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new lg(modifier2, dragHandleSizes3, dragHandleColors3, dragHandleShapes2, mutableInteractionSource4, i, i2, 2));
                return;
            }
            return;
        }
        mutableInteractionSource2 = mutableInteractionSource;
        boolean z3 = true;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        DragHandleColors dragHandleColors32 = dragHandleColors2;
        MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean VerticalDragHandle$lambda$1(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDragHandle$lambda$10$lambda$9(DragHandleShapes dragHandleShapes, State state, MutableState mutableState, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShape(VerticalDragHandle$lambda$1(state) ? dragHandleShapes.getDraggedShape() : VerticalDragHandle$lambda$3(mutableState) ? dragHandleShapes.getPressedShape() : dragHandleShapes.getShape());
        graphicsLayerScope.setClip(true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult VerticalDragHandle$lambda$13$lambda$12(DragHandleSizes dragHandleSizes, State state, MutableState mutableState, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        long mo368toSizeXkaWNTQ = measureScope.mo368toSizeXkaWNTQ(VerticalDragHandle$lambda$1(state) ? dragHandleSizes.m1939getDraggedSizeMYxV2XQ() : VerticalDragHandle$lambda$3(mutableState) ? dragHandleSizes.m1940getPressedSizeMYxV2XQ() : dragHandleSizes.m1941getSizeMYxV2XQ());
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(Math.round(Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ >> 32))), Math.round(Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ & 4294967295L)))));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h7(3, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDragHandle$lambda$13$lambda$12$lambda$11(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDragHandle$lambda$15$lambda$14(DragHandleColors dragHandleColors, State state, MutableState mutableState, DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, VerticalDragHandle$lambda$1(state) ? dragHandleColors.m1937getDraggedColor0d7_KjU() : VerticalDragHandle$lambda$3(mutableState) ? dragHandleColors.m1938getPressedColor0d7_KjU() : dragHandleColors.m1936getColor0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDragHandle$lambda$16(Modifier modifier, DragHandleSizes dragHandleSizes, DragHandleColors dragHandleColors, DragHandleShapes dragHandleShapes, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        VerticalDragHandle(modifier, dragHandleSizes, dragHandleColors, dragHandleShapes, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final boolean VerticalDragHandle$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void VerticalDragHandle$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDragHandle$lambda$6$lambda$5(MutableState mutableState) {
        VerticalDragHandle$lambda$4(mutableState, true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 VerticalDragHandle$lambda$8$lambda$7(MutableState mutableState) {
        VerticalDragHandle$lambda$4(mutableState, false);
        return w01.a;
    }

    private static final Modifier pressable(Modifier modifier, MutableInteractionSource mutableInteractionSource, final iy iyVar, final iy iyVar2) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mutableInteractionSource, new PointerInputEventHandler() { // from class: androidx.compose.material3.DragHandleKt$pressable$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.material3.DragHandleKt$pressable$1$1", f = "DragHandle.kt", l = {341, 343}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.DragHandleKt$pressable$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ij0 implements my {
                final /* synthetic */ iy $onPressed;
                final /* synthetic */ iy $onReleasedOrCancelled;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(iy iyVar, iy iyVar2, hm hmVar) {
                    super(hmVar);
                    this.$onPressed = iyVar;
                    this.$onReleasedOrCancelled = iyVar2;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onPressed, this.$onReleasedOrCancelled, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
                
                    if (androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r0, r11, r8) == r4) goto L16;
                 */
                @Override // defpackage.mc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    int i = this.label;
                    vn vnVar = vn.d;
                    if (i == 0) {
                        p10.Q(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        anonymousClass1 = this;
                        if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, pointerEventPass, anonymousClass1, 1, null) != vnVar) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return vnVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        anonymousClass1 = this;
                        anonymousClass1.$onReleasedOrCancelled.invoke();
                        return w01.a;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    anonymousClass1 = this;
                    anonymousClass1.$onPressed.invoke();
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(iy.this, iyVar2, null), hmVar);
                return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
            }
        });
    }
}
