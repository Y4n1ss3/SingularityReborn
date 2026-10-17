package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.WindowBoundsCalculator;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.ae;
import defpackage.bq;
import defpackage.cd;
import defpackage.er;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.mp;
import defpackage.my;
import defpackage.ny;
import defpackage.ou;
import defpackage.p10;
import defpackage.p9;
import defpackage.pu;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = Dp.m7611constructorimpl(16.0f);

    /* JADX WARN: Code restructure failed: missing block: B:67:0x025c, code lost:
    
        if (defpackage.q10.b(r10.rememberedValue(), java.lang.Integer.valueOf(r6)) == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(boolean z, ky kyVar, Modifier modifier, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ny nyVar2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Object exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
        Modifier modifier4;
        int i5;
        int i6;
        int i7;
        final int i8;
        MutableIntState mutableIntState;
        final MutableIntState mutableIntState2;
        final WindowBoundsCalculator windowBoundsCalculator;
        final MutableState mutableState;
        ComposeUiNode.Companion companion;
        int i9;
        boolean z2 = z;
        Composer startRestartGroup = composer.startRestartGroup(1597265892);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                nyVar2 = nyVar;
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1597265892, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:141)");
                }
                WindowBoundsCalculator platformWindowBoundsCalculator = ExposedDropdownMenu_androidKt.platformWindowBoundsCalculator(startRestartGroup, 0);
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                Object rememberedValue = startRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue == companion2.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState2 = (MutableState) rememberedValue;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                MutableIntState mutableIntState3 = (MutableIntState) rememberedValue2;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                MutableIntState mutableIntState4 = (MutableIntState) rememberedValue3;
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion2.getEmpty()) {
                    rememberedValue4 = new FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                FocusRequester focusRequester = (FocusRequester) rememberedValue4;
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) startRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                Strings.Companion companion3 = Strings.Companion;
                String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_dropdown_menu_expanded), startRestartGroup, 0);
                String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_dropdown_menu_collapsed), startRestartGroup, 0);
                String m2983getString2EP1pXo3 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_dropdown_menu_toggle), startRestartGroup, 0);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == companion2.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExposedDropdownMenuAnchorType.m1949boximpl(ExposedDropdownMenuAnchorType.Companion.m1957getPrimaryNotEditableoYjWRB4()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState3 = (MutableState) rememberedValue5;
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == companion2.getEmpty()) {
                    i4 = i3;
                    rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                } else {
                    i4 = i3;
                }
                MutableState mutableState4 = (MutableState) rememberedValue6;
                int i11 = i4 & 14;
                int i12 = i4 & 112;
                boolean changed = startRestartGroup.changed(density) | (i11 == 4) | (i12 == 32) | startRestartGroup.changed(platformWindowBoundsCalculator);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue7 == companion2.getEmpty()) {
                    modifier4 = modifier5;
                    i5 = i11;
                    i6 = i12;
                    i7 = i4;
                    i8 = mo361roundToPx0680j_4;
                    mutableIntState = mutableIntState3;
                    mutableIntState2 = mutableIntState4;
                    windowBoundsCalculator = platformWindowBoundsCalculator;
                    exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(focusRequester, z, mutableState4, m2983getString2EP1pXo, m2983getString2EP1pXo2, m2983getString2EP1pXo3, softwareKeyboardController, mutableState3, kyVar, mutableIntState, mutableIntState2);
                    focusRequester = focusRequester;
                    z2 = z;
                    startRestartGroup.updateRememberedValue(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1);
                } else {
                    z2 = z;
                    i5 = i11;
                    modifier4 = modifier5;
                    i6 = i12;
                    i7 = i4;
                    i8 = mo361roundToPx0680j_4;
                    mutableIntState = mutableIntState3;
                    windowBoundsCalculator = platformWindowBoundsCalculator;
                    exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = rememberedValue7;
                    mutableIntState2 = mutableIntState4;
                }
                ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;
                boolean changedInstance = startRestartGroup.changedInstance(windowBoundsCalculator) | startRestartGroup.changed(i8);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue8 == companion2.getEmpty()) {
                    rememberedValue8 = new mp(windowBoundsCalculator, i8, mutableState2, mutableIntState, mutableIntState2);
                    mutableState = mutableState2;
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                } else {
                    mutableState = mutableState2;
                }
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier4, (ky) rememberedValue8);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                iy constructor = companion4.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting()) {
                    companion = companion4;
                } else {
                    companion = companion4;
                }
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                nyVar2 = nyVar;
                nyVar2.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$12, startRestartGroup, Integer.valueOf((i7 >> 6) & 112));
                startRestartGroup.endNode();
                if (z2) {
                    startRestartGroup.startReplaceGroup(209894723);
                    boolean changedInstance2 = startRestartGroup.changedInstance(windowBoundsCalculator) | startRestartGroup.changed(i8);
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue9 == companion2.getEmpty()) {
                        rememberedValue9 = new iy() { // from class: nu
                            @Override // defpackage.iy
                            public final Object invoke() {
                                w01 ExposedDropdownMenuBox$lambda$18$lambda$17;
                                ExposedDropdownMenuBox$lambda$18$lambda$17 = ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$18$lambda$17(WindowBoundsCalculator.this, i8, mutableState, mutableIntState2);
                                return ExposedDropdownMenuBox$lambda$18$lambda$17;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    ExposedDropdownMenu_androidKt.OnPlatformWindowBoundsChange((iy) rememberedValue9, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(210228190);
                    startRestartGroup.endReplaceGroup();
                }
                int i13 = i5;
                boolean z3 = i13 == 4;
                Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue10 == companion2.getEmpty()) {
                    rememberedValue10 = new cd(3, z2, focusRequester);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                EffectsKt.SideEffect((iy) rememberedValue10, startRestartGroup, 0);
                boolean z4 = i6 == 32;
                Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue11 == companion2.getEmpty()) {
                    i9 = 0;
                    rememberedValue11 = new ou(kyVar, i9);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                } else {
                    i9 = 0;
                }
                BackHandler_androidKt.BackHandler(z2, (iy) rememberedValue11, startRestartGroup, i13, i9);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new ae(z2, kyVar, modifier3, nyVar2, i, i2, 3));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenuBox$lambda$15$lambda$14(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        mutableIntState.setIntValue((int) (layoutCoordinates.mo6242getSizeYbymL2g() >> 32));
        mutableIntState2.setIntValue(calculateMaxHeight(windowBoundsCalculator.getVisibleWindowBounds(), getAnchorBounds(ExposedDropdownMenuBox$lambda$2(mutableState)), i));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenuBox$lambda$18$lambda$17(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState) {
        mutableIntState.setIntValue(calculateMaxHeight(windowBoundsCalculator.getVisibleWindowBounds(), getAnchorBounds(ExposedDropdownMenuBox$lambda$2(mutableState)), i));
        return w01.a;
    }

    private static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenuBox$lambda$20$lambda$19(boolean z, FocusRequester focusRequester) {
        if (z) {
            FocusRequester.m4419requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenuBox$lambda$22$lambda$21(ky kyVar) {
        kyVar.invoke(Boolean.FALSE);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenuBox$lambda$23(boolean z, ky kyVar, Modifier modifier, ny nyVar, int i, int i2, Composer composer, int i3) {
        ExposedDropdownMenuBox(z, kyVar, modifier, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final int calculateMaxHeight(IntRect intRect, Rect rect, int i) {
        if (rect == null) {
            return 0;
        }
        int top = intRect.getTop() + i;
        int bottom = intRect.getBottom() - i;
        return Math.max((rect.getTop() > ((float) intRect.getBottom()) || rect.getBottom() < ((float) intRect.getTop())) ? bottom - top : y80.P(Math.max(rect.getTop() - top, bottom - rect.getBottom())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: expandable-3-2CpT8, reason: not valid java name */
    public static final Modifier m1974expandable32CpT8(Modifier modifier, final boolean z, final iy iyVar, final String str, final MutableState<Boolean> mutableState, String str2, String str3, String str4, SoftwareKeyboardController softwareKeyboardController) {
        return SemanticsModifierKt.semantics$default(KeyInputModifierKt.onPreviewKeyEvent(SuspendingPointerInputFilterKt.pointerInput(modifier, iyVar, new PointerInputEventHandler() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ij0 implements my {
                final /* synthetic */ String $anchorType;
                final /* synthetic */ iy $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(String str, iy iyVar, hm hmVar) {
                    super(hmVar);
                    this.$anchorType = str;
                    this.$onExpandedChange = iyVar;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorType, this.$onExpandedChange, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
                
                    if (r12 == r4) goto L19;
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
                        obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, pointerEventPass, anonymousClass1, 1, null);
                        if (obj != vnVar) {
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
                        if (((PointerInputChange) obj) != null) {
                            anonymousClass1.$onExpandedChange.invoke();
                        }
                        return w01.a;
                    }
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    anonymousClass1 = this;
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    if (ExposedDropdownMenuAnchorType.m1952equalsimpl0(anonymousClass1.$anchorType, ExposedDropdownMenuAnchorType.Companion.m1958getSecondaryEditableoYjWRB4())) {
                        pointerInputChange.consume();
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass2, anonymousClass1);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(str, iyVar, null), hmVar);
                return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
            }
        }), new ky() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$2
            @Override // defpackage.ky
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m1978invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1978invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean m1976isClickZmokQxo;
                boolean m1977isEnterMinusSpacebarZmokQxo;
                m1976isClickZmokQxo = ExposedDropdownMenuKt.m1976isClickZmokQxo(keyEvent);
                if (m1976isClickZmokQxo) {
                    if (ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m1956getPrimaryEditableoYjWRB4())) {
                        m1977isEnterMinusSpacebarZmokQxo = ExposedDropdownMenuKt.m1977isEnterMinusSpacebarZmokQxo(keyEvent);
                        if (m1977isEnterMinusSpacebarZmokQxo) {
                            iyVar.invoke();
                            return Boolean.TRUE;
                        }
                    } else {
                        iyVar.invoke();
                    }
                }
                if (ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m1956getPrimaryEditableoYjWRB4()) && z) {
                    long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
                    Key.Companion companion = Key.Companion;
                    if (Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5860getTabEK5gGoQ()) || Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), companion.m5686getDirectionDownEK5gGoQ()) || Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), companion.m5691getDirectionUpEK5gGoQ())) {
                        MutableState<Boolean> mutableState2 = mutableState;
                        Boolean bool = Boolean.TRUE;
                        mutableState2.setValue(bool);
                        return bool;
                    }
                }
                MutableState<Boolean> mutableState3 = mutableState;
                Boolean bool2 = Boolean.FALSE;
                mutableState3.setValue(bool2);
                return bool2;
            }
        }), false, new pu(str, z, str2, str3, str4, iyVar, softwareKeyboardController), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 expandable_3_2CpT8$lambda$25(String str, boolean z, String str2, String str3, String str4, iy iyVar, SoftwareKeyboardController softwareKeyboardController, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m1958getSecondaryEditableoYjWRB4())) {
            SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
            if (!z) {
                str2 = str3;
            }
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
        } else {
            SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6831getDropdownListo7Vup1c());
        }
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new p9(iyVar, str, softwareKeyboardController, 5), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean expandable_3_2CpT8$lambda$25$lambda$24(iy iyVar, String str, SoftwareKeyboardController softwareKeyboardController) {
        iyVar.invoke();
        if (!ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m1956getPrimaryEditableoYjWRB4()) || softwareKeyboardController == null) {
            return true;
        }
        softwareKeyboardController.show();
        return true;
    }

    private static final Rect getAnchorBounds(LayoutCoordinates layoutCoordinates) {
        return (layoutCoordinates == null || !layoutCoordinates.isAttached()) ? Rect.Companion.getZero() : RectKt.m4556Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m7794toSizeozmzZPI(layoutCoordinates.mo6242getSizeYbymL2g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasGreaterOrEqualPriorityThan-vVDBVkM, reason: not valid java name */
    public static final boolean m1975hasGreaterOrEqualPriorityThanvVDBVkM(String str, String str2) {
        ExposedDropdownMenuAnchorType.Companion companion = ExposedDropdownMenuAnchorType.Companion;
        if (ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, companion.m1957getPrimaryNotEditableoYjWRB4()) || ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, companion.m1956getPrimaryEditableoYjWRB4())) {
            return true;
        }
        if (ExposedDropdownMenuAnchorType.m1952equalsimpl0(str, companion.m1958getSecondaryEditableoYjWRB4())) {
            return ExposedDropdownMenuAnchorType.m1952equalsimpl0(str2, companion.m1958getSecondaryEditableoYjWRB4());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m1976isClickZmokQxo(android.view.KeyEvent keyEvent) {
        if (KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5930getKeyUpCS__XNY())) {
            return m1977isEnterMinusSpacebarZmokQxo(keyEvent) || Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), Key.Companion.m5847getSpacebarEK5gGoQ());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEnterMinusSpacebar-ZmokQxo, reason: not valid java name */
    public static final boolean m1977isEnterMinusSpacebarZmokQxo(android.view.KeyEvent keyEvent) {
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        return Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5685getDirectionCenterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5699getEnterEK5gGoQ()) || Key.m5612equalsimpl0(m5932getKeyZmokQxo, companion.m5796getNumPadEnterEK5gGoQ());
    }

    @er
    public static /* synthetic */ void MenuAnchorType$annotations() {
    }
}
