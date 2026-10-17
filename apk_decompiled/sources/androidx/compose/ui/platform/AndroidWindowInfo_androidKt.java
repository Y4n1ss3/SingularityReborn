package androidx.compose.ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.dr;
import defpackage.kf;
import defpackage.ts;
import defpackage.u31;
import defpackage.v31;
import defpackage.w31;
import defpackage.x31;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidWindowInfo_androidKt {
    public static final DerivedSize calculateWindowSize(View view) {
        Context context = view.getContext();
        Context tryUnwrapContext = tryUnwrapContext(context);
        if (tryUnwrapContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            return DerivedSize.Companion.m6736fromDpSizeitqla9I(DpKt.m7633DpSizeYgX7TsA(Dp.m7611constructorimpl(configuration.screenWidthDp), Dp.m7611constructorimpl(configuration.screenHeightDp)), AndroidDensity_androidKt.Density(context));
        }
        w31.a.getClass();
        v31 v31Var = v31.a;
        x31 x31Var = v31.b;
        x31Var.getClass();
        int i = Build.VERSION.SDK_INT;
        u31 e = (i >= 34 ? dr.e : i >= 30 ? kf.e : ts.q).e(tryUnwrapContext, x31Var.b);
        return DerivedSize.Companion.m6737fromPxSizeviCIZxY(IntSize.m7777constructorimpl((e.a().width() << 32) | (e.a().height() & 4294967295L)), AndroidDensity_androidKt.Density(tryUnwrapContext));
    }

    private static final Context tryUnwrapContext(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return context;
            }
            if (context instanceof InputMethodService) {
                return context;
            }
            if (context instanceof Application) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
