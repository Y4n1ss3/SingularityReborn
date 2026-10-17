package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppsKt {
    private static ImageVector _apps;

    public static final ImageVector getApps(Icons.Rounded rounded) {
        ImageVector imageVector = _apps;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Apps", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 8.0f, 4.0f, 8.0f, 4.0f);
        bv.r(p, 4.0f, 4.0f, 4.0f);
        k4.C(p, 10.0f, 20.0f, 4.0f, -4.0f);
        fc.x(p, -4.0f, 4.0f, 4.0f, 20.0f);
        bv.C(p, 4.0f, -4.0f, 4.0f, 16.0f);
        bv.m(p, 4.0f, 4.0f, 14.0f, 4.0f);
        bv.n(p, -4.0f, 4.0f, 10.0f, 4.0f);
        k4.C(p, 10.0f, 14.0f, 4.0f, -4.0f);
        fc.x(p, -4.0f, 4.0f, 16.0f, 4.0f);
        uo.B(p, 4.0f, 4.0f, 20.0f, 4.0f);
        kp0.A(p, -4.0f, 10.0f, 8.0f, 4.0f);
        r6.m(p, 14.0f, 4.0f, -4.0f, 4.0f);
        k4.C(p, 16.0f, 14.0f, 4.0f, -4.0f);
        fc.x(p, -4.0f, 4.0f, 16.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(p, 4.0f, -4.0f, -4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _apps = build;
        build.getClass();
        return build;
    }
}
