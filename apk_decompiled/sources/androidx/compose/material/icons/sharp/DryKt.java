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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DryKt {
    private static ImageVector _dry;

    public static final ImageVector getDry(Icons.Sharp sharp) {
        ImageVector imageVector = _dry;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Dry", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(1.0f, 12.68f, 23.0f, 18.0f, -2.5f);
        af0.w(c, -7.0f, -1.0f, 9.0f, 17.0f);
        af0.v(c, -9.0f, -1.0f, 10.0f, -2.5f);
        af0.g(c, 12.0f, -1.0f, 8.0f, 10.0f);
        c.horizontalLineTo(8.86f);
        c.lineToRelative(1.88f, -3.3f);
        r6.C(c, 9.12f, 5.0f, 1.0f, 12.68f);
        c.moveTo(15.65f, 4.86f);
        c.lineToRelative(-0.07f, -0.07f);
        c.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        c.lineTo(15.0f, 2.0f);
        c.horizontalLineToRelative(-1.89f);
        c.lineToRelative(-0.06f, 0.43f);
        c.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        c.lineToRelative(0.07f, 0.06f);
        c.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        c.lineTo(14.98f, 9.0f);
        c.horizontalLineToRelative(1.91f);
        c.lineToRelative(0.06f, -0.43f);
        c.curveTo(17.16f, 7.21f, 16.68f, 5.86f, 15.65f, 4.86f);
        k4.x(c, 19.65f, 4.86f, -0.07f, -0.07f);
        c.curveToRelative(-0.57f, -0.62f, -0.82f, -1.41f, -0.67f, -2.2f);
        c.lineTo(19.0f, 2.0f);
        c.horizontalLineToRelative(-1.89f);
        c.lineToRelative(-0.06f, 0.43f);
        c.curveToRelative(-0.2f, 1.36f, 0.27f, 2.71f, 1.3f, 3.72f);
        c.lineToRelative(0.07f, 0.06f);
        c.curveToRelative(0.57f, 0.62f, 0.82f, 1.41f, 0.67f, 2.2f);
        c.lineTo(18.98f, 9.0f);
        c.horizontalLineToRelative(1.91f);
        c.lineToRelative(0.06f, -0.43f);
        c.curveTo(21.16f, 7.21f, 20.68f, 5.86f, 19.65f, 4.86f);
        c.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dry = build;
        build.getClass();
        return build;
    }
}
