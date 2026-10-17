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
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoPhotographyKt {
    private static ImageVector _noPhotography;

    public static final ImageVector getNoPhotography(Icons.Outlined outlined) {
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoPhotography", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(8.9f, 6.07f, 7.48f, 4.66f);
        i.lineTo(9.0f, 3.0f);
        r6.t(i, 6.0f, 1.83f, 2.0f, 20.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        fc.t(i, 20.0f, 17.17f, 7.0f, -4.05f);
        i.lineToRelative(-1.83f, -2.0f);
        kf0.m(i, 9.88f, 8.9f, 6.07f);
        i.moveTo(20.49f, 23.31f);
        i.lineTo(18.17f, 21.0f);
        i.horizontalLineTo(4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.verticalLineTo(7.0f);
        i.curveToRelative(0.0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f);
        i.lineToRelative(-2.0f, -2.0f);
        i.lineTo(2.1f, 2.1f);
        gy.B(i, 19.8f, 19.8f, 20.49f, 23.31f);
        i.moveTo(9.19f, 12.02f);
        i.curveTo(9.08f, 12.33f, 9.0f, 12.65f, 9.0f, 13.0f);
        i.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(0.35f, 0.0f, 0.67f, -0.08f, 0.98f, -0.19f);
        uo.l(i, 9.19f, 12.02f, 16.17f, 19.0f);
        i.lineToRelative(-1.68f, -1.68f);
        i.curveTo(13.76f, 17.75f, 12.91f, 18.0f, 12.0f, 18.0f);
        i.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        i.curveToRelative(0.0f, -0.91f, 0.25f, -1.76f, 0.68f, -2.49f);
        r6.w(i, 4.17f, 7.0f, 4.0f, 12.0f);
        k4.w(i, 16.17f, 14.81f, 11.98f);
        i.lineToRelative(2.07f, 2.07f);
        i.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        i.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        i.curveToRelative(-0.36f, 0.0f, -0.71f, 0.04f, -1.06f, 0.12f);
        i.lineToRelative(2.07f, 2.07f);
        i.curveTo(13.85f, 10.49f, 14.51f, 11.15f, 14.81f, 11.98f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noPhotography = build;
        build.getClass();
        return build;
    }
}
