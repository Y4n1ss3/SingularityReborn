package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.compose.ui.graphics.Fields;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class av {
    public static vz a(u31 u31Var, FoldingFeature foldingFeature) {
        ox oxVar;
        ox oxVar2;
        u31Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type == 1) {
            oxVar = ox.g;
        } else {
            if (type != 2) {
                return null;
            }
            oxVar = ox.h;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            oxVar2 = ox.e;
        } else {
            if (state != 2) {
                return null;
            }
            oxVar2 = ox.f;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        gf gfVar = new gf(bounds);
        Rect a = u31Var.a();
        if (gfVar.a() == 0 && gfVar.b() == 0) {
            return null;
        }
        if (gfVar.b() != a.width() && gfVar.a() != a.height()) {
            return null;
        }
        if (gfVar.b() < a.width() && gfVar.a() < a.height()) {
            return null;
        }
        if (gfVar.b() == a.width() && gfVar.a() == a.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        bounds2.getClass();
        return new vz(new gf(bounds2), oxVar, oxVar2);
    }

    public static t31 b(u31 u31Var, WindowLayoutInfo windowLayoutInfo) {
        u31Var.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            vz a = foldingFeature instanceof FoldingFeature ? a(u31Var, foldingFeature) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new t31(arrayList);
    }

    public static t31 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        y31 y31Var = ts.q;
        y31 y31Var2 = kf.e;
        y31 y31Var3 = dr.e;
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        cr crVar = i >= 34 ? dr.d : ts.j;
        y80.a(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(Fields.SpotShadowColor));
        if (i >= 30) {
            if (i >= 34) {
                y31Var = y31Var3;
            } else if (i >= 30) {
                y31Var = y31Var2;
            }
            return b(y31Var.e(context, crVar), windowLayoutInfo);
        }
        if (!(context instanceof Activity)) {
            lu0.a("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
        Activity activity = (Activity) context;
        if (i >= 34) {
            y31Var = y31Var3;
        } else if (i >= 30) {
            y31Var = y31Var2;
        }
        return b(y31Var.a(activity, crVar), windowLayoutInfo);
    }
}
