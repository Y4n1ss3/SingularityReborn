package defpackage;

import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class l2 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;

    public /* synthetic */ l2(int i, iy iyVar) {
        this.d = i;
        this.e = iyVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        iy iyVar = this.e;
        w01 w01Var = w01.a;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1002662135, intValue, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous> (AdbActivity.kt:102)");
                    }
                    ComposableLambda composableLambda = uk.a;
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-517026447, true, new l2(i2, iyVar), composer, 54);
                    TopAppBarDefaults topAppBarDefaults = TopAppBarDefaults.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    AppBarKt.m1624TopAppBarGHTll3U(composableLambda, null, rememberComposableLambda, null, 0.0f, null, topAppBarDefaults.m2822topAppBarColors5tl4gsc(materialTheme.getColorScheme(composer, i3).m1773getPrimaryContainer0d7_KjU(), 0L, 0L, materialTheme.getColorScheme(composer, i3).m1757getOnPrimaryContainer0d7_KjU(), 0L, 0L, composer, TopAppBarDefaults.$stable << 18, 54), null, composer, 390, 186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-517026447, intValue2, -1, "com.lumi.singularity.ui.activities.AdbScreen.<anonymous>.<anonymous> (AdbActivity.kt:105)");
                    }
                    IconButtonKt.IconButton(this.e, null, false, null, null, null, uk.b, composer2, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1236012829, intValue3, -1, "com.lumi.singularity.ui.activities.AdbConnectScreen.<anonymous>.<anonymous> (AdbRootActivity.kt:245)");
                    }
                    IconButtonKt.IconButton(this.e, null, false, null, null, null, vk.a, composer3, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (!composer4.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                    composer4.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1147143293, intValue4, -1, "com.lumi.singularity.ui.activities.LaunchStartAppOnBootDialog.<anonymous> (AppsActivity.kt:1445)");
                    }
                    ButtonKt.TextButton(this.e, null, false, null, null, null, null, null, null, wk.B, composer4, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (!composer5.shouldExecute((intValue5 & 3) != 2, intValue5 & 1)) {
                    composer5.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1535809530, intValue5, -1, "com.lumi.singularity.ui.activities.ControllerInfoScreen.<anonymous>.<anonymous> (ControllerInfoActivity.kt:134)");
                    }
                    IconButtonKt.IconButton(this.e, null, false, null, null, null, zk.b, composer5, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (!composer6.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                    composer6.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(527271539, intValue6, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous> (DomainBlockerActivity.kt:76)");
                    }
                    ComposableLambda composableLambda2 = cl.a;
                    ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1072136813, true, new l2(6, iyVar), composer6, 54);
                    TopAppBarDefaults topAppBarDefaults2 = TopAppBarDefaults.INSTANCE;
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i4 = MaterialTheme.$stable;
                    AppBarKt.m1624TopAppBarGHTll3U(composableLambda2, null, rememberComposableLambda2, null, 0.0f, null, topAppBarDefaults2.m2822topAppBarColors5tl4gsc(materialTheme2.getColorScheme(composer6, i4).m1773getPrimaryContainer0d7_KjU(), 0L, 0L, materialTheme2.getColorScheme(composer6, i4).m1757getOnPrimaryContainer0d7_KjU(), 0L, 0L, composer6, TopAppBarDefaults.$stable << 18, 54), null, composer6, 390, 186);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (!composer7.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                    composer7.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1072136813, intValue7, -1, "com.lumi.singularity.ui.activities.DomainBlockerScreen.<anonymous>.<anonymous> (DomainBlockerActivity.kt:79)");
                    }
                    IconButtonKt.IconButton(this.e, null, false, null, null, null, cl.b, composer7, 1572864, 62);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (!composer8.shouldExecute((intValue8 & 3) != 2, intValue8 & 1)) {
                    composer8.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1045571709, intValue8, -1, "com.lumi.singularity.ui.activities.UpdateOptionsDialog.<anonymous> (MainActivity.kt:2563)");
                    }
                    ButtonKt.TextButton(this.e, null, false, null, null, null, null, null, null, el.d, composer8, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
        }
        return w01Var;
    }
}
