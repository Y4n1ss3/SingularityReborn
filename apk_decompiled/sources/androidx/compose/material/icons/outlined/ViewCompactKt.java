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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewCompactKt {
    private static ImageVector _viewCompact;

    public static final ImageVector getViewCompact(Icons.Outlined outlined) {
        ImageVector imageVector = _viewCompact;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ViewCompact", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 4.0f, 16.0f, 20.0f, 4.0f);
        kp0.B(w, 2.0f, 6.5f, 18.0f, 4.0f);
        k4.p(w, -2.5f, 2.5f, 18.0f);
        k4.A(w, 6.5f, 13.25f, 4.0f, -2.5f);
        uo.r(w, 2.5f, 13.25f, 6.5f, 8.5f);
        uo.o(w, 4.0f, 6.0f, 2.5f, 8.5f);
        k4.A(w, 11.0f, 18.0f, 8.5f, -2.5f);
        bv.s(w, 11.0f, 18.0f, 11.0f, 13.25f);
        w.horizontalLineTo(8.5f);
        w.verticalLineToRelative(-2.5f);
        w.horizontalLineTo(11.0f);
        w.verticalLineTo(13.25f);
        w.close();
        uo.p(w, 11.0f, 8.5f, 8.5f, 6.0f);
        bv.s(w, 11.0f, 8.5f, 15.5f, 18.0f);
        bv.h(w, 13.0f, -2.5f, 2.5f, 18.0f);
        k4.A(w, 15.5f, 13.25f, 13.0f, -2.5f);
        uo.r(w, 2.5f, 13.25f, 15.5f, 8.5f);
        uo.o(w, 13.0f, 6.0f, 2.5f, 8.5f);
        k4.C(w, 20.0f, 18.0f, -2.5f, -2.5f);
        bv.s(w, 20.0f, 18.0f, 20.0f, 13.25f);
        gy.t(w, -2.5f, -2.5f, 20.0f, 13.25f);
        j50.y(w, 20.0f, 8.5f, -2.5f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(w, 20.0f, 8.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewCompact = build;
        build.getClass();
        return build;
    }
}
