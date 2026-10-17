package androidx.compose.material.icons.sharp;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoPhotographyKt {
    private static ImageVector _noPhotography;

    public static final ImageVector getNoPhotography(Icons.Sharp sharp) {
        ImageVector imageVector = _noPhotography;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoPhotography", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.94f, 8.12f, 7.48f, 4.66f);
        i.lineTo(9.0f, 3.0f);
        r6.t(i, 6.0f, 1.83f, 2.0f, 22.0f);
        i.verticalLineToRelative(14.17f);
        i.lineToRelative(-5.12f, -5.12f);
        i.curveTo(16.96f, 13.71f, 17.0f, 13.36f, 17.0f, 13.0f);
        i.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        i.curveTo(11.64f, 8.0f, 11.29f, 8.04f, 10.94f, 8.12f);
        k4.r(i, 20.49f, 23.31f, 18.17f, 21.0f);
        uf.t(i, 2.0f, 5.0f, 0.17f);
        i.lineTo(0.69f, 3.51f);
        i.lineTo(2.1f, 2.1f);
        i.lineTo(21.0f, 21.0f);
        gy.B(i, 0.9f, 0.9f, 20.49f, 23.31f);
        i.moveTo(14.49f, 17.32f);
        i.lineToRelative(-1.5f, -1.5f);
        i.curveTo(12.67f, 15.92f, 12.35f, 16.0f, 12.0f, 16.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.curveToRelative(0.0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f);
        i.lineToRelative(-1.5f, -1.5f);
        i.curveTo(7.25f, 11.24f, 7.0f, 12.09f, 7.0f, 13.0f);
        i.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        i.curveTo(12.91f, 18.0f, 13.76f, 17.75f, 14.49f, 17.32f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noPhotography = build;
        build.getClass();
        return build;
    }
}
