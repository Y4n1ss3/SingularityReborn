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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DonutLargeKt {
    private static ImageVector _donutLarge;

    public static final ImageVector getDonutLarge(Icons.TwoTone twoTone) {
        ImageVector imageVector = _donutLarge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DonutLarge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 5.08f);
        b.curveToRelative(3.06f, 0.44f, 5.48f, 2.86f, 5.92f, 5.92f);
        b.horizontalLineToRelative(3.03f);
        b.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        r6.l(b, 3.03f, 18.92f, 13.0f);
        b.curveToRelative(-0.44f, 3.06f, -2.86f, 5.48f, -5.92f, 5.92f);
        b.verticalLineToRelative(3.03f);
        b.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        j50.t(b, -3.03f, 11.0f, 18.92f);
        b.curveToRelative(-3.39f, -0.49f, -6.0f, -3.4f, -6.0f, -6.92f);
        b.reflectiveCurveToRelative(2.61f, -6.43f, 6.0f, -6.92f);
        b.verticalLineTo(2.05f);
        b.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        b.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, -3.03f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutLarge = build;
        build.getClass();
        return build;
    }
}
