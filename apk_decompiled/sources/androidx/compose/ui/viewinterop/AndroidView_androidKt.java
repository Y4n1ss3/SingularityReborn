package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.hl0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.x50;
import defpackage.y40;
import defpackage.z50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt {
    private static final ky NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends View> void AndroidView(ky kyVar, Modifier modifier, ky kyVar2, ky kyVar3, ky kyVar4, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ky kyVar5;
        int i5;
        ky kyVar6;
        int i6;
        ky kyVar7;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-180024211);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(kyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                kyVar5 = kyVar2;
                i3 |= startRestartGroup.changedInstance(kyVar5) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    kyVar6 = kyVar3;
                    i3 |= startRestartGroup.changedInstance(kyVar6) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        kyVar7 = kyVar4;
                        i3 |= startRestartGroup.changedInstance(kyVar7) ? Fields.Clip : 8192;
                        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            modifier3 = i7 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                kyVar5 = null;
                            }
                            if (i5 != 0) {
                                kyVar6 = NoOpUpdate;
                            }
                            if (i6 != 0) {
                                kyVar7 = NoOpUpdate;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)");
                            }
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, FocusGroupNode_androidKt.focusInteropModifier(modifier3));
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            y40 y40Var = (y40) startRestartGroup.consume(x50.a);
                            hl0 hl0Var = (hl0) startRestartGroup.consume(z50.a);
                            if (kyVar5 != null) {
                                startRestartGroup.startReplaceGroup(1313917368);
                                iy createAndroidViewNodeFactory = createAndroidViewNodeFactory(kyVar, startRestartGroup, i3 & 14);
                                if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(createAndroidViewNodeFactory);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                m7866updateViewHolderParams6NefGtU(m3878constructorimpl, materializeModifier, hashCode, density, y40Var, hl0Var, layoutDirection, currentCompositionLocalMap);
                                Updater.m3886setimpl(m3878constructorimpl, kyVar5, AndroidView_androidKt$AndroidView$2$1.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl, kyVar7, AndroidView_androidKt$AndroidView$2$2.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl, kyVar6, AndroidView_androidKt$AndroidView$2$3.INSTANCE);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1314774735);
                                iy createAndroidViewNodeFactory2 = createAndroidViewNodeFactory(kyVar, startRestartGroup, i3 & 14);
                                if (!(startRestartGroup.getApplier() instanceof UiApplier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(createAndroidViewNodeFactory2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                                m7866updateViewHolderParams6NefGtU(m3878constructorimpl2, materializeModifier, hashCode, density, y40Var, hl0Var, layoutDirection, currentCompositionLocalMap);
                                Updater.m3886setimpl(m3878constructorimpl2, kyVar7, AndroidView_androidKt$AndroidView$3$1.INSTANCE);
                                Updater.m3886setimpl(m3878constructorimpl2, kyVar6, AndroidView_androidKt$AndroidView$3$2.INSTANCE);
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        ky kyVar8 = kyVar5;
                        ky kyVar9 = kyVar7;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new AndroidView_androidKt$AndroidView$4(kyVar, modifier3, kyVar8, kyVar6, kyVar9, i, i2));
                            return;
                        }
                        return;
                    }
                    kyVar7 = kyVar4;
                    if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    ky kyVar82 = kyVar5;
                    ky kyVar92 = kyVar7;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                kyVar6 = kyVar3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                kyVar7 = kyVar4;
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                ky kyVar822 = kyVar5;
                ky kyVar922 = kyVar7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            kyVar5 = kyVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            kyVar6 = kyVar3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            kyVar7 = kyVar4;
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            ky kyVar8222 = kyVar5;
            ky kyVar9222 = kyVar7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        kyVar5 = kyVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        kyVar6 = kyVar3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        kyVar7 = kyVar4;
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        ky kyVar82222 = kyVar5;
        ky kyVar92222 = kyVar7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final <T extends View> iy createAndroidViewNodeFactory(ky kyVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)");
        }
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean changedInstance = composer.changedInstance(context) | ((((i & 14) ^ 6) > 4 && composer.changed(kyVar)) || (i & 6) == 4) | composer.changedInstance(rememberCompositionContext) | composer.changedInstance(saveableStateRegistry) | composer.changed(hashCode) | composer.changedInstance(view);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            Object androidView_androidKt$createAndroidViewNodeFactory$1$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1$1(context, kyVar, rememberCompositionContext, saveableStateRegistry, hashCode, view);
            composer.updateRememberedValue(androidView_androidKt$createAndroidViewNodeFactory$1$1);
            rememberedValue = androidView_androidKt$createAndroidViewNodeFactory$1$1;
        }
        iy iyVar = (iy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iyVar;
    }

    public static final ky getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui = layoutNode.getInteropViewFactoryHolder$ui();
        if (interopViewFactoryHolder$ui != null) {
            return (ViewFactoryHolder) interopViewFactoryHolder$ui;
        }
        throw k4.a("Required value was null.");
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m7866updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i, Density density, y40 y40Var, hl0 hl0Var, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m3886setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m3886setimpl(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m3886setimpl(composer, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m3886setimpl(composer, y40Var, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m3886setimpl(composer, hl0Var, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m3886setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
        Updater.m3886setimpl(composer, Integer.valueOf(i), companion.getSetCompositeKeyHash());
    }

    public static final <T extends View> void AndroidView(ky kyVar, Modifier modifier, ky kyVar2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ky kyVar3;
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(kyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            ky kyVar4 = i5 != 0 ? NoOpUpdate : kyVar2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            AndroidView(kyVar, modifier3, null, NoOpUpdate, kyVar4, startRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            kyVar3 = kyVar4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            kyVar3 = kyVar2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidView_androidKt$AndroidView$1(kyVar, modifier2, kyVar3, i, i2));
        }
    }
}
