package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.f30;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.uo;
import defpackage.w01;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidPopup_androidKt {
    private static final int PopupPropertiesBaseFlags = 262144;
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);
    private static final ProvidableCompositionLocal<Boolean> LocalIsInPopupLayout = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalIsInPopupLayout$1.INSTANCE, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:112:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Popup(PopupPositionProvider popupPositionProvider, iy iyVar, PopupProperties popupProperties, my myVar, Composer composer, int i, int i2) {
        int i3;
        iy iyVar2;
        int i4;
        PopupProperties popupProperties2;
        iy iyVar3;
        PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        boolean z;
        String str;
        int i6;
        final LayoutDirection layoutDirection;
        PopupPositionProvider popupPositionProvider2 = popupPositionProvider;
        Composer startRestartGroup = composer.startRestartGroup(-1772091631);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            iyVar2 = iyVar;
            i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                popupProperties2 = popupProperties;
                i3 |= startRestartGroup.changed(popupProperties2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
                }
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    iy iyVar4 = i7 != 0 ? null : iyVar2;
                    PopupProperties popupProperties4 = i4 != 0 ? new PopupProperties(false, false, false, false, false, 31, (dq) null) : popupProperties2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1772091631, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:417)");
                    }
                    View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    String str2 = (String) startRestartGroup.consume(LocalPopupTestTag);
                    LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(myVar, startRestartGroup, (i3 >> 9) & 14);
                    Object[] objArr = new Object[0];
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = AndroidPopup_androidKt$Popup$popupId$1$1.INSTANCE;
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    UUID uuid = (UUID) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue, startRestartGroup, 48);
                    boolean booleanValue = ((Boolean) startRestartGroup.consume(LocalIsInPopupLayout)).booleanValue();
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        i5 = i3;
                        str = str2;
                        i6 = 32;
                        PopupLayout popupLayout = new PopupLayout(iyVar4, popupProperties4, str, view, density, popupPositionProvider2, uuid, booleanValue, null, Fields.RotationX, null);
                        popupPositionProvider2 = popupPositionProvider2;
                        z = true;
                        popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(-297523940, true, new AndroidPopup_androidKt$Popup$popupLayout$1$1$1(popupLayout, rememberUpdatedState)));
                        startRestartGroup.updateRememberedValue(popupLayout);
                        rememberedValue2 = popupLayout;
                    } else {
                        i5 = i3;
                        z = true;
                        str = str2;
                        i6 = 32;
                    }
                    final PopupLayout popupLayout2 = (PopupLayout) rememberedValue2;
                    int i8 = i5;
                    int i9 = i8 & 112;
                    int i10 = i8 & 896;
                    boolean changedInstance = startRestartGroup.changedInstance(popupLayout2) | (i9 == i6 ? z : false) | (i10 == 256 ? z : false) | startRestartGroup.changed(str) | startRestartGroup.changed(layoutDirection2.ordinal());
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new AndroidPopup_androidKt$Popup$2$1(popupLayout2, iyVar4, popupProperties4, str, layoutDirection2);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    EffectsKt.DisposableEffect(popupLayout2, (ky) rememberedValue3, startRestartGroup, 0);
                    boolean changedInstance2 = startRestartGroup.changedInstance(popupLayout2) | (i9 == i6 ? z : false) | (i10 == 256 ? z : false) | startRestartGroup.changed(str) | startRestartGroup.changed(layoutDirection2.ordinal());
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new AndroidPopup_androidKt$Popup$3$1(popupLayout2, iyVar4, popupProperties4, str, layoutDirection2);
                        layoutDirection = layoutDirection2;
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        layoutDirection = layoutDirection2;
                    }
                    EffectsKt.SideEffect((iy) rememberedValue4, startRestartGroup, 0);
                    int i11 = i8 & 14;
                    boolean changedInstance3 = startRestartGroup.changedInstance(popupLayout2) | (i11 == 4 ? z : false);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == companion.getEmpty()) {
                        rememberedValue5 = new AndroidPopup_androidKt$Popup$4$1(popupLayout2, popupPositionProvider2);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    EffectsKt.DisposableEffect(popupPositionProvider2, (ky) rememberedValue5, startRestartGroup, i11);
                    boolean changedInstance4 = startRestartGroup.changedInstance(popupLayout2);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == companion.getEmpty()) {
                        rememberedValue6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    EffectsKt.LaunchedEffect(popupLayout2, (my) rememberedValue6, startRestartGroup, 0);
                    Modifier.Companion companion2 = Modifier.Companion;
                    boolean changedInstance5 = startRestartGroup.changedInstance(popupLayout2);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue7 == companion.getEmpty()) {
                        rememberedValue7 = new AndroidPopup_androidKt$Popup$7$1(popupLayout2);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (ky) rememberedValue7);
                    boolean changedInstance6 = startRestartGroup.changedInstance(popupLayout2) | startRestartGroup.changed(layoutDirection.ordinal());
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (changedInstance6 || rememberedValue8 == companion.getEmpty()) {
                        rememberedValue8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                PopupLayout.this.setParentLayoutDirection(layoutDirection);
                                return MeasureScope.layout$default(measureScope, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
                            }

                            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                            /* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends f30 implements ky {
                                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                                public AnonymousClass1() {
                                    super(1);
                                }

                                @Override // defpackage.ky
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((Placeable.PlacementScope) obj);
                                    return w01.a;
                                }

                                public final void invoke(Placeable.PlacementScope placementScope) {
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue8;
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
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
                    uo.h(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion3.getSetCompositeKeyHash());
                    Updater.m3884reconcileimpl(m3878constructorimpl, companion3.getApplyOnDeactivatedNodeAssertion());
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    iyVar3 = iyVar4;
                    popupProperties3 = popupProperties4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    iyVar3 = iyVar2;
                    popupProperties3 = popupProperties2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new AndroidPopup_androidKt$Popup$9(popupPositionProvider2, iyVar3, popupProperties3, myVar, i, i2));
                    return;
                }
                return;
            }
            popupProperties2 = popupProperties;
            if ((i & 3072) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        iyVar2 = iyVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final my Popup$lambda$0(State<? extends my> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004d  */
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7873PopupK5zGePQ(Alignment alignment, long j, iy iyVar, PopupProperties popupProperties, my myVar, Composer composer, int i, int i2) {
        Alignment alignment2;
        int i3;
        long j2;
        int i4;
        iy iyVar2;
        int i5;
        PopupProperties popupProperties2;
        my myVar2;
        Alignment alignment3;
        long j3;
        iy iyVar3;
        PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(71005054);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            alignment2 = alignment;
        } else if ((i & 6) == 0) {
            alignment2 = alignment;
            i3 = (startRestartGroup.changed(alignment2) ? 4 : 2) | i;
        } else {
            alignment2 = alignment;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                iyVar2 = iyVar;
                i3 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        myVar2 = myVar;
                        i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.Clip : 8192;
                    } else {
                        myVar2 = myVar;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        alignment3 = alignment2;
                        j3 = j2;
                        iyVar3 = iyVar2;
                        popupProperties3 = popupProperties2;
                    } else {
                        alignment3 = i6 != 0 ? Alignment.Companion.getTopStart() : alignment2;
                        j3 = i7 != 0 ? IntOffset.m7733constructorimpl(0L) : j2;
                        iy iyVar4 = i4 != 0 ? null : iyVar2;
                        PopupProperties popupProperties4 = i5 != 0 ? new PopupProperties(false, false, false, false, false, 31, (dq) null) : popupProperties2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(71005054, i3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:386)");
                        }
                        boolean changed = startRestartGroup.changed(popupProperties4.getWindowType()) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | startRestartGroup.changed(popupProperties4.getWindowToken());
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new AlignmentOffsetPositionProvider(alignment3, j3, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        Popup((AlignmentOffsetPositionProvider) rememberedValue, iyVar4, popupProperties4, myVar2, startRestartGroup, (i3 >> 3) & 8176, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        iyVar3 = iyVar4;
                        popupProperties3 = popupProperties4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new AndroidPopup_androidKt$Popup$1(alignment3, j3, iyVar3, popupProperties3, myVar, i, i2));
                        return;
                    }
                    return;
                }
                popupProperties2 = popupProperties;
                if ((i & 24576) != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            iyVar2 = iyVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i & 24576) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        iyVar2 = iyVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i & 24576) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PopupTestTag(String str, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1357513789);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357513789, i2, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:547)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(str), myVar, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidPopup_androidKt$PopupTestTag$1(str, myVar, i));
        }
    }

    private static final void SimpleStack(Modifier modifier, my myVar, Composer composer, int i) {
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        int i2 = ((i << 3) & 112) | ((i >> 3) & 14) | 384;
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        iy constructor = companion.getConstructor();
        int i3 = ((i2 << 6) & 896) | 6;
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
        uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        Updater.m3886setimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
        Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
        myVar.invoke(composer, Integer.valueOf((i3 >> 6) & 14));
        composer.endNode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createFlags(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i = !z ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.SecureOn) {
            i |= 8192;
        }
        return !z2 ? i | Fields.RotationY : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int flagsWithSecureFlagInherited(PopupProperties popupProperties, boolean z) {
        return (popupProperties.getInheritSecurePolicy$ui() && z) ? popupProperties.getFlags$ui() | 8192 : (!popupProperties.getInheritSecurePolicy$ui() || z) ? popupProperties.getFlags$ui() : popupProperties.getFlags$ui() & (-8193);
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalIsInPopupLayout() {
        return LocalIsInPopupLayout;
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final boolean isPopupLayout(View view, String str) {
        if (view instanceof PopupLayout) {
            return str == null || str.equals(((PopupLayout) view).getTestTag());
        }
        return false;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
