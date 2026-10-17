package com.lumi.singularity.ui.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.ek;
import defpackage.h2;
import defpackage.hm;
import defpackage.hq;
import defpackage.im;
import defpackage.j2;
import defpackage.nq;
import defpackage.nr;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.uv;
import defpackage.vn;
import defpackage.vu0;
import defpackage.z2;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AdbActivity extends vu0 {
    public static final /* synthetic */ int w = 0;
    public File v;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(im imVar) {
        j2 j2Var;
        int i;
        if (imVar instanceof j2) {
            j2Var = (j2) imVar;
            int i2 = j2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = j2Var.d;
                i = j2Var.f;
                hm hmVar = null;
                int i3 = 1;
                if (i != 0) {
                    p10.Q(obj);
                    File file = this.v;
                    if (file != null) {
                        return file;
                    }
                    j2Var.f = 1;
                    nq nqVar = nr.a;
                    obj = p01.H(hq.d, new z2(this, hmVar, i3), j2Var);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                File file2 = (File) obj;
                this.v = file2;
                return file2;
            }
        }
        j2Var = new j2(this, imVar);
        Object obj2 = j2Var.d;
        i = j2Var.f;
        hm hmVar2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        File file22 = (File) obj2;
        this.v = file22;
        return file22;
    }

    @Override // defpackage.vu0, defpackage.dk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        SharedPreferences sharedPreferences = getSharedPreferences("singularity_prefs", 0);
        String absolutePath = new File(getApplicationInfo().nativeLibraryDir, "libsingularity_root_helper.so").getAbsolutePath();
        absolutePath.getClass();
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = getFilesDir();
        }
        File file = new File(externalFilesDir, "start_root_helper.sh");
        uv.M(file, "#!/system/bin/sh\nexec \"" + absolutePath + "\" \"$@\"\n");
        String absolutePath2 = file.getAbsolutePath();
        absolutePath2.getClass();
        ek.a(this, ComposableLambdaKt.composableLambdaInstance(152582398, true, new h2(absolutePath2, sharedPreferences, this, i)));
    }
}
