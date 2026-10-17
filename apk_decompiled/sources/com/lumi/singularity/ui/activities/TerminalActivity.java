package com.lumi.singularity.ui.activities;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.lumi.singularity.ui.activities.TerminalActivity;
import defpackage.ek;
import defpackage.my;
import defpackage.vu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TerminalActivity extends vu0 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.vu0, defpackage.dk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final boolean hasExtra = getIntent().hasExtra("is_rooted");
        final boolean booleanExtra = getIntent().getBooleanExtra("is_rooted", false);
        ek.a(this, ComposableLambdaKt.composableLambdaInstance(-861191698, true, new my() { // from class: ot0
            @Override // defpackage.my
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = TerminalActivity.v;
                int i2 = 0;
                boolean shouldExecute = composer.shouldExecute((intValue & 3) != 2, intValue & 1);
                w01 w01Var = w01.a;
                if (!shouldExecute) {
                    composer.skipToGroupEnd();
                    return w01Var;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-861191698, intValue, -1, "com.lumi.singularity.ui.activities.TerminalActivity.onCreate.<anonymous> (TerminalActivity.kt:48)");
                }
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                Object empty = companion.getEmpty();
                boolean z = hasExtra;
                hm hmVar = null;
                if (rememberedValue == empty) {
                    rememberedValue = uo.a(z ? booleanExtra : false, null, 2, null, composer);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                boolean changed = composer.changed(z);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new qt0(z, mutableState, hmVar, i2);
                    composer.updateRememberedValue(rememberedValue2);
                }
                EffectsKt.LaunchedEffect(w01Var, (my) rememberedValue2, composer, 6);
                MaterialThemeKt.MaterialTheme(y90.a(composer), null, null, ComposableLambdaKt.rememberComposableLambda(1840259522, true, new pt0((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), mutableState, i2), composer, 54), composer, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return w01Var;
            }
        }));
    }
}
