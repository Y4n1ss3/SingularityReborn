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
import defpackage.c21;
import defpackage.gy;
import defpackage.j50;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CribKt {
    private static ImageVector _crib;

    public static final ImageVector getCrib(Icons.TwoTone twoTone) {
        ImageVector imageVector = _crib;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Crib", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(18.0f, 14.0f, 6.0f, 8.0f);
        c.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(c, 2.0f, 5.0f, 8.0f, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(18.0f, 9.0f, -6.0f, 4.0f, 8.0f);
        v.curveTo(5.79f, 4.0f, 4.0f, 5.79f, 4.0f, 8.0f);
        v.verticalLineToRelative(6.0f);
        v.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        v.horizontalLineToRelative(2.0f);
        v.verticalLineToRelative(2.93f);
        v.curveToRelative(-0.61f, -0.35f, -1.16f, -0.78f, -1.65f, -1.27f);
        v.lineToRelative(-1.42f, 1.42f);
        v.curveTo(6.74f, 20.88f, 9.24f, 22.0f, 12.0f, 22.0f);
        v.curveToRelative(2.76f, 0.0f, 5.26f, -1.12f, 7.07f, -2.93f);
        v.lineToRelative(-1.42f, -1.42f);
        v.curveToRelative(-0.49f, 0.49f, -1.05f, 0.92f, -1.65f, 1.27f);
        v.verticalLineTo(16.0f);
        v.horizontalLineToRelative(2.0f);
        v.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        v.verticalLineToRelative(-3.0f);
        v.curveTo(20.0f, 9.9f, 19.1f, 9.0f, 18.0f, 9.0f);
        v.close();
        v.moveTo(14.0f, 19.75f);
        v.curveTo(13.36f, 19.91f, 12.69f, 20.0f, 12.0f, 20.0f);
        v.curveToRelative(-0.69f, 0.0f, -1.36f, -0.09f, -2.0f, -0.25f);
        c21.c(v, 16.0f, 4.0f, 19.75f);
        uo.p(v, 18.0f, 14.0f, 6.0f, 8.0f);
        v.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(v, 2.0f, 5.0f, 8.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crib = build;
        build.getClass();
        return build;
    }
}
