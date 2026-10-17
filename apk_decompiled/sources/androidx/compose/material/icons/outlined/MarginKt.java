package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarginKt {
    private static ImageVector _margin;

    public static final ImageVector getMargin(Icons.Outlined outlined) {
        ImageVector imageVector = _margin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Margin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 3.0f, 18.0f, 18.0f, 3.0f);
        kp0.B(w, 3.0f, 19.0f, 19.0f, 5.0f);
        c21.c(w, 5.0f, 14.0f, 19.0f);
        k4.C(w, 11.0f, 7.0f, 2.0f, 2.0f);
        uo.r(w, -2.0f, 7.0f, 7.0f, 7.0f);
        gy.t(w, 2.0f, 2.0f, 7.0f, 7.0f);
        k4.C(w, 15.0f, 7.0f, 2.0f, 2.0f);
        uo.r(w, -2.0f, 7.0f, 7.0f, 11.0f);
        gy.t(w, 2.0f, 2.0f, 7.0f, 11.0f);
        k4.C(w, 11.0f, 11.0f, 2.0f, 2.0f);
        uo.r(w, -2.0f, 11.0f, 15.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(w, 2.0f, 2.0f, -2.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _margin = build;
        build.getClass();
        return build;
    }
}
