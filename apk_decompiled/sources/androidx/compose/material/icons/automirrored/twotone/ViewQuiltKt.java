package androidx.compose.material.icons.automirrored.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewQuiltKt {
    private static ImageVector _viewQuilt;

    public static final ImageVector getViewQuilt(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _viewQuilt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.ViewQuilt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(8.33f, 17.0f, 5.0f, 7.0f, 3.33f);
        k4.D(f, 17.0f, 13.67f, 17.0f, -3.33f);
        k4.p(f, -4.0f, 3.33f, 17.0f);
        k4.C(f, 19.0f, 17.0f, -3.33f, -4.0f);
        bv.s(f, 19.0f, 17.0f, 19.0f, 11.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.l(f, -8.67f, 7.0f, 19.0f, 11.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 5.0f, 14.0f, 18.0f, 5.0f);
        kp0.B(w, 3.0f, 8.33f, 17.0f, 5.0f);
        c21.c(w, 7.0f, 3.33f, 17.0f);
        k4.C(w, 13.67f, 17.0f, -3.33f, -4.0f);
        uo.r(w, 3.33f, 17.0f, 19.0f, 17.0f);
        gy.t(w, -3.33f, -4.0f, 19.0f, 17.0f);
        j50.y(w, 19.0f, 11.0f, -8.67f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(w, 19.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewQuilt = build;
        build.getClass();
        return build;
    }
}
