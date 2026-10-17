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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhotoCameraBackKt {
    private static ImageVector _photoCameraBack;

    public static final ImageVector getPhotoCameraBack(Icons.TwoTone twoTone) {
        ImageVector imageVector = _photoCameraBack;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhotoCameraBack", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(15.95f, 7.0f, -1.83f, -2.0f, 9.88f);
        r6.w(u, 8.05f, 7.0f, 4.0f, 12.0f);
        kf0.v(u, 16.0f, 7.0f, 15.95f);
        u.moveTo(6.0f, 17.0f);
        u.lineToRelative(3.0f, -4.0f);
        u.lineToRelative(2.25f, 3.0f);
        u.lineToRelative(3.0f, -4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(u, 18.0f, 17.0f, 6.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 5.0f, -3.17f, 15.0f, 3.0f);
        bv.u(p, 9.0f, 7.17f, 5.0f, 4.0f);
        p.curveTo(2.9f, 5.0f, 2.0f, 5.9f, 2.0f, 7.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(16.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.verticalLineTo(7.0f);
        p.curveTo(22.0f, 5.9f, 21.1f, 5.0f, 20.0f, 5.0f);
        c21.d(p, 20.0f, 19.0f, 4.0f, 7.0f);
        kf0.B(p, 4.05f, 1.83f, -2.0f, 4.24f);
        p.lineToRelative(1.83f, 2.0f);
        p.horizontalLineTo(20.0f);
        p.verticalLineTo(19.0f);
        p.close();
        p.moveTo(11.25f, 16.0f);
        p.lineTo(9.0f, 13.0f);
        p.lineToRelative(-3.0f, 4.0f);
        p.horizontalLineToRelative(12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(p, -3.75f, -5.0f, 11.25f, 16.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _photoCameraBack = build;
        build.getClass();
        return build;
    }
}
