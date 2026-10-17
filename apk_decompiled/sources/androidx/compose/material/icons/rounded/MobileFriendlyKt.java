package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileFriendlyKt {
    private static ImageVector _mobileFriendly;

    public static final ImageVector getMobileFriendly(Icons.Rounded rounded) {
        ImageVector imageVector = _mobileFriendly;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MobileFriendly", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 1.0f, 9.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        j50.B(d, 4.0f, 10.0f, 16.0f, 9.0f);
        d.verticalLineToRelative(-1.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(3.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.x(d, 7.01f, 13.47f, -1.92f, -1.92f);
        d.curveToRelative(-0.35f, -0.35f, -0.92f, -0.35f, -1.27f, 0.0f);
        d.reflectiveCurveToRelative(-0.35f, 0.92f, 0.0f, 1.27f);
        d.lineToRelative(2.47f, 2.47f);
        d.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        d.lineToRelative(5.85f, -5.85f);
        d.curveToRelative(0.35f, -0.35f, 0.35f, -0.92f, 0.0f, -1.27f);
        d.reflectiveCurveToRelative(-0.92f, -0.35f, -1.27f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(d, -5.27f, 5.3f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileFriendly = build;
        build.getClass();
        return build;
    }
}
