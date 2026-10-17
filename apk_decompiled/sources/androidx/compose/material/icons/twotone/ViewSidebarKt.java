package androidx.compose.material.icons.twotone;

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
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewSidebarKt {
    private static ImageVector _viewSidebar;

    public static final ImageVector getViewSidebar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _viewSidebar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ViewSidebar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(20.0f, 8.67f, -2.5f, 6.0f, 20.0f);
        k4.B(v, 8.67f, 17.5f, 10.67f, 20.0f);
        k4.p(v, 2.67f, -2.5f, 10.67f);
        k4.C(v, 4.0f, 6.0f, 11.5f, 12.0f);
        bv.s(v, 4.0f, 6.0f, 17.5f, 18.0f);
        v.verticalLineToRelative(-2.67f);
        v.horizontalLineTo(20.0f);
        v.verticalLineTo(18.0f);
        v.horizontalLineTo(17.5f);
        v.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, v.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 4.0f, 16.0f, 20.0f, 4.0f);
        kp0.r(w, 2.0f, 20.0f, 8.67f, -2.5f);
        k4.t(w, 6.0f, 20.0f, 8.67f);
        k4.A(w, 17.5f, 10.67f, 20.0f, 2.67f);
        uo.r(w, -2.5f, 10.67f, 4.0f, 6.0f);
        gy.t(w, 11.5f, 12.0f, 4.0f, 6.0f);
        uf.D(w, 17.5f, 18.0f, -2.67f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(w, 18.0f, 17.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewSidebar = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getViewSidebar$annotations(Icons.TwoTone twoTone) {
    }
}
