package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Fields;
import defpackage.aa0;
import defpackage.b40;
import defpackage.ba0;
import defpackage.ca0;
import defpackage.da0;
import defpackage.ea0;
import defpackage.fa0;
import defpackage.kw0;
import defpackage.my;
import defpackage.ny;
import defpackage.oy;
import defpackage.py;
import defpackage.qy;
import defpackage.w01;
import defpackage.w5;
import defpackage.x6;
import defpackage.xe0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    public static final my movableContentOf(final my myVar) {
        return ComposableLambdaKt.composableLambdaInstance(-328108779, true, new w5(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-703201834, true, new ny() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            public final void invoke(Void r3, Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-703201834, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                my.this.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.ny
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((Void) obj, (Composer) obj2, ((Number) obj3).intValue());
                return w01.a;
            }
        })), 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$0(MovableContent movableContent, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-328108779, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:40)");
            }
            composer.insertMovableContent(movableContent, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$1(MovableContent movableContent, Object obj, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1032736913, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:63)");
            }
            composer.insertMovableContent(movableContent, obj);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$2(oy oyVar, xe0 xe0Var, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(xe0Var) : composer.changedInstance(xe0Var) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(561467799, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
            }
            oyVar.invoke(xe0Var.d, xe0Var.e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$3(MovableContent movableContent, Object obj, Object obj2, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-525773808, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:88)");
            }
            composer.insertMovableContent(movableContent, new xe0(obj, obj2));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$4(py pyVar, kw0 kw0Var, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(kw0Var) : composer.changedInstance(kw0Var) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-846116651, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:113)");
            }
            pyVar.invoke(kw0Var.d, kw0Var.e, kw0Var.f, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$5(MovableContent movableContent, Object obj, Object obj2, Object obj3, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1477386365, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
            }
            composer.insertMovableContent(movableContent, new kw0(obj, obj2, obj3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$6(qy qyVar, Object[] objArr, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743481490, i, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:142)");
        }
        qyVar.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentOf$lambda$7(MovableContent movableContent, Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & Fields.TransformOrigin) == 0 ? composer.changed(obj4) : composer.changedInstance(obj4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (composer.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304803723, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:146)");
            }
            composer.insertMovableContent(movableContent, new Object[]{obj, obj2, obj3, obj4});
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public static final <R> ny movableContentWithReceiverOf(ny nyVar) {
        return ComposableLambdaKt.composableLambdaInstance(-1655274392, true, new da0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(668517896, true, new x6(nyVar, 8))), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$0(ny nyVar, Object obj, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(668517896, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:171)");
            }
            nyVar.invoke(obj, composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$1(MovableContent movableContent, Object obj, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1655274392, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
            }
            composer.insertMovableContent(movableContent, obj);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$2(oy oyVar, xe0 xe0Var, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(xe0Var) : composer.changedInstance(xe0Var) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-95003188, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:196)");
            }
            oyVar.invoke(xe0Var.d, xe0Var.e, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$3(MovableContent movableContent, Object obj, Object obj2, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1349529900, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
            }
            composer.insertMovableContent(movableContent, new xe0(obj, obj2));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$4(py pyVar, kw0 kw0Var, Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= (i & 8) == 0 ? composer.changed(kw0Var) : composer.changedInstance(kw0Var) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-963896566, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:221)");
            }
            pyVar.invoke(kw0Var.d, kw0Var.e, kw0Var.f, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$5(MovableContent movableContent, Object obj, Object obj2, Object obj3, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (composer.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2121535275, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:222)");
            }
            composer.insertMovableContent(movableContent, new kw0(obj, obj2, obj3));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$6(qy qyVar, Object[] objArr, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-346590649, i, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:248)");
        }
        qyVar.invoke(objArr[0], objArr[1], objArr[2], objArr[3], composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 movableContentWithReceiverOf$lambda$7(MovableContent movableContent, Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composer.changed(obj) : composer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composer.changed(obj2) : composer.changedInstance(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & Fields.RotationY) == 0 ? composer.changed(obj3) : composer.changedInstance(obj3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & Fields.TransformOrigin) == 0 ? composer.changed(obj4) : composer.changedInstance(obj4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (composer.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572330192, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:252)");
            }
            composer.insertMovableContent(movableContent, new Object[]{obj, obj2, obj3, obj4});
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    public static final <P> ny movableContentOf(ny nyVar) {
        return ComposableLambdaKt.composableLambdaInstance(1032736913, true, new da0(new MovableContent(nyVar), 0));
    }

    public static final <R, P> oy movableContentWithReceiverOf(oy oyVar) {
        return ComposableLambdaKt.composableLambdaInstance(1349529900, true, new ea0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-95003188, true, new b40(oyVar, 2))), 1));
    }

    public static final <P1, P2> oy movableContentOf(oy oyVar) {
        return ComposableLambdaKt.composableLambdaInstance(-525773808, true, new ea0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(561467799, true, new b40(oyVar, 1))), 0));
    }

    public static final <R, P1, P2> py movableContentWithReceiverOf(py pyVar) {
        return ComposableLambdaKt.composableLambdaInstance(2121535275, true, new fa0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-963896566, true, new aa0(1, pyVar))), 1));
    }

    public static final <P1, P2, P3> py movableContentOf(py pyVar) {
        return ComposableLambdaKt.composableLambdaInstance(1477386365, true, new fa0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-846116651, true, new aa0(0, pyVar))), 0));
    }

    public static final <R, P1, P2, P3> qy movableContentWithReceiverOf(qy qyVar) {
        return ComposableLambdaKt.composableLambdaInstance(572330192, true, new ca0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(-346590649, true, new ba0(qyVar, 0))), 0));
    }

    public static final <P1, P2, P3, P4> qy movableContentOf(qy qyVar) {
        return ComposableLambdaKt.composableLambdaInstance(-1304803723, true, new ca0(new MovableContent(ComposableLambdaKt.composableLambdaInstance(743481490, true, new ba0(qyVar, 1))), 1));
    }
}
