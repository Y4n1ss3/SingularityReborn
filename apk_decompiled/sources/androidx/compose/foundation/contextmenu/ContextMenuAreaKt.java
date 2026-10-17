package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntOffsetKt;
import defpackage.dq;
import defpackage.e1;
import defpackage.g;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.tl;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuAreaKt {
    public static final void ContextMenu(final ContextMenuState contextMenuState, final iy iyVar, Modifier modifier, final ky kyVar, Composer composer, final int i, final int i2) {
        int i3;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        my myVar;
        Composer startRestartGroup = composer.startRestartGroup(-195055274);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(contextMenuState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195055274, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.kt:73)");
            }
            ContextMenuState.Status status = contextMenuState.getStatus();
            if (!(status instanceof ContextMenuState.Status.Open)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    myVar = new my() { // from class: ul
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 ContextMenu$lambda$0;
                            w01 ContextMenu$lambda$2;
                            switch (i5) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    ContextMenu$lambda$0 = ContextMenuAreaKt.ContextMenu$lambda$0(contextMenuState, iyVar, modifier2, kyVar, i, i2, (Composer) obj, intValue);
                                    return ContextMenu$lambda$0;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    ContextMenu$lambda$2 = ContextMenuAreaKt.ContextMenu$lambda$2(contextMenuState, iyVar, modifier2, kyVar, i, i2, (Composer) obj, intValue2);
                                    return ContextMenu$lambda$2;
                            }
                        }
                    };
                    endRestartGroup.updateScope(myVar);
                }
                return;
            }
            ContextMenuState.Status.Open open = (ContextMenuState.Status.Open) status;
            boolean changed = startRestartGroup.changed(open);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                ContextMenuPopupPositionProvider contextMenuPopupPositionProvider = new ContextMenuPopupPositionProvider(IntOffsetKt.m7756roundk4lQ0M(open.m352getOffsetF1C5BW0()), (my) null, 2, (dq) null);
                startRestartGroup.updateRememberedValue(contextMenuPopupPositionProvider);
                rememberedValue = contextMenuPopupPositionProvider;
            }
            composer2 = startRestartGroup;
            ContextMenuUiKt.ContextMenuPopup((ContextMenuPopupPositionProvider) rememberedValue, iyVar, modifier2, kyVar, composer2, i3 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            myVar = new my() { // from class: ul
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 ContextMenu$lambda$0;
                    w01 ContextMenu$lambda$2;
                    switch (i6) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            ContextMenu$lambda$0 = ContextMenuAreaKt.ContextMenu$lambda$0(contextMenuState, iyVar, modifier2, kyVar, i, i2, (Composer) obj, intValue);
                            return ContextMenu$lambda$0;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            ContextMenu$lambda$2 = ContextMenuAreaKt.ContextMenu$lambda$2(contextMenuState, iyVar, modifier2, kyVar, i, i2, (Composer) obj, intValue2);
                            return ContextMenu$lambda$2;
                    }
                }
            };
            endRestartGroup.updateScope(myVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenu$lambda$0(ContextMenuState contextMenuState, iy iyVar, Modifier modifier, ky kyVar, int i, int i2, Composer composer, int i3) {
        ContextMenu(contextMenuState, iyVar, modifier, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenu$lambda$2(ContextMenuState contextMenuState, iy iyVar, Modifier modifier, ky kyVar, int i, int i2, Composer composer, int i3) {
        ContextMenu(contextMenuState, iyVar, modifier, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuArea(ContextMenuState contextMenuState, iy iyVar, ky kyVar, Modifier modifier, boolean z, iy iyVar2, my myVar, Composer composer, int i, int i2) {
        int i3;
        iy iyVar3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        iy iyVar4;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1195420540);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(contextMenuState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            iyVar3 = iyVar;
            i3 |= startRestartGroup.changedInstance(iyVar3) ? 32 : 16;
        } else {
            iyVar3 = iyVar;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    iyVar4 = iyVar2;
                    i3 |= startRestartGroup.changedInstance(iyVar4) ? Fields.RenderEffect : 65536;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                    } else {
                        if (i6 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if (i5 != 0) {
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new e1(17);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            iyVar4 = (iy) rememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1195420540, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.kt:46)");
                        }
                        if (z2) {
                            startRestartGroup.startReplaceGroup(-1095188022);
                            boolean z3 = ((458752 & i3) == 131072) | ((i3 & 14) == 4);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new g(11, iyVar4, contextMenuState);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            modifier3 = ContextMenuGesturesKt.contextMenuGestures(modifier2, (ky) rememberedValue2);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1095031162);
                            startRestartGroup.endReplaceGroup();
                            modifier3 = modifier2;
                        }
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                        uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        myVar.invoke(startRestartGroup, Integer.valueOf((i3 >> 18) & 14));
                        ContextMenu(contextMenuState, iyVar3, null, kyVar, startRestartGroup, (i3 & 126) | ((i3 << 3) & 7168), 4);
                        startRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    boolean z4 = z2;
                    iy iyVar5 = iyVar4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new tl(contextMenuState, iyVar, kyVar, modifier2, z4, iyVar5, myVar, i, i2));
                        return;
                    }
                    return;
                }
                iyVar4 = iyVar2;
                if ((i & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                boolean z42 = z2;
                iy iyVar52 = iyVar4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            iyVar4 = iyVar2;
            if ((i & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            boolean z422 = z2;
            iy iyVar522 = iyVar4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        iyVar4 = iyVar2;
        if ((i & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        boolean z4222 = z2;
        iy iyVar5222 = iyVar4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuArea$lambda$1$0(iy iyVar, ContextMenuState contextMenuState, Offset offset) {
        iyVar.invoke();
        contextMenuState.setStatus(new ContextMenuState.Status.Open(offset.m4526unboximpl(), null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuArea$lambda$3(ContextMenuState contextMenuState, iy iyVar, ky kyVar, Modifier modifier, boolean z, iy iyVar2, my myVar, int i, int i2, Composer composer, int i3) {
        ContextMenuArea(contextMenuState, iyVar, kyVar, modifier, z, iyVar2, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }
}
