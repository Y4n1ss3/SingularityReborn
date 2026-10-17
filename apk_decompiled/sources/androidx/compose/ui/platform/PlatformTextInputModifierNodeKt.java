package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.Owner;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformTextInputModifierNodeKt {
    private static final ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> LocalChainedPlatformTextInputInterceptor = CompositionLocalKt.staticCompositionLocalOf(PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1.INSTANCE);

    public static final void InterceptPlatformTextInput(PlatformTextInputInterceptor platformTextInputInterceptor, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1892278287);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(platformTextInputInterceptor) : startRestartGroup.changedInstance(platformTextInputInterceptor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1892278287, i2, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:155)");
            }
            ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> providableCompositionLocal = LocalChainedPlatformTextInputInterceptor;
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) startRestartGroup.consume(providableCompositionLocal);
            boolean changed = startRestartGroup.changed(chainedPlatformTextInputInterceptor);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (ChainedPlatformTextInputInterceptor) rememberedValue;
            chainedPlatformTextInputInterceptor2.updateInterceptor(platformTextInputInterceptor);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(chainedPlatformTextInputInterceptor2), myVar, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(platformTextInputInterceptor, myVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object establishTextInputSession(PlatformTextInputModifierNode platformTextInputModifierNode, my myVar, hm hmVar) {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        int i;
        if (hmVar instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) hmVar;
            int i2 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
                i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (!platformTextInputModifierNode.getNode().isAttached()) {
                        o.m("establishTextInputSession called from an unattached node");
                        return null;
                    }
                    Owner requireOwner = DelegatableNodeKt.requireOwner(platformTextInputModifierNode);
                    ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) DelegatableNodeKt.requireLayoutNode(platformTextInputModifierNode).getCompositionLocalMap().get(LocalChainedPlatformTextInputInterceptor);
                    platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
                    Object interceptedTextInputSession = interceptedTextInputSession(requireOwner, chainedPlatformTextInputInterceptor, myVar, platformTextInputModifierNodeKt$establishTextInputSession$1);
                    vn vnVar = vn.d;
                    if (interceptedTextInputSession == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                o.j();
                return null;
            }
        }
        platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(hmVar);
        Object obj2 = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r5.textInputSession(r7, r0) == r8) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r6.textInputSession(r5, r7, r0) == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object interceptedTextInputSession(Owner owner, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, my myVar, hm hmVar) {
        PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        int i;
        if (hmVar instanceof PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) hmVar;
            int i2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = i2 - Integer.MIN_VALUE;
                Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
                i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    Object obj2 = vn.d;
                    if (chainedPlatformTextInputInterceptor == null) {
                        platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 1;
                    } else {
                        platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 2;
                    }
                    return obj2;
                }
                if (i == 1) {
                    p10.Q(obj);
                    o.j();
                    return null;
                }
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                o.j();
                return null;
            }
        }
        platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(hmVar);
        Object obj3 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
        i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
        if (i != 0) {
        }
    }
}
