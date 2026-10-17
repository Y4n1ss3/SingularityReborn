package androidx.compose.foundation.text;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import defpackage.iy;
import defpackage.k4;
import defpackage.ny;
import defpackage.q6;
import defpackage.uo;
import defpackage.ut;
import defpackage.w01;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {
    private static final xe0 EmptyInlineContent;

    static {
        ut utVar = ut.d;
        EmptyInlineContent = new xe0(utVar, utVar);
    }

    public static final void InlineChildren(AnnotatedString annotatedString, List<AnnotatedString.Range<ny>> list, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1794596951);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(annotatedString) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                AnnotatedString.Range<ny> range = list.get(i4);
                ny component1 = range.component1();
                int component2 = range.component2();
                int component3 = range.component3();
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.INSTANCE;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
                Modifier.Companion companion = Modifier.Companion;
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                iy constructor = companion2.getConstructor();
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
                uo.h(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                component1.invoke(annotatedString.subSequence(component2, component3).getText(), startRestartGroup, 0);
                startRestartGroup.endNode();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(annotatedString, list, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 InlineChildren$lambda$1(AnnotatedString annotatedString, List list, int i, Composer composer, int i2) {
        InlineChildren(annotatedString, list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final boolean hasInlineContent(AnnotatedString annotatedString) {
        return annotatedString.hasStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    public static final xe0 resolveInlineContent(AnnotatedString annotatedString, Map<String, InlineTextContent> map) {
        if (map == null || map.isEmpty()) {
            return EmptyInlineContent;
        }
        List<AnnotatedString.Range<String>> stringAnnotations = annotatedString.getStringAnnotations(InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = stringAnnotations.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<String> range = stringAnnotations.get(i);
            InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new xe0(arrayList, arrayList2);
    }
}
