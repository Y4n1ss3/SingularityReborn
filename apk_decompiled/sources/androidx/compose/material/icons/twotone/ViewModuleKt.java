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
import defpackage.c21;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewModuleKt {
    private static ImageVector _viewModule;

    public static final ImageVector getViewModule(Icons.TwoTone twoTone) {
        ImageVector imageVector = _viewModule;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ViewModule", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(19.0f, 11.0f, -3.33f, 7.0f, 19.0f);
        k4.D(v, 11.0f, 13.67f, 11.0f, -3.33f);
        c21.c(v, 7.0f, 3.33f, 11.0f);
        uf.D(v, 8.33f, 7.0f, 4.0f, 5.0f);
        bv.z(v, 7.0f, 8.33f, 5.0f, 17.0f);
        fc.y(v, -4.0f, 3.33f, 4.0f, 5.0f);
        bv.y(v, 10.33f, 17.0f, -4.0f, 3.33f);
        kf0.n(v, 4.0f, 10.33f, 15.67f, 17.0f);
        v.verticalLineToRelative(-4.0f);
        v.horizontalLineTo(19.0f);
        v.verticalLineToRelative(4.0f);
        v.horizontalLineTo(15.67f);
        v.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, v.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 5.0f, 14.0f, 18.0f, 5.0f);
        kp0.r(w, 3.0f, 19.0f, 11.0f, -3.33f);
        k4.t(w, 7.0f, 19.0f, 11.0f);
        j50.y(w, 13.67f, 11.0f, -3.33f, 7.0f);
        uo.r(w, 3.33f, 11.0f, 8.33f, 7.0f);
        w.verticalLineToRelative(4.0f);
        w.horizontalLineTo(5.0f);
        w.verticalLineTo(7.0f);
        w.horizontalLineTo(8.33f);
        w.close();
        bv.y(w, 5.0f, 17.0f, -4.0f, 3.33f);
        kf0.n(w, 4.0f, 5.0f, 10.33f, 17.0f);
        fc.y(w, -4.0f, 3.33f, 4.0f, 10.33f);
        uf.D(w, 15.67f, 17.0f, -4.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(w, 4.0f, 15.67f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewModule = build;
        build.getClass();
        return build;
    }
}
