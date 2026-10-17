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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WallpaperKt {
    private static ImageVector _wallpaper;

    public static final ImageVector getWallpaper(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wallpaper;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Wallpaper", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 4.0f, 7.0f, 11.0f, 2.0f);
        p.lineTo(4.0f, 2.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.D(p, 7.0f, 2.0f, 4.0f, 4.0f);
        p.moveTo(10.0f, 13.0f);
        p.lineToRelative(-4.0f, 5.0f);
        p.horizontalLineToRelative(12.0f);
        p.lineToRelative(-3.0f, -4.0f);
        gy.B(p, -2.03f, 2.71f, 10.0f, 13.0f);
        p.moveTo(17.0f, 8.5f);
        p.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        p.reflectiveCurveTo(14.0f, 7.67f, 14.0f, 8.5f);
        p.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        p.reflectiveCurveTo(17.0f, 9.33f, 17.0f, 8.5f);
        r6.B(p, 20.0f, 2.0f, -7.0f, 2.0f);
        kf0.x(p, 7.0f, 7.0f, 2.0f);
        p.lineTo(22.0f, 4.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(p, 20.0f, 20.0f, -7.0f, 2.0f);
        p.horizontalLineToRelative(7.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.p(p, -7.0f, -2.0f, 7.0f);
        p.moveTo(4.0f, 13.0f);
        p.lineTo(2.0f, 13.0f);
        p.verticalLineToRelative(7.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(p, 7.0f, -2.0f, 4.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, -7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wallpaper = build;
        build.getClass();
        return build;
    }
}
