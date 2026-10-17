package androidx.compose.foundation.text.selection;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.ProcessText_androidKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.LocaleList;
import defpackage.hq;
import defpackage.kn;
import defpackage.ky;
import defpackage.ms;
import defpackage.nf0;
import defpackage.nq;
import defpackage.nr;
import defpackage.oy;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviors_androidKt {
    private static final ProvidableCompositionLocal<kn> LocalTextClassifierCoroutineContext = CompositionLocalKt.staticCompositionLocalOf(new ms(20));
    private static oy PlatformSelectionBehaviorsFactory = new nf0();
    private static final long TEXT_CLASSIFICATION_TIMEOUT_MILLIS = 200;
    private static final long TEXT_CLASSIFIER_INITIALIZATION_TIMEOUT_MILLIS = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public static final kn LocalTextClassifierCoroutineContext$lambda$0() {
        nq nqVar = nr.a;
        return hq.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformSelectionBehaviorsImpl PlatformSelectionBehaviorsFactory$lambda$0(kn knVar, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        return new PlatformSelectionBehaviorsImpl(knVar, context, selectedTextType, localeList);
    }

    /* renamed from: addPlatformTextContextMenuItems-71BSaZU, reason: not valid java name */
    public static final void m1499addPlatformTextContextMenuItems71BSaZU(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, boolean z, CharSequence charSequence, TextRange textRange, PlatformSelectionBehaviors platformSelectionBehaviors, ky kyVar) {
        if (charSequence != null && textRange != null && platformSelectionBehaviors != null && (platformSelectionBehaviors instanceof PlatformSelectionBehaviorsImpl)) {
            ((PlatformSelectionBehaviorsImpl) platformSelectionBehaviors).m1496addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(textContextMenuBuilderScope, charSequence, textRange.m7064unboximpl(), kyVar);
            ProcessText_androidKt.m1208addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.m7064unboximpl());
            return;
        }
        kyVar.invoke(textContextMenuBuilderScope);
        if (charSequence == null || textRange == null) {
            return;
        }
        ProcessText_androidKt.m1208addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.m7064unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: canReuse-h5sm0ck, reason: not valid java name */
    public static final boolean m1500canReuseh5sm0ck(TextClassificationResult textClassificationResult, CharSequence charSequence, long j) {
        return TextRange.m7053equalsimpl0(j, textClassificationResult.m1547getSelectiond9O1mEE()) && q10.b(charSequence, textClassificationResult.getText());
    }

    public static final ProvidableCompositionLocal<kn> getLocalTextClassifierCoroutineContext() {
        return LocalTextClassifierCoroutineContext;
    }

    public static final oy getPlatformSelectionBehaviorsFactory() {
        return PlatformSelectionBehaviorsFactory;
    }

    public static final PlatformSelectionBehaviors rememberPlatformSelectionBehaviors(SelectedTextType selectedTextType, LocaleList localeList, Composer composer, int i) {
        composer.startReplaceGroup(430530635);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(430530635, i, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:95)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        kn knVar = (kn) composer.consume(LocalTextClassifierCoroutineContext);
        boolean changed = composer.changed(knVar) | composer.changed(context) | ((((i & 14) ^ 6) > 4 && composer.changed(selectedTextType.ordinal())) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(localeList)) || (i & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (PlatformSelectionBehaviors) PlatformSelectionBehaviorsFactory.invoke(knVar, context, selectedTextType, localeList);
            composer.updateRememberedValue(rememberedValue);
        }
        PlatformSelectionBehaviors platformSelectionBehaviors = (PlatformSelectionBehaviors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return platformSelectionBehaviors;
    }

    public static final void setPlatformSelectionBehaviorsFactory(oy oyVar) {
        PlatformSelectionBehaviorsFactory = oyVar;
    }

    public static /* synthetic */ void getPlatformSelectionBehaviorsFactory$annotations() {
    }
}
