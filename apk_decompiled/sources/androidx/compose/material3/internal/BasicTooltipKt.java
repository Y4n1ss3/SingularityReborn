package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import defpackage.bq;
import defpackage.dq;
import defpackage.f1;
import defpackage.fc;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.k4;
import defpackage.kb0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.oc;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.st;
import defpackage.ud;
import defpackage.un;
import defpackage.us0;
import defpackage.v4;
import defpackage.vd;
import defpackage.vn;
import defpackage.w01;
import defpackage.wr0;
import defpackage.xn;
import defpackage.y80;
import defpackage.yd;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTooltipKt {
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0209, code lost:
    
        if (defpackage.q10.b(r2.rememberedValue(), java.lang.Integer.valueOf(r0)) == false) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTooltipBox(PopupPositionProvider popupPositionProvider, my myVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, boolean z3, my myVar2, Composer composer, int i, int i2) {
        int i3;
        my myVar3;
        int i4;
        Modifier modifier2;
        int i5;
        iy iyVar2;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        TooltipState tooltipState2;
        boolean z5;
        Modifier modifier3;
        iy iyVar3;
        boolean z6;
        ScopeUpdateScope endRestartGroup;
        ComposeUiNode.Companion companion;
        MutableState mutableState;
        int i10;
        int i11;
        boolean z7;
        Composer startRestartGroup = composer.startRestartGroup(-1221877520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            myVar3 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & Fields.RotationY) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    iyVar2 = iyVar;
                    i3 |= startRestartGroup.changedInstance(iyVar2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        i7 = 196608;
                        z4 = z;
                    } else {
                        i7 = 196608;
                        z4 = z;
                        if ((i & 196608) == 0) {
                            i3 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : Fields.BlendMode;
                    }
                    i9 = i2 & Fields.SpotShadowColor;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(z3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        boolean z8 = true;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            Modifier modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
                            iy iyVar4 = i5 != 0 ? null : iyVar2;
                            if (i6 != 0) {
                                z4 = false;
                            }
                            boolean z9 = i8 != 0 ? true : z2;
                            boolean z10 = i9 != 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1221877520, i3, -1, "androidx.compose.material3.internal.BasicTooltipBox (BasicTooltip.kt:103)");
                            }
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            Composer.Companion companion2 = Composer.Companion;
                            if (rememberedValue == companion2.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            un unVar = (un) rememberedValue;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == companion2.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MutableState mutableState2 = (MutableState) rememberedValue2;
                            boolean z11 = z10 && (rememberTouchExplorationOrSwitchAccessServiceState(startRestartGroup, 0).getValue().booleanValue() || ((Boolean) mutableState2.getValue()).booleanValue());
                            Modifier.Companion companion3 = Modifier.Companion;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                            boolean z12 = z11;
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                            iy iyVar5 = iyVar4;
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
                            if (tooltipState.isVisible()) {
                                startRestartGroup.startReplaceGroup(-1891243071);
                                if (z4 || z12) {
                                    i11 = i3;
                                    z7 = true;
                                } else {
                                    i11 = i3;
                                    z7 = false;
                                }
                                i10 = i11;
                                my myVar4 = myVar3;
                                mutableState = mutableState2;
                                TooltipPopup(popupPositionProvider, tooltipState, iyVar5, unVar, z7, mutableState, myVar4, startRestartGroup, (i11 & 14) | i7 | ((i11 >> 3) & 112) | ((i11 >> 6) & 896) | ((i11 << 15) & 3670016));
                                startRestartGroup = startRestartGroup;
                                startRestartGroup.endReplaceGroup();
                            } else {
                                mutableState = mutableState2;
                                i10 = i3;
                                startRestartGroup.startReplaceGroup(-1890863476);
                                startRestartGroup.endReplaceGroup();
                            }
                            tooltipState2 = tooltipState;
                            boolean z13 = z9;
                            boolean z14 = z10;
                            modifier3 = modifier4;
                            WrappedAnchor(z13, tooltipState2, mutableState, z14, modifier3, myVar2, startRestartGroup, ((i10 >> 18) & 14) | 384 | ((i10 >> 3) & 112) | ((i10 >> 12) & 7168) | (57344 & (i10 << 3)) | ((i10 >> 9) & 458752), 0);
                            startRestartGroup.endNode();
                            if ((i10 & 896) != 256 && ((i10 & Fields.RotationY) == 0 || !startRestartGroup.changedInstance(tooltipState2))) {
                                z8 = false;
                            }
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z8 || rememberedValue3 == companion2.getEmpty()) {
                                rememberedValue3 = new defpackage.h(tooltipState2, 7);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            EffectsKt.DisposableEffect(tooltipState2, (ky) rememberedValue3, startRestartGroup, (i10 >> 6) & 14);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z13;
                            z6 = z14;
                            iyVar3 = iyVar5;
                        } else {
                            tooltipState2 = tooltipState;
                            startRestartGroup.skipToGroupEnd();
                            z5 = z2;
                            modifier3 = modifier2;
                            iyVar3 = iyVar2;
                            z6 = z3;
                        }
                        Composer composer2 = startRestartGroup;
                        boolean z15 = z4;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new yd(popupPositionProvider, myVar, tooltipState2, modifier3, iyVar3, z15, z5, z6, myVar2, i, i2));
                            return;
                        }
                        return;
                    }
                    boolean z82 = true;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    Composer composer22 = startRestartGroup;
                    boolean z152 = z4;
                    endRestartGroup = composer22.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                iyVar2 = iyVar;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & Fields.SpotShadowColor;
                if (i9 == 0) {
                }
                if ((i2 & Fields.RotationX) == 0) {
                }
                boolean z822 = true;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                Composer composer222 = startRestartGroup;
                boolean z1522 = z4;
                endRestartGroup = composer222.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            iyVar2 = iyVar;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & Fields.SpotShadowColor;
            if (i9 == 0) {
            }
            if ((i2 & Fields.RotationX) == 0) {
            }
            boolean z8222 = true;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            Composer composer2222 = startRestartGroup;
            boolean z15222 = z4;
            endRestartGroup = composer2222.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar3 = myVar;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        iyVar2 = iyVar;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & Fields.SpotShadowColor;
        if (i9 == 0) {
        }
        if ((i2 & Fields.RotationX) == 0) {
        }
        boolean z82222 = true;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        Composer composer22222 = startRestartGroup;
        boolean z152222 = z4;
        endRestartGroup = composer22222.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicTooltipBox$lambda$4$lambda$3(final TooltipState tooltipState, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltipKt$BasicTooltipBox$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                TooltipState.this.onDispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicTooltipBox$lambda$5(PopupPositionProvider popupPositionProvider, my myVar, TooltipState tooltipState, Modifier modifier, iy iyVar, boolean z, boolean z2, boolean z3, my myVar2, int i, int i2, Composer composer, int i3) {
        BasicTooltipBox(popupPositionProvider, myVar, tooltipState, modifier, iyVar, z, z2, z3, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final TooltipState BasicTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex) {
        return new BasicTooltipStateImpl(z, z2, mutatorMutex);
    }

    public static /* synthetic */ TooltipState BasicTooltipState$default(boolean z, boolean z2, MutatorMutex mutatorMutex, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        return BasicTooltipState(z, z2, mutatorMutex);
    }

    private static final void TooltipPopup(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, iy iyVar, un unVar, boolean z, MutableState<Boolean> mutableState, my myVar, Composer composer, int i) {
        int i2;
        Object obj;
        Object obj2;
        Composer startRestartGroup = composer.startRestartGroup(-1413720282);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = iyVar;
            i2 |= startRestartGroup.changedInstance(obj) ? 256 : Fields.SpotShadowColor;
        } else {
            obj = iyVar;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(unVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            obj2 = mutableState;
            i2 |= startRestartGroup.changed(obj2) ? Fields.RenderEffect : 65536;
        } else {
            obj2 = mutableState;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
        }
        int i3 = i2;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1413720282, i3, -1, "androidx.compose.material3.internal.TooltipPopup (BasicTooltip.kt:169)");
            }
            String description = BasicTooltipStrings.INSTANCE.description(startRestartGroup, 6);
            boolean changedInstance = ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(tooltipState))) | startRestartGroup.changedInstance(unVar) | ((458752 & i3) == 131072);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                ud udVar = new ud(obj, tooltipState, unVar, obj2, 0);
                startRestartGroup.updateRememberedValue(udVar);
                rememberedValue = udVar;
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider, (iy) rememberedValue, new PopupProperties(z, false, false, false, 14, (dq) null), ComposableLambdaKt.rememberComposableLambda(-1287705660, true, new BasicTooltipKt$TooltipPopup$2(description, myVar), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new vd(popupPositionProvider, tooltipState, iyVar, unVar, z, mutableState, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipPopup$lambda$10(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, iy iyVar, un unVar, boolean z, MutableState mutableState, my myVar, int i, Composer composer, int i2) {
        TooltipPopup(popupPositionProvider, tooltipState, iyVar, unVar, z, mutableState, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TooltipPopup$lambda$9$lambda$8(iy iyVar, TooltipState tooltipState, un unVar, MutableState mutableState) {
        if (iyVar != null) {
            iyVar.invoke();
        } else if (tooltipState.isVisible()) {
            p01.t(unVar, null, null, new BasicTooltipKt$TooltipPopup$1$1$1(tooltipState, null), 3);
            mutableState.setValue(Boolean.FALSE);
        }
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void WrappedAnchor(boolean z, TooltipState tooltipState, MutableState<Boolean> mutableState, boolean z2, Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        MutableState<Boolean> mutableState2;
        boolean z3;
        int i4;
        Modifier modifier2;
        int i5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1873232064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(tooltipState) : startRestartGroup.changedInstance(tooltipState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            mutableState2 = mutableState;
        } else {
            mutableState2 = mutableState;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(mutableState2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
                }
                i5 = i3;
                if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    if (i4 != 0) {
                        modifier2 = Modifier.Companion;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1873232064, i5, -1, "androidx.compose.material3.internal.WrappedAnchor (BasicTooltip.kt:146)");
                    }
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    un unVar = (un) rememberedValue;
                    Modifier keyboardBehavior = keyboardBehavior(anchorSemantics(handleGestures(modifier2, z, tooltipState), BasicTooltipStrings.INSTANCE.label(startRestartGroup, 6), z, tooltipState, unVar), z, tooltipState, unVar, z3, mutableState2);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, keyboardBehavior);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
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
                    my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (fc.l(myVar, startRestartGroup, (i5 >> 15) & 14)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                }
                Modifier modifier3 = modifier2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new oc(z, tooltipState, mutableState, z2, modifier3, myVar, i, i2));
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i2 & 32) != 0) {
            }
            i5 = i3;
            if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            Modifier modifier32 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z2;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 32) != 0) {
        }
        i5 = i3;
        if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        Modifier modifier322 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 WrappedAnchor$lambda$7(boolean z, TooltipState tooltipState, MutableState mutableState, boolean z2, Modifier modifier, my myVar, int i, int i2, Composer composer, int i3) {
        WrappedAnchor(z, tooltipState, mutableState, z2, modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final Modifier anchorSemantics(Modifier modifier, String str, boolean z, TooltipState tooltipState, un unVar) {
        return z ? ChildParentSemanticsKt.parentSemantics(modifier, new f1(str, unVar, tooltipState, 4)) : modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 anchorSemantics$lambda$12(String str, un unVar, TooltipState tooltipState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str, new v4(8, unVar, tooltipState));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean anchorSemantics$lambda$12$lambda$11(un unVar, TooltipState tooltipState) {
        p01.t(unVar, null, null, new BasicTooltipKt$anchorSemantics$1$1$1(tooltipState, null), 3);
        return true;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z, final TooltipState tooltipState) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, tooltipState, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object n = p10.n(new AnonymousClass1(pointerInputScope, TooltipState.this, null), hmVar);
                return n == vn.d ? n : w01.a;
            }

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {ComposerKt.providerValuesKey}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ TooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, hm hmVar) {
                    super(2, hmVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = tooltipState;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
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
                        un unVar = (un) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00221 c00221 = new C00221(unVar, this.$state, null);
                        this.label = 1;
                        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, c00221, this);
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

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {210, 216, 238}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00221 extends ij0 implements my {
                    final /* synthetic */ un $$this$coroutineScope;
                    final /* synthetic */ TooltipState $state;
                    long J$0;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {217}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00231 extends ij0 implements my {
                        final /* synthetic */ PointerEventPass $pass;
                        private /* synthetic */ Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00231(PointerEventPass pointerEventPass, hm hmVar) {
                            super(hmVar);
                            this.$pass = pointerEventPass;
                        }

                        @Override // defpackage.mc
                        public final hm create(Object obj, hm hmVar) {
                            C00231 c00231 = new C00231(this.$pass, hmVar);
                            c00231.L$0 = obj;
                            return c00231;
                        }

                        @Override // defpackage.my
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                            return ((C00231) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                        }

                        @Override // defpackage.mc
                        public final Object invokeSuspend(Object obj) {
                            int i = this.label;
                            if (i != 0) {
                                if (i == 1) {
                                    p10.Q(obj);
                                    return obj;
                                }
                                o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            p10.Q(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            PointerEventPass pointerEventPass = this.$pass;
                            this.label = 1;
                            Object waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, this);
                            vn vnVar = vn.d;
                            return waitForUpOrCancellation == vnVar ? vnVar : waitForUpOrCancellation;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00221(un unVar, TooltipState tooltipState, hm hmVar) {
                        super(hmVar);
                        this.$$this$coroutineScope = unVar;
                        this.$state = tooltipState;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00221 c00221 = new C00221(this.$$this$coroutineScope, this.$state, hmVar);
                        c00221.L$0 = obj;
                        return c00221;
                    }

                    @Override // defpackage.my
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                        return ((C00221) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
                    
                        if (r15 == r5) goto L36;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r14v1 */
                    /* JADX WARN: Type inference failed for: r14v12 */
                    /* JADX WARN: Type inference failed for: r14v17 */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        Throwable th;
                        ?? r14;
                        AwaitPointerEventScope awaitPointerEventScope;
                        long longPressTimeoutMillis;
                        C00221 c00221;
                        kb0 kb0Var;
                        PointerEventPass pointerEventPass;
                        kb0 kb0Var2;
                        int i = this.label;
                        vn vnVar = vn.d;
                        try {
                            if (i == 0) {
                                p10.Q(obj);
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                wr0 b = p10.b(Boolean.FALSE);
                                longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                this.L$0 = awaitPointerEventScope;
                                this.L$1 = b;
                                this.L$2 = pointerEventPass2;
                                this.J$0 = longPressTimeoutMillis;
                                this.label = 1;
                                c00221 = this;
                                Object awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, pointerEventPass2, c00221, 1, null);
                                if (awaitFirstDown$default != vnVar) {
                                    obj = awaitFirstDown$default;
                                    kb0Var = b;
                                    pointerEventPass = pointerEventPass2;
                                }
                                return vnVar;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        o.f("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    kb0Var = (kb0) this.L$0;
                                    p10.Q(obj);
                                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                                    if (pointerInputChange != null) {
                                        pointerInputChange.consume();
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    wr0 wr0Var = (wr0) kb0Var;
                                    wr0Var.getClass();
                                    wr0Var.j(null, bool);
                                    return w01.a;
                                }
                                pointerEventPass = (PointerEventPass) this.L$2;
                                kb0Var2 = (kb0) this.L$1;
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                try {
                                    p10.Q(obj);
                                    Boolean bool2 = Boolean.FALSE;
                                    wr0 wr0Var2 = (wr0) kb0Var2;
                                    wr0Var2.getClass();
                                    wr0Var2.j(null, bool2);
                                } catch (PointerEventTimeoutCancellationException unused) {
                                    c00221 = this;
                                    kb0Var = kb0Var2;
                                    p01.t(c00221.$$this$coroutineScope, null, xn.g, new AnonymousClass3(kb0Var, c00221.$state, null), 1);
                                    c00221.L$0 = kb0Var;
                                    c00221.L$1 = null;
                                    c00221.L$2 = null;
                                    c00221.label = 3;
                                    obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, c00221);
                                } catch (Throwable th2) {
                                    th = th2;
                                    r14 = kb0Var2;
                                    Boolean bool3 = Boolean.FALSE;
                                    wr0 wr0Var3 = (wr0) r14;
                                    wr0Var3.getClass();
                                    wr0Var3.j(null, bool3);
                                    throw th;
                                }
                                return w01.a;
                            }
                            long j = this.J$0;
                            pointerEventPass = (PointerEventPass) this.L$2;
                            kb0 kb0Var3 = (kb0) this.L$1;
                            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            p10.Q(obj);
                            longPressTimeoutMillis = j;
                            awaitPointerEventScope = awaitPointerEventScope2;
                            c00221 = this;
                            kb0Var = kb0Var3;
                            int m6104getTypeT8wyACA = ((PointerInputChange) obj).m6104getTypeT8wyACA();
                            PointerType.Companion companion = PointerType.Companion;
                            if (PointerType.m6174equalsimpl0(m6104getTypeT8wyACA, companion.m6181getTouchT8wyACA()) || PointerType.m6174equalsimpl0(m6104getTypeT8wyACA, companion.m6180getStylusT8wyACA())) {
                                try {
                                    C00231 c00231 = new C00231(pointerEventPass, null);
                                    c00221.L$0 = awaitPointerEventScope;
                                    c00221.L$1 = kb0Var;
                                    c00221.L$2 = pointerEventPass;
                                    c00221.label = 2;
                                    if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, c00231, c00221) != vnVar) {
                                        kb0Var2 = kb0Var;
                                        Boolean bool22 = Boolean.FALSE;
                                        wr0 wr0Var22 = (wr0) kb0Var2;
                                        wr0Var22.getClass();
                                        wr0Var22.j(null, bool22);
                                    }
                                } catch (PointerEventTimeoutCancellationException unused2) {
                                    p01.t(c00221.$$this$coroutineScope, null, xn.g, new AnonymousClass3(kb0Var, c00221.$state, null), 1);
                                    c00221.L$0 = kb0Var;
                                    c00221.L$1 = null;
                                    c00221.L$2 = null;
                                    c00221.label = 3;
                                    obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, c00221);
                                }
                                return vnVar;
                            }
                            return w01.a;
                        } catch (Throwable th3) {
                            th = th3;
                            this = this;
                        }
                    }

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, 227, 227}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3, reason: invalid class name */
                    public static final class AnonymousClass3 extends us0 implements my {
                        final /* synthetic */ kb0 $isLongPressedFlow;
                        final /* synthetic */ TooltipState $state;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass3(kb0 kb0Var, TooltipState tooltipState, hm hmVar) {
                            super(2, hmVar);
                            this.$isLongPressedFlow = kb0Var;
                            this.$state = tooltipState;
                        }

                        @Override // defpackage.mc
                        public final hm create(Object obj, hm hmVar) {
                            return new AnonymousClass3(this.$isLongPressedFlow, this.$state, hmVar);
                        }

                        @Override // defpackage.my
                        public final Object invoke(un unVar, hm hmVar) {
                            return ((AnonymousClass3) create(unVar, hmVar)).invokeSuspend(w01.a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
                        
                            if (defpackage.y80.k(r7, r0, r6) == r5) goto L30;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
                        
                            if (r7.show(r0, r6) == r5) goto L30;
                         */
                        @Override // defpackage.mc
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invokeSuspend(Object obj) {
                            Throwable th;
                            int i = this.label;
                            vn vnVar = vn.d;
                            try {
                            } catch (Throwable th2) {
                                if (!this.$state.isVisible()) {
                                    throw th2;
                                }
                                kb0 kb0Var = this.$isLongPressedFlow;
                                C00241 c00241 = new C00241(this.$state, null);
                                this.L$0 = th2;
                                this.label = 3;
                                if (y80.k(kb0Var, c00241, this) != vnVar) {
                                    th = th2;
                                }
                                return vnVar;
                            }
                            if (i == 0) {
                                p10.Q(obj);
                                ((wr0) this.$isLongPressedFlow).i(Boolean.TRUE);
                                TooltipState tooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                                this.label = 1;
                            } else {
                                if (i != 1) {
                                    if (i == 2) {
                                        p10.Q(obj);
                                        return w01.a;
                                    }
                                    if (i != 3) {
                                        o.f("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    th = (Throwable) this.L$0;
                                    p10.Q(obj);
                                    throw th;
                                }
                                p10.Q(obj);
                            }
                            if (this.$state.isVisible()) {
                                kb0 kb0Var2 = this.$isLongPressedFlow;
                                C00241 c002412 = new C00241(this.$state, null);
                                this.label = 2;
                            }
                            return w01.a;
                        }

                        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                        @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
                        public static final class C00241 extends us0 implements my {
                            final /* synthetic */ TooltipState $state;
                            /* synthetic */ boolean Z$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C00241(TooltipState tooltipState, hm hmVar) {
                                super(2, hmVar);
                                this.$state = tooltipState;
                            }

                            @Override // defpackage.mc
                            public final hm create(Object obj, hm hmVar) {
                                C00241 c00241 = new C00241(this.$state, hmVar);
                                c00241.Z$0 = ((Boolean) obj).booleanValue();
                                return c00241;
                            }

                            public final Object invoke(boolean z, hm hmVar) {
                                return ((C00241) create(Boolean.valueOf(z), hmVar)).invokeSuspend(w01.a);
                            }

                            @Override // defpackage.mc
                            public final Object invokeSuspend(Object obj) {
                                if (this.label != 0) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                                if (!this.Z$0) {
                                    this.$state.dismiss();
                                }
                                return w01.a;
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                return invoke(((Boolean) obj).booleanValue(), (hm) obj2);
                            }
                        }
                    }
                }
            }
        }), tooltipState, new PointerInputEventHandler() { // from class: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ TooltipState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                private /* synthetic */ Object L$0;
                int label;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00251 extends ij0 implements my {
                    final /* synthetic */ un $$this$coroutineScope;
                    final /* synthetic */ TooltipState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    @bq(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00261 extends us0 implements my {
                        final /* synthetic */ TooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00261(TooltipState tooltipState, hm hmVar) {
                            super(2, hmVar);
                            this.$state = tooltipState;
                        }

                        @Override // defpackage.mc
                        public final hm create(Object obj, hm hmVar) {
                            return new C00261(this.$state, hmVar);
                        }

                        @Override // defpackage.my
                        public final Object invoke(un unVar, hm hmVar) {
                            return ((C00261) create(unVar, hmVar)).invokeSuspend(w01.a);
                        }

                        @Override // defpackage.mc
                        public final Object invokeSuspend(Object obj) {
                            int i = this.label;
                            if (i == 0) {
                                p10.Q(obj);
                                TooltipState tooltipState = this.$state;
                                MutatePriority mutatePriority = MutatePriority.UserInput;
                                this.label = 1;
                                Object show = tooltipState.show(mutatePriority, this);
                                vn vnVar = vn.d;
                                if (show == vnVar) {
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
                    public C00251(un unVar, TooltipState tooltipState, hm hmVar) {
                        super(hmVar);
                        this.$$this$coroutineScope = unVar;
                        this.$state = tooltipState;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00251 c00251 = new C00251(this.$$this$coroutineScope, this.$state, hmVar);
                        c00251.L$0 = obj;
                        return c00251;
                    }

                    @Override // defpackage.my
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                        return ((C00251) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[RETURN] */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                        /*
                            r6 = this;
                            int r0 = r6.label
                            r1 = 0
                            r2 = 1
                            if (r0 == 0) goto L1a
                            if (r0 != r2) goto L14
                            java.lang.Object r0 = r6.L$1
                            androidx.compose.ui.input.pointer.PointerEventPass r0 = (androidx.compose.ui.input.pointer.PointerEventPass) r0
                            java.lang.Object r3 = r6.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                            defpackage.p10.Q(r7)
                            goto L33
                        L14:
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            defpackage.o.f(r6)
                            return r1
                        L1a:
                            defpackage.p10.Q(r7)
                            java.lang.Object r7 = r6.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
                            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                            r3 = r7
                        L24:
                            r6.L$0 = r3
                            r6.L$1 = r0
                            r6.label = r2
                            java.lang.Object r7 = r3.awaitPointerEvent(r0, r6)
                            vn r4 = defpackage.vn.d
                            if (r7 != r4) goto L33
                            return r4
                        L33:
                            androidx.compose.ui.input.pointer.PointerEvent r7 = (androidx.compose.ui.input.pointer.PointerEvent) r7
                            java.util.List r4 = r7.getChanges()
                            r5 = 0
                            java.lang.Object r4 = r4.get(r5)
                            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                            int r4 = r4.m6104getTypeT8wyACA()
                            androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.Companion
                            int r5 = r5.m6179getMouseT8wyACA()
                            boolean r4 = androidx.compose.ui.input.pointer.PointerType.m6174equalsimpl0(r4, r5)
                            if (r4 == 0) goto L24
                            int r7 = r7.m6034getType7fucELk()
                            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                            int r5 = r4.m6045getEnter7fucELk()
                            boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m6041equalsimpl0(r7, r5)
                            if (r5 == 0) goto L6e
                            un r7 = r6.$$this$coroutineScope
                            androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r4 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                            androidx.compose.material3.TooltipState r5 = r6.$state
                            r4.<init>(r5, r1)
                            r5 = 3
                            defpackage.p01.t(r7, r1, r1, r4, r5)
                            goto L24
                        L6e:
                            int r4 = r4.m6046getExit7fucELk()
                            boolean r7 = androidx.compose.ui.input.pointer.PointerEventType.m6041equalsimpl0(r7, r4)
                            if (r7 == 0) goto L24
                            androidx.compose.material3.TooltipState r7 = r6.$state
                            r7.dismiss()
                            goto L24
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2.AnonymousClass1.C00251.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PointerInputScope pointerInputScope, TooltipState tooltipState, hm hmVar) {
                    super(2, hmVar);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = tooltipState;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_pointerInput, this.$state, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
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
                        un unVar = (un) this.L$0;
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C00251 c00251 = new C00251(unVar, this.$state, null);
                        this.label = 1;
                        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(c00251, this);
                        vn vnVar = vn.d;
                        if (awaitPointerEventScope == vnVar) {
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
                Object n = p10.n(new AnonymousClass1(pointerInputScope, TooltipState.this, null), hmVar);
                return n == vn.d ? n : w01.a;
            }
        }) : modifier;
    }

    private static final Modifier keyboardBehavior(Modifier modifier, boolean z, final TooltipState tooltipState, un unVar, final boolean z2, final MutableState<Boolean> mutableState) {
        if (z) {
            return KeyInputModifierKt.onPreviewKeyEvent(FocusChangedModifierKt.onFocusChanged(modifier, new defpackage.g(6, unVar, tooltipState)), new ky() { // from class: androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$2
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return m2889invokeZmokQxo(((KeyEvent) obj).m5921unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m2889invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (!TooltipState.this.isVisible()) {
                        mutableState.setValue(Boolean.FALSE);
                    }
                    if (!z2 || !KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY()) || !Key.m5612equalsimpl0(KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent), Key.Companion.m5860getTabEK5gGoQ()) || !TooltipState.this.isVisible()) {
                        return Boolean.FALSE;
                    }
                    MutableState<Boolean> mutableState2 = mutableState;
                    Boolean bool = Boolean.TRUE;
                    mutableState2.setValue(bool);
                    return bool;
                }
            });
        }
        mutableState.setValue(Boolean.FALSE);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 keyboardBehavior$lambda$13(un unVar, TooltipState tooltipState, FocusState focusState) {
        p01.t(unVar, null, null, new BasicTooltipKt$keyboardBehavior$1$1(focusState, tooltipState, null), 3);
        return w01.a;
    }

    public static final TooltipState rememberBasicTooltipState(boolean z, boolean z2, MutatorMutex mutatorMutex, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            mutatorMutex = BasicTooltipDefaults.INSTANCE.getGlobalMutatorMutex();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1483057531, i, -1, "androidx.compose.material3.internal.rememberBasicTooltipState (BasicTooltip.kt:346)");
        }
        boolean z3 = ((((i & 112) ^ 48) > 32 && composer.changed(z2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(mutatorMutex)) || (i & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTooltipStateImpl(z, z2, mutatorMutex);
            composer.updateRememberedValue(rememberedValue);
        }
        BasicTooltipStateImpl basicTooltipStateImpl = (BasicTooltipStateImpl) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTooltipStateImpl;
    }

    private static final State<Boolean> rememberTouchExplorationOrSwitchAccessServiceState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1960751094, i, -1, "androidx.compose.material3.internal.rememberTouchExplorationOrSwitchAccessServiceState (BasicTooltip.kt:456)");
        }
        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(true, true, false, composer, 438, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberAccessibilityServiceState;
    }
}
