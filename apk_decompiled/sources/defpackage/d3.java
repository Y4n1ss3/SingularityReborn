package defpackage;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import com.lumi.singularity.ui.activities.AdbRootActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class d3 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ SharedPreferences e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ AdbRootActivity k;

    public /* synthetic */ d3(SharedPreferences sharedPreferences, boolean z, String str, boolean z2, boolean z3, boolean z4, AdbRootActivity adbRootActivity, int i) {
        this.d = i;
        this.e = sharedPreferences;
        this.f = z;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = adbRootActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L22;
     */
    @Override // defpackage.my
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        int i = this.d;
        w01 w01Var = w01.a;
        final int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = AdbRootActivity.v;
                if (!composer.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                    composer.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1705630074, intValue, -1, "com.lumi.singularity.ui.activities.AdbRootActivity.onCreate.<anonymous> (AdbRootActivity.kt:96)");
                    }
                    MaterialThemeKt.MaterialTheme(y90.a(composer), null, null, ComposableLambdaKt.rememberComposableLambda(609001038, true, new d3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, 1), composer, 54), composer, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i4 = AdbRootActivity.v;
                if (!composer2.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                    composer2.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(609001038, intValue2, -1, "com.lumi.singularity.ui.activities.AdbRootActivity.onCreate.<anonymous>.<anonymous> (AdbRootActivity.kt:99)");
                    }
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1747getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-729931821, true, new d3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, 2), composer2, 54), composer2, 12582918, 122);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        break;
                    }
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i5 = AdbRootActivity.v;
                if (!composer3.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                    composer3.skipToGroupEnd();
                    break;
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-729931821, intValue3, -1, "com.lumi.singularity.ui.activities.AdbRootActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AdbRootActivity.kt:100)");
                    }
                    final AdbRootActivity adbRootActivity = this.k;
                    boolean changedInstance = composer3.changedInstance(adbRootActivity);
                    Object rememberedValue = composer3.rememberedValue();
                    if (!changedInstance) {
                        obj3 = rememberedValue;
                        break;
                    }
                    final int i6 = r8 ? 1 : 0;
                    iy iyVar = new iy() { // from class: e3
                        @Override // defpackage.iy
                        public final Object invoke() {
                            int i7 = i6;
                            w01 w01Var2 = w01.a;
                            AdbRootActivity adbRootActivity2 = adbRootActivity;
                            switch (i7) {
                                case 0:
                                    int i8 = AdbRootActivity.v;
                                    adbRootActivity2.finish();
                                    break;
                                default:
                                    int i9 = AdbRootActivity.v;
                                    adbRootActivity2.setResult(-1);
                                    adbRootActivity2.finish();
                                    break;
                            }
                            return w01Var2;
                        }
                    };
                    composer3.updateRememberedValue(iyVar);
                    obj3 = iyVar;
                    iy iyVar2 = (iy) obj3;
                    boolean changedInstance2 = composer3.changedInstance(adbRootActivity);
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (!changedInstance2) {
                        obj4 = rememberedValue2;
                        break;
                    }
                    iy iyVar3 = new iy() { // from class: e3
                        @Override // defpackage.iy
                        public final Object invoke() {
                            int i7 = i2;
                            w01 w01Var2 = w01.a;
                            AdbRootActivity adbRootActivity2 = adbRootActivity;
                            switch (i7) {
                                case 0:
                                    int i8 = AdbRootActivity.v;
                                    adbRootActivity2.finish();
                                    break;
                                default:
                                    int i9 = AdbRootActivity.v;
                                    adbRootActivity2.setResult(-1);
                                    adbRootActivity2.finish();
                                    break;
                            }
                            return w01Var2;
                        }
                    };
                    composer3.updateRememberedValue(iyVar3);
                    obj4 = iyVar3;
                    j4.a(this.f, this.g, this.h, this.i, this.j, adbRootActivity, this.e, iyVar2, (iy) obj4, composer3, Fields.ColorFilter);
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
