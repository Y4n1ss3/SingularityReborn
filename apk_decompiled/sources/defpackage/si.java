package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class si implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ si(boolean z, String str, Role role, iy iyVar) {
        this.d = 0;
        this.e = z;
        this.f = str;
        this.g = role;
        this.h = iyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier clickable_XHw0xAI$lambda$1;
        Modifier textFieldScrollable$lambda$1;
        Modifier triStateToggleable_XHw0xAI$lambda$1;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                clickable_XHw0xAI$lambda$1 = ClickableKt.clickable_XHw0xAI$lambda$1(this.e, (String) obj6, (Role) obj5, (iy) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 1:
                textFieldScrollable$lambda$1 = TextFieldScrollKt.textFieldScrollable$lambda$1((TextFieldScrollerPosition) obj6, this.e, (OverscrollEffect) obj5, (MutableInteractionSource) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 2:
                triStateToggleable_XHw0xAI$lambda$1 = ToggleableKt.triStateToggleable_XHw0xAI$lambda$1((ToggleableState) obj6, this.e, (Role) obj5, (iy) obj4, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                break;
            case 3:
                final un unVar = (un) obj6;
                final rw0 rw0Var = (rw0) obj5;
                final Context context = (Context) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1039550677, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2624)");
                    }
                    final int i2 = 2;
                    final boolean z = this.e;
                    o01.a("Fix Magisk Zygisk", "Clears kernel memory by causing a kernel panic. Please hold power button to reboot.", null, ComposableLambdaKt.rememberComposableLambda(-611824675, true, new my() { // from class: gy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj7, Object obj8) {
                            int i3 = i2;
                            w01 w01Var2 = w01.a;
                            Object obj9 = context;
                            Object obj10 = rw0Var;
                            Object obj11 = unVar;
                            switch (i3) {
                                case 0:
                                    MutableState mutableState = (MutableState) obj11;
                                    SharedPreferences sharedPreferences = (SharedPreferences) obj10;
                                    ky kyVar = (ky) obj9;
                                    Composer composer2 = (Composer) obj7;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                        composer2.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-700257606, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3541)");
                                        }
                                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                                        boolean changed = composer2.changed(mutableState) | composer2.changedInstance(sharedPreferences) | composer2.changed(kyVar);
                                        Object rememberedValue = composer2.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new dy0(sharedPreferences, kyVar, mutableState, 7);
                                            composer2.updateRememberedValue(rememberedValue);
                                        }
                                        SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z, null, null, composer2, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    un unVar2 = (un) obj11;
                                    Context context2 = (Context) obj10;
                                    ky kyVar2 = (ky) obj9;
                                    Composer composer3 = (Composer) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1479965674, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3034)");
                                        }
                                        PaddingValues m757PaddingValuesYgX7TsA$default = PaddingKt.m757PaddingValuesYgX7TsA$default(Dp.m7611constructorimpl(8.0f), 0.0f, 2, null);
                                        Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(90.0f));
                                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        boolean changedInstance = composer3.changedInstance(unVar2) | composer3.changedInstance(context2) | composer3.changed(kyVar2);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            rememberedValue2 = new p9(unVar2, context2, kyVar2, 16);
                                            composer3.updateRememberedValue(rememberedValue2);
                                        }
                                        ButtonKt.Button((iy) rememberedValue2, m812width3ABfNKs, z, m1056RoundedCornerShape0680j_4, null, null, null, m757PaddingValuesYgX7TsA$default, null, gl.m, composer3, 817889328, 368);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    un unVar3 = (un) obj11;
                                    rw0 rw0Var2 = (rw0) obj10;
                                    Context context3 = (Context) obj9;
                                    Composer composer4 = (Composer) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-611824675, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2628)");
                                        }
                                        RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        Modifier m812width3ABfNKs2 = SizeKt.m812width3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(140.0f));
                                        boolean changedInstance2 = composer4.changedInstance(unVar3) | composer4.changedInstance(rw0Var2) | composer4.changedInstance(context3);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                            rememberedValue3 = new p9(unVar3, rw0Var2, context3, 15);
                                            composer4.updateRememberedValue(rememberedValue3);
                                        }
                                        ButtonKt.Button((iy) rememberedValue3, m812width3ABfNKs2, z, m1056RoundedCornerShape0680j_42, null, null, null, null, null, gl.f, composer4, 805306416, 496);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return w01Var2;
                        }
                    }, composer, 54), composer, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 4:
                final un unVar2 = (un) obj6;
                final Context context2 = (Context) obj5;
                final ky kyVar = (ky) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-961975580, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3030)");
                    }
                    final int i3 = 1;
                    final boolean z2 = this.e;
                    o01.a("Boot Animation", "Extracts and mounts the boot animation (and sound overlay, if the pack has one) chosen in the Payload Selector, then soft reboots", null, ComposableLambdaKt.rememberComposableLambda(-1479965674, true, new my() { // from class: gy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj7, Object obj8) {
                            int i32 = i3;
                            w01 w01Var2 = w01.a;
                            Object obj9 = kyVar;
                            Object obj10 = context2;
                            Object obj11 = unVar2;
                            switch (i32) {
                                case 0:
                                    MutableState mutableState = (MutableState) obj11;
                                    SharedPreferences sharedPreferences = (SharedPreferences) obj10;
                                    ky kyVar2 = (ky) obj9;
                                    Composer composer22 = (Composer) obj7;
                                    int intValue22 = ((Integer) obj8).intValue();
                                    if (!composer22.shouldExecute((intValue22 & 3) != 2, intValue22 & 1)) {
                                        composer22.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-700257606, intValue22, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3541)");
                                        }
                                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                                        boolean changed = composer22.changed(mutableState) | composer22.changedInstance(sharedPreferences) | composer22.changed(kyVar2);
                                        Object rememberedValue = composer22.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new dy0(sharedPreferences, kyVar2, mutableState, 7);
                                            composer22.updateRememberedValue(rememberedValue);
                                        }
                                        SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z2, null, null, composer22, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    un unVar22 = (un) obj11;
                                    Context context22 = (Context) obj10;
                                    ky kyVar22 = (ky) obj9;
                                    Composer composer3 = (Composer) obj7;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1479965674, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3034)");
                                        }
                                        PaddingValues m757PaddingValuesYgX7TsA$default = PaddingKt.m757PaddingValuesYgX7TsA$default(Dp.m7611constructorimpl(8.0f), 0.0f, 2, null);
                                        Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(90.0f));
                                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        boolean changedInstance = composer3.changedInstance(unVar22) | composer3.changedInstance(context22) | composer3.changed(kyVar22);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            rememberedValue2 = new p9(unVar22, context22, kyVar22, 16);
                                            composer3.updateRememberedValue(rememberedValue2);
                                        }
                                        ButtonKt.Button((iy) rememberedValue2, m812width3ABfNKs, z2, m1056RoundedCornerShape0680j_4, null, null, null, m757PaddingValuesYgX7TsA$default, null, gl.m, composer3, 817889328, 368);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    un unVar3 = (un) obj11;
                                    rw0 rw0Var2 = (rw0) obj10;
                                    Context context3 = (Context) obj9;
                                    Composer composer4 = (Composer) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-611824675, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2628)");
                                        }
                                        RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        Modifier m812width3ABfNKs2 = SizeKt.m812width3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(140.0f));
                                        boolean changedInstance2 = composer4.changedInstance(unVar3) | composer4.changedInstance(rw0Var2) | composer4.changedInstance(context3);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                            rememberedValue3 = new p9(unVar3, rw0Var2, context3, 15);
                                            composer4.updateRememberedValue(rememberedValue3);
                                        }
                                        ButtonKt.Button((iy) rememberedValue3, m812width3ABfNKs2, z2, m1056RoundedCornerShape0680j_42, null, null, null, null, null, gl.f, composer4, 805306416, 496);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return w01Var2;
                        }
                    }, composer2, 54), composer2, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                final MutableState mutableState = (MutableState) obj6;
                final SharedPreferences sharedPreferences = (SharedPreferences) obj5;
                final ky kyVar2 = (ky) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-672825464, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3540)");
                    }
                    final int i4 = 0;
                    final boolean z3 = this.e;
                    o01.a("System Hang Fix", "Turns Wi-Fi off and on during boot to prevent the system from hanging in certain conditions", null, ComposableLambdaKt.rememberComposableLambda(-700257606, true, new my() { // from class: gy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj7, Object obj8) {
                            int i32 = i4;
                            w01 w01Var2 = w01.a;
                            Object obj9 = kyVar2;
                            Object obj10 = sharedPreferences;
                            Object obj11 = mutableState;
                            switch (i32) {
                                case 0:
                                    MutableState mutableState2 = (MutableState) obj11;
                                    SharedPreferences sharedPreferences2 = (SharedPreferences) obj10;
                                    ky kyVar22 = (ky) obj9;
                                    Composer composer22 = (Composer) obj7;
                                    int intValue22 = ((Integer) obj8).intValue();
                                    if (!composer22.shouldExecute((intValue22 & 3) != 2, intValue22 & 1)) {
                                        composer22.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-700257606, intValue22, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3541)");
                                        }
                                        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                                        boolean changed = composer22.changed(mutableState2) | composer22.changedInstance(sharedPreferences2) | composer22.changed(kyVar22);
                                        Object rememberedValue = composer22.rememberedValue();
                                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new dy0(sharedPreferences2, kyVar22, mutableState2, 7);
                                            composer22.updateRememberedValue(rememberedValue);
                                        }
                                        SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z3, null, null, composer22, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    un unVar22 = (un) obj11;
                                    Context context22 = (Context) obj10;
                                    ky kyVar222 = (ky) obj9;
                                    Composer composer32 = (Composer) obj7;
                                    int intValue32 = ((Integer) obj8).intValue();
                                    if (!composer32.shouldExecute((intValue32 & 3) != 2, intValue32 & 1)) {
                                        composer32.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1479965674, intValue32, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3034)");
                                        }
                                        PaddingValues m757PaddingValuesYgX7TsA$default = PaddingKt.m757PaddingValuesYgX7TsA$default(Dp.m7611constructorimpl(8.0f), 0.0f, 2, null);
                                        Modifier m812width3ABfNKs = SizeKt.m812width3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(90.0f));
                                        RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        boolean changedInstance = composer32.changedInstance(unVar22) | composer32.changedInstance(context22) | composer32.changed(kyVar222);
                                        Object rememberedValue2 = composer32.rememberedValue();
                                        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            rememberedValue2 = new p9(unVar22, context22, kyVar222, 16);
                                            composer32.updateRememberedValue(rememberedValue2);
                                        }
                                        ButtonKt.Button((iy) rememberedValue2, m812width3ABfNKs, z3, m1056RoundedCornerShape0680j_4, null, null, null, m757PaddingValuesYgX7TsA$default, null, gl.m, composer32, 817889328, 368);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    un unVar3 = (un) obj11;
                                    rw0 rw0Var2 = (rw0) obj10;
                                    Context context3 = (Context) obj9;
                                    Composer composer4 = (Composer) obj7;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-611824675, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2628)");
                                        }
                                        RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f));
                                        Modifier m812width3ABfNKs2 = SizeKt.m812width3ABfNKs(Modifier.Companion, Dp.m7611constructorimpl(140.0f));
                                        boolean changedInstance2 = composer4.changedInstance(unVar3) | composer4.changedInstance(rw0Var2) | composer4.changedInstance(context3);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                            rememberedValue3 = new p9(unVar3, rw0Var2, context3, 15);
                                            composer4.updateRememberedValue(rememberedValue3);
                                        }
                                        ButtonKt.Button((iy) rememberedValue3, m812width3ABfNKs2, z3, m1056RoundedCornerShape0680j_42, null, null, null, null, null, gl.f, composer4, 805306416, 496);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                            }
                            return w01Var2;
                        }
                    }, composer3, 54), composer3, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ si(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.d = i;
        this.f = obj;
        this.e = z;
        this.g = obj2;
        this.h = obj3;
    }

    public /* synthetic */ si(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.e = z;
    }
}
