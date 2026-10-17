package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class wx0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;
    public final /* synthetic */ SharedPreferences f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ty h;
    public final /* synthetic */ boolean i;

    public /* synthetic */ wx0(Context context, boolean z, MutableState mutableState, SharedPreferences sharedPreferences, ky kyVar) {
        this.d = 3;
        this.g = context;
        this.i = z;
        this.e = mutableState;
        this.f = sharedPreferences;
        this.h = kyVar;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        w01 w01Var = w01.a;
        ty tyVar = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                final un unVar = (un) obj4;
                final my myVar = (my) tyVar;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1437292894, intValue, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3630)");
                    }
                    final int i2 = 1;
                    final MutableState mutableState = this.e;
                    final SharedPreferences sharedPreferences = this.f;
                    final boolean z = this.i;
                    o01.a("Navigator Fog", "Enables the fog effect in the navigator background", null, ComposableLambdaKt.rememberComposableLambda(-820562348, true, new my() { // from class: jy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj5, Object obj6) {
                            int i3 = i2;
                            w01 w01Var2 = w01.a;
                            switch (i3) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                        composer2.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1624977613, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3647)");
                                        }
                                        final MutableState mutableState2 = mutableState;
                                        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                                        boolean changed = composer2.changed(mutableState2);
                                        final SharedPreferences sharedPreferences2 = sharedPreferences;
                                        boolean changedInstance = changed | composer2.changedInstance(sharedPreferences2);
                                        final un unVar2 = unVar;
                                        boolean changedInstance2 = changedInstance | composer2.changedInstance(unVar2);
                                        final my myVar2 = myVar;
                                        boolean changedInstance3 = changedInstance2 | composer2.changedInstance(myVar2);
                                        Object rememberedValue = composer2.rememberedValue();
                                        if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                                            final int i4 = 2;
                                            ky kyVar = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i5 = i4;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar3 = myVar2;
                                                    MutableState mutableState3 = mutableState2;
                                                    un unVar3 = unVar2;
                                                    SharedPreferences sharedPreferences3 = sharedPreferences2;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i5) {
                                                        case 0:
                                                            boolean booleanValue2 = bool.booleanValue();
                                                            r6.f(mutableState3, bool, sharedPreferences3, "navigator_fog_enabled", booleanValue2);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar3, hq.d, null, new a01(booleanValue2, myVar3, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue3 = bool.booleanValue();
                                                            r6.f(mutableState3, bool, sharedPreferences3, "infinite_panels_enabled", booleanValue3);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar3, hq.d, null, new a01(booleanValue3, myVar3, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState3, bool, sharedPreferences3, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar3, hq.d, null, new a01(booleanValue4, myVar3, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer2.updateRememberedValue(kyVar);
                                            rememberedValue = kyVar;
                                        }
                                        SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z, null, null, composer2, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-820562348, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3631)");
                                        }
                                        final MutableState mutableState3 = mutableState;
                                        boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
                                        boolean changed2 = composer3.changed(mutableState3);
                                        final SharedPreferences sharedPreferences3 = sharedPreferences;
                                        boolean changedInstance4 = changed2 | composer3.changedInstance(sharedPreferences3);
                                        final un unVar3 = unVar;
                                        boolean changedInstance5 = changedInstance4 | composer3.changedInstance(unVar3);
                                        final my myVar3 = myVar;
                                        boolean changedInstance6 = changedInstance5 | composer3.changedInstance(myVar3);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changedInstance6 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            final int i5 = 0;
                                            ky kyVar2 = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i5;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar32 = myVar3;
                                                    MutableState mutableState32 = mutableState3;
                                                    un unVar32 = unVar3;
                                                    SharedPreferences sharedPreferences32 = sharedPreferences3;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue22, myVar32, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue3 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "infinite_panels_enabled", booleanValue3);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue3, myVar32, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue4, myVar32, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer3.updateRememberedValue(kyVar2);
                                            rememberedValue2 = kyVar2;
                                        }
                                        SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, z, null, null, composer3, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1865574418, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3663)");
                                        }
                                        final MutableState mutableState4 = mutableState;
                                        boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                                        boolean changed3 = composer4.changed(mutableState4);
                                        final SharedPreferences sharedPreferences4 = sharedPreferences;
                                        boolean changedInstance7 = changed3 | composer4.changedInstance(sharedPreferences4);
                                        final un unVar4 = unVar;
                                        boolean changedInstance8 = changedInstance7 | composer4.changedInstance(unVar4);
                                        final my myVar4 = myVar;
                                        boolean changedInstance9 = changedInstance8 | composer4.changedInstance(myVar4);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance9 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                            final int i6 = 1;
                                            ky kyVar3 = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i6;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar32 = myVar4;
                                                    MutableState mutableState32 = mutableState4;
                                                    un unVar32 = unVar4;
                                                    SharedPreferences sharedPreferences32 = sharedPreferences4;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue22, myVar32, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue32, myVar32, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue4, myVar32, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer4.updateRememberedValue(kyVar3);
                                            rememberedValue3 = kyVar3;
                                        }
                                        SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, z, null, null, composer4, 0, 108);
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
            case 1:
                final un unVar2 = (un) obj4;
                final my myVar2 = (my) tyVar;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer2.shouldExecute((intValue2 & 17) != 16, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2053259137, intValue2, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3646)");
                    }
                    final int i3 = 0;
                    final MutableState mutableState2 = this.e;
                    final SharedPreferences sharedPreferences2 = this.f;
                    final boolean z2 = this.i;
                    o01.a("Fixed Panel Scaling", "Makes panels change size with distance", null, ComposableLambdaKt.rememberComposableLambda(-1624977613, true, new my() { // from class: jy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj5, Object obj6) {
                            int i32 = i3;
                            w01 w01Var2 = w01.a;
                            switch (i32) {
                                case 0:
                                    Composer composer22 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    if (!composer22.shouldExecute((intValue22 & 3) != 2, intValue22 & 1)) {
                                        composer22.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1624977613, intValue22, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3647)");
                                        }
                                        final MutableState mutableState22 = mutableState2;
                                        boolean booleanValue = ((Boolean) mutableState22.getValue()).booleanValue();
                                        boolean changed = composer22.changed(mutableState22);
                                        final SharedPreferences sharedPreferences22 = sharedPreferences2;
                                        boolean changedInstance = changed | composer22.changedInstance(sharedPreferences22);
                                        final un unVar22 = unVar2;
                                        boolean changedInstance2 = changedInstance | composer22.changedInstance(unVar22);
                                        final my myVar22 = myVar2;
                                        boolean changedInstance3 = changedInstance2 | composer22.changedInstance(myVar22);
                                        Object rememberedValue = composer22.rememberedValue();
                                        if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                                            final int i4 = 2;
                                            ky kyVar = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i4;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar32 = myVar22;
                                                    MutableState mutableState32 = mutableState22;
                                                    un unVar32 = unVar22;
                                                    SharedPreferences sharedPreferences32 = sharedPreferences22;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue22, myVar32, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue32, myVar32, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue4, myVar32, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer22.updateRememberedValue(kyVar);
                                            rememberedValue = kyVar;
                                        }
                                        SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z2, null, null, composer22, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                        composer3.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-820562348, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3631)");
                                        }
                                        final MutableState mutableState3 = mutableState2;
                                        boolean booleanValue2 = ((Boolean) mutableState3.getValue()).booleanValue();
                                        boolean changed2 = composer3.changed(mutableState3);
                                        final SharedPreferences sharedPreferences3 = sharedPreferences2;
                                        boolean changedInstance4 = changed2 | composer3.changedInstance(sharedPreferences3);
                                        final un unVar3 = unVar2;
                                        boolean changedInstance5 = changedInstance4 | composer3.changedInstance(unVar3);
                                        final my myVar3 = myVar2;
                                        boolean changedInstance6 = changedInstance5 | composer3.changedInstance(myVar3);
                                        Object rememberedValue2 = composer3.rememberedValue();
                                        if (changedInstance6 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            final int i5 = 0;
                                            ky kyVar2 = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i5;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar32 = myVar3;
                                                    MutableState mutableState32 = mutableState3;
                                                    un unVar32 = unVar3;
                                                    SharedPreferences sharedPreferences32 = sharedPreferences3;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue22, myVar32, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue32, myVar32, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue4, myVar32, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer3.updateRememberedValue(kyVar2);
                                            rememberedValue2 = kyVar2;
                                        }
                                        SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, z2, null, null, composer3, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1865574418, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3663)");
                                        }
                                        final MutableState mutableState4 = mutableState2;
                                        boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                                        boolean changed3 = composer4.changed(mutableState4);
                                        final SharedPreferences sharedPreferences4 = sharedPreferences2;
                                        boolean changedInstance7 = changed3 | composer4.changedInstance(sharedPreferences4);
                                        final un unVar4 = unVar2;
                                        boolean changedInstance8 = changedInstance7 | composer4.changedInstance(unVar4);
                                        final my myVar4 = myVar2;
                                        boolean changedInstance9 = changedInstance8 | composer4.changedInstance(myVar4);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance9 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                            final int i6 = 1;
                                            ky kyVar3 = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i6;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar32 = myVar4;
                                                    MutableState mutableState32 = mutableState4;
                                                    un unVar32 = unVar4;
                                                    SharedPreferences sharedPreferences32 = sharedPreferences4;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue22, myVar32, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue32, myVar32, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue4, myVar32, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer4.updateRememberedValue(kyVar3);
                                            rememberedValue3 = kyVar3;
                                        }
                                        SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, z2, null, null, composer4, 0, 108);
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
            case 2:
                final un unVar3 = (un) obj4;
                final my myVar3 = (my) tyVar;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer3.shouldExecute((intValue3 & 17) != 16, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1248843872, intValue3, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3662)");
                    }
                    final int i4 = 2;
                    final MutableState mutableState3 = this.e;
                    final SharedPreferences sharedPreferences3 = this.f;
                    final boolean z3 = this.i;
                    o01.a("Infinite Floating Panels", "Enables infinite floating panels", null, ComposableLambdaKt.rememberComposableLambda(1865574418, true, new my() { // from class: jy0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.my
                        public final Object invoke(Object obj5, Object obj6) {
                            int i32 = i4;
                            w01 w01Var2 = w01.a;
                            switch (i32) {
                                case 0:
                                    Composer composer22 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    if (!composer22.shouldExecute((intValue22 & 3) != 2, intValue22 & 1)) {
                                        composer22.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1624977613, intValue22, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3647)");
                                        }
                                        final MutableState mutableState22 = mutableState3;
                                        boolean booleanValue = ((Boolean) mutableState22.getValue()).booleanValue();
                                        boolean changed = composer22.changed(mutableState22);
                                        final SharedPreferences sharedPreferences22 = sharedPreferences3;
                                        boolean changedInstance = changed | composer22.changedInstance(sharedPreferences22);
                                        final un unVar22 = unVar3;
                                        boolean changedInstance2 = changedInstance | composer22.changedInstance(unVar22);
                                        final my myVar22 = myVar3;
                                        boolean changedInstance3 = changedInstance2 | composer22.changedInstance(myVar22);
                                        Object rememberedValue = composer22.rememberedValue();
                                        if (changedInstance3 || rememberedValue == Composer.Companion.getEmpty()) {
                                            final int i42 = 2;
                                            ky kyVar = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i42;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar32 = myVar22;
                                                    MutableState mutableState32 = mutableState22;
                                                    un unVar32 = unVar22;
                                                    SharedPreferences sharedPreferences32 = sharedPreferences22;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue22, myVar32, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue32, myVar32, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState32, bool, sharedPreferences32, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar32, hq.d, null, new a01(booleanValue4, myVar32, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer22.updateRememberedValue(kyVar);
                                            rememberedValue = kyVar;
                                        }
                                        SwitchKt.Switch(booleanValue, (ky) rememberedValue, null, null, z3, null, null, composer22, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    Composer composer32 = (Composer) obj5;
                                    int intValue32 = ((Integer) obj6).intValue();
                                    if (!composer32.shouldExecute((intValue32 & 3) != 2, intValue32 & 1)) {
                                        composer32.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-820562348, intValue32, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3631)");
                                        }
                                        final MutableState mutableState32 = mutableState3;
                                        boolean booleanValue2 = ((Boolean) mutableState32.getValue()).booleanValue();
                                        boolean changed2 = composer32.changed(mutableState32);
                                        final SharedPreferences sharedPreferences32 = sharedPreferences3;
                                        boolean changedInstance4 = changed2 | composer32.changedInstance(sharedPreferences32);
                                        final un unVar32 = unVar3;
                                        boolean changedInstance5 = changedInstance4 | composer32.changedInstance(unVar32);
                                        final my myVar32 = myVar3;
                                        boolean changedInstance6 = changedInstance5 | composer32.changedInstance(myVar32);
                                        Object rememberedValue2 = composer32.rememberedValue();
                                        if (changedInstance6 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                            final int i5 = 0;
                                            ky kyVar2 = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i5;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar322 = myVar32;
                                                    MutableState mutableState322 = mutableState32;
                                                    un unVar322 = unVar32;
                                                    SharedPreferences sharedPreferences322 = sharedPreferences32;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState322, bool, sharedPreferences322, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar322, hq.d, null, new a01(booleanValue22, myVar322, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState322, bool, sharedPreferences322, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar322, hq.d, null, new a01(booleanValue32, myVar322, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState322, bool, sharedPreferences322, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar322, hq.d, null, new a01(booleanValue4, myVar322, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer32.updateRememberedValue(kyVar2);
                                            rememberedValue2 = kyVar2;
                                        }
                                        SwitchKt.Switch(booleanValue2, (ky) rememberedValue2, null, null, z3, null, null, composer32, 0, 108);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            break;
                                        }
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                        composer4.skipToGroupEnd();
                                        break;
                                    } else {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1865574418, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:3663)");
                                        }
                                        final MutableState mutableState4 = mutableState3;
                                        boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                                        boolean changed3 = composer4.changed(mutableState4);
                                        final SharedPreferences sharedPreferences4 = sharedPreferences3;
                                        boolean changedInstance7 = changed3 | composer4.changedInstance(sharedPreferences4);
                                        final un unVar4 = unVar3;
                                        boolean changedInstance8 = changedInstance7 | composer4.changedInstance(unVar4);
                                        final my myVar4 = myVar3;
                                        boolean changedInstance9 = changedInstance8 | composer4.changedInstance(myVar4);
                                        Object rememberedValue3 = composer4.rememberedValue();
                                        if (changedInstance9 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                            final int i6 = 1;
                                            ky kyVar3 = new ky() { // from class: zx0
                                                @Override // defpackage.ky
                                                public final Object invoke(Object obj7) {
                                                    int i52 = i6;
                                                    w01 w01Var3 = w01.a;
                                                    my myVar322 = myVar4;
                                                    MutableState mutableState322 = mutableState4;
                                                    un unVar322 = unVar4;
                                                    SharedPreferences sharedPreferences322 = sharedPreferences4;
                                                    Boolean bool = (Boolean) obj7;
                                                    switch (i52) {
                                                        case 0:
                                                            boolean booleanValue22 = bool.booleanValue();
                                                            r6.f(mutableState322, bool, sharedPreferences322, "navigator_fog_enabled", booleanValue22);
                                                            nq nqVar = nr.a;
                                                            p01.t(unVar322, hq.d, null, new a01(booleanValue22, myVar322, null, 0), 2);
                                                            break;
                                                        case 1:
                                                            boolean booleanValue32 = bool.booleanValue();
                                                            r6.f(mutableState322, bool, sharedPreferences322, "infinite_panels_enabled", booleanValue32);
                                                            nq nqVar2 = nr.a;
                                                            p01.t(unVar322, hq.d, null, new a01(booleanValue32, myVar322, null, 2), 2);
                                                            break;
                                                        default:
                                                            boolean booleanValue4 = bool.booleanValue();
                                                            r6.f(mutableState322, bool, sharedPreferences322, "panel_scaling_enabled", booleanValue4);
                                                            nq nqVar3 = nr.a;
                                                            p01.t(unVar322, hq.d, null, new a01(booleanValue4, myVar322, null, 1), 2);
                                                            break;
                                                    }
                                                    return w01Var3;
                                                }
                                            };
                                            composer4.updateRememberedValue(kyVar3);
                                            rememberedValue3 = kyVar3;
                                        }
                                        SwitchKt.Switch(booleanValue3, (ky) rememberedValue3, null, null, z3, null, null, composer4, 0, 108);
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
            default:
                Context context = (Context) obj4;
                ky kyVar = (ky) tyVar;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((LazyItemScope) obj).getClass();
                if (!composer4.shouldExecute((intValue4 & 17) != 16, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1805414951, intValue4, -1, "com.lumi.singularity.ui.activities.TweaksScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TweaksActivity.kt:2702)");
                    }
                    o01.a("Double-Tap Fix", "Applies fix for broken Double-Tap Passthrough feature", null, ComposableLambdaKt.rememberComposableLambda(-410361333, true, new ju0(context, this.i, this.e, this.f, kyVar), composer4, 54), composer4, 3126, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }

    public /* synthetic */ wx0(MutableState mutableState, SharedPreferences sharedPreferences, un unVar, my myVar, boolean z, int i) {
        this.d = i;
        this.e = mutableState;
        this.f = sharedPreferences;
        this.g = unVar;
        this.h = myVar;
        this.i = z;
    }
}
