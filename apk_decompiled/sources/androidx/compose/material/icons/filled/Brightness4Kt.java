package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness4Kt {
    private static ImageVector _brightness4;

    public static final ImageVector getBrightness4(Icons.Filled filled) {
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Brightness4", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(20.0f, 8.69f, 4.0f, -4.69f);
        c.lineTo(12.0f, 0.69f);
        r6.w(c, 8.69f, 4.0f, 4.0f, 4.69f);
        c.lineTo(0.69f, 12.0f);
        fc.t(c, 4.0f, 15.31f, 20.0f, 4.69f);
        c.lineTo(12.0f, 23.31f);
        r6.w(c, 15.31f, 20.0f, 20.0f, -4.69f);
        r6.C(c, 23.31f, 12.0f, 20.0f, 8.69f);
        c.moveTo(12.0f, 18.0f);
        c.curveToRelative(-0.89f, 0.0f, -1.74f, -0.2f, -2.5f, -0.55f);
        c.curveTo(11.56f, 16.5f, 13.0f, 14.42f, 13.0f, 12.0f);
        c.reflectiveCurveToRelative(-1.44f, -4.5f, -3.5f, -5.45f);
        c.curveTo(10.26f, 6.2f, 11.11f, 6.0f, 12.0f, 6.0f);
        c.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(c, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = build;
        build.getClass();
        return build;
    }
}
